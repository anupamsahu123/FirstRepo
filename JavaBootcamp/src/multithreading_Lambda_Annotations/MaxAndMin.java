package multithreading_Lambda_Annotations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MaxAndMin {
	
	 public static void main(String[] args){

	       List<Integer> numbers = new ArrayList<>();
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       while(n-- > 0){
	           numbers.add(sc.nextInt());
	       }
	       printArrayStats(numbers);
	   }

	  
	 public static void printArrayStats(List<Integer> numbers){
		    int maxNumber = numbers.stream().max(Comparator.naturalOrder()).get();
		       int minNumber = numbers.stream().min(Comparator.naturalOrder()).get();
		       int sum = numbers.stream().mapToInt(Integer::intValue).sum();

		       System.out.println(maxNumber);
		       System.out.println(minNumber);
		       System.out.println(sum);
		    
	   }



}
