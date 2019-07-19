package com.desitsa.gestorpersonas.aplicacion;

import java.util.List;

public interface IPersonaEndPoint {
    List<PersonaDTO> getAll();
    PersonaDTO update(PersonaDTO personaActualizada);
    PersonaDTO save(PersonaDTO persona);
    PersonaDTO delete(PersonaDTO persona);
}
