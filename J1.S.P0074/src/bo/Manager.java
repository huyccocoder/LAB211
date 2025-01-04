/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import ultis.getInputData;

/**
 *
 * @author Admin
 */
public class Manager {
    getInputData getData = new getInputData();

    public int[][] getMatrix1() {
        int rowM1 = getData.inputInt("Enter Row Matrix 1: ", 1, Integer.MAX_VALUE);
        int columnM1 = getData.inputInt("Enter Column Matrix 1: ", 1, Integer.MAX_VALUE);
        int[][] matrix = new int[rowM1][columnM1];

        for (int i = 0; i < rowM1; i++) {
            for (int j = 0; j < columnM1; j++) {
                String message = String.format("Enter Matrix1[%d][%d]: ", i + 1, j + 1);
                matrix[i][j] = getData.inputMatrix(message);
            }
        }
        return matrix;
    }

}
