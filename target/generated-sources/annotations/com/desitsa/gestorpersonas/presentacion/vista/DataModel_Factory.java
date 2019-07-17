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
public final class DataModel_Factory implements Factory<DataModel> {
  private static final DataModel_Factory INSTANCE = new DataModel_Factory();

  @Override
  public DataModel get() {
    return new DataModel();
  }

  public static DataModel_Factory create() {
    return INSTANCE;
  }

  public static DataModel newInstance() {
    return new DataModel();
  }
}
