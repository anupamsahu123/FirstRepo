package oopsJavaPart1;

import java.util.Scanner;

/*
 Description
Create three classes – Triangle, Circle and Rectangle, which extends the class Shape. Each of these three classes should constitute a method display that must be overridden. You must take the number of sides in a shape as the input and predict the kind of shape it is. The output of your program is as follows: 
If the number of the input side is 0, print “The shape is a circle”. 
If the number of the input side is 3, print “The shape is a triangle”. 
If the number of the input side is 4, print “The shape is a rectangle”. 
If the number of sides is anything other than 0, 3, or 4, print “Enter a valid number of sides!”.        
Input: The input should be an integer ‘n’ that represents the number of sides in a shape.
Output: The output will consist of one line that displays the kind of shape according to the number of sides.
Sample input:3
Sample output:The shape is a triangle.
 */
class Shape {
    public void display() {
        System.out.println("display method overriding");
    }

}
class Triangle extends Shape{
	public void display() {
        System.out.println("The shape is a triangle");
	
}}
	class Circle extends Shape{
		public void display() {
	        System.out.println("The shape is a circle");
		
	}}
		class Rectangle extends Shape{
			public void display() {
		        System.out.println("The shape is a rectangle");
			
		}}
public class InheritenceConcept {
	 public static void main(String[] args) {

	        Scanner in = new Scanner(System.in);
	        Shape obj = new Triangle();
	        Shape obj2 = new Circle();
	        Shape obj1 = new Rectangle();
	        int numberOfSides = in.nextInt();

	        switch (numberOfSides) {
	            case 0:
	                obj2.display();//Circle
	                break;
	            case 3:
	                obj.display();//Triangle
	                break;
	            case 4:
	                obj1.display();//rectange
	                break;
	            default:
	                System.out.println("Enter a valid number of sides!");
	                break;
	        }
	        in.close();
	    }
}

