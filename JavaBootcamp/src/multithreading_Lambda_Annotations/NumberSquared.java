package multithreading_Lambda_Annotations;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class NumberSquared 
{
	public static void main(String[] args)
	{
	       List<Integer> numbers = new ArrayList<>();
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       while(n-- > 0)
	       {
	           numbers.add(sc.nextInt());
	       }
	       printSquareNumbers(numbers);
	       sc.close();
	   }
	
	 public static void printSquareNumbers(List<Integer> numbers)
	 {
		 
		 List<Integer> squareNumbers = numbers.stream().map(n -> n * n)
		            .collect(Collectors.toList());
		 squareNumbers.forEach(System.out::println);
	         
	 }}

