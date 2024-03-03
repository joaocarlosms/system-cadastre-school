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
public class Teacher {
    private String name;
    private char sex;
    private int age;
    private String cpf;
    
    public Teacher() {
        this.name = "";
        this.sex = ' ';
        this.age = 0;
        this.cpf = "000.000.000-00";
    }
    
    public Teacher(String name, char sex, int age, String cpf) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Teacher(Teacher orig)  {
        this.name = orig.getName();
        this.age = orig.getAge();
        this.cpf = orig.getCpf();
        this.sex = orig.getSex();       
    }
    
    public void fill_teacher() {
        Scanner reader = new Scanner(System.in);
        System.out.println("******* Preenchendo professor ******");
        
        System.out.println("Informe o nome: ");
        this.setName(reader.nextLine());
        
        System.out.println("Informe o CPF: ");
        this.setCpf(reader.nextLine());
        
        System.out.println("Informe o sexo: ");
        this.setSex(reader.next().charAt(0));
        
        System.out.println("Informe a idade: ");
        this.setAge(reader.nextInt());
    }

    @Override
    public String toString() {
        return
                "-------- DADOS DO PROFESSOR --------\n" +
                "Nome=" + name 
                + ", Sexo=" + sex 
                + ", Idade=" + age 
                + ", CPF=" + cpf ;
    }
    
    
    
    public void copy_teacher(Teacher another) {
        this.name = another.getName();
        this.cpf = another.getCpf();
        this.age = another.getAge();
        this.sex = another.getSex();
    }
}
