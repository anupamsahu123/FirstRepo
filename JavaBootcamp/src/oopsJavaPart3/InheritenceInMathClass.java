package oopsJavaPart3;

class MathClass {
	int sum;
	public Object addition(int x, int y, int z) {
		return null;
	   }
	  
	}

class Add extends MathClass {public int Adding(int x, int y,int z) {
		int sum=x+y+z;
		return sum;
		}

		public int Adding(int x, int y) {
			int sum=x+y;
			return sum;
		}	
	 
		
	}
public class InheritenceInMathClass
{
	public static void main(String[] args) {

 Add a = new Add();
 System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());  
 System.out.print(a.Adding(1,2) + " " + a.Adding(3,4) + " " + a.Adding(5,6,7) + "\n");
	   
	}
	
}
