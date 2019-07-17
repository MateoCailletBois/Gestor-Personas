package com.desitsa.gestorpersonas.aplicacion;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GestorPersona_Factory implements Factory<GestorPersona> {
  private final Provider<IPersonaEndPoint> personaEndPointProvider;

  public GestorPersona_Factory(Provider<IPersonaEndPoint> personaEndPointProvider) {
    this.personaEndPointProvider = personaEndPointProvider;
  }

  @Override
  public GestorPersona get() {
    return new GestorPersona(personaEndPointProvider.get());
  }

  public static GestorPersona_Factory create(Provider<IPersonaEndPoint> personaEndPointProvider) {
    return new GestorPersona_Factory(personaEndPointProvider);
  }

  public static GestorPersona newInstance(IPersonaEndPoint personaEndPoint) {
    return new GestorPersona(personaEndPoint);
  }
}
