/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Student {
    private int id;
    private String studentName;
    private int semester;
    private String coursseName;

    public Student(int id, String studentName, int semester, String coursseName) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.coursseName = coursseName;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", studentName=" + studentName + ", semester=" + semester + ", coursseName=" + coursseName + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCoursseName() {
        return coursseName;
    }

    public void setCoursseName(String coursseName) {
        this.coursseName = coursseName;
    }
    
    
}
