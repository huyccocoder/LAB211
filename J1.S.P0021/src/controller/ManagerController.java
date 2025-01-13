/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import model.Student;
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
    
    public boolean isEmpty(){
        if(list.checkEmpty()){
            System.err.println("List empty");
            return true;
        }
        return false;
    }

    public void createStudent() {
        
        if(isEmpty()){
            return;
        }
        
        if (list.lengthTen()) {
            if (!getData.checkYesOrNo()) {
                return;
            }
        }

        try {
            String nameStudent = getData.inputString("Input Name: ", "([a-zA-Z\\s]+)");
            String semester = getData.checkInputSemester("Input semester: ");
            String course = getData.checkInputCourse("Input course: ");
            
            if(list.checkDuplicated(nameStudent, semester, course)){
                System.err.println("The student is duplicated");
                throw new Exception();
            }

            int result = list.addStudent(0, nameStudent, semester, course);
            if (result != -1) {
                System.out.println("Create successfully");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Create failed");
        }
    }

    public void findAndSortStudent() {
        if(isEmpty()){
            return;
        }
        
        String input = getData.inputString("Enter name to search: ", ".+");
        ArrayList<Student> tmp = new ArrayList<>();

        int check = -1;
        for (Student student : list.getDatabase()) {
            if (student.getStudentName().contains(input)) {
                tmp.add(student);
                check = 1;
            }
        }

        if (check != 1) {
            System.out.println("Student not exist");
        } else {
            tmp.sort((s1, s2) -> s1.getStudentName().compareTo(s2.getStudentName()));
            for (Student student : tmp) {
                System.out.println(student);
            }
        }
    }

    public Student findStudentById(int id){
        
        for (Student student : list.getDatabase()) {
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }
    
    public void updateStudent(int id){
        if(isEmpty()){
            return;
        }
        
        Student updateStudent = findStudentById(id);
        Student tmpStudent = updateStudent;
        if(updateStudent != null){
            String nameStudent = getData.inputString("Input newName: ", "([a-zA-Z\\s]+)");
            String semester = getData.checkInputSemester("Input newSemester: ");
            String course = getData.checkInputCourse("Input newCourse: ");
            
            System.out.println(tmpStudent);

            Student update = list.updateStudent(updateStudent, nameStudent, semester, course);

            System.out.println("--------------- UPADTE ---------------");
            System.out.println("---ID " + id + " have UPDATED---");
            System.out.println(update);
        }
        else{
            System.err.println("Student not exist");
        }
    }
    
    public void deleteStudent(int id){
        Student deleteStudent = findStudentById(id);
        if(list.deleteStudent(deleteStudent)){
            System.out.println("Remove successfully");
        }
        else{
            System.err.println("Remove failed");
        }
    }
    
    public void updateOrDelete() {
        if(isEmpty()){
            return;
        }
        
        int input = getData.inputInt("Enter id: ", 0, list.sizeOfStudent());

        Student searchStudent = this.findStudentById(input);
        if(searchStudent != null){
            System.out.println(searchStudent);
        }
        else{
            System.err.println("Not found Student");
            return;
        }
        
        String checkUpdateOrDelete = getData.checkUpdateOrDelete("Do you want to update(U) or delete(D) student: ");
        if(checkUpdateOrDelete.equalsIgnoreCase("u")){
            updateStudent(input);
        }
        else{
            deleteStudent(input);
        }
    }

    // Report quantity course of Student
    public void reportQuantityCourse(){
        HashMap<String, Integer> report = list.getCountOfCourse();

        System.out.println("The report as below: ");
        System.out.printf("%-10s | %-5s\n", "STUDENT", "COUNT QUANTITY");
        for (Entry<String, Integer> student : report.entrySet()) {
            System.out.printf("%-10s | %-5d\n", student.getKey(), student.getValue());
        }
    }

    public void printStudent() {
        if(isEmpty()){
            return;
        }
        list.printListStudent();
    }
}
