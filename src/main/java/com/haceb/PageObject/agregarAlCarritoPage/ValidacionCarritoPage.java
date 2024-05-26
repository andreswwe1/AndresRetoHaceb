package com.haceb.PageObject.agregarAlCarritoPage;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidacionCarritoPage extends PageObject {

    private By buttonAgregarCarrito=By.xpath("//span[@class='vtex-add-to-cart-button-0-x-buttonText vtex-add-to-cart-button-0-x-buttonText--add-to-cart' and contains (text(),'Agregar al carrito')]");

    private By iconoCarrito= By.xpath("//span[@class='vtex-minicart-2-x-minicartIconContainer gray relative']");

    private By txtProductoSeleccionado=By.xpath("//span[@class='vtex-store-components-3-x-productBrand ']");

    private By txtProductoCarrito=By.xpath("//a[@class='c-on-base t-title lh-copy fw6 no-underline fw5-m vtex-product-list-0-x-productName ']");
    public By getButtonAgregarCarrito() {
        return buttonAgregarCarrito;
    }

    public By getIconoCarrito() {
        return iconoCarrito;
    }

    public By getTxtProductoSeleccionado() {
        return txtProductoSeleccionado;
    }

    public By getTxtProductoCarrito() {
        return txtProductoCarrito;
    }
}
