package basicJavaCondition;

/*Celsius to Farhenhite
Description
Write a Java program to take the temperature from a user in Celsius, convert it into Fahrenheit, and then display it to the user. You can use the following formula for this purpose:
F = 9C/5+32
Where C is the temperature in Celsius and F is the temperature in Fahrenheit
Note: You can assume that C and F are integer values. You do not need to take the input C, just complete the code and print the output.
Sample input: 1
Sample output: 33 */


import java.util.Scanner;

public class CelsiustoFarhenhite {


	   public static void main(String[] args) {
	    int C, F;
	      Scanner input= new Scanner(System.in);
	      C=input.nextInt();

	    F= 9*C/5 +32;
	    System.out.println(F);
	    input.close();

	 }
	
	
	
}
