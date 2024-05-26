
Feature:Agregar al carrito un producto aleatorio
  @AgregarAlCarrito
  Scenario:Visualizacion del producto aleatorio  agredado al carrito
    Given que ingreso a la url de Haceb cerrando la alerta
    And presiono menu categorias
    And  selecciono una categoria aleatoria
    And selecciono una subcategoria aleatoria
    And doy click a un producto aleatorio
    When le doy clic en el boton agregar al carrito
    Then  en el icono del carrito se visualizara el mismo producto seleccionado

