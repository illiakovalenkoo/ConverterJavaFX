package org.feodal.konwerter3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private Label labelGrams;

    @FXML
    private Label labelKilos;

    @FXML
    private Label labelTonnes;

    @FXML
    private TextField textField;

    double currentValueInGrams;

    @FXML
    void initialize() {
        comboBox.getItems().addAll("Grams", "Kilos", "Tonnes");
        comboBox.setValue("Grams");
        textField.setOnKeyReleased(event -> {
            convert();
        });
        comboBox.setOnAction(event -> {
            convert();
        });
    }

    private void convert() {
        try {
            String input = textField.getText().trim();
            if (input.isEmpty()) {
                labelGrams.setText("");
                labelKilos.setText("");
                labelTonnes.setText("");
                return;
            }
            double currentValue = Double.parseDouble(textField.getText());
            switch (comboBox.getSelectionModel().getSelectedItem()) {
                case "Grams":
                    currentValueInGrams = currentValue;
                    break;
                case "Kilos":
                    currentValueInGrams = currentValue * 1000;
                    break;
                case "Tonnes":
                    currentValueInGrams = currentValue * 1000000;
                    break;
            }
            labelGrams.setText(formatResult(currentValueInGrams));
            labelKilos.setText(formatResult(currentValueInGrams / 1000));
            labelTonnes.setText(formatResult(currentValueInGrams / 1000000));
        } catch (NumberFormatException e) {
            labelGrams.setText("Error - Enter a number");
            labelKilos.setText("Error - Enter a number");
            labelTonnes.setText("Error - Enter a number");
        }
    }

    private String formatResult(double number) {
        if (number == (int) number) {
            return String.valueOf((int) number);
        } else {
            return String.valueOf(number);
        }
    }
}
