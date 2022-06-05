package oopsJavaPart1;
/*Declare a constructor in the Student class and then create a new object named s1 
(name - karan | roll number - 1056 | cgpa - 8.8). 
Then, call the method displayProfile( ) below. 
Also, print the details of the percentage of s1 using the findPercentage( ) method.
The findPercentage() method should be used in printing ‘Percentage of s1 is 88.0’. 
Check the sample output below.
Input:
No input required
Output:
1056 karan 8.8 
Percentage of s1 is 88.0 */

public class StudentClass {

	    public static void main(String[] args) {
	        Student1 s1 = new Student1(1056,"karan",8.8);
	        s1.displayProfile();
	        System.out.println("Percentage of s1 is " + s1.findPercentage());
	    }
	}

	class Student1 {
	    public int rollno;
	    public String name;
	    public double cgpa;

	    public Student1(int rollno, String name, double cgpa){
	        this.rollno = rollno;
	        this.name = name;
	        this.cgpa = cgpa;
	    }
	    public void displayProfile() {
	        System.out.println(rollno + " " + name + " " + cgpa);
	    }
	    public double findPercentage() {
	        double percent = cgpa * 10;
	        return percent;
	    }
	}
	
	

