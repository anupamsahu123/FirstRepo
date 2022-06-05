package stringsInJava;

import java.util.Scanner;

public class SumofnumberinString {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String inputstring = scanner.next();
		System.out.println(Add(inputstring));
		scanner.close();
	}

public static int Add(String inputstring) {
	
	  char[] c = inputstring.toCharArray();
	  int sum = 0;
      for (int i = 0; i < c.length; i++) {
          if (Character.isDigit(c[i])) {
              
              int a = Integer.parseInt(String.valueOf(c[i]));
              sum = sum + a;
	
	}
}
	return sum;
	}
}
