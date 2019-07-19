package com.desitsa.gestorpersonas.aplicacion;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class PersonaDTO {

    private Integer id;
    private String nombre;
    private String apellido;
    private int dni;

    public PersonaDTO() {}

    public PersonaDTO(Integer id, String nombre, String apellido, Integer dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    //******************************( GETTER )******************************
    public Integer getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getDni() { return dni; }

    //******************************( SETTER )******************************
    public void setId(Integer id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setDni(int dni) { this.dni = dni; }

    @Override
    public String toString() {
        return "@" + System.identityHashCode(this) + " ID:" + getId() + " Nombre:" + getNombre() + " Apellido:" + getApellido() + " DNI:" + getDni();
    }
}
