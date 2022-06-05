package collectionFramework;
/*
Check anagram using TreeMap
Description
You have to find if the given two strings are anagram or not. An anagram of a string is another
string that contains the same characters; only the order of characters can be different. 
For example: “listen”, and “silent” are anagrams of each other.
Given two strings to the function isAnagram(), you have to find whether the strings are 
anagram or not. If the strings are anagram, you need to return true else false. 
You do not need to carry any input or printing operation. Just complete the function.
Hint: Try using treemap for checking the anagram string.
Input: “listen” “silent”
Output: true
Input: “caat” “cat”
Output: false
 */
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CheckAnagramUsingTreeMap {
	
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner (System.in);
	    String s1 = scanner.next();
	    String s2 = scanner.next();
	    
	    System.out.println(isAnagram(s1,s2));
	    	
	}
	
public static boolean isAnagram(String string1, String string2){
	  
	   if ( string1.length() != string2.length() ) {
           return false;
       }

       Map< Character , Integer > charFrequencyS1 = new TreeMap<>();
       Map< Character , Integer > charFrequencyS2 = new TreeMap<>();

       for ( int i=0 ; i<string1.length() ; i++ ) {
           if ( charFrequencyS1.containsKey(string1.charAt(i)) ) {
               int freq = charFrequencyS1.get(string1.charAt(i));
               charFrequencyS1.put(string1.charAt(i), freq+1);
           }

           else {
               charFrequencyS1.put(string1.charAt(i), 1);
           }

           if ( charFrequencyS2.containsKey(string2.charAt(i)) ) {
               int freq = charFrequencyS2.get(string2.charAt(i));
               charFrequencyS2.put(string2.charAt(i), freq+1);
           }

           else {
               charFrequencyS2.put(string2.charAt(i), 1);
           }

       }

       return charFrequencyS1.equals(charFrequencyS2);

   }
	
	
	
	}



