/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class StudentList {

    ArrayList<Student> listStudent;
    private int lastID;

    public StudentList() {
        listStudent = new ArrayList<>();
        listStudent.add(new Student(1, "huy", "summer", "java"));
        listStudent.add(new Student(1, "huy", "spring", "java"));
        listStudent.add(new Student(2, "hai", "autumn", "C/C++"));
        listStudent.add(new Student(3, "cuowng", "spring", ".NET"));
        this.lastID = 3;
    }
    
    public int sizeOfStudent(){
        return listStudent.size();
    }
    
    public boolean checkEmpty() {
        return listStudent.size() == 0;
    }

    public boolean lengthTen() {
        if (listStudent.size() >= 5) {
            return true;
        }
        return false;
    }

    public ArrayList<Student> getDatabase() {
        return listStudent;
    }
    
    public boolean checkDuplicated(String nameStudent, String semester, String course){
        for (Student student : listStudent) {
            if(student.getStudentName().equalsIgnoreCase(nameStudent) 
                    && student.getSemester().equalsIgnoreCase(semester)
                    && student.getCourse().equalsIgnoreCase(course)){
                return true;
            }
        }
        return false;
    }

    public int addStudent(int id, String studentName, String semester, String course) {
        Student student = new Student();

        try {
            student.setId(++lastID);
            student.setStudentName(studentName);
            student.setSemester(semester);
            student.setCourse(course);

            if (listStudent.add(student)) {
                return student.getId();
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return -1;
    }

    // Quantity Course of Student
    public HashMap<String, Integer> getCountOfCourse(){
    HashMap<String, Integer> quantityCourseOfStudent = new HashMap<>();
        for (Student student : listStudent) {
            quantityCourseOfStudent.put(student.getStudentName(), quantityCourseOfStudent.getOrDefault(student.getStudentName(), 0) + 1);
        }

        return quantityCourseOfStudent;
    }

    public Student updateStudent(Student student, String studentName, String semester, String course){
        student.setStudentName(studentName);
        student.setSemester(semester);
        student.setCourse(course);
        
        return student;
    }
    
    public boolean deleteStudent(Student student){
        if(listStudent.remove(student)){
            return true;
        }
        return false;
    }
    
    public void printListStudent() {
        System.out.printf("%-5s | %-20s | %-10s\n", "ID", "== STUDENT NAME ==", "== Course ==");
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }
}
