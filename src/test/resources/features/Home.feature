Feature: Un usuario interactua con la applicacion movil


  @Demo
  Scenario Outline: El usuario agrega una tarea
    Given El usuario esta logueado
    When El hace click en el boton +
    And El usuario hace click en la barra que muestra la fecha actual
    And ingresa el dia '<fecha>' de inicio
    And presiona el boton Start y agrega hora '<horaInicio>'  y hora '<horaFin>' de inicio
    And presiona el boton Guardar
    And hace click en '<proyecto>' y crea uno
    And agrega una tarea '<tarea>'y una etiqueta '<etiqueta>'
    And Agrega una '<descripcion>' de la tarea
    And presiona el boton Guardar
    Then el usuario visualiza el nombre del proyecto: '<proyecto>'

    Examples:
      | fecha         | horaInicio | horaFin | descripcion | proyecto  | tarea | etiqueta  |
      | 18 julio 2022 | 22         | 23      | Testing     | TimeEntry | Test  | TimeEntry |


  Scenario Outline: El usuario agrega una tarea y descarta guardarla
    Given El usuario esta logueado
    When El hace click en el boton +
    And El usuario hace click en la barra que muestra la fecha actual
    And ingresa el dia '<fecha>' de inicio
    And presiona el boton Start y agrega hora '<horaInicio>'  y hora '<horaFin>' de inicio
    And presiona el boton Descartar y luego confirma la accion
    Then El usuario visualiza su workspace

    Examples:
      | fecha         | horaInicio | horaFin |
      | 19 junio 2022 | 22         | 23      |


  Scenario: El usuario habilita el modo oscuro

    Given El usuario esta logueado
    And El usuario hace click al boton menu
    And El usuario hace click en el boton Ajustes
    And El usuario hablita el modo oscuro
    And El usuario hace click al boton Logout
    And El usuario confirma la accion
    Then El usuario se desloguea de la app


