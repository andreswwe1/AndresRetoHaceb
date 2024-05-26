package com.haceb.steps.registrarseSteps.menuRegistro;

import com.haceb.PageObject.registrarsePage.menuRegistro.RegistroDetallesAdicionalesPage;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Step;

import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.haceb.utils.CambioVentana.cambiarPantalla;

import static com.haceb.utils.EsperasExplicitas.esperarElemento;
import static com.haceb.utils.HacerScroll.hacerScroll;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class RegistroDetallesAdicionalesSteps {

    @Page
    private RegistroDetallesAdicionalesPage registroDetallesAdicionales;
    private  boolean question;
    private List<String>  datosRegistroAdicionales;
    @Step("ingreso los datos de la ventana algunos detalles mas")

    public void ingresoDatosAdicionales(DataTable dataTable) {

        datosRegistroAdicionales = dataTable.row(1);
        esperarElemento(registroDetallesAdicionales.getDriver(),registroDetallesAdicionales.getCjTxtCedula());
        registroDetallesAdicionales.getDriver().findElement(registroDetallesAdicionales.getCjTxtCedula()).sendKeys(datosRegistroAdicionales.get(0));

        registroDetallesAdicionales.getDriver().findElement(registroDetallesAdicionales.getDateFechaNacimiento()).sendKeys(datosRegistroAdicionales.get(2));

        Select seleccionarGenero=new Select(getDriver().findElement(registroDetallesAdicionales.getSelectGenero()));
        seleccionarGenero.selectByVisibleText(datosRegistroAdicionales.get(1));

        Select seleccionarDepartamento=new Select(getDriver().findElement(registroDetallesAdicionales.getSelectDepartamento()));
        seleccionarDepartamento.selectByVisibleText(datosRegistroAdicionales.get(3));


    }
    @Step ("presiono el boton enviar")
    public void botonEnviar(){
        hacerScroll(getDriver());
       esperarElemento(registroDetallesAdicionales.getDriver(),registroDetallesAdicionales.getButtonEnviar());
        registroDetallesAdicionales.getDriver().findElement(registroDetallesAdicionales.getButtonEnviar()).click();



    }


    @Step  ("visualizarse la nueva pestaña con respectivo  mensaje")
    public void msjInicioSesion(){
        cambiarPantalla();
       esperarElemento(registroDetallesAdicionales.getDriver(),registroDetallesAdicionales.getAlertclose());
        registroDetallesAdicionales.getDriver().findElement(registroDetallesAdicionales.getAlertclose()).click();

        esperarElemento(registroDetallesAdicionales.getDriver(),registroDetallesAdicionales.getMsjInicioSesion());

        question = registroDetallesAdicionales.getDriver().findElement(registroDetallesAdicionales.getMsjInicioSesion()).isDisplayed();
        if (question) {
            System.out.println("el inicio de sesion fue exitoso");
        } else {
            System.out.println("No se realizo el registro de inicio de sesion");
        }



    }

}
