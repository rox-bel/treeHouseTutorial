package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    //edited in gethub
    @FXML private TextField firstName;
    public void handleSaySup(ActionEvent actionEvent) {
        System.out.printf("sup %s %n",firstName.getText());
    }
}
