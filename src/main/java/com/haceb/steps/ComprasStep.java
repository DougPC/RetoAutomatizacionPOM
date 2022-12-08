package com.haceb.steps;

import com.haceb.pageObjects.ComprasPageObject;
import com.haceb.utils.DatosExcel;
import com.haceb.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ComprasStep {
    ComprasPageObject comprasPageObject = new ComprasPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    DatosExcel datosExcel = new DatosExcel();

    @Step
    public void abrirNavegador(){
        comprasPageObject.open();

    }

    @Step
    public void clickCategorias (){
        comprasPageObject.getDriver().findElement(comprasPageObject.getBtnCategoria()).click();

    }

    @Step
    public  void  clickCatArticulo (){

        comprasPageObject.getDriver().findElement(comprasPageObject.getBtnCatArticulo()).click();
        //esperaImplicita.esperaImplicita(10 );
        comprasPageObject.getDriver().findElement(comprasPageObject.getBtnArtSeleccionado()).click();


    }

    @Step
    public  void  comprarArt (){
        comprasPageObject.getDriver().findElement(comprasPageObject.getBtnComprarArticulo()).click();
        esperaImplicita.esperaImplicita(10 );
    }

    @Step
    public void buscarArt() throws IOException {
        comprasPageObject.getDriver().findElement(comprasPageObject.getBtnBuscarArticulo()).click();

        comprasPageObject.getDriver().findElement(comprasPageObject.getTxtBuscarArticulo())
                .sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","Articulos",1,0));

        esperaImplicita.esperaImplicita(5 );
        comprasPageObject.getDriver().findElement(comprasPageObject.getClickArt()).click();
        comprasPageObject.getDriver().findElement(comprasPageObject.getBtnComprararticulo2()).click();
        esperaImplicita.esperaImplicita(5 );

    }


}
