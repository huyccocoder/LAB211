/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.util.ArrayList;
import java.util.List;
import model.Task;

/**
 *
 * @author Admin
 */
public class TaskManager {

    private List<Task> listTask;
    private int lastId;

    public TaskManager() {
        listTask = new ArrayList<>();
        lastId = 0;
    }

    public int addTask(int taskTypeId, String requirementName, String date,
            double planFrom, double planTo, String assignee, String reviewer) {

        Task task = new Task();

        try {
            for (Task task1 : listTask) {
            if (task1.getRequirementName().compareTo(requirementName) == 0
                    && task1.getTaskTypeId().compareTo(task.convertIntIntoString(taskTypeId)) == 0
                    && task1.getDate().compareTo(date) == 0
                    && task1.getPlanFrom() == planFrom
                    && task1.getPlanTo() == planTo
                    && task1.getAssignee().compareTo(assignee) == 0
                    && task1.getReviewer().compareTo(reviewer) == 0) {

                
                throw new Exception();
                
            }
        }
        } catch (Exception e) {
            System.err.println("The task is duplicated");
            return -1;
        }
        
        

        try {
            task.setId(++lastId);
            task.setTaskTypeId(taskTypeId);
            task.setRequirementName(requirementName);
            task.setDate(date);
            task.setPlanFrom(planFrom);
            task.setPlanTo(planTo);
            task.setAssignee(assignee);
            task.setReviewer(reviewer);

            if (listTask.add(task)) {
                return task.getId();
            }

        } catch (Exception e) {
            e.getMessage();
        }
        return -1;
    }

    public boolean checkEmpty() {
        if (listTask.size() == 0) {
            return true;
        }
        return false;
    }

    public boolean deleteById(int id) {

        int cnt = 0;

        for (Task task : listTask) {

            if (task.getId() == id) {
                listTask.remove(cnt);
                return true;
            } else {
                ++cnt;
            }
        }
        return false;
    }

    public void displayTask() {
        for (Task task : listTask) {
            System.out.println(task);
        }
    }

}
