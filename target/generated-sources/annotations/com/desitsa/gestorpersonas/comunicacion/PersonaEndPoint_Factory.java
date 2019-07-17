package com.desitsa.gestorpersonas.comunicacion;

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
public final class PersonaEndPoint_Factory implements Factory<PersonaEndPoint> {
  private static final PersonaEndPoint_Factory INSTANCE = new PersonaEndPoint_Factory();

  @Override
  public PersonaEndPoint get() {
    return new PersonaEndPoint();
  }

  public static PersonaEndPoint_Factory create() {
    return INSTANCE;
  }

  public static PersonaEndPoint newInstance() {
    return new PersonaEndPoint();
  }
}
