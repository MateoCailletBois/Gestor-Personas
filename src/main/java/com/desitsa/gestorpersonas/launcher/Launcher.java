package com.desitsa.gestorpersonas.launcher;

import com.desitsa.gestorpersonas.presentacion.vista.ContenedorController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(Class.forName(ContenedorController.class.getName()).getResource("Contenedor.fxml"))));
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);
        primaryStage.show();
    }
}
