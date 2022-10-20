package lab1_nandini;

//The Fibonacci sequence is defined by the following rule. 
//The first 2 values in the sequence are 1,
//1. Every subsequent value is the sum of the 2 values preceding it. 
//Write a Java program that uses both recursive and non-recursive functions
//to print the nth value of the Fibonacci sequence?
import java.util.Scanner;

public class Exercise3 {

		public static void main(String args[])  
		{    
		 int x1=0,x2=1;
		 System.out.println("first two elements of Fibonacci series are: ");
		 System.out.println(x1+" "+x2);
		 System.out.println("Enter no. of elements of series you wanna print ");
		 Scanner obj1 = new Scanner(System.in);
		 int noOfElements = obj1.nextInt();
		 int newnum;
		 while(noOfElements>0)
		 {
			 newnum = x1+x2;
			x1 = x2;
			x2 = newnum;
			System.out.println(" "+newnum);
			
			 noOfElements--;
			 
			 
		 }
		}
}