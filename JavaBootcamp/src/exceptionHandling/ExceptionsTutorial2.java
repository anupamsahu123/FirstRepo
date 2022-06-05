package exceptionHandling;


class UpGradException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
public class ExceptionsTutorial2 {
	  public static void func(int a, int b, int[] arr) throws ArithmeticException, ArrayIndexOutOfBoundsException, UpGradException{
	        //1. print the division value
	        //2. print the third element in array

	        System.out.println("Division is " + a/b);
	        System.out.println("3rd element is " + arr[2]);
	        if(a<b) throw new UpGradException();
	    }

	    public static void main(String[] args) {
	        int a = 0, b = 1;
	        int[] arr = {6,7,8,9,10};

	        try {
	            func(a,b, arr); // This will divide two integers and will print 3rd element in array
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Arithmetic exception occurred");
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Cannot access element out of boundary");
	        }
	        catch (UpGradException e) {
	            System.out.println("My own exception");
	        }
	    }
	
}
