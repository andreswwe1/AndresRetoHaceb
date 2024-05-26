package com.haceb.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HacerClickJS {




    public static void clickJS(WebDriver driver, WebElementFacade elemento) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",
                elemento);

    }



}

