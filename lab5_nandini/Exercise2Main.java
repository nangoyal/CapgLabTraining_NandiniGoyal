package lab5_nandini;
//Exercise 2: Write a Java Program to validate the full name of an employee. 
//Create and throw a user defined exception if firstName and lastName is blank.
import java.util.Scanner;

public class Exercise2Main {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter your First Name and Last Name here ......");
		 String firstName = sc.next();
		 String lastName = sc.next();
		 System.out.println("First Name: "+firstName);
		 System.out.println("Last Name: "+lastName);
		
	try {
		if(firstName ==null || lastName == null) {
			throw new IncompleteNameException("Alert!,Please enter Full Name");
		}
		else
		{
			System.out.println("Full Name is: " +firstName +" " +lastName);
		}
	}
	catch(IncompleteNameException e){
	System.out.println("Either First Name or Last Name is missing!");
		
	}

}
}
