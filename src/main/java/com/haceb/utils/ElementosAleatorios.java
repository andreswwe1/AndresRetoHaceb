package com.haceb.utils;


import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;



public class ElementosAleatorios {
    static int indice;

    public static WebElement cateAleatoria(List<WebElement> elementos) {
        Random aleatorio = new Random();
      indice  = aleatorio.nextInt(elementos.size());

       // indice  = 0;
        System.out.println("el indicee de la categoria es: "+indice);
        return elementos.get(indice);


    }


   public static  WebElement subCateAleatoria(List<WebElement> elementos){
        int indice1 = 0;

        switch(indice) {
            case 1:
                System.out.println("el sistema escogio la categoria lavadora y no tiene SubCategoria");

                break;
            case 6:
                System.out.println("el sistema escogio la categoria cargadores de carros y no tiene SubCategoria");
                break;
            default:
                Random aleatorio1 = new Random();

             indice1 = aleatorio1.nextInt(elementos.size());
                //indice1  = 1;
                System.out.println("selecciono la subcategoria " + indice1);


        }


       try {
           return elementos.get(indice1);
        }catch (IndexOutOfBoundsException e){

           return null;//cuando viene categoria 1 o 6
        }



   }


    public static WebElement SelectProductoAleatorio(List<WebElement> elementos) {
        Random aleatorio = new Random();

        int indice2 = aleatorio.nextInt(elementos.size());
       //indice2  = 3;
        System.out.println("el producto aleatorio  seleccionado es  "+indice2);
        return elementos.get(indice2);

    }
}



