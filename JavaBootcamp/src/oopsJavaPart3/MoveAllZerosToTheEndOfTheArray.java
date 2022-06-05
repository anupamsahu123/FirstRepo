package oopsJavaPart3;

import java.util.Scanner;

public class MoveAllZerosToTheEndOfTheArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        s.close();
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
    	int count = 0; 
    	for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];
    	while (count < arr.length)
            arr[count++] = 0;
    }
}