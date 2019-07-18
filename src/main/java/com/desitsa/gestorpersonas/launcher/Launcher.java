package com.desitsa.gestorpersonas.launcher;

import com.desitsa.gestorpersonas.launcher.di.componentes.DaggerAppComponente;
import com.desitsa.gestorpersonas.launcher.di.componentes.FxAppComponente;
import com.desitsa.gestorpersonas.presentacion.vista.ContenedorController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FxAppComponente fxApp = DaggerAppComponente.create().fxApp().application(this).mainWindow(primaryStage).build();
        FXMLLoader loader = fxApp.loader((ContenedorController.class).getResource("Contenedor.fxml"));
        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);
        primaryStage.show();
    }
}
