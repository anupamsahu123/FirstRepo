package loopsAndArray;

import java.util.Scanner;

/*
 You are given a number n. Print the pattern shown below.
Input: 4
Output:

* * * * 

 * * * 

  * * 

   * 

   * 

  * * 

 * * * 

* * * * 



Input: 3

Output:

* * * 

 * * 

  * 

  * 

 * * 

* * * 
 */
public class FinalPattern {
	 public static void main (String[]args)
	  {
	    
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();

	    for (int i = 0; i <= n - 1; i++)
	      {
		for (int j = 0; j < i; j++)
		  {
		    System.out.print (" ");
		  }
		for (int k = i; k <= n - 1; k++)
		  {
		    System.out.print ("*" + " ");

		  }
		System.out.println ("");
	      }
	    for (int i = n - 1; i >= 0; i--)
	      {
		for (int j = 0; j < i; j++)
		  {
		    System.out.print (" ");
		  }
		for (int k = i; k <= n - 1; k++)
		  {
		    System.out.print ("*" + " ");
		  }
		System.out.println ("");

	      }
	    scanner.close();
}
	 }
