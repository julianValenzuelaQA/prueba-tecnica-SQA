Feature: Agregar productos al carrito

  Scenario: agrego 2 productos al carrito
    Given el usuario esta en la pagina de san angel
    When el usuario agrega un primer producto con "2" unidades
    And el usuario agrega un segundo producto con "5" unidades
    Then el usuario deberia ver los productos con sus unidades "2" y "5" en el carrito