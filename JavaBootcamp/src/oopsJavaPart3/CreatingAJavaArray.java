package oopsJavaPart3;

public abstract class CreatingAJavaArray {

	   public static void main(String[] args) {
	       int random[ ] = {2, 4, 5, 10};
	       printArray(random);
	   }

	   public static void printArray(int[] arr) {
	         for(int s : arr) {
				      System.out.println(s);
				    }
	       
	   }
	}