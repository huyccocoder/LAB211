/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import ultis.getInputData;

/**
 *
 * @author Admin
 */
public class MatrixController {
    getInputData getData = new getInputData();

    public int[][] addTwoMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] matrixAdd = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrixAdd.length; i++) {
            for (int j = 0; j < matrixAdd[0].length; j++) {
                matrixAdd[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return matrixAdd;
    }

    public int[][] subTwoMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] matrixSub = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrixSub.length; i++) {
            for (int j = 0; j < matrixSub[0].length; j++) {
                matrixSub[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return matrixSub;
    }

    public int[][] multiTwoMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] matrixMulti = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrixMulti.length; i++) {
            for (int j = 0; j < matrixMulti[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }

                matrixMulti[i][j] = sum;
            }
        }

        return matrixMulti;
    }
}
