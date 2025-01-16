/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultis;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {
    
    Scanner sc = new Scanner(System.in);
    
    public int inputInt(String msg, int min, int max){
        int result = 0;
        do {
            System.out.print(msg);
            try {
                String input = sc.nextLine();
                if(checkInt(input) != -1){
                    return checkInt(input);
                }
                result = Integer.parseInt(input);
                if(result  < min || result > max){
                    System.err.println("Input must have " + min + " and " + max);
                    continue;
                }
                return result;
            } catch (Exception e) {
                System.err.println("Input invalid. Please try again");
            }
        } while (true);
    }
    
    public int checkInt(String input){
        if(input.matches("\\d+[\\.][0]+"))
            return Integer.parseInt(input.substring(0, input.indexOf(".")));
        else
            return -1;
    }
    
    public double inputDouble(String msg, double min, double max){
        double result = 0;
        do {
            try {
                System.out.print(msg);
                result = Double.parseDouble(sc.nextLine());
                
                if (result % 0.5 != 0) {
                    System.err.println("Please input .5 or integer number");
                    continue;
                }
                
                if(result < min || result > max){
                    System.err.println("Input must have " + min + " and " + max);
                    continue;
                }
                
                return result;
            } catch (Exception e) {
                System.err.println("Input invalid. Please try again");
            }
        } while (true);
    }
    
    public String inputString(String msg, String regex){
        do {
            System.out.print(msg);
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.err.println("Please input non-empty string ");
                continue;
            }
            
            if(!input.matches(regex)){
                System.err.println("Please input string with correctly regex " + regex);
                continue;
            }
            
            return input;
        } while (true);
    }    
}
