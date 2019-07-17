package com.desitsa.gestorpersonas.launcher.di.modulos;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
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
public final class FxAppModulo_ProvideControllerFactoryFactory implements Factory<Callback<Class<?>, Object>> {
  private final FxAppModulo module;

  private final Provider<Map<Class<?>, Provider<Object>>> providersProvider;

  public FxAppModulo_ProvideControllerFactoryFactory(FxAppModulo module,
      Provider<Map<Class<?>, Provider<Object>>> providersProvider) {
    this.module = module;
    this.providersProvider = providersProvider;
  }

  @Override
  public Callback<Class<?>, Object> get() {
    return provideControllerFactory(module, providersProvider.get());
  }

  public static FxAppModulo_ProvideControllerFactoryFactory create(FxAppModulo module,
      Provider<Map<Class<?>, Provider<Object>>> providersProvider) {
    return new FxAppModulo_ProvideControllerFactoryFactory(module, providersProvider);
  }

  public static Callback<Class<?>, Object> provideControllerFactory(FxAppModulo instance,
      Map<Class<?>, Provider<Object>> providers) {
    return Preconditions.checkNotNull(instance.provideControllerFactory(providers), "Cannot return null from a non-@Nullable @Provides method");
  }
}
