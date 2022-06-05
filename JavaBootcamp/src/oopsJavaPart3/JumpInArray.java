package oopsJavaPart3;
/*
 Jump In Array
Description
Suppose you are playing a game. You are given an array of integers as the input. The game starts at index 0 of the array. You jump the number equal to the integer at the index of the array. You are required to find out whether you can reach the end of the array. Return “true” if the end of the array is reached; otherwise, return “false”. The array contains only 0 and positive numbers.
Note: You must reach the index greater than or equal to the last index of the array. No input and output are needed from your end. You just need to complete the CanReach function. The main function will take care of printing “true” or “false”.
Input: [1,1,1,1,1,]
Output: true   
Explanation: The player starts at index 0 and keeps jumping one position each time until it reaches the end of the array.
Input: [1,1,0,1,1,]
Output: false
Explanation: The player starts at index 0 and keeps jumping one position each time until it reaches index 2, where it encounters 0 and does not move forward.
 */
import java.util.Scanner;

public class JumpInArray {
	  public static void main (String[]args)
	  {
	    Scanner scanner = new Scanner (System.in);
	    int size = scanner.nextInt ();
	    int arr[] = new int[size];

	    for (int i = 0; i < size; i++)
	        arr[i] = scanner.nextInt ();

	      System.out.println (CanReach (arr));
	      scanner.close();
	  }
 static boolean CanReach (int arr[])
	  {
	 boolean[] index = new boolean[arr.length];
		index[0]=true;
		
		for (int currPos = 0; currPos < arr.length; currPos++) {
            /* if the index we are currently at is not reachable from
             * 0th index, then we obviously can not make further jumps
             * from this position.
             * Also, number of jumps possible from the current position
             * needs to be greater than zero, as in case of zero, we can
             * not move to any other position by making a jump*/
            if (index [currPos] && arr [currPos] > 0) {
                int maxJumps = arr[currPos];
                /* mark all the reachable positions from current position
                 * true because, if they can be reached from an intermediate
                 * spot, and that intermediate spot can be reached from zero,
                 * then the jumped position will also be reachable from zeroth
                 * index*/
                for (int jump = 1; jump <= maxJumps; jump++) {
                    if(currPos + jump < index.length)
                    {
                    	index[currPos+jump] =  true;
                    }
                }
            }
        }
 
        /*return the result of last index of the array if it is reachable
         * from zeroth index or not*/
        return index [arr.length-1];
    	  }
	}