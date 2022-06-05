package cardGameTest;

import java.util.Scanner;


class Cards1 {
    public static class superclass
    {
        void print()
        {
            System.out.println("superclass.");
        }
    }
 
    public static class subclass extends superclass
    {
        
        void print()
        {
            System.out.println("subclass.");
        }
    }
 
    public static void main(String[] args)
    {
    	//int random[ ] = new int[5, "jaba", 5];
    	//int random = new int[5];
    	//int random[ ] = new random[5];
    	//int random = new random[ ];
    	superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
    }
}