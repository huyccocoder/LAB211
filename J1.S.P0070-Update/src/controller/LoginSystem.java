/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Locale;
import java.util.ResourceBundle;

import ultis.CheckInput;
import ultis.Create_HandleCaptcha;
import ultis.GetDataInput;

/**
 *
 * @author Admin
 */
public class LoginSystem {
    public void loginSystem_VietNam(){
        Locale VietNam = new Locale("vi", "VN");
        Login(VietNam);

    }

    public void loginSystem_English(){
        Locale English = new Locale("en", "EN");
        Login(English);
    }

    public void Login(Locale locale){
        GetDataInput getData = new GetDataInput();
        ResourceBundle handleLanguage = ResourceBundle.getBundle("language.language", locale);
        Create_HandleCaptcha checkCaptcha = new Create_HandleCaptcha();
        CheckInput check = new CheckInput();
        
        String account = getData.inputAccount(handleLanguage.getString("Account"), handleLanguage.getString("InvalidAccount"));
        String password = getData.inputPassWord(handleLanguage.getString("Password"), handleLanguage.getString("InvalidPassword"));

        checkCaptcha.handleCaptcha(handleLanguage.getString("Captcha"), handleLanguage.getString("InputCaptcha"), handleLanguage.getString("InvalidCaptcha"));

        boolean checkAccount = check.checkAccount(account);
        boolean checkPassword = check.checkPassword(password);

        if(checkAccount && checkPassword){
            System.out.println(handleLanguage.getString("ExistAccount"));
            System.out.println(handleLanguage.getString("LoginSuccessfully"));
            
        }
        else{
            System.out.println(handleLanguage.getString("NotExistAccount"));
            System.out.println(handleLanguage.getString("LoginFailed"));
        }
        
    }
}
