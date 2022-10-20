package lab2_nandini;
import java.util.*;

// Create a method which accepts an array of
//integer elements and return the second smallest element in the array
import java.util.Scanner;

public class Exercise1 {
	
		public static void printArray(int arr[]) {
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
	}
		public static int getSmallestElement(int arr[])
		{
			return arr[1];
		}
	
    public static void main(String args[]){
    	int arr[] = {15,28,90,12,67,17};

    	for(int i=0;i<arr.length-1;i++) {
    		for(int j=0;j<arr.length-i-1;j++)
    		{
    			if(arr[j]>arr[j+1]) {
    			int temp = arr[j];
    			arr[j] = arr[j+1];
    			arr[j+1] = temp;
    			}
    		}
    }
    	System.out.println("Array is: ");
    	printArray(arr);
    	System.out.println("The second smallest elemnt in the Array: ");
    	System.out.println(getSmallestElement(arr));
}
}
