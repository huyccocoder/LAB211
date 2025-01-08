/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.StudentList;
import ultis.GetDataInput;

/**
 *
 * @author Admin
 */
public class ManagerController {
    GetDataInput getData = new GetDataInput();
    StudentList list = new StudentList();

    public ManagerController() {
    }
    
    public void createStudent(){
        if(list.lengthTen()){
            if(!getData.checkYN()){
                return;
            }
        }
        
        try {
            String nameStudent = getData.inputString("Input Name: ", "([a-zA-Z\\s]+)");
            String semester = getData.checkInputSemester("Input semester: ");
            String course = getData.checkInputCourse("Input course: ");
            
            int result = list.addStudent(0, semester, semester, course);
            if(result != -1){
                System.out.println("Create successfully");
            }
            else{
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Create failed");
        }
    }
    
    public void printStudent(){
        if(list.checkEmpty()){
            System.err.println("List empty");
            return;
        }
        
        list.printListStudent();
    }
}
