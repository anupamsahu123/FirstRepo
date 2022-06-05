package basicJavaCondition;

import java.util.Scanner;

/*Operations on Variables
Description
Write a Java code that does the following:
Asks the user to input three integer variables: a, b and c
Does the following calculation: a*b+c
Prints out the value obtained in Step 2
Input:
a = 2, b = 3, c = 4 
Output:  
10 */

public class OperationsOnVariables {
	 public static void main(String[] args) {
		    int a;
		    int b;
		    int c;

		    Scanner input = new Scanner(System.in);
		    a=input.nextInt();
		    b=input.nextInt();
		    c=input.nextInt();
		     System.out.println(a*b+c);
		     input.close();

		  }

}
