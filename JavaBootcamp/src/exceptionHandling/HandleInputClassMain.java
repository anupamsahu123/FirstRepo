package exceptionHandling;
import java.util.Scanner;
/*
 Handle Input Class
Description
Suppose you are performing X/Y operations, where X and Y are integers. 
You are required to implement a method (inside the given arithmetic class)
that will handle custom exceptions. You must complete the provided method Divide,
which performs and returns the X/Y operation when X>=Y or throws an error with the 
message “Not allowed”. You need not take input or print the output, as the main function 
will perform the input-output. Complete the Divide() function inside the Arithmetic class,
 which returns the output or throws an exception.
Note: X and Y will always be integers and Y will never be 0.
INPUT: X = 20, Y = 9
OUTPUT: Not Allowed
INPUT: X = 20, Y = 20
OUTPUT: 1
 */
class Arithmetic{

	public int Divide(int x, int y) throws Exception{
		
		
		int output=x/y;
		 if(x<y) throw new Exception("Not Allowed");
		 
		return output;	
	}  
}
public class HandleInputClassMain
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		
		Arithmetic obj = new Arithmetic();
		try{
		    System.out.println(obj.Divide(X,Y));
		}catch(Exception e) {
		    System.out.println(e.getMessage());
		}
		
		scanner.close();
		
		
		 
	}
}