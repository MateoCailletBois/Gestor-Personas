package com.desitsa.gestorpersonas.aplicacion;

import javax.inject.Inject;
import java.util.List;

public class GestorPersona implements IGestorPersona {

    private IPersonaEndPoint personaEndPoint;

    @Inject
    public GestorPersona(IPersonaEndPoint personaEndPoint) {
        this.personaEndPoint = personaEndPoint;
    }

    public List<PersonaDTO> obtenerTodas() throws RuntimeException {
        return personaEndPoint.getAll();
    }

    public PersonaDTO guardar(PersonaDTO personaDTO) throws RuntimeException {
        if (null == personaDTO.getId())
            return personaEndPoint.save(personaDTO);
        else
            return personaEndPoint.update(personaDTO);
    }

    public PersonaDTO eliminar(PersonaDTO personaDTO) throws RuntimeException {
        return personaEndPoint.delete(personaDTO);
    }
}
