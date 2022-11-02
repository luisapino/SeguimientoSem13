package com.example.seguimientosem13.Control;

import com.example.seguimientosem13.HelloApplication;
import com.example.seguimientosem13.model.PassUserData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginController {

    @FXML
    private Button loginBT;

    @FXML
    private HBox passHB;

    @FXML
    private TextField passTF1;

    @FXML
    private TextField passTF2;

    @FXML
    private TextField passTF3;

    @FXML
    private TextField passTF4;

    @FXML
    private TextField passTF5;

    @FXML
    private TextField passTF6;

    @FXML
    void doLogin(ActionEvent event) throws IOException {

        String text = "";
        for(Node node : passHB.getChildren()){
            TextField tf = (TextField) node;
            text += tf.getText();

        }

        if(PassUserData.getInstance().getPass().equals(text)){
            HelloApplication.showWindow("ContentBox.fxml");
            Stage currentStage = (Stage)passTF1.getScene().getWindow();
            currentStage.hide();
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Error fatal!");
            alert.setContentText("Contraseña equivocada!");
            alert.show();
        }


    }

    @FXML
    void onKey(KeyEvent event) {

        if(event.getSource().equals(passTF1)){
            passTF2.requestFocus();
        }
        if(event.getSource().equals(passTF2)){
            passTF3.requestFocus();
        }
        if(event.getSource().equals(passTF3)){
            passTF4.requestFocus();
        }
        if(event.getSource().equals(passTF4)){
            passTF5.requestFocus();
        }
        if(event.getSource().equals(passTF5)){
            passTF6.requestFocus();
        }
        if (event.getSource().equals(passTF6)){
            loginBT.requestFocus();
        }
    }

}

