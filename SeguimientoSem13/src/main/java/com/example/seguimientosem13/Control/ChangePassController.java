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

public class ChangePassController {

    @FXML
    private HBox actComHBox;

    @FXML
    private TextField actTF1;

    @FXML
    private TextField actTF2;

    @FXML
    private TextField actTF3;

    @FXML
    private TextField actTF4;

    @FXML
    private TextField actTF5;

    @FXML
    private TextField actTF6;

    @FXML
    private Button changePassBTT;

    @FXML
    private Button closeBoxBTT;

    @FXML
    private HBox newComHbox;

    @FXML
    private TextField newTF1;

    @FXML
    private TextField newTF2;

    @FXML
    private TextField newTF3;

    @FXML
    private TextField newTF4;

    @FXML
    private TextField newTF5;

    @FXML
    private TextField newTF6;

    @FXML
    void changePass(ActionEvent event) {
        String actPass = "";
        for(Node node : actComHBox.getChildren()){
            TextField tf = (TextField) node;
            actPass += tf.getText();
        }

        String newPass = "";
        for(Node node : newComHbox.getChildren()){
            TextField tf = (TextField) node;
            newPass += tf.getText();
        }

        if(actPass.equals(newPass)){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("---Advertencia---");
            alert.setContentText("Está ingresando una contraseña igual a la anterior, debe realizar cambios");
            alert.show();

        }else if(!actPass.equals(PassUserData.getInstance().getPass())){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Error");
            alert.setContentText("La combinacion actual no concuerda a la registrada anteriormente, ingrese nuevamente la contraseña");
            alert.show();
        }else{
            PassUserData.getInstance().setPass(newPass);
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("Exito");
            alert.setContentText("Contraseña cambiada exitosamente");
            alert.show();
        }


    }

    @FXML
    void closeBox(ActionEvent event) throws IOException{

        HelloApplication.showWindow("login.fxml");
        Stage currentStage = (Stage)actTF6.getScene().getWindow();
        currentStage.hide();

    }

    @FXML
    void onKey(KeyEvent event){
        if (event.getSource().equals(actTF1)) {
            actTF2.requestFocus();
        }
        if (event.getSource().equals(actTF2)) {
            actTF3.requestFocus();
        }
        if (event.getSource().equals(actTF3)) {
            actTF4.requestFocus();
        }
        if (event.getSource().equals(actTF4)) {
            actTF5.requestFocus();
        }
        if (event.getSource().equals(actTF5)) {
            actTF6.requestFocus();
        }
        if (event.getSource().equals(actTF6)) {
            newTF1.requestFocus();
        }
    }

    @FXML
    void onKeyNewCom(KeyEvent event) {
        if (event.getSource().equals(newTF1)) {
            newTF2.requestFocus();
        }
        if (event.getSource().equals(newTF2)) {
            newTF3.requestFocus();
        }
        if (event.getSource().equals(newTF3)) {
            newTF4.requestFocus();
        }
        if (event.getSource().equals(newTF4)) {
            newTF5.requestFocus();
        }
        if (event.getSource().equals(newTF5)) {
            newTF6.requestFocus();
        }
        if (event.getSource().equals(newTF6)) {
            changePassBTT.requestFocus();
        }
    }
}