/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ManagerController;
import ultis.GetDataInput;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        GetDataInput getData = new GetDataInput();
        ManagerController controller = new ManagerController();
  
        while (true) {            
            display.showMenu();
            int choice = getData.inputInt("Your choice: ", 1, 5);
            switch (choice) {
                case 1:
                    controller.createStudent();
                    break;
                case 2:
                    controller.findAndSortStudent();
                    break;
                case 3:
                    controller.updateOrDelete();
                    break;
                case 4:
                    controller.printStudent();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
        
    }
}
