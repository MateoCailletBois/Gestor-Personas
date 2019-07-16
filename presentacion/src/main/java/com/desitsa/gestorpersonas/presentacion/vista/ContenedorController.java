package com.desitsa.gestorpersonas.presentacion.vista;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ContenedorController implements Initializable {

    @FXML private BorderPane root;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            root.setCenter(FXMLLoader.load(getClass().getResource("listado/Listado.fxml")));
            root.setRight(FXMLLoader.load(getClass().getResource("editor/Editor.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
