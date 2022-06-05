package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsTutorial1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = sc.nextInt();

            System.out.println("Enter second number");
            int b = sc.nextInt();
            int ans = a/b;
            System.out.println("Output is " + ans);

            int[] arr = {1,2,3,4,5};
            System.out.println("3rd element in array is " + arr[12]);
            sc.close();
        }
        catch(ArithmeticException e) {
            System.out.println("Division by zero is not possible");
            
        }
        catch(InputMismatchException e) {
            System.out.println("Given input is not valid");
           
        }
        catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println("Can not access the element, as it is out of range");
           
        }
        catch (Exception e) {
        	System.out.println("Some error occured");
            System.out.println("Bye");
        }
        finally {
        	System.out.println("Bye");
        }
        }
}