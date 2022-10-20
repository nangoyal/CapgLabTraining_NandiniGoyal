package lab1_nandini;
//Create a method to check if a number is a power of two or not
import java.util.Scanner;
public class Exercise8 {
	
	public static boolean checkNumber(int n) {
		boolean isPowerOfTwo = false;
		
		if (n == 0)
            return isPowerOfTwo;
 
        while (n != 1) {
            if (n % 2 != 0)
                return isPowerOfTwo;
            n = n / 2;
        }
		
		
		return !isPowerOfTwo;
		
		
	}
	
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPowerOfTwo = false;
		System.out.println(isPowerOfTwo);
		
		
	}

}
