/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bo.Manager;
import ultis.getInputData;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        Display display = new Display();
        getInputData getData = new getInputData();
        Manager manager = new Manager();

        display.showMenu();

        int[][] max1 = manager.getMatrix1();
        // int[][] max2 = manager.getMatrix1();

        display.displayMatrix(max1);

    //    int choice = getData.inputInt("Your choice: ", 1, 4);
    //    int [][] arr1 = new int[choice][choice];
    //    switch (choice) {
    //        case 1:
    //            System.out.println("---------- Addition ----------");
               
    //            break;
    //        case 2:
    //            break;
    //        case 3:
    //            break;
    //        case 4:
    //            System.exit(0);
    //            break;
    // }
}
}
