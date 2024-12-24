/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0003;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utility utl = new Utility();
        int size = utl.getIntegerInRange("Enter number of array: ", 1, Integer.MAX_VALUE);
        int arr[] = new int[size];
        utl.getRandomNumber(arr, size);
        System.out.print("Unsorted array: ");
        utl.display(arr);
        utl.insertionSort(arr);
        System.out.print("Sorted array: ");
        utl.display(arr);
    }
    
}
