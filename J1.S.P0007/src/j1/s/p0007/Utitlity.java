/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0007;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Utitlity {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public int getIntegerInRange(String msg, int min, int max) {
        int result = 0;
        do {
            try {
                System.out.println(msg);
                String input = sc.nextLine();
                if (checkInt(input) != -1) {
                    return checkInt(input);
                }
                result = Integer.parseInt(input);
                if (result < min || result > max) {
                    System.err.println("Number valid. Number must between " + min + " and " + max);
                    continue;
                }
                return result;
            } catch (Exception e) {
            }
        } while (true);
    }

    public int checkInt(String input) {
        if (input.matches("\\d+[\\.][0]+")) {
            return Integer.parseInt(input.substring(0, input.indexOf(".")));
        }
        return -1;
    }
    
}
