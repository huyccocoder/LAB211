/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultis;

import java.lang.reflect.Array;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {

    Scanner sc = new Scanner(System.in);

    public int inputInt(String msg, int min, int max) {
        int result = 0;
        do {
            System.out.print(msg);
            try {
                String input = sc.nextLine();
                if (checkInt(input) != -1) {
                    return checkInt(input);
                }
                result = Integer.parseInt(input);
                if (result < min || result > max) {
                    System.err.println("Input must have " + min + " and " + max);
                    continue;
                }
                return result;
            } catch (Exception e) {
                System.err.println("Input invalid. Please try again");
            }
        } while (true);
    }

    public int checkInt(String input) {
        if (input.matches("\\d+[\\.][0]+")) {
            return Integer.parseInt(input.substring(0, input.indexOf(".")));
        } else {
            return -1;
        }
    }

    public double inputDouble(String msg, double min, double max) {
        double result = 0;
        do {
            try {
                System.out.print(msg);
                result = Double.parseDouble(sc.nextLine());

                if (result % 0.5 != 0) {
                    System.err.println("Please input .5 or integer number");
                    continue;
                }

                if (result < min || result > max) {
                    System.err.println("Input must have " + min + " and " + max);
                    continue;
                }

                return result;
            } catch (Exception e) {
                System.err.println("Input invalid. Please try again");
            }
        } while (true);
    }

    public String inputString(String msg, String regex) {
        do {
            System.out.print(msg);
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.err.println("Please input non-empty string ");
                continue;
            }

            if (!input.matches(regex)) {
                System.err.println("Please input string with correctly regex " + regex);
                continue;
            }

            return input;
        } while (true);
    }

    public int inputBirthDate(String msg) {
        int currYear = Year.now().getValue();
        int result;
        while (true) {
            try {
                System.out.print(msg);
                String input = sc.nextLine();

                if (checkInt(input) != -1) {
                    return checkInt(input);
                }

                result = Integer.parseInt(input);
                if (result % 4 == 0) {
                    if (result >= 1900 && result <= currYear - 18) {
                        return result;
                    } else {
                        throw new Exception();
                    }
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.err.println(" Length of BirthDate is 4 character and range in 1900...(Current-18)");
            }
        }
    }

    public String inputPhone(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    System.err.println("Please input non-empty string ");
                    continue;
                }
                
                if(input.length() < 10){
                    System.err.println("String minimum 10 characters");
                    continue;
                }
                
                if (!input.matches("^[0]\\d+$")) {
                    throw new Exception();
                }
                
                return input;
            } catch (Exception e) {
                System.err.println("Phone start is 0, Please input again");
            }
        }
    }
    
    ArrayList<String> listEmail = new ArrayList<>(Arrays.asList("@gmail.com", "@fpt.edu.vn", "@yahoo.com"));
    public String inputEmail(String msg){
        while (true) {            
            try {
                System.out.print(msg);
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    System.err.println("Please input non-empty string ");
                    continue;
                }
                for (String string : listEmail) {
                    if(input.endsWith(string)){
                       return input; 
                    }
                }
                
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Email invalid. Please input again");
                System.out.println("List email valid: ");
                for (String string : listEmail) {
                    System.out.println(string);
                }
            }
        }
    }
}
