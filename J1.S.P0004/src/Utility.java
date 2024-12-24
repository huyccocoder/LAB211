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
    
    public int partition(int arr[], int l, int r){
        int i = l - 1, pivot = arr[r];
        for (int j = l; j < r; j++) {
            if(arr[j] <= pivot){
                ++i;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        ++i;
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i;
    }
    
    public void quickSort(int arr[], int l, int r){
        if(l < r){
            int p = partition(arr, l, r);
            quickSort(arr, l, p - 1);
            quickSort(arr, p + 1, r);
            
        }
    }
}
