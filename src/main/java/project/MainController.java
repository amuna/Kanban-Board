package project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;

public class MainController {
    @FXML
    private MenuItem exit;

    public void initialize(){
        exit.setAccelerator(KeyCombination.keyCombination("Ctrl+Q"));
    }
    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }
}