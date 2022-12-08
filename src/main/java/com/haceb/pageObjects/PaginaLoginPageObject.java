package com.haceb.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.haceb.com/HacebLogin")

public class PaginaLoginPageObject extends PageObject {

   // By txtCoreoElectronico = By.xpath("//*[@id='emailHash']");
   // By txtCoreoElectronico = By.xpath("//*[@id='gigya-loginID-51216659851706440']");
    By btnInicioSesion = By.xpath("//*[@id='gigya-register-form']/div[2]/a/h5");
    By loginCorreo = By.xpath("//*[@id='emailHash']");
    By loginClave = By.xpath("//*[@id='loginhash']");
    By btnEnviar = By.xpath("//*[@id='submitLogin']");


   // public By getTxtCoreoElectronico() { return txtCoreoElectronico;   }

    public By getBtnInicioSesion() {  return btnInicioSesion;   }

    public By getLoginCorreo() {      return loginCorreo;    }

    public By getLoginClave() { return loginClave; }

    public By getBtnEnviar() { return btnEnviar; }
}
