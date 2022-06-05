package oopsJavaPart3;

import java.util.Scanner;

public class LargestDifferenceInArray {
	 public static void main (String[]args)
	  {
	    Scanner scanner = new Scanner (System.in);
	    int size = scanner.nextInt ();
	    int arr[] = new int[size];

	    for (int i = 0; i < size; i++)
	        arr[i] = scanner.nextInt ();

	      System.out.println (FindMaxDiff (arr));
	      scanner.close();

	  }

	static int FindMaxDiff (int arr[])
	  {
		int largestNumber = Integer.MIN_VALUE;
	    int smallestNumber = Integer.MAX_VALUE; 
	    for(int i = 0; i < arr.length; i++)
	    {
	        if(arr[i] > largestNumber)
	            largestNumber = arr[i];

	        if(arr[i] < smallestNumber)
	            smallestNumber = arr[i];

	    }

	    int biggestDifference = largestNumber - smallestNumber ;
		return biggestDifference;
	  
	  }
}
