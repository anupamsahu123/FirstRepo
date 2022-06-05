package oopsJavaPart3;
import java.util.Scanner;
abstract class MathClass1
{
abstract void output(Integer n);
}
class PrintTable extends MathClass1
{
public void output(Integer n) 
{
		int j,number = n;
		for(j=1;j<=10;j++) 
		{
		
		int mul=number*j;
		System.out.print(mul + " ");
		}
		
	}
	
}
public class Source 
{
public static void main(String args[] ) throws Exception 
{
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    PrintTable obj = new PrintTable();
    obj.output(n);	
    scanner.close();
    }
}