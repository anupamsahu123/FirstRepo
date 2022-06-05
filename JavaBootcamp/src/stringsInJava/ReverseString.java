package stringsInJava;

import java.util.Scanner;

public class ReverseString {
	public static StringBuilder reverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse().toString();		 
		return sb;
	}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(reverse(str));
    sc.close();
  }
}