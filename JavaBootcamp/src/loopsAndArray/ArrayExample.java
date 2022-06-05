package loopsAndArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int val: arr) {
            System.out.println("value is " + val);
            sc.close();
        }}
}
