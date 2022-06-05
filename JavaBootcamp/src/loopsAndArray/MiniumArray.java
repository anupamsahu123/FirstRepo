package loopsAndArray;

import java.util.Arrays;
import java.util.Scanner;

public class MiniumArray {

	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner (System.in);
		int sizeOfarray = scanner.nextInt();
		int arr[] = new int [sizeOfarray];
		for(int i=0; i<sizeOfarray;i++)
		arr[i] = scanner.nextInt();
	    FindMinimum(arr);
	    scanner.close();
	}
public static void FindMinimum(int arr[])
{
  Arrays.sort(arr);
  System.out.println(arr[0]);
}
}