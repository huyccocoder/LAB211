/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0008;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {

    
    
    public static void main(String[] args) {
        
        Utility utl = new Utility();
        
        Scanner sc = new Scanner(System.in);
        String input = utl.getStringValid("Enter your content: ");
        utl.count(input);
        utl.display();
        
    }
    
}
