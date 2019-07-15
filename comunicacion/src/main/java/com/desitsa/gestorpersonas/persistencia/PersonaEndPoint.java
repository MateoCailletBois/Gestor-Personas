package com.desitsa.gestorpersonas.persistencia;

import com.desitsa.gestorpersonas.aplicacion.IPersonaEndPoint;
import com.desitsa.gestorpersonas.aplicacion.PersonaDTO;

import java.util.ArrayList;
import java.util.List;

public class PersonaEndPoint implements IPersonaEndPoint {

    private static List<PersonaDTO> listaPersonas;

    //******************************( METODOS PUBLICOS )******************************
    public List<PersonaDTO> getAll() {
        if (listaPersonas == null)
            iniciarLista();
        return listaPersonas;
    }

    public void save(PersonaDTO persona) {
        listaPersonas.add(persona);
    }

    public void update(PersonaDTO personaActualizada) {
        for (PersonaDTO persona : listaPersonas) {
            if (persona.getId() == persona.getId()) {
                listaPersonas.remove(persona);
                listaPersonas.add(personaActualizada);
            }
        }
    }

    public void delete(PersonaDTO persona) {
        PersonaDTO persona_a_eliminar = null;
        for (PersonaDTO p : listaPersonas) {
            if (p.getId() == persona.getId())
                persona_a_eliminar = p;
        }
        listaPersonas.remove(persona_a_eliminar);
    }

    //******************************( METODOS PRIVADOS )******************************
    private  void iniciarLista() {
        listaPersonas = new ArrayList<>();
        listaPersonas.add(new PersonaDTO(1,"Mateo", "Baudino", 37732758));
        listaPersonas.add(new PersonaDTO(2,"Julian", "Gautier", 36547895));
        listaPersonas.add(new PersonaDTO(3,"Pepe", "Guardiola", 14555214));
        listaPersonas.add(new PersonaDTO(4,"Yoryo", "Trabis ", 55478963));
        listaPersonas.add(new PersonaDTO(5,"Papu", "Papurris", 12345678));
    }
}
