package lab1_nandini;

//Create a class with a method which can calculate the 
//sum of first n natural numbers which are divisible by 3 or 5.

import java.util.Scanner;


public class Exercise5 {
	
	
	static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
      
    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
    
		public static int calculateSum(int N,int X,int Y){
			int S1, S2, S3;
		     
	        S1 = ((N / X)) * (2 * X + (N / X - 1) * X) / 2;
	        S2 = ((N / Y)) * (2 * Y + (N / Y - 1) * Y) / 2;
	        S3 = ((N / ( lcm(X,Y))) * (2 * ( lcm(X,Y))
	                          + (N / ( lcm(X,Y)) - 1) * ( lcm(X,Y)))/ 2);
	     
	        return S1 + S2 - S3;
		}



     public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in);
    	 int N = sc.nextInt();
//    	 int X = sc.nextInt();
//    	 int Y = sc.nextInt();
    	 System.out.println(calculateSum(N,3,5));
	 
}

}
