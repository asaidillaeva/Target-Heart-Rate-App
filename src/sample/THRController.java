package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class THRController {
    @FXML
    public Button calculateButton;
    @FXML
    private TextField ageTextField;
    @FXML
    private TextArea resultTextArea;
    @FXML
    void calculateButtonPressed() {
        try {
            int age = new Integer(ageTextField.getText());
            if (age < 150 && age > 0) {
                int res = 220 - age;
                int result1 = (res * 50) / 100;
                int result2 = (res * 85) / 100;
                String result = (String.format("Maximum Heart Rate: %dbpm%n%nTarget Heart Rate: %d-%dbpm%n%n(bpm-beats per minute) ", res, result2, result1));
                resultTextArea.setText(result);
            } else {
                resultTextArea.setText("Incorrect Age");
                resultTextArea.selectAll();
                resultTextArea.requestFocus();
            }
        } catch (NumberFormatException e) {
            ageTextField.setText("Incorrect Age!");
            resultTextArea.setText("Incorrect Age!");
            resultTextArea.setText("Incorrect Age!");
        }
    }
}
