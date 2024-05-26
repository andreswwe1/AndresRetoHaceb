package com.haceb.steps.agregarAlCarritoSteps;

import com.haceb.PageObject.agregarAlCarritoPage.ValidacionCarritoPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static com.haceb.utils.EsperasExplicitas.esperarElemento;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidacionCarritoSteps {

    @Page
    ValidacionCarritoPage validacionCarrito;
    private    String nombreCategoria;

    @Step("clic en el boton agregar al carrito")
    public void clikBtnAgregarCarrito(){
        esperarElemento(validacionCarrito.getDriver(), validacionCarrito.getButtonAgregarCarrito());
        validacionCarrito.getDriver().findElement(validacionCarrito.getButtonAgregarCarrito()).click();
        System.out.println("dio clic en el boton agregar carrito ");
      nombreCategoria = String.valueOf(validacionCarrito.getDriver().findElement(validacionCarrito.getTxtProductoSeleccionado()).getText());
        System.out.println("EL PRODUCTO SELECCIONADO  ES :"+nombreCategoria);
    }

    @Step("click en el icono del carrito" )
    public void clikBtnCarrito() {
        esperarElemento(validacionCarrito.getDriver(), validacionCarrito.getIconoCarrito());
        validacionCarrito.getDriver().findElement(validacionCarrito.getIconoCarrito()).click();


    }

    @Step("se visualizara el mismo producto seleccionado" )
    public void comparacionProductos(){

        esperarElemento(validacionCarrito.getDriver(), validacionCarrito.getIconoCarrito());
        String txtProductoSeleccionado = String.valueOf(validacionCarrito.getDriver().findElement(validacionCarrito.getTxtProductoSeleccionado()).getText());
        String TxtProductoCarrito=  String.valueOf(validacionCarrito.getDriver().findElement(validacionCarrito.getTxtProductoCarrito()).getText());

        System.out.println("el producto seleccionado es : "+txtProductoSeleccionado);
        System.out.println("el producto agregado al carrito es: "+TxtProductoCarrito);



    assertEquals(
            txtProductoSeleccionado,
            TxtProductoCarrito,"El producto agregado al carrito no coincide con el producto del carrito.");

    }


}

