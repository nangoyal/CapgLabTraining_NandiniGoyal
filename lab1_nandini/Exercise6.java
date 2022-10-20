package lab1_nandini;
import java.util.Scanner;
import java.lang.Math;
//Create a class with a method to find the difference 
//between the sum of the squares and the square of the sum 
//of the first n natural numbers.

public class Exercise6 {
	
	static int calculateDifference(int n) {
		int S1 =0,S2=0;
		S1 =(n * (n + 1)) / 2;
		S2 = (n * (n + 1) * (2 * n + 1)) / 6;
		int S3 = S1*S1;
		return (Math.abs(S2-S3));
	}


public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(calculateDifference(n));
	
}
}