package com.desitsa.gestorpersonas.presentacion.vista.editor;

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
public final class EditorController_Factory implements Factory<EditorController> {
  private final Provider<DataModel> dataModelProvider;

  private final Provider<IGestorPersona> gestorPersonaProvider;

  public EditorController_Factory(Provider<DataModel> dataModelProvider,
      Provider<IGestorPersona> gestorPersonaProvider) {
    this.dataModelProvider = dataModelProvider;
    this.gestorPersonaProvider = gestorPersonaProvider;
  }

  @Override
  public EditorController get() {
    return new EditorController(dataModelProvider.get(), gestorPersonaProvider.get());
  }

  public static EditorController_Factory create(Provider<DataModel> dataModelProvider,
      Provider<IGestorPersona> gestorPersonaProvider) {
    return new EditorController_Factory(dataModelProvider, gestorPersonaProvider);
  }

  public static EditorController newInstance(DataModel dataModel, IGestorPersona gestorPersona) {
    return new EditorController(dataModel, gestorPersona);
  }
}
