/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Convert;
import ultis.GetInputData;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Display display = new Display();
        GetInputData input = new GetInputData();
        Convert convert = new Convert();

        do {            
            // Display Menu
            display.display();
            // Input base
            int inputBase = input.getBase("Enter base input: ", 1  , 4, 0);
            // Input ouputBase
            int outputBase = input.getBase("Enter base ouput: ", 1, 4, inputBase);
            // Input value to convert
            String inputValue = input.getInput("Enter input value: ", inputBase);
            // Result convert
            String resultConvert = convert.convertValue(inputValue, inputBase, outputBase);
            // Display result convert
            display.displayResult(resultConvert);
        } while (true);
    }
            
}
