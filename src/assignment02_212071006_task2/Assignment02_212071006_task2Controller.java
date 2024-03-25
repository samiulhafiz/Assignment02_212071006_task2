/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package assignment02_212071006_task2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Assignment02_212071006_task2Controller implements Initializable {

    @FXML
    private Button NameBtn;
    @FXML
    private Button IdBtn;
    @FXML
    private Button SemesterBtn;
    @FXML
    private Button BatchBtn;
    @FXML
    private Button ExitBtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialization code (if needed)
    }    

    @FXML
    private void showname(ActionEvent event) {
        System.out.println("Samiul Hafiz");
    }

    @FXML
    private void ShowId(ActionEvent event) {
        System.out.println("212071006");
    }

    @FXML
    private void ShowSemester(ActionEvent event) {
        System.out.println("7th");
    }

    @FXML
    private void ShowBatch(ActionEvent event) {
        System.out.println("27th");
    }

    @FXML
    private void DoExit(ActionEvent event) {
        System.out.println("Exit Button clicked");
        // Close the application
        System.exit(0);
    }
}
