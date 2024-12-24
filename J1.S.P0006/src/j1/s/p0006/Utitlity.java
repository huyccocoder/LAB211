/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0006;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Utitlity {

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
                    System.err.println("Number invalid. Number must between " + min + " and " + max);
                    continue;
                }
                return result;

            } catch (Exception e) {
                System.err.println("Invalid Format. Please input again");
            }
        } while (true);
    }

    public int checkInt(String input) {
        if (input.matches("\\d+[\\.][0]+")) {
            return Integer.parseInt(input.substring(0, input.indexOf(".")));
        }
        return -1;
    }

    public void getRandomNumber(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }
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

    public void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public int binarySearch(int arr[], int numberSearch) {
        int l = 0, r = arr.length - 1;
        int pos = 0;
        while (l < r) {
            int mid = (l + r) / 2;
            if(arr[mid] == numberSearch){
                return mid;
            }
            if (arr[mid] > numberSearch) {
                r = mid - 1;
            } 
            else {
                l = mid +1;
            }
        }
        return -1;
    }
}
