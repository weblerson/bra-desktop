package com.bra.bradesktop;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {

    @FXML
    private Label introLabel;

    @FXML
    public void onToRegisterAction() throws IOException {

        FXMLLoader root = new FXMLLoader(getClass().getResource("RegisterView.fxml"));

        Stage window = (Stage) this.introLabel.getScene().getWindow();

        Scene scene = new Scene(root.load());
        window.setTitle("BRA Premens: Cadastro");
        window.setScene(scene);
    }

    @FXML
    public void onToChangeAction() {
    }

    @FXML
    public void onToGetterAction() {
    }
}