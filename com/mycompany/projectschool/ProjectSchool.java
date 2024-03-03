/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectschool;
import java.util.Scanner;
import classes.Discipline;
import classes.Student;

/**
 *
 * @author Windows
 */
public class ProjectSchool {
    public static void menuOptions() {
        
        System.out.println("+-------------------------------------+");
        System.out.println("|          Sistema de Gerenciamento   |");
        System.out.println("+-------------------------------------+");
        System.out.println("| Opção |          Descrição          |");
        System.out.println("+-------+-----------------------------+");
        System.out.println("|   1   |         Cadastrar           |");
        System.out.println("|   2   |         Deletar             |");
        System.out.println("|   3   |         Pesquisar           |");
        System.out.println("|   4   |         Sair                |");
        System.out.println("+-------+-----------------------------+");
        
       
    }
    
    public static void main(String[] args) {
        Discipline d = new Discipline();
        Student student = new Student();
        Scanner reader = new Scanner(System.in);
        int option = 0;
        
        do {
            menuOptions();
            option = reader.nextInt();
            
            switch(option) {
                case 1:
                    d.fill_discipline();
                    d.print_data_discipline();
                    break;
               
                case 2:
                    System.out.println(student);
                    break;
            }
        }while(option != 4);
    }
}
