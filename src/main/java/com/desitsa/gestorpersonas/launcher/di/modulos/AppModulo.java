package com.desitsa.gestorpersonas.launcher.di.modulos;

import com.desitsa.gestorpersonas.aplicacion.GestorPersona;
import com.desitsa.gestorpersonas.aplicacion.IGestorPersona;
import com.desitsa.gestorpersonas.aplicacion.IPersonaEndPoint;
import com.desitsa.gestorpersonas.comunicacion.PersonaEndPoint;
import com.desitsa.gestorpersonas.presentacion.vista.DataModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

import javax.inject.Singleton;

@Module
public abstract class AppModulo {

    @Binds
    abstract IGestorPersona bindGestorPersona(GestorPersona gestorPersona);

    @Binds
    abstract IPersonaEndPoint bindPersonaEndpoint(PersonaEndPoint personaEndPoint);
}
