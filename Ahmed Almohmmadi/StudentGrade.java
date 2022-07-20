/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.grade;

import java.util.Scanner;

/**
 *
 * @author ahmed
 */
public class StudentGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Plase enter the grade : ");
        
       double a = sc.nextInt();
       
        System.out.println("The stuednt grade is : "+printGrade(a));
        
        
        
        
        
        
    }
    
     public static double printGrade(double grade){
   
     
         if (grade >= 90.0){
             System.out.println(" A ");}
         else if (grade >= 80.0){
             System.out.println(" B ");}
         else if (grade >= 70.0){
             System.out.println(" C ");}
         else if (grade >= 60.0){
             System.out.println(" D ");}
         else {
             System.out.println(" F ");}
         
         return grade;
         
         
     
     
     }
}
