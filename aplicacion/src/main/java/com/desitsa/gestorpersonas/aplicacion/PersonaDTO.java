package com.desitsa.gestorpersonas.aplicacion;

public class PersonaDTO {

    private int id;
    private String nombre;
    private String apellido;
    private int dni;

    public PersonaDTO() {}

    public PersonaDTO(int id, String nombre, String apellido, int dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    //******************************( GETTER )******************************
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getDni() { return dni; }

    //******************************( SETTER )******************************
    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setDni(int dni) { this.dni = dni; }
}
