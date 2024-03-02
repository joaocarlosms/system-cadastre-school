/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import classes.Student;
import classes.Teacher;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Discipline {
    private String name;
    private int semester;
    private String time;
    private Teacher minister;
    private List<Student> listStudents;
    
    public Discipline() {
        this.name = "";
        this.semester = 0;
        this.time = "0h";
        this.listStudents = new ArrayList<>();
        this.minister = new Teacher();
    }
    
    public Discipline(String name, int semester, String time, Teacher minister, List<Student> listStudents) {
        this.name = name;
        this.semester = semester;
        this.time = time;
        this.minister = minister;
        this.listStudents = listStudents;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    public int getSemester() {
        return semester;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    
    public void setMinister(Teacher minister) {
        this.minister = minister;
    }
    
    public Teacher getMinister() {
        return minister;
    }
    
    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }
    
    public List<Student> getListStudents() {
        return listStudents;
    }
}
