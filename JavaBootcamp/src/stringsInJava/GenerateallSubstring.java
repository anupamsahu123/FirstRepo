package stringsInJava;

import java.util.Scanner;

public class GenerateallSubstring {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	String str = scanner.next();
	 SubString(str, str.length());
	 scanner.close();
	
}
	
	public static void SubString(String str, int n)
    {
       for (int i = 0; i < n; i++ )
           for (int j = i+1; j <= n; j++)
           
        	   
                System.out.print(str.substring(i, j)+" ");
      
                
    }
}