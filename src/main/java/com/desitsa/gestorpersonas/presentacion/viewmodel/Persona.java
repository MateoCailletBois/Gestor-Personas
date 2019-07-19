package com.desitsa.gestorpersonas.presentacion.viewmodel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Persona {

    private StringProperty id = new SimpleStringProperty();
    private StringProperty nombre = new SimpleStringProperty();
    private StringProperty apellido = new SimpleStringProperty();
    private StringProperty dni = new SimpleStringProperty();

    public Persona() {}

    public Persona(String id, String nombre, String apellido, String dni) {
        setId(id);
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
    }

    //******************************( GETTER )******************************
    public String getId() { return id.get(); }
    public StringProperty idProperty() { return id; }
    public String getNombre() { return nombre.get(); }
    public StringProperty nombreProperty() { return nombre; }
    public String getApellido() { return apellido.get(); }
    public StringProperty apellidoProperty() { return apellido; }
    public String getDni() { return dni.get(); }
    public StringProperty dniProperty() { return dni; }

    //******************************( SETTER )******************************
    public void setId(String id) { this.id.set(id); }
    public void setNombre(String nombre) { this.nombre.set(nombre); }
    public void setApellido(String apellido) { this.apellido.set(apellido); }
    public void setDni(String dni) { this.dni.set(dni); }
}
