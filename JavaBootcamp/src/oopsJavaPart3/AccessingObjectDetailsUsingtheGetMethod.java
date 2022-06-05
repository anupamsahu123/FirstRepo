package oopsJavaPart3;

import java.util.LinkedList;

public class AccessingObjectDetailsUsingtheGetMethod {

	   public static void main(String[] args) {
	       LinkedList<Student1> studentList = new LinkedList<Student1>();

	       Student1 s1 = new Student1("Sujit", 1);
	       Student1 s2 = new Student1("Siddharth", 2);
	       Student1 s3 = new Student1("Karanpreet", 3);
	       Student1 s4 = new Student1("Hari", 5);
	       Student1 s5 = new Student1("Tricha", 4);

	       studentList.add(s1);
	       studentList.add(s2);
	       studentList.add(s3);
	       studentList.add(s4);
	  Student1 s=studentList.get(1);
		       System.out.println(s.getDetails());
	   }

	   public static void printStudentList(LinkedList<Student1> students) {
	       for(Student1 s : students) {
	           System.out.println(s.getDetails());
	       }
	   }
	}

	class Student1 {
	   private final String name;
	   private final int rollNumber;

	   public Student1(String name, int rollNumber) {
	       this.name = name;
	       this.rollNumber = rollNumber;
	   }

	   public String getDetails() {
	       return
	               "name = " + this.name + '\n' +
	                       "roll number = " + this.rollNumber + '\n';
	   }
	}