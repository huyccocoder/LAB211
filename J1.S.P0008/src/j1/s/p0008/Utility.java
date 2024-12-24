/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0008;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Utility {

    public static Map<String , Integer> countString = new HashMap<>();
    public static Map<Character, Integer> countChar = new HashMap<>();
    
    public String getStringValid(String msg) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(msg);
            String input = sc.nextLine();
            if (checkString(input) != 0) {
                return input;
            }
            else
                 System.err.println("Input invalid. String must have alphabetic");
        } while (true);
    }

    public int checkString(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isAlphabetic(input.charAt(i)) && !Character.isSpaceChar(input.charAt(i))) {
                return 0;
            }
        }
        return 1;
    }
    
    public void display(){
        System.out.println(countString);
        System.out.println(countChar);
    }
    
    public void count(String text){
        String cntStr[] = text.split(" ");
        for (int i = 0; i < cntStr.length; i++) {
            countString.put(cntStr[i], countString.getOrDefault(cntStr[i], 0) + 1);
        }
        
        for (int i = 0; i < text.length(); i++) {
            countChar.put(text.charAt(i), countChar.getOrDefault(text.charAt(i), 0) + 1);
        }
        
        countChar.remove(' ');
    }
}
