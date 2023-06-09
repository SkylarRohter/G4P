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
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(css);
        move(stage, scene, scene);


        FileScanner fileScanner = new FileScanner("src/main/resources/text.txt");
        SequenceAnalyzer sa = new SequenceAnalyzer(fileScanner.getSequence());
        System.out.println(Arrays.toString(sa.getBPCounts()));
        int count = 0;
        Transciption trans = new Transciption();
        trans.transcript(getReadingFrames(fileScanner.getSequence()));
        do {
            String substring = fileScanner.getSequence().substring(Splitter.stop);
            trans.transcript(getReadingFrames(substring));
            Translation translation = new Translation(trans.getRNA());
            count++;
        }while(count < fileScanner.getSequence().length());

        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
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

    private ArrayList<char[]> getReadingFrames(String s){
        Splitter splitter = new Splitter(s,
                new FindCodon("TAC", s).find(),
                new FindCodon("TAC", s).getStopIndex());
        splitter.split();
        return splitter.getSplit();
    }

    public static void main(String[] args) {
        launch();
    }
}