/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultis;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Create_HandleCaptcha {
    Random random = new Random();

    public String createCaptcha(){
        String stringCaptcha = "";
        for (char i = '0'; i <= '9'; i++) {
            stringCaptcha += i;
        }
        for (char i = 'a'; i < 'z'; i++) {
            stringCaptcha += i;
        }
        for (char i = 'A'; i < 'Z'; i++) {
            stringCaptcha += i;
        }

        boolean haveLowerChar = false;
        boolean haveUpperChar = false;
        boolean haveDigit = false;

        do {
            String codeCapt = "";
            for (int i = 0; i < 5; i++) {
                int randomNumber = random.nextInt(stringCaptcha.length());
                char codeRandom = stringCaptcha.charAt(randomNumber);

                if(codeRandom >= 'a' && codeRandom <= 'z'){
                    haveLowerChar = true;
                }
                if(codeRandom >= 'A' && codeRandom <= 'Z'){
                    haveUpperChar = true;
                }
                if(codeRandom >= '0' && codeRandom <= '9'){
                    haveDigit = true;
                }
                codeCapt += codeRandom;
            }
            if(haveDigit == true && haveLowerChar == true && haveUpperChar == true){
                return codeCapt;
            }
            else{
                continue;
            }
        } while (true);
    }

    public boolean handleCaptcha(String msgCaptcha, String userCaptcha, String invalidCaptcha){
        GetDataInput getData = new GetDataInput();
        do {
            try {
                String captcha = createCaptcha();
                System.out.println(msgCaptcha + captcha);
                String inputCaptcha = getData.inputCaptcha(userCaptcha, invalidCaptcha);
                if(captcha.equals(inputCaptcha)){
                    return true;
                }
                else{
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println(invalidCaptcha);
            }
        } while (true);
    }
}
