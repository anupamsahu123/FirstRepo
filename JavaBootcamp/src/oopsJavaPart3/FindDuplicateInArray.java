package oopsJavaPart3;

import java.util.Scanner;

public class FindDuplicateInArray {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++)
			arr[i] = scanner.nextInt();
		System.out.println(FindDup(arr));
		scanner.close();
	}

	static int FindDup (int arr[]) {
	    int Duplicate = 0;
	      for(int i = 0; i <= arr.length-1; i++) 
	      {
	        for(int j = i + 1; j <= arr.length-1; j++) {
	                if(arr[i] == arr[j]) {
	                    Duplicate=arr[i];
	                  }
	              }
	        }
	    return Duplicate;
	  
}}