package javaMain;

import java.util.ArrayList;
import java.util.List;

public class test {
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
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
    }
}