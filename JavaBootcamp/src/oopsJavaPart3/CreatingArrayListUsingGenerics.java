package oopsJavaPart3;
import java.util.ArrayList;
public class CreatingArrayListUsingGenerics {

	   public static void main(String[] args) {
	      
		   ArrayList<Float> random = new ArrayList<Float>();
		      //Add the first four elements to this 'random' ArrayList
		       random.add(2.0f);
		       random.add(4.0f);
		       random.add(5f);
		       random.add(10.0f);
		       random.add(99.9f); 
		       System.out.println(random.contains(5.0));
		       //Command for adding a new element
		       printArray(random);
	       //Create an ArrayList using Generics here
	     
	   }

	   public static void printArray(ArrayList<Float> random) {  
	       for(Object a : random) { 
	    	 
	           System.out.println(a);
	       }
	   }
	}