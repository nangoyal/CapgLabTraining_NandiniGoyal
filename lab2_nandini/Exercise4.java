package lab2_nandini;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

//Create a method which accepts an integer array 
//and removes all the duplicates in the array. 
//Return the resulting array in descending order
public class Exercise4 {
	public static int[] modifyArray(int arr[],int n)
	{
		Arrays.sort(arr);
		int i, j = 0;
		for(i = 0; i < n - 1; i++) {
			if(arr[i] != arr[i+1]){
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n-1];
		while(j < n) {
			arr[j++] = 0; 
		}
		
		for (i = 0; i < n-1; i++) {
            for (j = 0; j < n-i-1; j++)
                if (arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    	}
		return arr;
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
		int mArr[] = modifyArray(arr,n);
		System.out.println("Modified Array in descending order after removing duplicates: ");
		for(int i=0;i<mArr.length;i++) {
		System.out.print(mArr[i]+" ");
		}
	}

}
