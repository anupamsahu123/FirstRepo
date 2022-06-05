package oopsJavaPart3;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
	  public static void main (String[]args)
	  {
	    Scanner scanner = new Scanner (System.in);
	    int size1 = scanner.nextInt ();
	    
	    int arr1[] = new int[size1];
	    for(int i=0; i<size1; i++)
	    arr1[i] = scanner.nextInt();
	    
	    int size2 = scanner.nextInt ();
	    int arr2[] = new int[size2];
	    for(int i=0; i<size2; i++)
	    arr2[i] = scanner.nextInt();
	    
	    int arr3 [] = MergeArray(arr1, arr2);
	    
	    for(int i=0; i<arr3.length; i++)
	    System.out.print(arr3[i]+" ");
	    scanner.close();
	  }
	 public static int[] MergeArray(int arr1[], int arr2[])
	  {
	
		 int[] MergeArray= new int [arr1.length + arr2.length];
		 int i=0, j=0, k=0; 
		 while (i < arr1.length) 
	        {
			 MergeArray[k] = arr1[i];
	            i++;
	            k++;
	        } 
		 while (j < arr2.length) 
	        {
			 MergeArray[k] = arr2[j];
	            j++;
	            k++;
	        } 
	             
	        Arrays.sort(MergeArray);
	         
	        return MergeArray;
	    }
		 
		 
	  }
	