/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Task {
    private int id;
    private int taskTypeId;
    private String requirementName;
    private String date;
    private double planFrom;
    private double planTo;
    private String assignee;
    private String reviewer;
    
    public Task() {
    }

    public Task(int id, int taskTypeId, String requirementName, String date, double planFrom, double planTo, String assignee, String reviewer) {
        this.id = id;
        this.taskTypeId = taskTypeId;
        this.requirementName = requirementName;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }
    
    

    public String convertIntIntoString(int taskTypeId){
        switch (taskTypeId) {
            case 1:
                return "Code";
            case 2:
                return "Test";
            case 3:
                return "Design";
            case 4:
                return "Review";
            default:
                throw new AssertionError();
        }
    }
    
    public int convertStringIntoInt(String str){
        if(str.compareTo("Code") == 0){
            return 1;
        }
        if(str.compareTo("Test") == 0){
            return 2;
        }
        if(str.compareTo("Design") == 0){
            return 3;
        }
        if(str.compareTo("Review") == 0){
            return 4;
        }
        return -1;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskTypeId() {
        return convertIntIntoString(taskTypeId);
    }

    public void setTaskTypeId(int taskTypeId) {
        this.taskTypeId = taskTypeId;
//        this.taskTypeId = convertIntIntoString(taskTypeId);
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    
    
    @Override
    public String toString() {
        return String.format("%-5d %-10s %-10s %-15s %-10.1f %-10s %-10s",
                       id, requirementName , this.getTaskTypeId() , date,
                       planTo - planFrom, assignee, reviewer);
    }
    
    
    
}
