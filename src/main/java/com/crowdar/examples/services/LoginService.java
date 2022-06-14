package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class LoginService {

    public static void doLogin(String email, String password){
        MobileActionManager.setInput(LoginConstants.EMAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, password);
        MobileActionManager.click(LoginConstants.SIGN_IN_BUTTON_LOCATOR);
    }

    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.EMAIL_INPUT_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.EMAIL_INPUT_LOCATOR), LoginConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
    public static void isViewIconTime(){
        MobileActionManager.waitVisibility(LoginConstants.TITULO_HOME_XPATH);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.TITULO_HOME_XPATH), "No se pudo ingresar al workspace del usuario");
    }

   public static void clickBtnMenu(){
        MobileActionManager.click(LoginConstants.MENU_CONFIG_XPATH);
   }
    public static void clickBtnLogout(){
        MobileActionManager.click(LoginConstants.LOGOUT_BTN_XPATH);
    }
    public static void clickBtnConfirm(){
        MobileActionManager.click(LoginConstants.CONFIRM_BTN_ID);
    }


}
