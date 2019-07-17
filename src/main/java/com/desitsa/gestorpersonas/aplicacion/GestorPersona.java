package com.desitsa.gestorpersonas.aplicacion;

import java.util.List;

public class GestorPersona {

    private IPersonaEndPoint personaEndPoint;

    public GestorPersona(IPersonaEndPoint personaEndPoint) {
        this.personaEndPoint = personaEndPoint;
    }

    public List<PersonaDTO> obtenerTodas() {
        return personaEndPoint.getAll();
    }

    public void guardar(PersonaDTO personaDTO) {
        if (null == personaDTO.getId())
            personaEndPoint.save(personaDTO);
        else
            personaEndPoint.update(personaDTO);
    }

    public void eliminar(PersonaDTO personaDTO) {
        personaEndPoint.delete(personaDTO);
    }
}
