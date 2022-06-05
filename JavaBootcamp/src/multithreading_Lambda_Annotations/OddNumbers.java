package multithreading_Lambda_Annotations;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OddNumbers {
	   	public static void main(String[] args){
	       List<Integer> numbers = new ArrayList<>();
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       while(n-- > 0){
	           numbers.add(sc.nextInt());
	       }
	       printEvenNumbers(numbers);
	       sc.close();
	   }
	public static void printEvenNumbers(List<Integer> numbers){
		List<Integer> evenNumbers = numbers.stream().
                filter(n -> n % 2 == 0).collect(Collectors.toList());
		evenNumbers.forEach(System.out::println);
	   }
	}
