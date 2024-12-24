/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.TaskManager;
import ultis.Validate;

/**
 *
 * @author Admin
 */
public class ManagerController {

    TaskManager taskManager;
    Validate valid = new Validate();

    public ManagerController() {
        taskManager = new TaskManager();
    }

    public void addTask() {

        System.out.println("--------------- Add Task ---------------");

        int taskTypeId = valid.inputInt("Task Type: ", 1, 4);
        String requirmentName = valid.inputString("Requirement Name: ", "[a-zA-Z]+");
        String date = valid.inputDate("Date: ");
        double planFrom = valid.inputDouble("From: ", 8, 17);
        double planTo = valid.inputDouble("To: ", planFrom + 0.5, 17.5);
        String assignee = valid.inputString("Assignee: ", ".+");
        String reviewer = valid.inputString("Reviewer: ", ".+");

        int id = taskManager.addTask(taskTypeId, requirmentName, date, planFrom, planTo, assignee, reviewer);

        if (id != -1) {
            System.out.println("Add task successfully");
        } else {
            System.err.println("Add task failed");
        }
    }

    public void deleteTask() {
        System.out.println("--------------- Del Task ---------------");
        int deleteId = valid.inputInt("Delete Id: ", 1, Integer.MAX_VALUE);

        if (taskManager.checkEmpty()) {
            System.err.println("The list task is empty. Please add task!!!!");
            return;
        }

        try {
            if (taskManager.deleteById(deleteId)) {
                System.out.println("Delete successfully");
            } else {
                System.err.println("Not found Id!!!!Delete failed");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void showTask() {
        System.out.println("--------------- Task ---------------");
        System.out.printf("%-5s %-10s %-10s %-15s %-10s %-10s %-10s\n",
                "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
        if (taskManager.checkEmpty()) {
            System.err.println("The list task is empty. Please add task!!!!");
        }
        taskManager.displayTask();
    }

}
