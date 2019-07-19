package com.desitsa.gestorpersonas.launcher.di.componentes;

import com.desitsa.gestorpersonas.aplicacion.GestorPersona;
import com.desitsa.gestorpersonas.aplicacion.GestorPersona_Factory;
import com.desitsa.gestorpersonas.comunicacion.PersonaEndPoint_Factory;
import com.desitsa.gestorpersonas.launcher.di.modulos.FxAppModulo;
import com.desitsa.gestorpersonas.launcher.di.modulos.FxAppModulo_ProvideControllerFactoryFactory;
import com.desitsa.gestorpersonas.launcher.di.modulos.FxAppModulo_ProvideFxmlLoaderFactoryFactory;
import com.desitsa.gestorpersonas.presentacion.vista.ContenedorController;
import com.desitsa.gestorpersonas.presentacion.vista.ContenedorController_Factory;
import com.desitsa.gestorpersonas.presentacion.vista.DataModel;
import com.desitsa.gestorpersonas.presentacion.vista.DataModel_Factory;
import com.desitsa.gestorpersonas.presentacion.vista.editor.EditorController;
import com.desitsa.gestorpersonas.presentacion.vista.editor.EditorController_Factory;
import com.desitsa.gestorpersonas.presentacion.vista.listado.ListadoController;
import com.desitsa.gestorpersonas.presentacion.vista.listado.ListadoController_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.net.URL;
import java.util.Map;
import java.util.function.Function;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
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
public final class DaggerAppComponente implements AppComponente {
  private Provider<DataModel> dataModelProvider;

  private Provider<GestorPersona> gestorPersonaProvider;

  private DaggerAppComponente() {

    initialize();
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponente create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.dataModelProvider = DoubleCheck.provider(DataModel_Factory.create());
    this.gestorPersonaProvider = GestorPersona_Factory.create((Provider) PersonaEndPoint_Factory.create());
  }

  @Override
  public FxAppComponente.Builder fxApp() {
    return new FxAppComponenteBuilder();}

  public static final class Builder {
    private Builder() {
    }

    public AppComponente build() {
      return new DaggerAppComponente();
    }
  }

  private final class FxAppComponenteBuilder implements FxAppComponente.Builder {
    private Application application;

    private Stage mainWindow;

    @Override
    public FxAppComponenteBuilder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public FxAppComponenteBuilder mainWindow(Stage mainWindow) {
      this.mainWindow = Preconditions.checkNotNull(mainWindow);
      return this;
    }

    @Override
    public FxAppComponente build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      Preconditions.checkBuilderRequirement(mainWindow, Stage.class);
      return new FxAppComponenteImpl(new FxAppModulo(), application, mainWindow);
    }
  }

  private final class FxAppComponenteImpl implements FxAppComponente {
    private Provider<ListadoController> listadoControllerProvider;

    private Provider<EditorController> editorControllerProvider;

    private Provider<Map<Class<?>, Provider<Object>>> mapOfClassOfAndProviderOfObjectProvider;

    private Provider<Callback<Class<?>, Object>> provideControllerFactoryProvider;

    private Provider<Function<URL, FXMLLoader>> provideFxmlLoaderFactoryProvider;

    private FxAppComponenteImpl(FxAppModulo fxAppModuloParam, Application application,
        Stage mainWindow) {

      initialize(fxAppModuloParam, application, mainWindow);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final FxAppModulo fxAppModuloParam, final Application application,
        final Stage mainWindow) {
      this.listadoControllerProvider = ListadoController_Factory.create(DaggerAppComponente.this.dataModelProvider, (Provider) DaggerAppComponente.this.gestorPersonaProvider);
      this.editorControllerProvider = EditorController_Factory.create(DaggerAppComponente.this.dataModelProvider, (Provider) DaggerAppComponente.this.gestorPersonaProvider);
      this.mapOfClassOfAndProviderOfObjectProvider = MapProviderFactory.<Class<?>, Object>builder(3).put(ContenedorController.class, (Provider) ContenedorController_Factory.create()).put(ListadoController.class, (Provider) listadoControllerProvider).put(EditorController.class, (Provider) editorControllerProvider).build();
      this.provideControllerFactoryProvider = DoubleCheck.provider(FxAppModulo_ProvideControllerFactoryFactory.create(fxAppModuloParam, mapOfClassOfAndProviderOfObjectProvider));
      this.provideFxmlLoaderFactoryProvider = DoubleCheck.provider(FxAppModulo_ProvideFxmlLoaderFactoryFactory.create(fxAppModuloParam, provideControllerFactoryProvider));
    }

    @Override
    public Function<URL, FXMLLoader> fxmlLoaderFactory() {
      return provideFxmlLoaderFactoryProvider.get();}
  }
}
