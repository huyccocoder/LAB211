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
    
    public void displayMatrix(int[][] matrix1, int[][] matrix2, String regex){
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print("[" + matrix1[i][j] + "]" + " ");
            }
            System.out.println("");
        }

        System.out.println(regex);

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print("[" + matrix2[i][j] + "]" + " ");
            }
            System.out.println("");
        }
    }

    public void navbarAdd(){
        System.out.println("---------- Addition ----------");
    }

    public void navbarSub(){
        System.out.println("---------- Subtraction ----------");
    }
    
    public void navbarMulti(){
        System.out.println("---------- Multiplication ----------");
    }
}
