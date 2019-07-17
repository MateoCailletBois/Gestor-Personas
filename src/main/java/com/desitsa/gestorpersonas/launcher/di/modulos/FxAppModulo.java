package com.desitsa.gestorpersonas.launcher.di.modulos;

import com.desitsa.gestorpersonas.launcher.di.anotaciones.FxAppScoped;
import dagger.Module;
import dagger.Provides;
import javafx.fxml.FXMLLoader;
import javafx.fxml.LoadException;
import javafx.util.Callback;

import javax.inject.Provider;
import java.io.UncheckedIOException;
import java.net.URL;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.function.Function;

@Module(includes = {FxControllersModulo.class})
public class FxAppModulo {

    @Provides
    @FxAppScoped
    Callback<Class<?>, Object> provideControllerFactory(Map<Class<?>, Provider<Object>> providers) {
        return clazz -> {
            Provider<?> provider = providers.get(clazz);
            if (provider == null) {
                throw new UncheckedIOException(new LoadException("Controller not registered for class: " + clazz.getName()));
            }
            Object controller = provider.get();
            if (!clazz.isInstance(controller)) {
                throw new UncheckedIOException(new LoadException("Registered controller not instance of class: " + clazz.getName()));
            }
            return controller;
        };
    }

    @Provides
    @FxAppScoped
    Function<URL, FXMLLoader> provideFxmlLoaderFactory(Callback<Class<?>, Object> controllerFactory) {
        return url -> {
            FXMLLoader loader = new FXMLLoader(url);
            loader.setControllerFactory(controllerFactory);
            return loader;
        };
    }
}