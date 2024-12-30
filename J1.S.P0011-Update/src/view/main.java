/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import ultis.InputData;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Display display = new Display();
        InputData inputData = new InputData();

        display.display();

        int inputBase = inputData.getBase("Input base: ", 1, 4, 0);
        int outputBase = inputData.getBase("Output Base: ", 1, 4, inputBase);
    }
}
