package loopsAndArray;

import java.util.Scanner;
/*Reverse the Array
Description
Given an array. You need to complete the function to print the element in reverse order. 
No input is required from your end. You are provided with an array. You need to output the reversed array.
Input: [1, 5, 7, 3, 4, 8, 0]
Output: 0 8 4 3 7 5 1
Note: Output Each Number with a space in the same line.
Hint: Try to solve the question without using any additional array.
 */
public class ReverseTheArray {
public static void main(String args[] ) throws Exception {
Scanner scanner = new Scanner (System.in);
	
		int sizeOfarray = scanner.nextInt();
		int arr[] = new int [sizeOfarray];
		for(int i=0; i<sizeOfarray;i++)
		arr[i] = scanner.nextInt();
		PrintReverseArray(arr);
		scanner.close();
		
}
public static void PrintReverseArray(int arr[])
{
    int left=0;
    int right= arr.length-1;
    while(left<right) {
    int temp=arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
    left++;
    right--;
    }
    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]+" ");
    }
    }
}


