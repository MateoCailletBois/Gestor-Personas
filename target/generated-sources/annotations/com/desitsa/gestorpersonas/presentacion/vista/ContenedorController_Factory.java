package com.desitsa.gestorpersonas.presentacion.vista;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ContenedorController_Factory implements Factory<ContenedorController> {
  private static final ContenedorController_Factory INSTANCE = new ContenedorController_Factory();

  @Override
  public ContenedorController get() {
    return new ContenedorController();
  }

  public static ContenedorController_Factory create() {
    return INSTANCE;
  }

  public static ContenedorController newInstance() {
    return new ContenedorController();
  }
}
