package com.desitsa.gestorpersonas.launcher.di.modulos;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.net.URL;
import java.util.function.Function;
import javafx.fxml.FXMLLoader;
import javafx.util.Callback;
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
public final class FxAppModulo_ProvideFxmlLoaderFactoryFactory implements Factory<Function<URL, FXMLLoader>> {
  private final FxAppModulo module;

  private final Provider<Callback<Class<?>, Object>> controllerFactoryProvider;

  public FxAppModulo_ProvideFxmlLoaderFactoryFactory(FxAppModulo module,
      Provider<Callback<Class<?>, Object>> controllerFactoryProvider) {
    this.module = module;
    this.controllerFactoryProvider = controllerFactoryProvider;
  }

  @Override
  public Function<URL, FXMLLoader> get() {
    return provideFxmlLoaderFactory(module, controllerFactoryProvider.get());
  }

  public static FxAppModulo_ProvideFxmlLoaderFactoryFactory create(FxAppModulo module,
      Provider<Callback<Class<?>, Object>> controllerFactoryProvider) {
    return new FxAppModulo_ProvideFxmlLoaderFactoryFactory(module, controllerFactoryProvider);
  }

  public static Function<URL, FXMLLoader> provideFxmlLoaderFactory(FxAppModulo instance,
      Callback<Class<?>, Object> controllerFactory) {
    return Preconditions.checkNotNull(instance.provideFxmlLoaderFactory(controllerFactory), "Cannot return null from a non-@Nullable @Provides method");
  }
}
