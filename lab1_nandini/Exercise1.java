package lab1_nandini;

//Problem Statement: Create a method to find the sum of the cubes of the digits of an n digit number
import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = obj.nextInt();
		int sum=0;
		while(num>0)
		{
			int n=num%10;
			
			sum+=(n*n*n);
			num = num/10;
		}
		System.out.println("Sum of cubes of digits of entered number is "+sum);
		
		
	}

}
