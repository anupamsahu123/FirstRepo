package oopsJavaPart3;

import java.util.Scanner;

public class TheFibonacci {
	
		  public static void main (String[]args)
		  {

		    Scanner scanner = new Scanner (System.in);
		    int n = scanner.nextInt ();

		    int a = 0, b = 1, c;
		    if (n == 0)
		      System.out.println (a);
		    else
		      {
			for (int i = 2; i <= n; i++)
			  {
			    c = a + b;
			    a = b;
			    b = c;
			  }
			System.out.println (b);
		      }
		    scanner.close();
		  }
		}