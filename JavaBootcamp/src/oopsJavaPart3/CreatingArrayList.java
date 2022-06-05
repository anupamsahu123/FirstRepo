package oopsJavaPart3;

import java.util.ArrayList;

public class CreatingArrayList {
	   public static void main(String[] args) {
	       //int random[ ] = {2, 4, 5, 10};       
	       //Declare and create an object of the ArrayList class named 'random', in place of the line above
	       ArrayList<Integer> random = new ArrayList<Integer>();
	      //Add the first four elements to this 'random' ArrayList
	       random.add(2);
	       random.add(4);
	       random.add(5);
	       random.add(10);
	       random.add(99);                    //Command for adding a new element
	       printArray(random);
	   }

	   public static void printArray(ArrayList<Integer> random) {   //Change the type of the parameter to ArrayList
	       for(Object a : random) { 
	    	  // randoms s = (randoms) a;
	    	   //Change the data type of 'a' from 'int' to 'Object'
	           System.out.println(a);
	       }
	   }
	}