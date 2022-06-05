package multithreading_Lambda_Annotations;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {

	   public static void main(String[] args){
	       List<String> sentences = Arrays.asList(
	               "A little memory work might be required",
	               "I know we can count on your memory",
	               "I will count to three",
	               "Little by little however my difficulties began to disappear");
     	      
	     /*  Set<String> distinct = new HashSet<>(sentences);
	        for (String s: distinct) {
	           // System.out.println(s);
	            String words[] = s.split(" ");
	            for(String token : words) {
	               // System.out.println(token);
	                String lowercase=token.toLowerCase();
	                System.out.println(lowercase);	
	       
	                */
	       
	       Set<String> distinct = new HashSet<>(sentences);
	        for (String s: distinct) {
	           // System.out.println(s);
	            String words[] = s.split(" ");
	            for(String token : words) {
	               // System.out.println(token);
	                String lowercase=token.toLowerCase();
	                //System.out.println(lowercase);	
	       	       System.out.print(
	               countOccurrences(lowercase)
	       );
	        }
	       
	   }}
	   public static Map<String, Long> countOccurrences(String sentences) {
		   
	       return Arrays.stream(sentences.split(" "))
		            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()
		                    )
		            );
	      
		}
	
}
