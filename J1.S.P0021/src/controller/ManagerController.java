/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
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

    public void createStudent() {
        if (list.lengthTen()) {
            if (!getData.checkYN()) {
                return;
            }
        }

        try {
            String nameStudent = getData.inputString("Input Name: ", "([a-zA-Z\\s]+)");
            String semester = getData.checkInputSemester("Input semester: ");
            String course = getData.checkInputCourse("Input course: ");

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
        String input = getData.inputString("Enter name to search: ", ".+");
        ArrayList<Student> listStudent = list.getDatabase();
        ArrayList<Student> tmp = new ArrayList<>();

        int check = -1;
        for (Student student : listStudent) {
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

    
    
    public void printStudent() {
        if (list.checkEmpty()) {
            System.err.println("List empty");
            return;
        }

        list.printListStudent();
    }
}
