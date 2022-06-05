package javaMain;

import java.util.Scanner;

public class SetterMethod {
	
	 public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   String name = scanner.next();
		   insan p = new insan();
		       p.setName(name);
		       System.out.println(p.getName());
		       scanner.close();
		   }
		}

		class insan {
		   private String name;
		public String getName() 
		{
		       return name;
		   }
		public void setName(String name)
		{
			this.name = name;
			    
			}

}
