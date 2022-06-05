package loopsAndArray;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        int ele = sc.nextInt();
        int ansIndex = -1;

        for(int i=0; i<N; i++) {
            if(arr[i] == ele) {
                ansIndex = i;
                break;
            }
        }

        System.out.println("Index is " + ansIndex);
        sc.close();
    }
}
