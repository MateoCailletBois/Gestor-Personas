package com.desitsa.gestorpersonas.launcher.di.componentes;

import com.desitsa.gestorpersonas.launcher.di.modulos.AppModulo;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModulo.class})
public interface AppComponente {

    FxAppComponente.Builder fxApp();
}