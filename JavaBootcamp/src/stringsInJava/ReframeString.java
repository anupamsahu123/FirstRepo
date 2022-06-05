package stringsInJava;

import java.util.Scanner;

public class ReframeString {
	public static void main(String[] args) {
		
		String name;
        Scanner scan = new Scanner(System.in);
        name  = scan.next();
        String lowercase= name.toLowerCase();
        String upperCase = lowercase.substring(0, 1).toUpperCase() + lowercase.substring(1);
        System.out.println(upperCase); 
        scan.close();
	}
}
