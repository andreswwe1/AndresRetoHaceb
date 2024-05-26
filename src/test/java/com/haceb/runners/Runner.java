package com.haceb.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
       glue = "com.haceb.stepDefinitions",
      tags = "@AgregarAlCarrito",
      // tags = "@Registro_usuario_nuevo",


        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
