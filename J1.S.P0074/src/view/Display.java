/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bo.Manager;

/**
 *
 * @author Admin
 */
public class Display {
    public void showMenu(){
        System.out.println("========== Calculator Program ==========");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Exit");
    }
    
    public void displayMatrix(int[][] max1){
        for (int i = 0; i < max1.length; i++) {
            for (int j = 0; j < max1[0].length; j++) {
                System.out.print("[" + max1[i][j] + "]" + " ");
            }
            System.out.println("");
        }
    }
}
