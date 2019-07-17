package com.desitsa.gestorpersonas.launcher.di.componentes;

import com.desitsa.gestorpersonas.launcher.di.anotaciones.FxAppScoped;
import com.desitsa.gestorpersonas.launcher.di.modulos.FxAppModulo;
import dagger.BindsInstance;
import dagger.Subcomponent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.function.Function;

@FxAppScoped
@Subcomponent(modules = {FxAppModulo.class})
public interface FxAppComponente {

    Function<URL, FXMLLoader> fxmlLoaderFactory();

    default FXMLLoader loader(URL fxmlUrl) {
        return fxmlLoaderFactory().apply(Objects.requireNonNull(fxmlUrl));
    }

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        @BindsInstance
        Builder mainWindow(Stage mainWindow);

        FxAppComponente build();
    }

}
