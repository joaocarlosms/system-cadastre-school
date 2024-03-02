/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.Scanner;
/**
 *
 * @author Windows
 */
public class Student {
    private String name;
    private char sex;
    private int age;
    private String enrollment;
    private int YearsJoin;
    
    public Student() {
        this.name = " ";
        this.sex = ' ';
        this.age = 0;
        this.enrollment = " ";
        this.YearsJoin = 0;
    }
    
    public Student(String name, char sex, int age, String enrollment, int YearsJoin) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.enrollment = enrollment;
        this.YearsJoin = YearsJoin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public int getYearsJoin() {
        return YearsJoin;
    }

    public void setYearsJoin(int YearsJoin) {
        this.YearsJoin = YearsJoin;
    }
    
    public Student(Student orig) {
       this.name = orig.getName();
       this.sex = orig.getSex();
       this.age = orig.getAge();
       this.enrollment = orig.getEnrollment();
       this.YearsJoin = orig.getYearsJoin();
    }
    
    public void fill_student() {
        Scanner reader = new Scanner(System.in);
        System.out.println("***** Preenchendo aluno ******");
        
        System.out.println("Nome: ");
        this.setName(reader.next());
        
        System.out.println("Idade: ");
        this.setAge(reader.nextInt());
        
        System.out.println("Sexo: ");
        this.setSex(reader.next().charAt(0));
        
        System.out.println("Matricula: ");
        this.setEnrollment(reader.next());
        
        System.out.println("Ano de ingresso: ");
        this.setYearsJoin(reader.nextInt());
        
   }
    
    @Override
    public String toString() {
        return "-------- DADOS DO ALUNO --------\n" +
                "Nome: " + name + "\n" +
                "Idade: " + age + "\n" +
                "Sexo: " + sex + "\n" + 
                "Matricula: " + enrollment + "\n" +
                "Ano de ingresso: " + YearsJoin + "\n";
    }
    
    public void copy_student(Student another) {
        this.name = another.getName();
        this.age = another.getAge();
        this.sex = another.getSex();
        this.enrollment = another.getEnrollment();
        this.YearsJoin = another.getYearsJoin();
    }
}
