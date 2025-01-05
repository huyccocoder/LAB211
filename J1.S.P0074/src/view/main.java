/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bo.Manager;
import controller.MatrixController;
import ultis.getInputData;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        Display display = new Display();
        getInputData getData = new getInputData();
        Manager manager = new Manager();
        MatrixController controller = new MatrixController();

        display.showMenu();

        int choice = getData.inputInt("Your choice: ", 1, 4);
        String regex = "";

        switch (choice) {
            case 1:
                regex = "+";

                display.navbarAdd();
                int[][] max1 = manager.getMatrix1();
                int[][] max2 = manager.getMatrix2(max1, regex);

                display.displayMatrix(max1);
                System.out.println(regex);
                display.displayMatrix(max2);

                int [][] matrixAdd = controller.addTwoMatrix(max1, max2);
                System.out.println("=");
                display.displayMatrix(matrixAdd);
                break;
            case 2:
                regex = "-";

                display.navbarSub();
                int[][] matrix1 = manager.getMatrix1();
                int[][] matrix2 = manager.getMatrix2(matrix1, regex);

                display.displayMatrix(matrix1);
                System.out.println(regex);
                display.displayMatrix(matrix2);

                int [][] matrixSub = controller.subTwoMatrix(matrix1, matrix2);
                System.out.println("=");
                display.displayMatrix(matrixSub);

                break;
            case 3:
                regex = "*";

                display.navbarMulti();
                int[][] Multimatrix1 = manager.getMatrix1();
                int[][] Multimatrix2 = manager.getMatrix2(Multimatrix1, regex);

                display.displayMatrix(Multimatrix1);
                System.out.println(regex);
                display.displayMatrix(Multimatrix2);

                int [][] matrixMulti = controller.multiTwoMatrix(Multimatrix1, Multimatrix2);
                System.out.println("=");
                display.displayMatrix(matrixMulti);
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
