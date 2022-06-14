package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class HomeSteps extends PageSteps {

     @Given("El usuario esta logueado")
    public void elUsuarioEstaLogueado() {
         LoginService.doLogin("norman@live.com.ar", "Testing2022");

    }

    @When("El hace click en el boton +")
    public void elHaceClickEnElBoton() {
       HomeService.clickBtnAddTimeEntry();
    }

    @And("El usuario hace click en la barra que muestra la fecha actual")
    public void elUsuarioHaceClickEnLaBarraQueMuestraLaFechaActual() {
         HomeService.clickAddDayMenu();
    }


    @And("ingresa el dia {string} de inicio")
    public void ingresaElDiaFechaDeInicio(String fecha) {
         HomeService.setFecha(fecha);
    }

    @And("presiona el boton Start y agrega hora {string}  y hora {string} de inicio")
    public void agregaHoraDeInicio_MinutoDeInicio(String horaInicio, String horaFin) {
        HomeService.agregarTiempo(horaInicio,"Inicio");
        HomeService.agregarTiempo(horaFin,"Fin");
    }

    @And("presiona el boton Guardar")
    public void presionaElBotonGuardar() {
         HomeService.clickBtnGuardar();
    }

    @And("Agrega una {string} de la tarea")
    public void agregaUnaDescripcionDeLaTarea(String descripcion) {
         HomeService.agregarDescripcion(descripcion);
    }

    @And("hace click en {string} y crea uno")
    public void haceClickEnProyectoYCreaUno(String proyecto) {
         HomeService.agregarProyecto(proyecto);
    }

    @And("agrega una tarea {string}y una etiqueta {string}")
    public void agregaUnaTareaTareaYUnaEtiquetaEtiqueta(String tarea, String etiqueta) {
         HomeService.agregarTarea(tarea);
         HomeService.agregarEtiqueta(etiqueta);
    }

    @Then("el usuario visualiza el nombre del proyecto: {string}")
    public void elUsuarioVisualizaElNombreDelProyectoProyecto(String proyecto) {
         HomeService.verificaProyecto(proyecto);
    }

    @And("presiona el boton Descartar y luego confirma la accion")
    public void presionaElBotonDescartarYLuegoConfirmaLaAccion() {
         HomeService.descartarCambios();
    }

    @And("El usuario hace click en el boton Ajustes")
    public void elUsuaarioHaCeClickEnElBotonAjustes() {
         HomeService.clickBtnAjustes();
    }

    @And("El usuario hablita el modo oscuro")
    public void elUsuarioHablitaElModoOscuro() {
         HomeService.clickModoOscuro();
    }
}
