package com.haceb.PageObject.registrarsePage.menuRegistro;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class RegistroUsuarioNuevoPage extends PageObject {
    private By lnkParaRegistrarse=By.xpath("//a[@class='gigya-composite-control gigya-composite-control-link hc-text-header']/h5");
private By cjTxtEmail=By.xpath("//input[@id='gigya-loginID-51216659851706440']");
private By cjTxtNombre =By.xpath("//input[@placeholder='Nombre *']");
private By cjTxtApellido=By.xpath("//input[@placeholder='Apellido *']");
private By cjTxtClave=By.xpath("//input[@placeholder='Contraseña *']");
private By cjTxtRepetirClave=By.xpath("//input[@placeholder='Confirma la contraseña *']");


//span[@class='gigya-label-text gigya-checkbox-text __web-inspector-hide-shortcut__']
    //  @FindBy(xpath = "(//span[@class='gigya-label-text gigya-checkbox-text'])[5]")

   @FindBy(xpath = "//form[@class='gigya-register-form' and @id='gigya-register-form']/div/div/label/span[@class='gigya-label-text gigya-checkbox-text']")
    WebElementFacade  checkBoxTerminos;



    private By buttonSiAutorizo =By.xpath("//div/div/div/label[text()='Si Autorizo']");

    private By btnRegistrarse=By.xpath("//*[@id='gigya-register-form']/div[2]/div[11]/input");


    public By getLnkParaRegistrarse() {
        return lnkParaRegistrarse;
    }
    public By getCjTxtEmail() {
        return cjTxtEmail;
    }

    public By getCjTxtNombre() {
        return cjTxtNombre;
    }

    public By getCjTxtApellido() {
        return cjTxtApellido;
    }

    public By getCjTxtClave() {
        return cjTxtClave;
    }

    public By getCjTxtRepetirClave() {
        return cjTxtRepetirClave;
    }


    public WebElementFacade getCheckBoxTerminos() {
        return checkBoxTerminos;
    }

    public By getButtonSiAutorizo() {
        return buttonSiAutorizo;
    }

    public By getBtnRegistrarse() {
        return btnRegistrarse;
    }





}
