package net.novahc.g4p;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import net.novahc.g4p.Logic.Parse.FileScanner;
import net.novahc.g4p.Logic.Parse.SequenceAnalyzer;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Pane sideBar;
    @FXML
    private Pane mainPane;
    @FXML
    private Pane helpPane;
    @FXML
    private Pane aboutPane;


    @FXML
    private Button uploadButton;
    @FXML
    private Button pasteButton;

    @FXML
    private BarChart<String,Integer> countChart;

    @FXML
    XYChart.Series<String,Integer> series1 = new XYChart.Series();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        invokeChart();
    }
    private void invokeChart(){
        FileScanner fileScanner = new FileScanner("src/main/resources/text.txt");
        SequenceAnalyzer sa = new SequenceAnalyzer(fileScanner.getSequence());
        int[] ca = sa.getBPCounts();
        int count = 0;
        Integer[] bpCounts = new Integer[4];
        for(int c : ca){
            bpCounts[count] = Integer.valueOf(c);
            count++;
        }
        series1.setName("Nucleotide Counts");
        series1.getData().add(new XYChart.Data("Adenine", bpCounts[0]));
        series1.getData().add(new XYChart.Data("Cytosine", bpCounts[1]));
        series1.getData().add(new XYChart.Data("Guanine", bpCounts[2]));
        series1.getData().add(new XYChart.Data("Thymine", bpCounts[3]));
        countChart.getData().add(series1);
    }
}