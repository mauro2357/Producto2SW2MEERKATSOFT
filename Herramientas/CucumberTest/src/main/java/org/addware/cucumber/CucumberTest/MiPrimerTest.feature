 Feature: Probar calculadora
  Mediante este test voy a
  hacer pruebas con dos numeros a
  ver como se comporta mi aplicacion.

  Scenario: Sumatorio de dos numeros
    Given dos numeros 2,3
    When sumo los dos numeros
    And multiplico el resultado por 3
    Then resultado debe ser 15