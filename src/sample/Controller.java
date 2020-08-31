package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Controller {

    @FXML
    public TextField fieldText;
    @FXML
    public TextArea textArea;


    public void clickButton() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String afterFormat = time.format(format);

        textArea.appendText("                                        "+afterFormat+"\n"+"" +
                "                                        "+fieldText.getText()+ " \n");
        fieldText.clear();
    }

    public void onClick(ActionEvent actionEvent) {
    }

    public void onClickAction(ActionEvent actionEvent) {
    }

    public void clear(ActionEvent actionEvent) {
    }
}
