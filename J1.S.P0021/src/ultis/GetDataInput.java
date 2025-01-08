/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultis;

import java.util.ArrayList;
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
    
    public int inputInt(String msg, int min, int max) {
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
    
    public String inputString(String msg, String regex) {
        while (true) {            
            try {
                System.out.print(msg);
                String input = this.inputString();
                if (!input.matches(regex)) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.out.println("The string invalid. Please input again");
            }            
        }
    }
    
    public String checkInputCourse(String msg){
        while (true) {            
            try {
                System.out.print(msg);
                String input = inputString();
                if(input.equalsIgnoreCase("java")
                        ||input.equalsIgnoreCase(".net")
                        || input.equalsIgnoreCase("c/c++")){
                    return input;
                }
                else{
                    System.out.println("The course must be Java, .Net, C/C++");
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
    
    public String checkInputSemester(String msg){
        while (true) {            
            try {
                System.out.print(msg);
                String input = inputString();
                if(input.equalsIgnoreCase("Summer")
                        ||input.equalsIgnoreCase("Spring")
                        || input.equalsIgnoreCase("Autumn")){
                    return input;
                }
                else{
                    System.out.println("The course must be Summer, Autumn, Spring");
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
    
    public boolean checkYN(){
        while (true) {            
            try {
                System.out.print("Do you want to continue (Y/N): ");
                String input = this.inputString();
                if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
                    return true;
                }
                if(input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")){
                    return false;
                }
                throw new Exception();
            } catch (Exception e) {
                System.err.println("User must input Y/N or Yes/No to continue");
            } 
        }
    }
    
    
    
}
