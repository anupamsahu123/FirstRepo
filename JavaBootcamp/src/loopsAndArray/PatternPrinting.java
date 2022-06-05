package loopsAndArray;

import java.util.Scanner;

/*
Description
Given an integer n, print the triangle. You need to read the integer as input and output the triangle as shown below.
Input: 6
Output: 

     * 

    * * 

   * * * 

  * * * * 

 * * * * * 

* * * * * *
 */

public class PatternPrinting {
	public static void main(String args[])
	{
	  Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
	        // loop to iterate for the given number of rows
	         for (int i = 1; i <= rows; i++) 
	         {
	       // loop to print the number of spaces before the star
	         for (int j = rows; j >= i; j--) 
	         {
	                   System.out.print(" ");
	          }
	       // loop to print the number of stars in each row
	               for (int j = 1; j <= i; j++) 
	          {
	                   System.out.print("* ");
	          }
	       // for new line after printing each row
	               System.out.println();
	           }
	         scanner.close();
	}
}
