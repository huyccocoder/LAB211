/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultis;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GetDataInput {

    Scanner sc = new Scanner(System.in);

    public String inputString() {
        do {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.err.println("The string is empty. Please input again non-empty string");
                continue;
            }
            return input;
            
        } while (true);
    }

    public int inputChoice(String msg, int min, int max) {
        int value = 0;
        do {
            try {
                System.out.print(msg);
                String input = this.inputString();
                value = Integer.parseInt(input);
                if (value >= min && value <= max) {
                    return value;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.err.println("Invalid Input. You have to input integer number between " + min + " and " + max);
            }
        } while (true);
    }

    public String inputAccount(String msg, String invalidAccount) {
        String result = "";
        do {
            try {
                System.out.print(msg);
                String input = this.inputString();

                if (input.length() == 10) {
                    if (input.matches("^[0-9]+$")) {
                        result = input;
                    } else {
                        throw new Exception();
                    }
                } else {
                    throw new Exception();
                }
                return result;
            } catch (Exception e) {
                System.out.println(invalidAccount);
            }
        } while (true);
    }

    public String inputPassWord(String msg, String invalidPassword) {
        String result = "";
        do {
            try {
                System.out.print(msg);
                String input = this.inputString();
                
                if(input.length() >= 8 && input.length() <= 31){
                    if(input.matches("^(?=.*[a-zA-Z])(?=.*\\d)[0-9a-zA-Z]+$")){
                        result = input;
                    }
                    else{
                        throw new Exception();
                    }
                }
                else{
                    throw new Exception();
                }
                return result;
            } catch (Exception e) {
                System.out.println(invalidPassword);
            }
        } while (true);
    }
}
