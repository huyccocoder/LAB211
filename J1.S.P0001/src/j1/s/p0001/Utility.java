/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0001;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Utility {
    
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    
    public int getIntInRange(String msg, int min , int max){
        int result = 0;
        do {
            try {
                System.out.println(msg);
                String input = sc.nextLine();
                if(checkInt(input) != -1){
                    return checkInt(input);
                }
                result = Integer.parseInt(input);
                if(result < min || result > max){
                    System.err.println("Invalid number. Number must between " + min + "and " + max);
                    continue;
                }
                return result;
            } catch (Exception e) {
                System.err.println("Invalid number format. Please try again");
            }
        } while (true);
    }
    
    public int checkInt(String input){
        if(input.matches("\\d+[\\.][0]+")){
            return Integer.parseInt(input.substring(0, input.indexOf(".")));
        }
        return -1;
    }
    
    public int[] getRandom(int arr[], int size){
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }
    
    public void display(int arr[]){
        System.out.print("[ ");
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(cnt == arr.length - 1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i] + ", ");
                ++cnt;
            }
        }
        System.out.println(" ]");
    }
    
    public void bubleSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    
    
}
