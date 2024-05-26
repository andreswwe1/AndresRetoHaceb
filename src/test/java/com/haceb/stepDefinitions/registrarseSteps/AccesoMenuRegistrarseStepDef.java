package com.haceb.stepDefinitions.registrarseSteps;

import com.haceb.steps.registrarseSteps.menuPrincipal.AccesoMenuRegistrarseSteps;

import com.haceb.steps.registrarseSteps.menuRegistro.RegistroDetallesAdicionalesSteps;
import com.haceb.steps.registrarseSteps.menuRegistro.RegistroUsuarioNuevoSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccesoMenuRegistrarseStepDef {
    WebDriver driver;


    @Steps
    private RegistroUsuarioNuevoSteps registroUsuarioNuevo;

    @Steps
    private AccesoMenuRegistrarseSteps accesoMenuRegistrarse;

    @Steps
    private RegistroDetallesAdicionalesSteps registrosAdicionales;


    @BeforeAll
    static void setupClass() {

        WebDriverManager.chromedriver().clearDriverCache().setup();
    }

    @BeforeEach
    void setupTest() {

         driver = new ChromeDriver();
    }


    @Given("que ya ingrese a la url de Haceb cerrando la alerta")
    public void queYaIngreseALaUrlDeHacebCerrandoLaAlerta() {

        accesoMenuRegistrarse.openUrl();
    }


    @And("oprimo el boton Entrar")
    public void oprimoElBotonEntrar() {
        accesoMenuRegistrarse.oprimirBtnentrar();
    }
    @And("presiono el boton registrarse")
    public void presionoElBotonRegistrarse() {

        accesoMenuRegistrarse.oprimirLinkRegistrarse();

    }

    @And("presiono el texto Aun no te has registrado")
    public void presionoElTextoAunNoTeHasRegistrado() {
        registroUsuarioNuevo.oprimirLnkParaRegistro();
    }
    @When("diligencio los datos en la nueva ventana")
    public void diligencioLosDatosEnLaNuevaVentana(DataTable dataTable) {
        registroUsuarioNuevo.ingresoDatosRegistro(dataTable);
    }

    @And("seleciono el checklist  de tratamiento de datos")
    public void selecionoElChecklistDeTratamientoDeDatos() {
        registroUsuarioNuevo.selectCheckboxTerminos();
    }
    @And("escojo el raddiobutton de si autorizo")
    public void escojoElRaddiobuttonDeSiAutorizo() {
     registroUsuarioNuevo.selectBotonRadioButton();
    }

    @And("presiono el boton Registrarme en la pagina de registro")
    public void presionoElBotonRegistrarmeEnLaPaginaDeRegistro() {
        registroUsuarioNuevo.oprimirBotonRegistrarme();
    }
    @And("ingreso los datos de la ventana algunos detalles mas")
    public void ingresoLosDatosDeLaVentanaAlgunosDetallesMas(DataTable dataTable) {
        registrosAdicionales.ingresoDatosAdicionales(dataTable);
    }

    @And("presiono el boton enviar")
    public void presionoElBotonEnviar() {
        registrosAdicionales.botonEnviar();
    }


    @Then("Debe visualizarse la nueva ventana con el inicio de sesion")
    public void debe_visualizarse_la_nueva_ventana_con_el_inicio_de_sesion() {
        registrosAdicionales.msjInicioSesion();
    }



    @AfterEach
    void teardown() {

        driver.quit();
    }
}
