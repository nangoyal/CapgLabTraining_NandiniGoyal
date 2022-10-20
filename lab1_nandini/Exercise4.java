package lab1_nandini;
//Write a Java program that prompts the user for an integer 
//and then prints out all the prime numbers up to that Integer

import java.util.Scanner;
public class Exercise4 {

	
		public static void main(String args[]) 
        {

		Scanner obj = new Scanner(System.in);
	    System.out.println("Enter the integer upto which you want to print the prime numbers ");
	    int n = obj.nextInt();
	    while(n>2)
	    {
	    	if(n%2!=0)
	    	{
	    		System.out.println(n);
	    	}
	    	n--;
	    }  
	    
	    System.out.println("2");
		}
	    

}