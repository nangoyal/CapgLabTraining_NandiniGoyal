package lab5_nandini;
//Validate the age of a person and 
//display proper message by using user defined exception. 
//Age of a person should be above 15.

import java.util.Scanner;

public class Exercise1Main {
     public static void main(String[] args) {
    	 
    	 System.out.println("Enter the age of the person:");
    	 Scanner sc = new Scanner(System.in);
    	 int age = sc.nextInt();
    	 
    	 try {
    		 if(age<15)
    		 {
    			 throw new InvalidAgeException("The entered age is not valid!");
    		 }
    		 else
    		 {
    			 System.out.println("Entered age is valid!");		 
    		 }
    		 }
    	 catch(InvalidAgeException e) {
    		 System.out.println("Alert!,Please enter age greater then 15!");
    	 }
    	 
    	 
    	 
     }
}
