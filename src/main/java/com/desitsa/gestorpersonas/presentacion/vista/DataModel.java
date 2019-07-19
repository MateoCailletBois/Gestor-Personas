package com.desitsa.gestorpersonas.presentacion.vista;

import com.desitsa.gestorpersonas.presentacion.viewmodel.Persona;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class DataModel {

    private final ObservableList<Persona> listaPersonas = FXCollections.observableArrayList();
    private final ObjectProperty<Persona> personaSeleccionada = new SimpleObjectProperty<>(null);

    @Inject
    public DataModel() { }

    //******************************( METODOS PUBLICOS )******************************
    public void removerPersona(Persona persona) throws RuntimeException {
        listaPersonas.remove(persona);
    }

    public void guardarPersona(Persona persona) throws RuntimeException {
        Persona personaParaReemplazar = listaPersonas.stream().filter(p -> p.getId().equals(persona.getId())).findAny().orElse(null);
        if (null == personaParaReemplazar)
            listaPersonas.add(persona);
        else
            listaPersonas.set(listaPersonas.indexOf(personaParaReemplazar), persona);
    }

    //******************************( GETTER )******************************
    public ObservableList<Persona> getListaPersonas() { return listaPersonas; }
    public Persona getPersonaSeleccionada() { return personaSeleccionada.get(); }
    public ObjectProperty<Persona> personaSeleccionadaProperty() { return personaSeleccionada; }

    //******************************( SETTER )******************************
    public void setListaPersonas(List<Persona> listaPersona) { listaPersonas.setAll(listaPersona); }
    public void setPersonaSeleccionada(Persona personaSeleccionada) { this.personaSeleccionada.set(personaSeleccionada); }
}