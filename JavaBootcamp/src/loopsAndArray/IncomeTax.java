package loopsAndArray;

import java.util.Scanner;

/*Comprehension: Income tax
Create a program for calculating the income tax to be paid by an individual earning less than 1 crore. Use conditional statements only.
Use the following rules: 
Income Tax Age slab
A)Income range	B)General (non-seniors)	C)Senior citizens (>= 60 & < 80)	D)Very senior citizens (>= 80)
1)Up to 2,50,000, Nil, Nil, Nil
2)Rs.2,50,001 to Rs.3,00,000,	10%,	Nil,	Nil
3)Rs.3,00,001 to Rs.5,00,000,	10%,	10%,	Nil
4)Rs.5,00,001 to Rs.10,00,000,	20%,	20%,	20%
5)Above Rs.10,00,000,	        30%,	30%,	30%
 
Additional information:
The basic exemption limit for individuals (i.e. below 60 years of age) is Rs. 2.50 lakhs.
The basic exemption limit for senior citizens (60 years to 80 years) is Rs. 3.00 lakhs.
The basic exemption limit for very senior citizens (80 years and above) is Rs. 5.00 lakhs.
No extra cess is to be levied.
Take the income and age as inputs and return the income tax. 
For example, if the income of an individual is 6 lacs and his/her age is < 60, then the income tax to be paid is calculated by the following set of rules: 

A)Income range    	                        B)Tax rate	Taxable     C)income	D)Tax to be paid 
1)Income up to Rs. 2,50,000	                  Nil	                   -	       Nil
2)Income from Rs. 2,50,000 – Rs. 5,00,000	  10%	        0.10*(500000- 250000)	25,000
3)Income from Rs. 5,00,000 – Rs. 10,00,000	  20%	        0.2*(600000 - 500000)	20,000
4)Income over Rs. 10,00,000	                   -	                  -	             0
5)Tax	 	 	                                                                    45,000
 
Income Tax Calculator
Description

Note: Please enter the income figures without commas. 
So if the annual income is Rs. 2,50,000, enter only 250000 in the Input Console. 
Enter the age only after you've entered the income. 
Also, make sure that you enter your inputs in the Input Console before clicking on Test Run.
You do not have to print the tax amount, just store the tax amount in a variable named tax.
Sample Input:
600000
45
Output:
45000.0
 */


public class IncomeTax {
	   public static void main(String args[]) {
	        Scanner scan = new Scanner(System.in);
	        // Enter annual income
	        double income = scan.nextDouble();
	        // Enter age
	        int age = scan.nextInt();
	        
	        double minimumAllowedIncome; 
	        double tax = 0.0;
	        
	        if ((age > 60) && (age <= 80)) {
	            minimumAllowedIncome = 300000;
	        } else if (age > 80) {
	            minimumAllowedIncome = 500000;
	        } else {
	            minimumAllowedIncome = 250000;
	        }
	        
	        if (income > minimumAllowedIncome && income <= 500000.00) {
	            tax = 0.1 * (income - minimumAllowedIncome);
	        } else if (income > 500000.00 && income <= 1000000.00) {
	            tax = 0.1 * (500000 - minimumAllowedIncome) + 0.2 * (income - 500000);
	        } else if (income > 1000000.00) {
	            tax = 0.1 * (500000 - minimumAllowedIncome) + 0.2 * (1000000 - 500000) + 0.3 * (income - 1000000);
	        }
	        System.out.print(tax);
	        scan.close();
	    }
}
