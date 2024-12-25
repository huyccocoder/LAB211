/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Admin
 */
public class Display {

    public Display() {
    }
    
    public void display(){
        System.out.println("Menu: ");
        System.out.println("\t1. Binary");
        System.out.println("\t2. Decimal");
        System.out.println("\t3. Hexadecimal");
        System.out.println("\t4. Exit");
    }
    
    public void displayResult(String result){
        System.out.println("Result convert: " + result);
    }
}
