package javaMain;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class StudentGradeCalculator {
	int marks;
	  char grade;
	  public char getGrades(int marks){
	    //Delete the return statement and write code here
	    if (marks <= 100 && marks >= 80) {
	        grade = 'A';
	    }
	    else if (marks <= 79 && marks >= 60) {
	    	grade = 'B';
	    }
	    else if (marks <= 59 && marks >= 40) {
	    	grade = 'C';
	    }
	    else if (marks <= 39 && marks >= 0) {
	    	grade = 'F';
	    }
	    else if (marks > 100 || marks < 0) {
	    	grade = 'X';
	    }
	    return grade;
	  }  
	  public static void main (String[] args) {
		  StudentGradeCalculator source = new StudentGradeCalculator();
	      source.getGrades(source.marks);
	      System.out.println(source.grade);
	  }
	}