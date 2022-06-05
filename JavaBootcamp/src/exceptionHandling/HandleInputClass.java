package exceptionHandling;
/*
Handle Array Exceptions
Description
An array of length n will have an index from 0 to n-1. You are required to implement a try-catch block where the array element is accessed. In case the index is greater than the Array allowed index, the catch should print the default exception. You need not take input as the main function will handle this operation. Just implement the try-catch block, and print the array element in case the array index is available. Or else, print the default exception for ArrayIndexOutOfBoundsException.
Note: System.out.println(e) --> This prints the exception.
Input: [1,2,3,4,5] , 3
Output: 4
Explanation: Here, the 3rd index is the 4th element, i.e., 4.
Input: [1,2,3,4,5] , 6
Output: java.lang.ArrayIndexOutOfBoundsException: 6
 */
import java.util.Scanner;



public class HandleInputClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size_array = scanner.nextInt();
		int arr [] = new int [size_array];
		for(int i=0; i<size_array; i++)
		arr[i] = scanner.nextInt();
		int index = scanner.nextInt(); 
		try {
				System.out.println(arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);	
		}
		scanner.close();
		
	}
}