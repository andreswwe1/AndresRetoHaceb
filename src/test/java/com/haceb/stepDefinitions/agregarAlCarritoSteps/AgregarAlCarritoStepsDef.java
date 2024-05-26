package com.haceb.stepDefinitions.agregarAlCarritoSteps;

import com.haceb.steps.agregarAlCarritoSteps.SelectCateySubCategoriaPageSteps;
import com.haceb.steps.agregarAlCarritoSteps.ValidacionCarritoSteps;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgregarAlCarritoStepsDef {

    WebDriver driver;
    @Steps
    private SelectCateySubCategoriaPageSteps  SelectCateySubCategoria;
    @Steps
    private ValidacionCarritoSteps validacionCarrito ;


    @BeforeAll
    static void setupClass() {

        WebDriverManager.chromedriver().clearDriverCache().setup();
    }

    @BeforeEach
    void setupTest() {

        driver = new ChromeDriver();
    }


    @Given("que ingreso a la url de Haceb cerrando la alerta")
    public void queIngresoALaUrlDeHacebCerrandoLaAlerta() {

        SelectCateySubCategoria.openUrl();
    }


    @Given("presiono menu categorias")
    public void presionoMenuCategorias() {
        SelectCateySubCategoria.oprimirButtonCategorias();
    }
    @Given("selecciono una categoria aleatoria")
    public void seleccionoUnaCategoriaAleatoria() {
        SelectCateySubCategoria.selectCategoriaAleatoria();
    }
    @Given("selecciono una subcategoria aleatoria")
    public void seleccionoUnaSubcategoriaAleatoria() {
        SelectCateySubCategoria.selectSubCategoria();
    }
    @Given("doy click a un producto aleatorio")
    public void doyClickAUnProductoAleatorio() {
        SelectCateySubCategoria.clickProductAleatorio();
    }
    @When("le doy clic en el boton agregar al carrito")
    public void leDoyClicEnElBotonAgregarAlCarrito() {
validacionCarrito.clikBtnAgregarCarrito();

    }
    @Then("en el icono del carrito se visualizara el mismo producto seleccionado")
    public void enElIconoDelCarritoSeVisualizaraElMismoProductoSeleccionado() {
        validacionCarrito.clikBtnCarrito();
        validacionCarrito.comparacionProductos();
    }





    @AfterEach
    void teardown() {

        driver.quit();
    }
}
