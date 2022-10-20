package lab2_nandini;
//Create a method which accepts an integer array, 
//reverse the numbers in the array and returns the resulting array in sorted order
import java.util.Scanner;
import java.util.*;


public class Exercise3 {
	
	public static int getSorted(int arr,int n) {
		for (int i = n-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of Elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		getSorted(arr,n);
	}

}
