package loopsAndArray;

import java.util.Arrays;
import java.util.Scanner;

public class ElementintheArray {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner (System.in);
		int sizeOfarray = scanner.nextInt();
		int arr[] = new int [sizeOfarray];
		for(int i=0; i<sizeOfarray;i++)
		arr[i] = scanner.nextInt();
		int number = scanner.nextInt();
		Find(arr, number);
		scanner.close();
				
		}

		    public static void Find(int arr[], int number)
		    {
		        Arrays.sort(arr);
		     int index = Arrays.binarySearch(arr,number);
		     if(index>0) System.out.println("yes");
		     else System.out.println("no");
		    }
		 }
