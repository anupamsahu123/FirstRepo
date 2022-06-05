package collectionFramework;
import java.util.ArrayList;
import java.util.Scanner;
/*
Description
You are given two arraylists. You are required to count the number of elements common between 
them. You must complete the function countCommon(), which takes two arraylists as input 
parameters and returns the count of the common elements.
You do not need to perform any input or output operations, as the main function takes care of this.
Note: Two arraylists can be of variable sizes. Return 0 if no common elements exist.
5 1 2 3 4 5
4 2 6 7 8
Output: 1
 */
public class CountCommon {
	
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    ArrayList<Integer> list1 = new ArrayList<>();
	    ArrayList<Integer> list2 = new ArrayList<>();
	    int size1 = scanner.nextInt();
	    for(int i=0; i<size1; i++)
	        list1.add(scanner.nextInt());
	    int size2 = scanner.nextInt();
	    for(int i=0; i<size2; i++)
	        list2.add(scanner.nextInt());
	  	   System.out.println(countCommon(list1, list2));
	  	   scanner.close();
	   	}
	
public static int countCommon(ArrayList<Integer>list1, ArrayList<Integer>list2 ){
	    
	//List<Integer> result = list1.stream().distinct().filter(list2::contains).collect(Collectors.toList());
	//result.forEach(System.out::print);
	list1.retainAll(list2);
	return list1.size();
	}
}
