/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Utility {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public int getIntegerInRange(String msg, int min, int max) {
        int result = 0;
        do {
            try {
                System.out.println(msg);
                String input = sc.nextLine();
                if (checkInt(input) != -1) {
                    return checkInt(input);
                }
                result = Integer.parseInt(input);
                if (result < min || result > max) {
                    System.err.println("Invalid number. Number must between " + min + " and " + max);
                    continue;
                }
                return result;
            } catch (Exception e) {
                System.err.println("Invalid format. Please try input again");
            }
        } while (true);
    }

    public int checkInt(String input) {
        if (input.matches("\\d+[\\.][0]+")) {
            return Integer.parseInt(input.substring(0, input.indexOf(".")));
        }
        return -1;
    }

    public int[] getRandomNumber(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

    public void display(int arr[]) {
        System.out.print("[ ");
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cnt == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");

            }
            ++cnt;
        }
        System.out.println(" ]");
    }

    public void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int x[] = new int[n1];
        int y[] = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            x[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            y[i] = arr[m + i + 1];
           
        }
        
        int index = l;
        int i =0, j = 0;
        while(i < n1 && j < n2){
            if(x[i] <= y[j]){
                arr[index++] = x[i++];
            }
            else{
                arr[index++] = y[j++];
            }
        }
        
        while(i < n1){
            arr[index++] = x[i++];
        }
        while(j < n2){
            arr[index++] = y[j++];
        }
    }

    public void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    

}
