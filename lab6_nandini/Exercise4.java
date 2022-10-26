package lab6_nandini;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
//Exercise 4:  school offers medals to the students of tenth based on the following criteria 
//If(Marks>=90) : Gold 
//If(Marks between 80 and 90) : Silver 
//If(Marks between 70 and 80) : Bronze 

public class Exercise4 {
public static void getStudents(HashMap<String, Integer> store) {
		
		HashMap<String, String> storeMarks = new HashMap<>();
		
		for (Map.Entry e : storeMarks.entrySet()) {
			
			int m = (int)e.getValue();
           
			if(m >=70 && m < 80) {
				
				storeMarks.put((String)e.getKey(), "Bronze MEDAL");
            
			} else if(m >=80 && m < 90) {
				storeMarks.put((String)e.getKey(), "Silver MEDAL");
            
			} else {
            	if(m >= 90 && m <= 100) {
            		storeMarks.put((String)e.getKey(), "Gold MEDAL");
            	}
            }
		}
//		Set<Entry<String,Integer>>setobj = store.entrySet();
//		Iterator<Entry<String,Integer>> itr = setobj.iterator();
//	    while(itr.hasNext()) {
//	    	 System.out.println(itr.next());
	    }
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> marks = new HashMap<>();
	    marks.put("Aparajita", 72);
	    marks.put("Harsha", 91);
	    marks.put("Umang", 89);
	    marks.put("Shaily", 62);
	    getStudents(marks);
	}
}
