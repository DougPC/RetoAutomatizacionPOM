package com.haceb.steps;

import com.haceb.pageObjects.PaginaLoginPageObject;
import com.haceb.utils.DatosExcel;
import com.haceb.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class PaginaLoginStep {

   // PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    PaginaLoginPageObject paginaLoginPageObject = new PaginaLoginPageObject();
    DatosExcel datosExcel = new DatosExcel();

    @Step
    public void abrirNavegador(){
        paginaLoginPageObject.open();

    }

    @Step
    public void inicioSesion(){
        paginaLoginPageObject.getDriver().findElement(paginaLoginPageObject.getBtnInicioSesion()).click();
    }



    @Step
    public  void ingresarCorreo() throws IOException {

       // paginaLoginPageObject.getDriver().findElement(paginaLoginPageObject.getTxtCoreoElectronico()).sendKeys("");

        /*paginaLoginPageObject.getDriver().findElement(paginaLoginPageObject.getTxtCoreoElectronico())
                .sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","DatosLogin",1,0));*/

    }

    @Step
    public void loginCorreo () throws IOException {
      //  paginaLoginPageObject.getDriver().findElement(paginaLoginPageObject.getLoginCorreo()).sendKeys(" ");

        paginaLoginPageObject.getDriver().findElement(paginaLoginPageObject.getLoginCorreo())
                .sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","DatosLogin",1,0));

        paginaLoginPageObject.getDriver().findElement(paginaLoginPageObject.getLoginClave())
                .sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","DatosLogin",1,1));

        paginaLoginPageObject.getDriver().findElement(paginaLoginPageObject.getBtnEnviar()).click();

        esperaImplicita.esperaImplicita(10 );
    }



}
