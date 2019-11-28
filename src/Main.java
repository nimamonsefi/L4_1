/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new  Scanner(System.in);
        Student student=new Student();
        
        System.out.print("Enter Your Name : ");
        student.setName(scanner.next());
        
        System.out.print("Enter Your ID : ");
        student.setId(scanner.next());
        
        System.out.print("Enter Your Age : ");
        student.setAge(scanner.next());
        
        System.out.print("Enter Your Study : ");
        student.setStudy(scanner.next());
        
        System.out.println("\nName : "+student.getName());
        System.out.println("ID : "+student.getId());
        System.out.println("Age : "+student.getAge());
        System.out.println("Study : "+student.getStudy());

    }
    
}
