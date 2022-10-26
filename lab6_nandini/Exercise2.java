package lab6_nandini;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

//Exercise2 Collection: Create a method that accepts a character array 
//and count the number of times each character is present in the array.

public class Exercise2 {
      
	public static HashMap countChars(char[] store) {
        HashMap <Character, Integer> storeMap = new HashMap<>();
		
		for (int i = 0; i < store.length; i++) {
			
			if (storeMap.containsKey(store[i])){
				int count = storeMap.get(store[i]);
			   
				storeMap.put(store[i],++count);
			
			} else {
				storeMap.put(store[i],1);
		    }
		}
		return storeMap;
		
	}
	
	public static void main(String[] args) {
		while(true) {
		System.out.println("Enter Char Arr here:");
		Scanner sc = new Scanner(System.in);	
		String str = sc.next();
		System.out.println(countChars(str.toCharArray()));
		}
	
	}
}
