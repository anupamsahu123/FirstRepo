package collectionFramework;
/*
 Count Unique
Description
You are given an arraylist of integers. You do not need to take the input and print the output. 
Just complete the function CountUnique(), which takes the arraylist as the argument and 
returns an integer as the number of unique elements.
Input: [1,2,2,3,4,5,2,4]
Output: 5
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountUnique 
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int size = scanner.nextInt();
	    
	    ArrayList<Integer> inputlist =  new ArrayList<>();
	    
 	    
	    for(int i=0; i<size;i++)
	    inputlist.add(scanner.nextInt());
	    
	   System.out.println( CountUnique(inputlist));
	   scanner.close();
	}

/*	
public static int CountUnique( ArrayList<Integer> inputlist){
	
	HashSet<Integer> hset = new HashSet<Integer>(inputlist);
	int Unique=hset.size();
	return Unique;
*/
 public static int CountUnique( ArrayList<Integer> inputlist){
	   Set <Integer> set = new TreeSet<>();
	   for(int i=0; i<inputlist.size();i++)
	   set.add(inputlist.get(i));
	   return set.size(); 
 
 
	}

}
