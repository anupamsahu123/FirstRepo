package bootcamp2ndclass;

import java.util.Scanner;

public class IfelseCondition {
	
	 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x =Integer.MAX_VALUE;
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+" Elements to Store inside Array");
        for(int i = 0 ; i< size ; i ++){
            arr[i]= sc.nextInt();
        }
        for(int i = 0 ; i<arr.length; i++)
        {
        	if(arr[i] < x)
        	{
            x= arr[i];
        }
        }
        System.out.println("Smallest Element inside this Array is "+x);
    }

}
