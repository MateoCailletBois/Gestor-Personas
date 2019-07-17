package com.desitsa.gestorpersonas.presentacion.vista.listado;

import com.desitsa.gestorpersonas.aplicacion.GestorPersona;
import com.desitsa.gestorpersonas.aplicacion.PersonaDTO;
import com.desitsa.gestorpersonas.presentacion.viewmodel.Persona;
import com.desitsa.gestorpersonas.presentacion.vista.DataModel;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ListadoController implements Initializable {

    @FXML private ListView<Persona> lvPersona;
    private DataModel dataModel;
    private GestorPersona gestorPersona;

//    public ListadoController(DataModel dataModel, GestorPersona gestorPersona) {
//        this.dataModel = dataModel;
//        this.gestorPersona = gestorPersona;
//    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        iniciarDataModel();
        bindDataModel();
    }

    //******************************( METODOS PRIVADOS )******************************
    private void iniciarDataModel() {
//        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
//        List<Persona> listaPersonas = new ArrayList<>();
//        for (PersonaDTO personaDTO : gestorPersona.obtenerTodas())
//            listaPersonas.add(mapper.map(personaDTO, Persona.class));
//        dataModel.setListaPersonas(listaPersonas);
    }

    private void bindDataModel() {
//        lvPersona.setItems(dataModel.getListaPersonas());
//        lvPersona.getSelectionModel().selectedItemProperty().addListener((obs, personaAnterior, personaActual) -> dataModel.setPersonaSeleccionada(personaActual));
//        lvPersona.setCellFactory(lvPersona -> new ListCell<Persona>() {
//            @Override
//            public void updateItem(Persona persona, boolean empty) {
//                super.updateItem(persona, empty);
//                if (empty || persona == null)
//                    setText(null);
//                else
//                    setText(persona.getNombre() + " " + persona.getApellido());
//            }
//        });
    }
}
