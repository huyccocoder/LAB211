package bo;

import java.util.Random;

import ultis.GetData;

public class createCaptcha {
    public String createCapcha() {
        String finalCaptCha = "";

        String string = "";
        for (char i = 'a'; i <= 'z'; i++) {
            string += i;
        }

        for (char i = 'A'; i <= 'Z'; i++) {
            string += i;
        }

        for (char i = '0'; i <= '9'; i++) {
            string += i;
        }

        do {
            String result = "";
            boolean haveLowerChar = false;
            boolean haveUpperChar = false;
            boolean haveDigit = false;

            for (int i = 0; i < 5; i++) {
                Random random = new Random();
                int index = random.nextInt(string.length());
                char character = string.charAt(index);

                if (character >= 'a' && character <= 'z') {
                    result += character;
                    haveLowerChar = true;
                } 
                else if (character >= 'A' && character <= 'Z') {
                    result += character;
                    haveUpperChar = true;
                } 
                else {
                    result += character;
                    haveDigit = true;
                }
            }

            if (haveLowerChar && haveUpperChar && haveDigit) {
                finalCaptCha = result;
                break;
            }
            else{
                continue;
            }
        } while (true);

        return finalCaptCha;
    }

    public void handleCapcha(String captcha, String errCaptcha, String inputCaptcha){
        GetData getData = new GetData();

        do {
            String newCaptCha = createCapcha();
            System.out.println(captcha + newCaptCha);
            String inCaptcha = getData.getCaptcha(inputCaptcha, errCaptcha);

            if (newCaptCha.equals(inCaptcha)) {
                return;
            }
            else{
                System.out.println(errCaptcha);
            }

        } while (true);
    }
}
