/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import ultis.Validation;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Display display = new Display();
        Validation check = new Validation();
        
//        display.displayCandidate();
//        
//        int choice = check.inputInt("Your choice: ", 1, 5);
//        switch (choice) {
//            case 1:
//                
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5: 
//                System.exit(0);
//        }

        String phone = check.inputEmail("Nhap vao: ");
        System.out.println(phone);
    }
}
