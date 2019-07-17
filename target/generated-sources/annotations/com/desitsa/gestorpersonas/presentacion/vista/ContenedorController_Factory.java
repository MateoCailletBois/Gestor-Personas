package com.desitsa.gestorpersonas.presentacion.vista;

import dagger.internal.Factory;
import java.net.URL;
import java.util.function.Function;
import javafx.fxml.FXMLLoader;
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
public final class ContenedorController_Factory implements Factory<ContenedorController> {
  private final Provider<Function<URL, FXMLLoader>> fxmlLoaderFactoryProvider;

  public ContenedorController_Factory(
      Provider<Function<URL, FXMLLoader>> fxmlLoaderFactoryProvider) {
    this.fxmlLoaderFactoryProvider = fxmlLoaderFactoryProvider;
  }

  @Override
  public ContenedorController get() {
    return new ContenedorController(fxmlLoaderFactoryProvider.get());
  }

  public static ContenedorController_Factory create(
      Provider<Function<URL, FXMLLoader>> fxmlLoaderFactoryProvider) {
    return new ContenedorController_Factory(fxmlLoaderFactoryProvider);
  }

  public static ContenedorController newInstance(Function<URL, FXMLLoader> fxmlLoaderFactory) {
    return new ContenedorController(fxmlLoaderFactory);
  }
}
