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
    public void display(){
        System.out.println("---------- Convert Program ----------");
        System.out.println("Menu: ");
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal");
        System.out.println("4. Exit");
    }

    public void resultConvert(String x){
        System.out.println("Result after convert: " + x);
    }
}
