package javaMain;

public class GetterMethod {

	public static void main(String[] args) {
		   Person n1 = new Person("Ankit");
		   System.out.println(n1.getName());
		   }
		}

		class Person {
		   private String name;
		   public Person(String name) 
		   {       
		       this.name = name;
		   }
		   public String getName(){
		       return this.name ;
		   }
		   
}
