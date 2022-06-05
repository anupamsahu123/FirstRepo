package loopsAndArray;

import java.util.Scanner;

public class IncreasingOrDecreasingArray2 {
	
	public static void main(String[] args) {

	       Scanner input = new Scanner(System.in);
	       int arr[] = new int [3];

	 arr[0]= input.nextInt();
		        arr[1]=input.nextInt();
		        arr[2]=input.nextInt();
		       
		        if (arr[0] < arr[1] && arr[1] < arr[2])
		        {
		            System.out.println("The numbers entered are in increasing order");
		        }
		        else if (arr[0] > arr[1] && arr[1] > arr[2])
		        {
		            System.out.println("The numbers entered are in decreasing order");
		        }
		        else
		        {
		            System.out.println("The numbers are in neither in increasing order nor in decreasing order");
		        }
		        input.close();

	  }

}
