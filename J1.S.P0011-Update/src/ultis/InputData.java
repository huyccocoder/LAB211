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
public class InputData {
    Scanner sc = new Scanner(System.in);

    /**
     * @param msg
     * @param min
     * @param max
     * @param inputBase
     * @return
     */
    public int getBase(String msg, int min, int max, int inputBase) {
        int choice = 0;
        int base = 0;

        do {
            try {
                System.out.print(msg);
                String input = sc.nextLine();

                if (input.isEmpty()) {
                    System.out.println("String is empty. Please input again non-empty string");
                    continue;
                }

                choice = Integer.parseInt(input);
                if (choice < min || choice > max) {
                    System.out.println("Input have to between " + min + " and " + max);
                    continue;
                }

                switch (choice) {
                    case 1:
                        base = 2;
                        break;

                    case 2:
                        base = 10;
                        break;

                    case 3:
                        base = 16;
                        break;
                    case 4: 
                        System.exit(0);
                }

                if (base == inputBase) {
                    System.out.println("Output base is duplicated. Please input again!!!!");
                    continue;
                }

                return base;
            } catch (Exception e) {
                System.out.println("Format invalid. Please input again");
            }
        } while (true);
    }

    public String geString(String msg, int inputBase) {
        String result ="";
        do {
            try {
                System.out.print(msg);
                String input = sc.nextLine();

                if (input.isEmpty()) {
                    System.out.println("String is empty. Please input again non-empty string");
                    continue;
                }

                switch (inputBase) {
                    case 2:
                        if (input.matches("^[0-1]+$")) {
                            result = input;
                        } else {
                            System.out.println("Binary is only input 0 and 1!!");
                            continue;
                        }
                    case 10:
                        if (input.matches("^[0-9]+$")) {
                            result = input;
                        } else {
                            System.out.println("Decimal only input 0 and 9");
                            continue;
                        }
                    case 16:
                        if (input.matches("^[a-fA-F0-9]+$")) {
                            result = input;
                        } else {
                            System.out.println("Hexadecimal only input 0 and 9 and a to f");;
                            continue;
                        }
                }

                return result.toUpperCase();
            } catch (Exception e) {
                System.out.println("Format invalid. Please input again");
            }
        } while (true);
        
    }
}
