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

    public void guardar(PersonaDTO personaDTO) throws RuntimeException {
        if (null == personaDTO.getId())
            personaEndPoint.save(personaDTO);
        else
            personaEndPoint.update(personaDTO);
    }

    public void eliminar(PersonaDTO personaDTO) throws RuntimeException {
        personaEndPoint.delete(personaDTO);
    }
}
