package collectionFramework;

/*
 3
1 A
2 A
3 B
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DistinctValues {

	//Method to print distinct values
	public static void printValues(Map<Integer,String> map){
		Set<String> value = new HashSet<>(map.values());
		for(String i : value)
		System.out.print(i + " ");
		
	}			
public static void main(String[] x){
		Map<Integer,String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int key;
		String value;
		for(int i = 1; i <= num; i++)
		{
			key = sc.nextInt();
			value = sc.next();
			map.put(key,value);
		}
		printValues(map);
		sc.close();
	}
	
	
}
