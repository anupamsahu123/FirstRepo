package oopsJavaPart1;

/*
 Create an object of the given Person class with parameterised constructor initialising the name 
 variable to ‘Ankit’, and then print the value of ‘name’ variable using the getter method.
Input:
No Input Required
Output:
Ankit
 */

public class Getter {
	   public static void main(String[] args) {
	       Person p = new Person("Ankit");
	       System.out.println(p.getName());
	   }
	}

	class Person {
	   private String name;
	   public Person(String name) {       
	       this.name = name;
	   }
	   public String getName() {
	       return name;
	   }
}
