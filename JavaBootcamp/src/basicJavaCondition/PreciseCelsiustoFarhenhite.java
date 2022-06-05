package basicJavaCondition;

import java.util.Scanner;

/* Precise Celsius to Farhenhite
Description
Write a Java program to take the temperature from a user in Celsius, convert it into Fahrenheit, and then display it to the user. You can use the following formula for this purpose:
F = 9C/5+32
Where C is the temperature in Celsius and F is the temperature in Fahrenheit
Note: C will be entered in integer form, but F can be a float.
Sample input: 1
Sample output: 33.8*/

public class PreciseCelsiustoFarhenhite {
	public static void main(String[] args) {
	      
		 int C; 
		 float F;
		 Scanner input = new Scanner(System.in);
		 C = input.nextInt();
		 F= 9 * (float)C / 5 + 32;
		 System.out.println(F);
		 input.close();
		  
		 }
}
