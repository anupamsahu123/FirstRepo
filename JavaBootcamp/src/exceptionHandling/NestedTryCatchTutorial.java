package exceptionHandling;

public class NestedTryCatchTutorial {
	 public static void main(String[] args) {
	        try {
	            try {
	                int a = 5;
	                int b = 0;

	                int ans = a/b;

	                System.out.println("Output is " + ans);
	            }
	            catch (ArithmeticException e) {
	                System.out.println("Division is not possible");
	            }

	            try {
	                int[] arr = {2,4,6};
	                System.out.println("Fourth element is " + arr[3]);
	            }
	            catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Cannot access element out of reach");
	            }
	        }
	        catch (Exception e) {
	            System.out.println("Some error occurred");
	        }
	    }
	
}
