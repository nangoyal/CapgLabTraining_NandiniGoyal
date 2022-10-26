package lab6_nandini;
//Exercise 5: Create a method which accepts an array of integer elements 
//and return the second smallest element in the array
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 {
	
	public static int getSmallestElement(int[] arr) {
		
		List<Integer>mine = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			mine.add(arr[i]);  //inserting elements of arr array to mine List.
		}
		Collections.sort(mine); //sorting the mine List using Collection Package.
		return mine.get(1);     //return second element of the sorted array(List).
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of Elements in Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter Elements here:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Second Smallest element of your array is: ");
		System.out.println(getSmallestElement(arr));	
	}

}
