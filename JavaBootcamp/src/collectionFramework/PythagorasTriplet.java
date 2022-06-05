package collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class PythagorasTriplet {
	
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		String[] arr= new String[t];
		for(int i =0; i<t; i++) {
            int x=scan.nextInt();
            int y=scan.nextInt();
            int z=scan.nextInt();
            arr[i]=((x*x + y*y == z*z)? ("Yes"):("No"));
		}
		scan.close();
		for(String val:arr) {
			System.out.println(val);
		}
	}
}
