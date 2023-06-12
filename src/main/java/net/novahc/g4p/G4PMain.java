package net.novahc.g4p;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import net.novahc.g4p.Logic.Conversion.FindCodon;
import net.novahc.g4p.Logic.Conversion.Transciption;
import net.novahc.g4p.Logic.Conversion.Translation;
import net.novahc.g4p.Logic.Parse.FileScanner;
import net.novahc.g4p.Logic.Parse.SequenceAnalyzer;
import net.novahc.g4p.Logic.Sorting.Splitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class G4PMain extends Application {

    //Offests determine where the mouse interact with the menu

    private double xOffset;
    private double yOffset;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(G4PMain.class.getResource("main.fxml"));
        String css = this.getClass().getResource("style.css").toExternalForm();

        FileScanner fileScanner = new FileScanner("src/main/resources/text.txt");
        SequenceAnalyzer sa = new SequenceAnalyzer(fileScanner.getSequence());
        System.out.println("Base Pair Count: "+Arrays.toString(sa.getBPCounts()));
        System.out.println("Base Pair Percentages: "+Arrays.toString(sa.getBPPercentages()));
        Transciption trans = new Transciption();
        Splitter splitter = new Splitter(fileScanner.getSequence());
        splitter.split();
        trans.transcript(splitter.getSplit());
        Translation translation = new Translation(trans.getRNA());
    }
    // Controls movement of the main "Anchor Pane"
    private void move(Stage stage, Scene scene, Scene loginScene) {
        loginScene.setOnMousePressed(event -> {
            xOffset = stage.getX() - event.getScreenX();
            yOffset = stage.getY() - event.getScreenY();
        });
        scene.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() + xOffset);
            stage.setY(event.getScreenY() + yOffset);
        });
    }

    public static void main(String[] args) {
        launch();
    }
}