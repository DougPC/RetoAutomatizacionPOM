package com.haceb.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.haceb.com/")
public class ComprasPageObject extends PageObject {

    By btnCategoria = By.xpath("//*[@id='btnDropMenu']/a");
    By btnCatArticulo = By.xpath("//*[@id='contentCategory']/li[1]/a");
    By btnArtSeleccionado = By.xpath("/html/body/div[4]/div/div[3]/div[2]/div/div/a/button");
    By btnComprarArticulo = By.xpath("/html/body/div[5]/div[3]/div[2]/div[1]/div[4]/div[7]/a");
    By btnBuscarArticulo = By.xpath("/html/body/header/div[2]/div[5]/div[1]/span");
    By txtBuscarArticulo = By.xpath("//*[@id='full-search']");
    By clickArt = By.xpath("/html/body/header/div[2]/div[4]/div/div/li[2]/a/span[2]");
    By btnComprararticulo2 = By.xpath("/html/body/div[5]/div[3]/div[2]/div[1]/div[4]/div[7]/a");


    public By getBtnCategoria() {    return btnCategoria;    }

    public By getBtnCatArticulo() {    return btnCatArticulo;  }

    public By getBtnArtSeleccionado() {     return btnArtSeleccionado;    }

   public By getBtnComprarArticulo() {      return btnComprarArticulo;    }

    public By getBtnBuscarArticulo() {        return btnBuscarArticulo;    }

    public By getTxtBuscarArticulo() {  return txtBuscarArticulo;  }

    public By getClickArt() {     return clickArt;   }

    public By getBtnComprararticulo2() {   return btnComprararticulo2;    }
}
