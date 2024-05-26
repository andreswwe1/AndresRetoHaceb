package com.haceb.utils;


import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class CambioVentana {
    public static void cambiarPantalla() {


        String ventanaPrincipal = getDriver().getWindowHandle();
        Set<String> ventanas = getDriver().getWindowHandles();

        for (String ventana : ventanas) {

            if (!ventanaPrincipal.equals(ventana)) {

                getDriver().switchTo().window(ventana);
                getDriver().manage().window().maximize();
                break;
            }


        }

    }


}
