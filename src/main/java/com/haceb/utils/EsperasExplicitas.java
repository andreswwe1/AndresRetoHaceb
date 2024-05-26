package com.haceb.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EsperasExplicitas {

    public static void esperarElemento(WebDriver driver, By elementBy){
        WebDriverWait waitVar= new WebDriverWait(driver, Duration.ofSeconds(30));
        waitVar.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }



}
