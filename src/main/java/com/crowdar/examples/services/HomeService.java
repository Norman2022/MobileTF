package com.crowdar.examples.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;
import sun.security.mscapi.CPublicKey;

import java.util.Date;
import java.util.Objects;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class HomeService {

    public static void clickBtnAddTimeEntry() {
        MobileActionManager.click(HomeConstants.ADD_TIME_ENTRY_ID);
    }

    public static void clickAddDayMenu() {
        MobileActionManager.click(HomeConstants.DAY_MENU_ID);
    }

    public static void setFecha(String fecha) {

        MobileActionManager.click(HomeConstants.SET_DAY_BTN_XPATH, fecha);

    }

    public static void agregarTiempo(String hora, String flag) {
        if (Objects.equals(flag,"Fin")){
        MobileActionManager.click(HomeConstants.END_BTN_MENU_XPATH );}
          else {
            MobileActionManager.click(HomeConstants.START_BTN_MENU_XPATH);
          }
        int intHoraInicio = Integer.parseInt(hora);
        int horaApp;
        for (int i = 1; i < 24; i++) {
            horaApp = Integer.parseInt(MobileActionManager.getText(HomeConstants.SET_HOURS_INPUT_XPATH));
            if (horaApp != intHoraInicio) {
                MobileActionManager.click(HomeConstants.MOVE_HOURS_SCROLL_XPATH);
            } else {
                break;
            }
        }

    }
     public static void clickBtnGuardar(){
       MobileActionManager.click(HomeConstants.SAVE_BTN_ID);
     }
public static void agregarDescripcion(String descripcion){
        MobileActionManager.setInput(HomeConstants.DESCRIP_TIME_ENTRY_ID, descripcion);

}
 public static void agregarProyecto(String proyecto){
        MobileActionManager.click(HomeConstants.ADD_PROJECT_ID);
        MobileActionManager.click(HomeConstants.SAVE_BTN_ID);
        MobileActionManager.setInput(HomeConstants.SET_PROJECT_ID, proyecto);
        MobileActionManager.click(HomeConstants.SAVE_BTN_ID);
 }
public static void agregarTarea(String tarea){
        MobileActionManager.click(HomeConstants.ADD_TASK_ID);
        MobileActionManager.click(HomeConstants.SAVE_BTN_ID);
        MobileActionManager.setInput(HomeConstants.SET_TASK_ID, tarea);
        MobileActionManager.click(HomeConstants.ADD_BTN_ID);


}
public static void agregarEtiqueta(String etiqueta){
    MobileActionManager.click(HomeConstants.ADD_TAG_ID);
    MobileActionManager.click(HomeConstants.SAVE_BTN_ID);
    MobileActionManager.setInput(HomeConstants.SET_TAG_ID, etiqueta);
    MobileActionManager.click(HomeConstants.ADD_BTN_ID);
    MobileActionManager.click(HomeConstants.BACK_BTN);
}
public static void verificaProyecto(String proyecto){
   String project =  MobileActionManager.getText(HomeConstants.NAME_PROJECT_ID);
   Assert.assertTrue(project.contains(proyecto));
    }

public static void descartarCambios(){
        MobileActionManager.click(HomeConstants.BACK_BTN);
        MobileActionManager.click(HomeConstants.CONFIRM_DISCARD_ID);
        MobileActionManager.click(HomeConstants.BACK_BTN);

}
public static void clickBtnAjustes(){

        MobileActionManager.click(HomeConstants.SETTING_BRN_XPATH);

}
public static void clickModoOscuro(){
    MobileActionManager.click(HomeConstants.DARK_MODE_BTN_ID);
    MobileActionManager.click(LoginConstants.MENU_CONFIG_XPATH);
}


}
