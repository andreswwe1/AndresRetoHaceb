package com.haceb.steps.registrarseSteps.menuRegistro;

import com.haceb.PageObject.registrarsePage.menuRegistro.RegistroUsuarioNuevoPage;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.List;

import static com.haceb.utils.CambioVentana.cambiarPantalla;
import static com.haceb.utils.EsperasExplicitas.*;
import static com.haceb.utils.HacerClickJS.clickJS;
import static com.haceb.utils.HacerScroll.hacerScroll;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class RegistroUsuarioNuevoSteps {



    @Page
   private RegistroUsuarioNuevoPage registroUsario;
    private List<String> datosRegistro;

    @Step ("presiono el texto Aun no te has registrado")
    public void oprimirLnkParaRegistro(){

        cambiarPantalla();


        esperarElemento (registroUsario.getDriver(),registroUsario.getLnkParaRegistrarse());
        registroUsario.getDriver().findElement(registroUsario.getLnkParaRegistrarse()).click();



    }

    @Step("diligencio los datos en la nueva ventana")
    public void ingresoDatosRegistro(DataTable dataTable){
         datosRegistro = dataTable.row(1);
        esperarElemento(registroUsario.getDriver(),registroUsario.getCjTxtEmail());
        registroUsario.getDriver().findElement(registroUsario.getCjTxtEmail()).sendKeys(datosRegistro.get(0));
        registroUsario.getDriver().findElement(registroUsario.getCjTxtNombre()).sendKeys(datosRegistro.get(1));
        registroUsario.getDriver().findElement(registroUsario.getCjTxtApellido()).sendKeys(datosRegistro.get(2));
        registroUsario.getDriver().findElement(registroUsario.getCjTxtClave()).sendKeys(datosRegistro.get(3));
        registroUsario.getDriver().findElement(registroUsario.getCjTxtRepetirClave()).sendKeys(datosRegistro.get(4));

    }

    @Step("seleciono el checklist  de tratamiento de datos")
    public void selectCheckboxTerminos(){

        hacerScroll(getDriver());
        WebElementFacade checkBoxTerminos1=registroUsario.getCheckBoxTerminos();
        clickJS(registroUsario.getDriver(), checkBoxTerminos1);


    }

    @Step("escojo el raddiobutton de si autorizo")
    public void selectBotonRadioButton(){
        //boton  autorizacion

        esperarElemento (registroUsario.getDriver(),registroUsario.getButtonSiAutorizo());
        registroUsario.getDriver().findElement(registroUsario.getButtonSiAutorizo()).click();

    }
    @Step("presiono el boton Registrarme en la pagina de registro")
            public void oprimirBotonRegistrarme(){
            //boton registrarse
            registroUsario.getDriver().findElement(registroUsario.getBtnRegistrarse()).click();
            }




}
