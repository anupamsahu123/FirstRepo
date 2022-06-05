package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class FreqCheck {
	public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(15);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(15);
        arr.add(15);
        arr.add(15);
        arr.add(15);

        int count = Collections.frequency(arr, 15);
        System.out.println(count);
}}
