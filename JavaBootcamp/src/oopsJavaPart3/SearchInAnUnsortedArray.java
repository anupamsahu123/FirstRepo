package oopsJavaPart3;

import java.util.Scanner;

public class SearchInAnUnsortedArray {
	
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        search(arr, k);
    }

    // Method to search for k in an unsorted array
    static void search(int[] arr, int k) 
    {
    	boolean found = true;
        
        int n = 0;
		// Loop to check that K times of
        // element is present in the array
        for(int i = 0; i < n; i++)
        {
           for(int j = 0; j < n; j++)
           {
              if (arr[i] == k * arr[j])
              {
                  found = true;
                  break;
              }
           }
        }
     
        if (found)
            System.out.print("true" + "\n");
        else
            System.out.print("false" + "\n");
    }
}