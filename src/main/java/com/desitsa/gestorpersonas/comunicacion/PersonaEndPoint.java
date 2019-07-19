package com.desitsa.gestorpersonas.comunicacion;

import com.desitsa.gestorpersonas.aplicacion.IPersonaEndPoint;
import com.desitsa.gestorpersonas.aplicacion.PersonaDTO;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class PersonaEndPoint implements IPersonaEndPoint {

    private static List<PersonaDTO> listaPersonas;
    private static int ultimoID;

    @Inject
    public PersonaEndPoint() {

    }

    //******************************( METODOS PUBLICOS )******************************
    public List<PersonaDTO> getAll() throws RuntimeException {
        iniciarLista();
        imprimirBaseDeDatos("getAll", null);
        return listaPersonas;
    }

    public PersonaDTO save(PersonaDTO persona) throws RuntimeException {
        persona.setId(++ultimoID);
        listaPersonas.add(persona);
        imprimirBaseDeDatos("Save", persona);
        return persona;
    }

    public PersonaDTO update(PersonaDTO personaParaActualizada) throws RuntimeException {
        PersonaDTO personaParaQuitar = null;
        for (PersonaDTO persona : listaPersonas) {
            if (persona.getId().equals(personaParaActualizada.getId()))
                personaParaQuitar = persona;
        }
        listaPersonas.remove(personaParaQuitar);
        listaPersonas.add(personaParaActualizada);
        imprimirBaseDeDatos("Update", personaParaActualizada);
        return personaParaActualizada;
    }

    public PersonaDTO delete(PersonaDTO persona) throws RuntimeException {
        PersonaDTO personaParaEliminar = null;
        for (PersonaDTO p : listaPersonas) {
            if (p.getId().equals(persona.getId()))
                personaParaEliminar = p;
        }
        listaPersonas.remove(personaParaEliminar);
        imprimirBaseDeDatos("Delete", persona);
        return personaParaEliminar;
    }

    //******************************( METODOS PRIVADOS )******************************
    private void iniciarLista() throws RuntimeException {
        listaPersonas = new ArrayList<>();
        listaPersonas.add(new PersonaDTO(1,"Mateo", "Baudino", 37732758));
        listaPersonas.add(new PersonaDTO(2,"Julian", "Gautier", 36547895));
        listaPersonas.add(new PersonaDTO(3,"Pepe", "Guardiola", 14555214));
        listaPersonas.add(new PersonaDTO(4,"Yoryo", "Trabis ", 55478963));
        listaPersonas.add(new PersonaDTO(5,"Papu", "Papurris", 12345678));
        ultimoID = listaPersonas.size();
    }

    private void imprimirBaseDeDatos(String accion, PersonaDTO persona) {
        System.out.println("Realizando: " + accion + " Con: " + persona);
        for (PersonaDTO personaDTO : listaPersonas) {
            System.out.println(personaDTO);
        }
    }
}
