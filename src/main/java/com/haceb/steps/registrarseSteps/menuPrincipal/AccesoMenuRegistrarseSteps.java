package com.haceb.steps.registrarseSteps.menuPrincipal;

import com.haceb.PageObject.registrarsePage.menuPrincipal.AccesoMenuRegistrarsePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


import static com.haceb.utils.EsperasExplicitas.esperarElemento;

public class AccesoMenuRegistrarseSteps {
@Page
 private AccesoMenuRegistrarsePage accesoMenuRegistrarse;
    @Step("Open Browser y close alert")
    public void openUrl(){

        accesoMenuRegistrarse.openUrl("https://www.haceb.com/");

        esperarElemento( accesoMenuRegistrarse.getDriver(),accesoMenuRegistrarse.getAlertInicio());
        accesoMenuRegistrarse.getDriver().findElement(accesoMenuRegistrarse.getAlertInicio()).click();
    }

   @Step ("oprimo el boton Entrar")
    public void oprimirBtnentrar(){
       esperarElemento(accesoMenuRegistrarse.getDriver(),accesoMenuRegistrarse.getBtnEntrar());
               accesoMenuRegistrarse.getDriver().findElement(accesoMenuRegistrarse.getBtnEntrar()).click();
    }
    @Step("presiono el link registrarse")
    public void oprimirLinkRegistrarse(){
        esperarElemento(accesoMenuRegistrarse.getDriver(),(accesoMenuRegistrarse.getLinkVBtnRegistrarse()));
        accesoMenuRegistrarse.getDriver().findElement(accesoMenuRegistrarse.getLinkVBtnRegistrarse()).click();

    }




}
