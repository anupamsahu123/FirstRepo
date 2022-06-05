package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseTheArrayList {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            list.add(s.nextInt());
        //reverseArrayList(list);
        ArrayList<Integer> list1 =  reverseArrayList(list);
        for (int i = 0; i < list1.size(); i++)
            System.out.print(list1.get(i) + " ");
        s.close();
    }

    // Method to reverse the ArrayList
   public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) {
    	ArrayList<Integer> array_list = new ArrayList<Integer>();
    	//for (int i = 0; i < inputlist.size(); i++)
        array_list.addAll((list));
    	Collections.reverse(array_list);
        return array_list;
    }
}