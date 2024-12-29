package controller;
import bo.createCaptcha;
import java.util.Locale;
import java.util.ResourceBundle;
import ultis.CheckData;
import ultis.GetData;

public class LoginSystem {

    public void loginSystemVietNam(){
        Locale VietNam = new Locale("vi", "VN");
        login(VietNam);
    }

    public void loginSystemEnglish(){
        Locale English = new Locale("en", "EN");
        login(English);
    }

    public void login(Locale locale){
        GetData getData = new GetData();
        ResourceBundle handLanguage = ResourceBundle.getBundle("controller.language", locale);
        CheckData checkData = new CheckData();
        createCaptcha handleCaptcha = new createCaptcha();
        
        String account = getData.getAccount(handLanguage.getString("Account"), handLanguage.getString("ErrorAccount"));
        
        String password = getData.getPassword(handLanguage.getString("Password"), handLanguage.getString("ErrorPassword"));
        
        handleCaptcha.handleCapcha(handLanguage.getString("Captcha"), handLanguage.getString("ErrorCaptcha"), handLanguage.getString("Inputcaptcha"));
        
        boolean checkAccount = checkData.checkAccount(account);
        boolean checkPassWord = checkData.checkPassword(account, password);
        
        if(checkAccount && checkPassWord){
            System.out.println(handLanguage.getString("LoginSuccess"));
        }
        else{
            System.out.println(handLanguage.getString("LoginFailed"));
        }
    }
}
