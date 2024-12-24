/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p00010;

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
        int size = utl.getIntegerInRange("Enter number of array", 1, Integer.MAX_VALUE);
        int k = utl.getIntegerInRange("Enter search value", 0, Integer.MAX_VALUE);
        int[] arr = new int[size];
        utl.getRandomNumber(arr, size);
        System.out.print("The array: ");
        utl.display(arr);
        int position = utl.linearSearch(arr, k);
        if (position != -1) {
            System.out.print("Found " + k + " at index: " + position);
        } else {
            System.out.println("Not found " + k + " in array");
        }
        System.out.println();
    }
}
