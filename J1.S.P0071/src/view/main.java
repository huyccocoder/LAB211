/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import controller.ManagerController;
import java.util.*;
import model.Task;
import ultis.Validate;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        Task t1 = new Task(0, 0, "12-11-1999", "huy", 0, 0, "a", "b");
        Task t2 = new Task(0, 0, "12-11-1999", "huy", 0, 0, "a", "b");
        System.out.println(t1 == t2);
        
//        Validate valid = new Validate();
//        ManagerController control = new ManagerController();
//
//        while (true) {
//            System.out.println("=============== Task program ==========");
//            System.out.println("1. Add Task");
//            System.out.println("2. Delete Task");
//            System.out.println("3. Display Task");
//            System.out.println("4. Exit");
//
//            int choice = valid.inputInt("Input your choice: ", 1, 4);
//            switch (choice) {
//                case 1:
//                    control.addTask();
//                    break;
//                case 2:
//                    control.deleteTask();
//                    break;
//                case 3:
//                    control.showTask();
//                    break;
//                case 4:
//                    System.exit(0);
//            }
//        }
    }

}
