/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        Utility utl = new Utility();
        int size = utl.getIntegerInRange("Enter number of array: ", 1, Integer.MAX_VALUE);
        int arr[] = new int[size];
        utl.getRandomNumber(arr, size);
        System.out.print("Unsorted array: ");
        utl.display(arr);
        utl.quickSort(arr, 0, size - 1);
        System.out.print("Sorted array: ");
        utl.display(arr);
    }

}
