/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class StudentList {

    ArrayList<Student> listStudent;
    private int lastID;

    public StudentList() {
        listStudent = new ArrayList<>();
        this.lastID = 0;
    }

    public int addStudent(int id, String studentName, String semester, String course) {
        Student student = new Student();

        try {
            student.setId(++lastID);
            student.setStudentName(studentName);
            student.setSemester(semester);
            student.setCourse(course);
            
            if(listStudent.add(student)){
                return student.getId();
            }
            else{
                throw  new Exception();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return -1;
    }
    
    public boolean checkEmpty(){
        return listStudent.size() == 0;
    }
    
    public boolean lengthTen(){
        if(listStudent.size() >= 1){
            return true;
        }
        return false;
    }
    
    public ArrayList<Student> getDatabase(){
        return listStudent;
    }
    
    public void printListStudent(){
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }
}
