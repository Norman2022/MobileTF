package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class LoginSteps extends PageSteps {

    @Given("La aplicacion se carga correctamente")

    public void isLoginPageVisible() {
        LoginService.isViewLoaded();
    }


    @When("El usuario se loguea con: (.*), (.*)")
    public void doLoginProcess(String email, String password) {
        LoginService.doLogin(email, password);
    }

    @io.cucumber.java.en.Then("El usuario visualiza su workspace")
    public void elUsuarioVisualizaSuWorkspace() {
        LoginService.isViewIconTime();
    }

    @And("El usuario hace click al boton menu")
    public void elUsuarioHaceClickAlBotonMenu() {
        LoginService.clickBtnMenu();
    }

    @And("El usuario hace click al boton Logout")
    public void elUsuarioHaceClicAlBotonLogout() {
        LoginService.clickBtnLogout();
    }

    @And("El usuario confirma la accion")
    public void elUsuarioConfirmaLaAccion() {
        LoginService.clickBtnConfirm();
    }

    @Then("El usuario se desloguea de la app")
    public void elUsuarioSeDeslogueaDeLaApp() {
        LoginService.isViewLoaded();
    }
}
