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
public class main {
    public static void main(String[] args) {
        Display display = new Display();
        GetDataInput getData = new GetDataInput();
//        Show Menu
        display.DisplayMenu();
//        choose option
        getData.inputChoice("Please choice one option: ", 1, 4);
        
        System.out.println(getData.inputCaptcha("huy: ", "hahah"));
        
    }
}
