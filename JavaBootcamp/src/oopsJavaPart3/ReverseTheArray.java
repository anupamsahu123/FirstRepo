package oopsJavaPart3;

import java.util.Scanner;

public class ReverseTheArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        s.close();
    }

    // Method to reverse the array
   public static void reverseArray(int[] arr)  {
       int[] temp = new int[arr.length];
       
       for (int i = 0; i < arr.length; i++) {
           temp[arr.length - 1 - i] = arr[i];
       }

       for (int i = 0; i < arr.length; i++) {
    	   arr[i] = temp[i];
       }
   
}
}