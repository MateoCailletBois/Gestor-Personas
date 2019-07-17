package com.desitsa.gestorpersonas.presentacion.vista;

import com.desitsa.gestorpersonas.presentacion.viewmodel.Persona;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class DataModel {

    private final ObservableList<Persona> listaPersonas = FXCollections.observableArrayList();
    private final ObjectProperty<Persona> personaSeleccionada = new SimpleObjectProperty<>(null);

    //******************************( METODOS PUBLICOS )******************************
    public void removerPersona(Persona persona) {
        listaPersonas.remove(persona);
    }

    //******************************( GETTER )******************************
    public ObservableList<Persona> getListaPersonas() { return listaPersonas; }
    public Persona getPersonaSeleccionada() { return personaSeleccionada.get(); }
    public ObjectProperty<Persona> personaSeleccionadaProperty() { return personaSeleccionada; }

    //******************************( SETTER )******************************
    public void setListaPersonas(List<Persona> listaPersona) { listaPersonas.setAll(listaPersona); }
    public void setPersonaSeleccionada(Persona personaSeleccionada) { this.personaSeleccionada.set(personaSeleccionada); }
}
