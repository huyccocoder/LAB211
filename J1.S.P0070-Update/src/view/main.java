/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.LoginSystem;
import ultis.Create_HandleCaptcha;
import ultis.GetDataInput;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Display display = new Display();
        GetDataInput getData = new GetDataInput();
        LoginSystem login = new LoginSystem();
        Create_HandleCaptcha captcha = new Create_HandleCaptcha();
//        Show Menu
        display.DisplayMenu();
//        choose option
        int choice = getData.inputChoice("Please choice one option: ", 1, 4);
        
        switch (choice) {
            case 1:
                login.loginSystem_VietNam();
                break;
            case 2:
                login.loginSystem_English();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
}
