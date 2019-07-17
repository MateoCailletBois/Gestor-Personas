package com.desitsa.gestorpersonas.presentacion.vista.listado;

import com.desitsa.gestorpersonas.aplicacion.IGestorPersona;
import com.desitsa.gestorpersonas.presentacion.vista.DataModel;
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
public final class ListadoController_Factory implements Factory<ListadoController> {
  private final Provider<DataModel> dataModelProvider;

  private final Provider<IGestorPersona> gestorPersonaProvider;

  public ListadoController_Factory(Provider<DataModel> dataModelProvider,
      Provider<IGestorPersona> gestorPersonaProvider) {
    this.dataModelProvider = dataModelProvider;
    this.gestorPersonaProvider = gestorPersonaProvider;
  }

  @Override
  public ListadoController get() {
    return new ListadoController(dataModelProvider.get(), gestorPersonaProvider.get());
  }

  public static ListadoController_Factory create(Provider<DataModel> dataModelProvider,
      Provider<IGestorPersona> gestorPersonaProvider) {
    return new ListadoController_Factory(dataModelProvider, gestorPersonaProvider);
  }

  public static ListadoController newInstance(DataModel dataModel, IGestorPersona gestorPersona) {
    return new ListadoController(dataModel, gestorPersona);
  }
}
