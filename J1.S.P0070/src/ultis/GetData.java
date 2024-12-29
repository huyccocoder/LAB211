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
public class GetData {

    Scanner sc = new Scanner(System.in);

    public int getChoice(String msg, int min, int max) {
        String input = "";
        int choice = 0;
        do {
            try {
                System.out.print(msg);
                input = sc.nextLine();

                if (input.isEmpty()) {
                    System.err.println("Input String is empty. Please again input string!!");
                    continue;
                } else {
                    choice = Integer.parseInt(input);
                    if (choice >= min || choice <= max) {
                        break;
                    } else {
                        System.err.println("Choice must between " + min + " and " + max);
                        continue;
                    }
                }
            } catch (Exception e) {
                System.err.println("Choice must positive integer number");
            }
        } while (true);

        return choice;
    }

    public String getAccount(String msg, String errorFormat){
        String input = "";

        do {
            try {
                System.out.println(msg);
                input = sc.nextLine();
    
                if (input.isEmpty()) {
                    System.out.println("Empty string. Please again input non-empty string");
                    continue;
                }
    
                if(input.matches("^[0-9]{10}")){
                    return input;
                }
                else{
                    System.out.println(errorFormat);
                    continue;
                }
            } catch (Exception e) {
                System.out.println(errorFormat);
                continue;
            }
        } while (true);
    }

    public String getPassword(String msg, String errPassword){
        String result = "";
        do {
            try {
                System.out.println(msg);
                result = sc.nextLine();
                if (result.isEmpty()) {
                    System.out.println("Empty string. Please again input non-empty string");
                    continue;
                }

                if(result.length() >= 8 && result.length() <= 31){
                    if(result.matches("[]")){
                        
                    }
                }
                else{
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println(errPassword);
            }
        } while (true);
    }
}
