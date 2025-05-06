Feature: Gestión de stock de productos

  Scenario: Consultar el stock de un producto
    Given un producto con un stock de 5 unidades
    When el usuario consulta el stock
    Then el stock del producto debe ser 5
