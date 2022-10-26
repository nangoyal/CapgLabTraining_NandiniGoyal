package com.cg.eis.bean;
//Exercise 3:  Create an Exception class named as “EmployeeException”(User defined Exception)
//in a package named as “com.cg.eis.exception” and throw an exception 
//if salary of an employee is below than 3000. Use Exception Handling mechanism to handle exception properly.
import java.util.Scanner;

public class lab5Exercise3Main {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the salary of the Employee: ");
	double salary = sc.nextDouble();
	
	try {
		if(salary<3000){
			throw new EmployeeException("Salary is below 3000");
		}
		else
		{
			System.out.println("Salary is ok!");
		}
	} catch(EmployeeException e) {
		System.out.println("Entered salary is not appropriate,please enter Salary >3000");
	}
	
	}  
}
