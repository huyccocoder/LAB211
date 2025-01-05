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

        int choice = getData.inputInt("Your choice: ", 1, 4);
        String regex = "";

        switch (choice) {
            case 1:
                regex = "+";
                int[][] max1 = manager.getMatrix1();
                int[][] max2 = manager.getMatrix2(max1, regex);
        
                display.displayMatrix(max1, max2, regex);
                break;
            case 2:
                regex = "-";
                break;
            case 3:
                regex = "*";
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
