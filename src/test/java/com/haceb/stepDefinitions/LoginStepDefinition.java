package com.haceb.stepDefinitions;


import com.haceb.steps.PaginaLoginStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinition {
    
    @Steps
    PaginaLoginStep paginaLoginStep;



    @Dado("^el usuario se encuentre en la pagina web en el modulo de login$")
    public void elUsuarioSeEncuentreEnLaPaginaWebEnElModuloDeLogin() throws IOException {

       /* paginaInicioStep.abrirNavegador();
        paginaInicioStep.clickMiperfil();
        paginaInicioStep.clickIngresar();
        paginaInicioStep.clickIngresarHaceb();*/

        paginaLoginStep.abrirNavegador();

       /* try {
            paginaLoginStep.ingresarCorreo();
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new RuntimeException(e);
        }*/

        paginaLoginStep.inicioSesion();







    }


    @Cuando("^ingrese los datos requeridos para el login$")
    public void ingreseLosDatosRequeridosParaElLogin() throws IOException {
       //paginaLoginStep.ingresarCorreo();

        paginaLoginStep.loginCorreo();
    }

    @Entonces("^el visulaizara la pagina de perfil de usuario$")
    public void elVisulaizaraLaPaginaDePerfilDeUsuario() {

    }


}
