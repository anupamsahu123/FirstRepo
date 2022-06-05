package collectionFramework;

/*
 
You are given a string. You are required to arrange the alphabetical characters in 
ascending order. You do not need to take any input or print output, as the main function 
will take care of that. You just need to complete the ArrangeString() function, 
which accepts the string as a parameter and returns the arranged string.
Note: All characters are lowercase.
Hint: Try breaking the string into individual characters.
Input: upgrad
Output: adgpru 
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	    String inputstring = scanner.next();
	    
	   System.out.println( ArrangeString(inputstring));
	   scanner.close();
	   
	}
	
	public static char[] ArrangeString( String inputstring){
	
		
		  char []arr = inputstring.toCharArray();
	        Arrays.sort(arr);
			return arr;
	       
	  
	}
	
}
