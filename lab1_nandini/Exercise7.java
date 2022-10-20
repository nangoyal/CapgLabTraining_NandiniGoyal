package lab1_nandini;
import java.util.Scanner;
//Create a method to check if a number is an increasing number
public class Exercise7 {
	
	public static boolean checkNumber(int number) {
		boolean increNum = false;
		while(number>0) {
			int lastD = number%10;
			number/=10;
			int nextLastD = number%10;
			
			if(nextLastD <=lastD)
			{
				increNum = true;
			}
			else
			{
				increNum = false;
			}
	}
		return increNum;
	}
	
	
	
	
	
	
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 int number = sc.nextInt();
	 boolean increNum = false;
	 increNum = checkNumber(number);
	 System.out.println(increNum);
    	 
    	  
      }
}
