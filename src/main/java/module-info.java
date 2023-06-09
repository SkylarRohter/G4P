module net.novahc.g4p {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens net.novahc.g4p to javafx.fxml;
    exports net.novahc.g4p;
}