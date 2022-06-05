package oopsJavaPart1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Find the sum of the length of the lines. A line is defined with two points A and B on the number line. For example, if A = -3 and B = 10, the length of the line is 13. This is because the distance between -3 and 10 on the number line is 13 units (10 -(-3) = 13).
Similarly, if A = 9 and B = 5, the length of the line will be 4 units, as the distance between 9 and 5 on the number line is 4 units (9 - 5 = 4). You need to complete the method getTotalSumOfLines.
Input: There will be two lines and each line will have A & B integers separated by a space.
Output: This should return the sum of the length of the two lines given as the input by the user.
﻿Sample Input:
5 9
-10 3
Expected Output:
		
17
Explanation:
First line represents first lines coordinates i.e. A = 5, B = 9.
Second line represents second lines coordinates i.e. A = -10, B = 3.
Length of first line = 4, length of second line is 13. Hence output is 17.
 */

public class LineLength {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLineCoordinates = br.readLine().split(" ");
        int a1 = Integer.parseInt(firstLineCoordinates[0]);
        int b1 = Integer.parseInt(firstLineCoordinates[1]);
        String[] secondLineCoordinates = br.readLine().split(" ");
        int a2 = Integer.parseInt(secondLineCoordinates[0]);
        int b2 = Integer.parseInt(secondLineCoordinates[1]);
        Line firstLine = new Line(a1, b1);
        Line secondLine = new Line(a2, b2);
        int totalSumOfLines = getTotalSumOfLines(firstLine, secondLine);
        System.out.println(totalSumOfLines);
        br.close();
    }

private static int getTotalSumOfLines(Line firstLine, Line secondLine) {
      int sum = 0;
	    if(firstLine.getA() > firstLine.getB())
	        sum = sum + (firstLine.getA() - firstLine.getB());
	    else
	        sum = sum + (firstLine.getB() - firstLine.getA());
	    if(secondLine.getA() > secondLine.getB())
	        sum = sum + (secondLine.getA() - secondLine.getB());
	    else
	        sum = sum + (secondLine.getB() - secondLine.getA());
	    return sum;
         
    }

 public static class Line {
        private int a;
        private int b;

        public Line(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }
    }
}
