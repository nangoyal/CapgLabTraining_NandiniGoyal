package lab2_nandini;
//Create a method that can accept an array 
//of String objects and sort in alphabetical order. 
//The elements in the left half should be completely 
//in uppercase and the elements in the right half should be 
//completely in lower case. Return the resulting array.
//Note: If there are odd number of String objects, 
//then (n/2) +1 elements should be in UPPPERCASE
import java.util.Arrays;  
//import java.util.lang;
import java.util.Scanner;


public class Exercise2 {
         
	public static void sortString(String arr[],int n) {
		if(n%2==0) {
		for(int i=0;i<=n/2;i++)
		{
			System.out.println(arr[i].toUpperCase());
		}
		for(int i=n/2+1;i<=n-1;i++)
		{
			System.out.println(arr[i].toLowerCase());
		}
		}
		if(n%2!=0)
		{
			for(int i=0;i<n/2+1;i++)
			{
				System.out.println(arr[i].toUpperCase());
			}
			for(int i=n/2+1;i<=n-1;i++)
			{
				System.out.println(arr[i].toLowerCase());
			}
		}
	      
	}  

	
	public static void main(String args[]) {  
		Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
    
	      System.out.println("Enter the String ");
	      String arr[] = new String[n];
	    
//	    Scanner sc1 = new Scanner(System.in);
	    for(int i=0;i<n;i++)
	    {
	    	arr[i] =sc.nextLine();
	      
	    }  
        for(int i = 0; i<n; i++) 
        {  
            for (int j = i+1; j<n; j++)  
            {
              
               if(arr[i].compareTo(arr[j])>0)   
               {  
                   
                   String temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
                }  
             }  
          }  
       
          System.out.println(Arrays.toString(arr));
          sortString(arr,n);
	}

}
//output: 10
//Enter the String 
//nan
//ashj
//jas
//iwe
//wej
//df
//eir
//tyo
//tow
//[, ashj, df, eir, iwe, jas, nan, tow, tyo, wej]
//
//ASHJ
//DF
//EIR
//IWE
//JAS
//nan
//tow
//tyo
//wej

