package oopsJavaPart1;
/*
 Given a string as an input, create an object of the given Person class,
 and initialise that object by assigning the input string to the ‘name’ variable using the setter method. 
 You do not need to input or output anything, just complete the setter definition.
Input:
Ankit
Output:
Ankit
 */

import java.util.Scanner;

public class Setters {
	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       String name = scanner.next();
	       human p = new human();
	       p.setName(name);
	      System.out.println(p.getName());
	      scanner.close();
	   }
	}

	class human {
	   private String name;
	   public String getName() {
	       return name;
	   }
	   
	   public void setName(String name) {
	       this.name = name;
	   }
	  
}
