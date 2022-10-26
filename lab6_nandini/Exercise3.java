package lab6_nandini;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
//Exercise 3: Create a method which accepts an array of numbers 
//and returns the numbers and their squares in Hashmap

public class Exercise3 {
	public static HashMap getSquares(int[] store) {
		
		HashMap <Integer, Integer> storeMap = new HashMap<>();
		
		for (int i = 0; i < store.length; i++) {
			
			if (storeMap.containsKey(store[i]) == false){
				int n = store[i];
			    storeMap.put(store[i], n*n);
			   
			}
		}
		return storeMap;
	}

	public static void main(String[] args) {
		while(true) {
		System.out.println("Enter num here:");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getSquares(arr));
		}

	}
}

