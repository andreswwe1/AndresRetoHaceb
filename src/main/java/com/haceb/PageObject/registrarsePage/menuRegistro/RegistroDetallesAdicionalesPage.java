package com.haceb.PageObject.registrarsePage.menuRegistro;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistroDetallesAdicionalesPage extends PageObject {

    private By cjTxtCedula= By.xpath("//input[@placeholder='Ingrese su documento de identidad *']");
            private By selectGenero=By.id("gigya-dropdown-153944062160082270");

            private By dateFechaNacimiento=By.xpath("//input[@data-display-name='Ingrese una fecha']");
                    private By selectDepartamento=By.id("gigya-dropdown-92626747568210580");
    //select[@id='gigya-dropdown-92626747568210580']
    private By buttonEnviar=By.xpath("(//input[@class='gigya-input-submit hc-c-register-screen-submit invi'])[2]");


    private  By msjInicioSesion=By.xpath("(//span[contains (text (), 'Hola,')])[1]");
   // private  By hola=By.xpath(    "//div[@class='vtex-menu-2-x-styledLinkContent vtex-menu-2-x-styledLinkContent--menu__department-btn vtex-menu-2-x-styledLinkContent--menu__first flex justify-between nowrap']");
private By alertclose=By.xpath("//div[@class='gigya-screen-dialog-close']");

    public By getCjTxtCedula() {
        return cjTxtCedula;
    }

    public By getSelectGenero() {
        return selectGenero;
    }

    public By getDateFechaNacimiento() {
        return dateFechaNacimiento;
    }

    public By getSelectDepartamento() {
        return selectDepartamento;
    }

    public By getButtonEnviar() {
        return buttonEnviar;
    }

    public By getMsjInicioSesion() {
        return msjInicioSesion;
    }

    public By getAlertclose() {
        return alertclose;
    }
}
