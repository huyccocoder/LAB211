/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0006;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utitlity utl = new Utitlity();
        int size = utl.getIntegerInRange("Enter number of array: ", 1, Integer.MAX_VALUE);
        int k = utl.getIntegerInRange("Enter search value: ", 0 , Integer.MAX_VALUE);
        int arr[] = new int[size];
        System.out.print("Sorted array: ");
        utl.getRandomNumber(arr, size);
        utl.bubblesort(arr);
        utl.display(arr);
        System.out.println("Found " + k + " at index: " + utl.binarySearch(arr, k));
    }
    
}
