package loopsAndArray;

import java.util.Scanner;

/*
Description
Write Java code to check whether numbers entered by the user are in increasing order or decreasing and print “The numbers entered are in increasing order” for increasing order and “The numbers entered are in decreasing order” for decreasing order.
If the numbers are in neither increasing nor decreasing order then print “The numbers are in neither in increasing order nor in decreasing order”.
Hint: Use arrays and loops to solve this problem.
Sample Input:
11
19
132
Sample Output:
The numbers entered are in increasing order
 */
public class IncreasingOrdecreasingArray 
{
	public static void main(String[] args) {

	      Scanner input = new Scanner(System.in);
	       int arr[] = new int [3];
	       
	      for(int i=0; i<3; i++)
	           arr[i] = input.nextInt();

	            if(arr[0] < arr[1] && arr[1] < arr[2])
	            System.out.println("The numbers entered are in increasing order");
	            else if(arr[0]>arr[1] && arr[1]>arr[2])
	            System.out.println("The numbers entered are in decreasing order");
	            else System.out.println("The numbers are in neither in increasing order nor in decreasing order");
	            input.close();


	   }

}
