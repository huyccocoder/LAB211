/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0001;

import java.sql.Array;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utility ult = new Utility();
        int size = ult.getIntInRange("Input size of array", 1, Integer.MAX_VALUE);
        int [] array = new int[size];
        ult.getRandom(array, size);
        System.out.print("Unsorted array: ");
        ult.display(array);
        ult.bubleSort(array);
        System.out.print("Sorted array: ");
        ult.display(array);
    }
    
}
