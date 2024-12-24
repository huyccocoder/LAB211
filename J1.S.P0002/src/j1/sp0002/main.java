/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.sp0002;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        Utility utl = new Utility();
        int size = utl.getIntegerInRange("Enter number of array", 1, Integer.MAX_VALUE);
        int arr[] = new int[size];
        utl.getRandomNumber(arr, size);
        System.out.println("Unsorted Array");
        utl.display(arr);
        utl.selectionSort(arr);
        System.out.println("Sorted Array");
        utl.display(arr);    }
}

