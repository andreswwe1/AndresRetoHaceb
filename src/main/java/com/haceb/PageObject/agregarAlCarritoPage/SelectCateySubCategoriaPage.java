package com.haceb.PageObject.agregarAlCarritoPage;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SelectCateySubCategoriaPage extends PageObject {
    private By alertInicio = By.xpath("//div[@class='gigya-screen-dialog-close']");
    private By buttonCategoria=By.xpath("(//p[@class='lh-copy vtex-rich-text-0-x-paragraph vtex-rich-text-0-x-paragraph--text-trigger-destop vtex-rich-text-0-x-paragraph--link-header'])[2]");


    private By ButtonCateAleatoria=By.xpath("//div[@class='hacebco-menu-drawer-0-x-menuItemText']");

    private By SubCategoria=By.xpath("//div[@class='vtex-flex-layout-0-x-flexRow vtex-flex-layout-0-x-flexRow--category']");

    private By buttonSelectProducto=By.xpath("//div[@class='vtex-button__label flex items-center justify-center h-100 ph6 w-100 border-box ']");
    public By getAlertInicio() {
        return alertInicio;
    }

    public By getButtonCategoria() {
        return buttonCategoria;
    }


    public By getButtonCateAleatoria() {
        return ButtonCateAleatoria;
    }

    public By getSubCategoria() {
        return SubCategoria;
    }

    public By getButtonSelectProducto() {
        return buttonSelectProducto;
    }

}
