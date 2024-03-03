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
    
    public Discipline(Discipline orig) {
        this.name = orig.getName();
        this.semester = orig.getSemester();
        this.time = orig.getTime();
        this.minister = orig.getMinister();
        this.listStudents = orig.getListStudents();
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
    
    public String getTime() {
       return time;
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
    
    public void fill_discipline() {
        Scanner reader = new Scanner(System.in);
        System.out.println("**** Preenchendo Disciplina *****");
        
        System.out.println("Nome: ");
        this.setName(reader.next());
        
        minister.fill_teacher(); // fill data of teachers/ministers
        
        System.out.println("Semestre: ");
        this.setSemester(reader.nextInt());
        
        System.out.println("Tempo: ");
        this.setTime(reader.next());
        
        char option = 'n';
            
        do{
            Student student = new Student();
            student.fill_student();
            
            System.out.println("Deseja cadastrar mais aluno(s/n): ");
            option = reader.next().charAt(0);
        }while(option == 's');
   }

     public void print_data_discipline() { 
            System.out.println("---- Dados da Disciplina ----");
            System.out.println("Nome: " + this.name);
            System.out.println("Semestre: "+ this.semester); 
            System.out.println("Horario: " + this.time);
               
            System.out.println(minister);
              
            for(int i = 0; i < listStudents.size(); i++) {
                 Student student = this.getListStudents().get(i);
                 System.out.println(student);
            }
        }
     
     public void copy_discipline(Discipline another) {
         this.name = another.getName();
         this.semester = another.getSemester();
         this.time = another.getTime();
         
         minister.copy_teacher(another.getMinister());
         
         for(int i = 0; i < listStudents.size(); i++) {
             Student anotherStudent = another.getListStudents().get(i);
             Student student = new Student();
             student.copy_student(anotherStudent);
             this.listStudents.add(student);
         }
     }
}
