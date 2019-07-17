package com.desitsa.gestorpersonas.aplicacion;

import java.util.List;

public interface IPersonaEndPoint {
    List<PersonaDTO> getAll();
    void update(PersonaDTO personaActualizada);
    void save(PersonaDTO persona);
    void delete(PersonaDTO persona);
}
