package multithreading_Lambda_Annotations;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
public class CalculateCountOfFruit {


	   public static void main(String[] args) {
	       List<String> fruits = new ArrayList<>();
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       while(n-- > 0){
	           fruits.add(sc.next());
	       }
	       printFruitCount(fruits);
	       sc.close();
	   }

	   
	public static void printFruitCount(List<String> fruits){
	       
		List<String> duplicateList = new ArrayList<String>(fruits);
		Map<String, Long> couterMap = duplicateList.stream().collect(Collectors.groupingBy(e -> e.toString().toLowerCase(),Collectors.counting()));
	    System.out.println(couterMap);
		
	   }


	
}
