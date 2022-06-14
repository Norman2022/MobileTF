Feature: Un usuario se Loguea y Desloguea de la app

  Scenario Outline: El usuario se loguea correctamente
    Given La aplicacion se carga correctamente
    When El usuario se loguea con: <email>, <password>
    Then El usuario visualiza su workspace


    Examples:
      | email              | password    |
      | norman@live.com.ar | Testing2022 |


  Scenario Outline: El usuario se desloguea correctamente
    Given La aplicacion se carga correctamente
    When El usuario se loguea con: <email>, <password>
    And El usuario visualiza su workspace
    And El usuario hace click al boton menu
    And El usuario hace click al boton Logout
    And El usuario confirma la accion
    Then El usuario se desloguea de la app


    Examples:
      | email              | password    |
      | norman@live.com.ar | Testing2022 |
