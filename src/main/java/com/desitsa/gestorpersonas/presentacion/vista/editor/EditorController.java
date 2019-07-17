package com.desitsa.gestorpersonas.presentacion.vista.editor;

import com.desitsa.gestorpersonas.aplicacion.IGestorPersona;
import com.desitsa.gestorpersonas.aplicacion.PersonaDTO;
import com.desitsa.gestorpersonas.presentacion.viewmodel.Persona;
import com.desitsa.gestorpersonas.presentacion.vista.DataModel;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import javax.inject.Inject;
import java.net.URL;
import java.util.ResourceBundle;

public class EditorController implements Initializable {

    @FXML private TextField tfNombre;
    @FXML private TextField tfApellido;
    @FXML private TextField tfDni;
    private DataModel dataModel;
    private IGestorPersona gestorPersona;

    @Inject
    public EditorController(DataModel dataModel, IGestorPersona gestorPersona) {
        this.dataModel = dataModel;
        this.gestorPersona = gestorPersona;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       bindDataModel();
    }

    //******************************( METODOS PRIVADOS )******************************
    @FXML
    private void guardar() {
        try {
            Mapper mapper = DozerBeanMapperBuilder.buildDefault();
            gestorPersona.guardar(mapper.map(dataModel.getPersonaSeleccionada(), PersonaDTO.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void eliminar() {
        try {
            Mapper mapper = DozerBeanMapperBuilder.buildDefault();
            Persona personaActual = dataModel.getPersonaSeleccionada();
            gestorPersona.eliminar(mapper.map(personaActual, PersonaDTO.class));
            dataModel.removerPersona(personaActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void bindDataModel() {
        dataModel.personaSeleccionadaProperty().addListener((obs, personaAnterior, personaActual) -> {
            if (personaActual == null) {
                limpiarCampos();
            } else {
                llenarCampos();
            }
        });
    }

    private void limpiarCampos() {
        tfNombre.clear();
        tfApellido.clear();
        tfDni.clear();
    }

    private void llenarCampos() {
        Persona personaActual = dataModel.getPersonaSeleccionada();
        tfNombre.setText(personaActual.getNombre());
        tfApellido.setText(personaActual.getApellido());
        tfDni.setText(personaActual.getDni());
    }
}
