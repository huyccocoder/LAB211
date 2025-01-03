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
public class getInputData {
    Scanner sc = new Scanner(System.in);
    
    public int inputChoice(String msg, int min, int max){
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
    
    
    
}
