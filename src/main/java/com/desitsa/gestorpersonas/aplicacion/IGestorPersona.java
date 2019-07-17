package com.desitsa.gestorpersonas.aplicacion;

import java.util.List;

public interface IGestorPersona {

    List<PersonaDTO> obtenerTodas() throws RuntimeException;

    void guardar(PersonaDTO personaDTO) throws RuntimeException;

    void eliminar(PersonaDTO personaDTO) throws RuntimeException;
}
