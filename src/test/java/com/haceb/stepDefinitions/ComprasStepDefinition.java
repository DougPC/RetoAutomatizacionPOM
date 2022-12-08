package com.haceb.stepDefinitions;

import com.haceb.steps.ComprasStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class ComprasStepDefinition {

    @Steps
    ComprasStep comprasStep;

    @Dado("^el usuario se encuentre en la pagina web principal en la seccion de categorias$")
    public void elUsuarioSeEncuentreEnLaPaginaWebPrincipalEnLaSeccionDeCategorias() {
        comprasStep.abrirNavegador();
        comprasStep.clickCategorias();


    }

    @Cuando("^seleccione un producto y oprima  comprar$")
    public void seleccioneUnProductoYOprimaComprar() {
        comprasStep.clickCatArticulo();

    }

    @Entonces("^el visulaizara la cantidad de articulos en el carrito de compras$")
    public void elVisulaizaraLaCantidadDeArticulosEnElCarritoDeCompras() throws IOException {
        comprasStep.comprarArt();
        comprasStep.buscarArt();

    }


}
