package com.haceb.PageObject.registrarsePage.menuPrincipal;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AccesoMenuRegistrarsePage extends PageObject {


    private By alertInicio=By.xpath("//div[@class='gigya-screen-dialog-close']");
private By btnEntrar =By.xpath("//span[@class='vtex-login-2-x-label t-action--small pl4 gray dn db-l']");
private By linkVBtnRegistrarse=By.xpath("//button[contains(@class, 'vtex-button') and contains(@class, 'c-action-primary') and .//span[contains(text(), 'Entrar con')]]");




    public By getAlertInicio() {
        return alertInicio;
    }

    public By getBtnEntrar() {
        return btnEntrar;
    }



    public By getLinkVBtnRegistrarse() {
        return linkVBtnRegistrarse;
    }




}
