package stringsInJava;

import java.util.Scanner;

public class StringConcat {
	public static void main(String[] args) {

	      String name;
	      int year;
	      Scanner input= new Scanner(System.in);
	      name=input.nextLine();
	      year=input.nextInt();
	      year=year+4;
         System.out.println("Hello "+ name);
         System.out.println("Free services till:"+ year);
         input.close();
	   }
}
