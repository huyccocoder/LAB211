/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import ultis.GetData;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        Display display = new Display();
        GetData getdata = new GetData();

//        Display Menu
        display.display();
//        Input Choice
        int choice = getdata.getChoice("Please choice one option: ", 1, 4);
        switch (choice) {
            case 1:
                
                break;
            case 2:

                break;
            case 3:
                System.exit(0);
                break;

        }

    }
}
