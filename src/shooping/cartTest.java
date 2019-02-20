package shooping;

import java.util.ArrayList;


public class cartTest {
	
	 public static int counter  = 0 ;
	 public static int price = 0 ;
	 
	
		
	
	 public static ArrayList<Integer>array= new ArrayList<Integer>();
	
	
	
	public static void  addBook(int pric ) {
		array.add(pric);
		counter = array.size() ;
		price +=pric;
		
	}
	


	
	
	
}