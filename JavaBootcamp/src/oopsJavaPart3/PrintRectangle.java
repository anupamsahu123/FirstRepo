package oopsJavaPart3;

import java.util.Scanner;

public class PrintRectangle 
{
	 public static void main (String[]args)
	 {
	    Scanner scanner = new Scanner (System.in);
	    int n = scanner.nextInt ();
	    Patternprint(n);
	    scanner.close();
	 }
	static void Patternprint (int n)
	  {
		 for(int i=1; i<=n; i++)
	        {
	            for(int j=1; j<=2*n; j++)
	            {
			        System.out.print("* ");
		        }
			    System.out.println("");
	   
	  }
}
	}