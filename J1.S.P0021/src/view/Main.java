/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import ultis.GetDataInput;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        GetDataInput getData = new GetDataInput();
        display.showMenu();
        
        int choice  = getData.inputChoice("Your choice: ", 1, 5);
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }
}
