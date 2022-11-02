package com.example.seguimientosem13.Control;

import com.example.seguimientosem13.HelloApplication;
import com.example.seguimientosem13.model.PassUserData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ContentBox implements Initializable{

    @FXML
    private Button changePassBT;

    @FXML
    private Button closeBoxBT;

    @FXML
    private TextArea contTA;

    @FXML
    void doChangePass(ActionEvent event) throws IOException {

        String data = contTA.getText();
        PassUserData.getInstance().setTextCont(data);
        HelloApplication.showWindow("changePass.fxml");
        Stage newStage = (Stage) changePassBT.getScene().getWindow();
        newStage.hide();
    }

    @FXML
    void doCloseBox(ActionEvent event) throws IOException{
        String data = contTA.getText();
        PassUserData.getInstance().setTextCont(data);
        HelloApplication.showWindow("login.fxml");
        Stage newStage = (Stage) closeBoxBT.getScene().getWindow();
        newStage.hide();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        contTA.setText(PassUserData.getInstance().getTextCont());
    }
}
