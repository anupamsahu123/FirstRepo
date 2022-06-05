package oopsJavaPart1;
//This is an example of garbage and distrector class.

	class Calculator {
	    int a;
	    int b;

	    public int addNumbers() {
	        return a+b;
	    }
	    /*
	    Calculator() {

	    }

	     */

	    Calculator() {
	        System.out.println("I am in calculator constructor");
	    }

	    Calculator(int x, int y) {
	        a = x;
	        b = y;
	        System.out.println("I am in calculator constructor with values");
	    }

	}

	public class Destructor {
	    public static void main(String[] args) {
	        // Student mohit = new Student();
	        Calculator nithinCalc = new Calculator(); //go to line 19
	        nithinCalc.a = 5;
	        nithinCalc.b = 15;
	        int result = nithinCalc.addNumbers();
	        System.out.println(result);

	        Calculator annCalc = new Calculator(100,200);
	        result = annCalc.addNumbers();
	        System.out.println(result);

	        nithinCalc = null;
	        annCalc = null;
	        System.gc();
	    }
	}

