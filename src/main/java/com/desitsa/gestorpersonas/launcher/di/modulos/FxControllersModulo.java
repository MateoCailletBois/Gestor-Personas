package com.desitsa.gestorpersonas.launcher.di.modulos;

import com.desitsa.gestorpersonas.presentacion.vista.ContenedorController;
import com.desitsa.gestorpersonas.presentacion.vista.editor.EditorController;
import com.desitsa.gestorpersonas.presentacion.vista.listado.ListadoController;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module
abstract class FxControllersModulo {

    @Binds
    @IntoMap
    @ClassKey(ContenedorController.class)
    abstract Object bindContenedorController(ContenedorController contenedorController);

    @Binds
    @IntoMap
    @ClassKey(ListadoController.class)
    abstract Object bindListadoController(ListadoController listadoController);

    @Binds
    @IntoMap
    @ClassKey(EditorController.class)
    abstract Object bindEditorController(EditorController editorController);
}