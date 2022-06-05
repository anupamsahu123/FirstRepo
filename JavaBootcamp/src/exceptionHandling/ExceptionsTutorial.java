package exceptionHandling;

import java.util.Scanner;

public class ExceptionsTutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();
        try {
            int ans = a/b;
            System.out.println("Output is " + ans);
            System.out.println("Bye");
        }
        catch(Exception e) {
            System.out.println("Division by zero is not possible");
            System.out.println("Bye");
        }sc.close();
    }
}