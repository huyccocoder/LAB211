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

    public int[][] getMatrix2(int [][] matrix1, String regex) {
        int [][] matrix2;
        int rowM2, columnM2;
        do {
            if(regex.equals("+") || regex.equals("-")){
                rowM2 = getData.inputInt("Enter Row Matrix 2:", 1, Integer.MAX_VALUE);
                columnM2 = getData.inputInt("Enter Column Matrix 2:", 1, Integer.MAX_VALUE);
                if(rowM2 != matrix1.length || columnM2 != matrix1[0].length){
                    System.err.println("Row or column Matrix2 not equal to row or column Matrix1");
                    continue;
                }
                else{
                    break;
                }
            }

            if(regex.equals("*")){
                rowM2 = getData.inputInt("Enter Row Matrix 2:", 1, Integer.MAX_VALUE);
                columnM2 = getData.inputInt("Enter Column Matrix 2:", 1, Integer.MAX_VALUE);
                
                if(rowM2 != matrix1[0].length){
                    System.err.println("Row matrix2 have to equal column matrix1");
                }
                else{
                    break;
                }
            }
        } while (true);

        matrix2 = new int[rowM2][columnM2];

        for (int i = 0; i < rowM2; i++) {
            for (int j = 0; j < columnM2; j++) {
                String message = String.format("Enter Matrix1[%d][%d]: ", i + 1, j + 1);
                matrix2[i][j] = getData.inputMatrix(message);
            }
        }
        return matrix2;
    }

}
