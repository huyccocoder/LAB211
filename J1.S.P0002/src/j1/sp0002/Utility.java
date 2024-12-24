/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.sp0002;

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

    public void selectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[min_index] > arr[j]){
                    min_index = j;
                }
            }
            
            if(min_index != i){
                int tmp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = tmp;
            }
        }
    }
    
}
