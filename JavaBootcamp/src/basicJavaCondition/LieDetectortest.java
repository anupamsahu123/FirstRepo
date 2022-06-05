package basicJavaCondition;

import java.util.Scanner;

/*Lie detector test
Description
Assume that you have built a lie detector that detects the level of chemicals X and Y.
If the sum of the amounts of X and Y is greater than 30, the person is telling the truth. Write a Java code to take in the values of X and Y and detect whether the person is telling the truth or not.
If the person is telling the truth, display “The statement made by the person is true”. If the person is lying, display “The statement made by the person is false”.
Sample input:
12
23
Sample output:
The statement made by the person is true*/
public class LieDetectortest {
	public static void main(String[] args) {
	       int X,Y;
	       Scanner input = new Scanner(System.in);
	       X=input.nextInt();
	       Y=input.nextInt();
	       if(X+Y>30)
	       {
	           System.out.println("The statement made by the person is true");
	       }
	       else
	       {
	        System.out.println("The statement made by the person is false");   
	       }
	       input.close();
	        }
}
