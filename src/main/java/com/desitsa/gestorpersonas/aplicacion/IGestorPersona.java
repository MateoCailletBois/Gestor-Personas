package com.desitsa.gestorpersonas.aplicacion;

import java.util.List;

public interface IGestorPersona {

    List<PersonaDTO> obtenerTodas() throws RuntimeException;

    PersonaDTO guardar(PersonaDTO personaDTO) throws RuntimeException;

    PersonaDTO eliminar(PersonaDTO personaDTO) throws RuntimeException;
}
