package stringsInJava;

import java.util.Scanner;

public class FindandDelete {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String inputstring = scanner.next();
		String wordtodelete = scanner.next();
		System.out.println(Delete(inputstring,wordtodelete));
		scanner.close();
	}

public static String Delete(String inputstring, String wordtodelete)
  {
	return inputstring=inputstring.replaceAll(wordtodelete, "");
	}
	
}
