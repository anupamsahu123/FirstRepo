package javaMain;

public class StudentConstructor {

	

	public static void main(String[] args) 
	{

		   Student s1 = new Student(1056,"karan",8.8);
		   s1.displayProfile();
		   System.out.println("Percentage of s1 is "+ s1.findPercentage());
		    }
		}

		class Student {
		    public int rollno;
		    public String name;
		    public double cgpa;
		  

		public Student(int r, String n, double c)
		{
		    rollno = r;
		    name = n;
		    cgpa = c;
		}
		    
		    public void displayProfile() {
		        System.out.println(rollno + " " + name + " " + cgpa);
		    }
		    public double findPercentage() {
		        double percent = cgpa * 10;
		        return percent;
		    }

}
