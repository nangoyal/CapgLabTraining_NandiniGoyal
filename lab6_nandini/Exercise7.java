package lab6_nandini;
//Exercise 7: Create a method which accepts an integer array,
//reverse the numbers in the array and returns the resulting array in sorted order
import java.util.Scanner;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exercise7 {
	public static void getSorted(int[] arr){
		List<Integer> dora = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			dora.add(arr[i]);
		}
		

		System.out.println("Print Your Array");
		ListIterator itr = dora.listIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
//		Printing Array in reverse order using hasPrevious method of listIterator class object.		
		System.out.println("Print Reversed Array");
		while(itr.hasPrevious()) {
			System.out.print(itr.previous()+" ");
		}
		
		System.out.println();
		
		System.out.println("Print Sorted Array");
		Collections.sort(dora);
		for(int i=0;i<arr.length;i++)
		{
		  System.out.print(dora.get(i)+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Elements in the Array: ");
        int n = sc.nextInt();
        
        System.out.println("Enter Elements here: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i] = sc.nextInt();
        }
       getSorted(arr);
	}
}
