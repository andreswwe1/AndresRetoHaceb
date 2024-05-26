package com.haceb.steps.agregarAlCarritoSteps;

import com.haceb.PageObject.agregarAlCarritoPage.SelectCateySubCategoriaPage;

import net.thucydides.core.annotations.Step;

import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

import java.util.List;


import static com.haceb.utils.ElementosAleatorios.*;
import static com.haceb.utils.EsperasExplicitas.esperarElemento;


public class SelectCateySubCategoriaPageSteps {

    @Page
    private SelectCateySubCategoriaPage SelectCateySubCategoria;

private String nombreCategoria;
private  List<WebElement> subCategoria;
private   WebElement  elementoWeb;


    @Step("Open Browser y close alert")

    public void openUrl() {

        SelectCateySubCategoria.openUrl("https://www.haceb.com/");

        esperarElemento(SelectCateySubCategoria.getDriver(), SelectCateySubCategoria.getAlertInicio());
        SelectCateySubCategoria.getDriver().findElement(SelectCateySubCategoria.getAlertInicio()).click();
    }

    @Step("presiono menu categorias")
    public void oprimirButtonCategorias(){
        esperarElemento(SelectCateySubCategoria.getDriver(), SelectCateySubCategoria.getButtonCategoria());
        SelectCateySubCategoria.getDriver().findElement(SelectCateySubCategoria.getButtonCategoria()).click();

                    }

@Step( "categoria aleatoria")
public void selectCategoriaAleatoria(){

     List<WebElement> categoria;
    esperarElemento(SelectCateySubCategoria.getDriver(), SelectCateySubCategoria.getButtonCateAleatoria());
    categoria=SelectCateySubCategoria.getDriver().findElements(SelectCateySubCategoria.getButtonCateAleatoria());
     elementoWeb=cateAleatoria(categoria);
   nombreCategoria = String.valueOf(elementoWeb.getText());
    System.out.println("la categoria es "+nombreCategoria);
    elementoWeb.click();


    }

    @Step("selecciono una subcategoria aleatoria")
    public void selectSubCategoria(){


                subCategoria= SelectCateySubCategoria.getDriver().findElements(SelectCateySubCategoria.getSubCategoria());

         elementoWeb=subCateAleatoria(subCategoria);
        try {
    elementoWeb.click();
    nombreCategoria = String.valueOf(elementoWeb.getText());
    System.out.println("la SUB categoria es " + nombreCategoria);
}
catch(Exception e) {

}
}


    @Step("doy click a un producto aleatorio")
    public  void clickProductAleatorio(){

           List<WebElement> productoAleatorio;

            esperarElemento(SelectCateySubCategoria.getDriver(), SelectCateySubCategoria.getButtonSelectProducto());

            productoAleatorio = SelectCateySubCategoria.getDriver().findElements(SelectCateySubCategoria.getButtonSelectProducto());

             elementoWeb = SelectProductoAleatorio(productoAleatorio);

        elementoWeb.click();


    }


    }


