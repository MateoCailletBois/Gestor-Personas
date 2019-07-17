package com.desitsa.gestorpersonas.presentacion.vista;

import com.desitsa.gestorpersonas.presentacion.vista.editor.EditorController;
import com.desitsa.gestorpersonas.presentacion.vista.listado.ListadoController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import javax.inject.Inject;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Function;

public class ContenedorController implements Initializable {

    @FXML private BorderPane root;
    private Function<URL, FXMLLoader> fxmlLoaderFactory;

    @Inject
    public ContenedorController(Function<URL, FXMLLoader> fxmlLoaderFactory) {
        this.fxmlLoaderFactory = fxmlLoaderFactory;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            root.setCenter(fxmlLoaderFactory.apply(ListadoController.class.getResource("Listado.fxml")).load());
            root.setRight(fxmlLoaderFactory.apply(EditorController.class.getResource("Editor.fxml")).load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
