package oopsJavaPart3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AlternateIterationUsingListIterator {

	   public static void main(String[] args) {
	       List<Integer> random = new ArrayList<Integer>();
	       random.add(1);
	       random.add(2);
	       random.add(3);
	       random.add(4);
	       random.add(5);   
	       random.add(6);   
	     

	       iterateFwd(random);
	   }

	   public static void iterateFwd(List<	Integer> num) {
		   ListIterator<Integer> it = num.listIterator(num.size());
		   while(it.hasPrevious()) {
		       if(it.hasPrevious()) {
		           System.out.println(it.previous());
		       }
		       it.previous();
	   }
	}}