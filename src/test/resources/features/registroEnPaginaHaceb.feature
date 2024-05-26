
Feature: Registrarse en la pagina de Haceb
  @Registro_usuario_nuevo
    Scenario: Registro de un usuario nuevo  pagina Haceb
    Given que ya ingrese a la url de Haceb cerrando la alerta
      And oprimo el boton Entrar
    And  presiono el boton registrarse
      And presiono el texto Aun no te has registrado
    When diligencio los datos en la nueva ventana
      | email                     | nombre | apellido | clave    | confClave |
      | andreshaceb26@yopmail.com | pepito | perez    | 12345678 | 12345678  |
    And seleciono el checklist  de tratamiento de datos
      And escojo el raddiobutton de si autorizo
      And presiono el boton Registrarme en la pagina de registro
      And ingreso los datos de la ventana algunos detalles mas
        | cedula  | genero    | fecha_Nacimiento | departamento |
        | 1020815 | Masculino | 11/05/1996       | Cundinamarca |

          And presiono el boton enviar
      Then Debe visualizarse la nueva ventana con el inicio de sesion






















