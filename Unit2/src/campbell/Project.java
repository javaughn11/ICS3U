
package campbell;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Project.java
 * Project, on page 75, Exercise 11
 * Created on October 3, 2016
 * Made by Javaughn Campbell
 * Displays the percentage of time that the user has spent designing, coding, debugging, and testing
 */

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double design;
		double code;
		double debug;
		double test;
		
		System.out.print("Designing: ");
		design = scan.nextInt();
		System.out.print("Coding: ");
		code = scan.nextInt();
		System.out.print("Debugging: ");
		debug = scan.nextInt();
		System.out.print("Testing: ");
		test = scan.nextInt();
		
		double tasktime = (design+code+debug+test);
		double designtime = ((design/tasktime)*100);
		double codetime = ((code/tasktime)*100);
		double debugtime = ((debug/tasktime)*100);
		double testtime = ((test/tasktime)*100);
		 
		System.out.format("\n%1s %14s %1s","Task","% Time"," ");
		System.out.format("\n%1s %8s %1s","Designing",df.format(designtime),"%");
		System.out.format("\n%1s %11s %1s","Coding",df.format(codetime),"%");
		System.out.format("\n%1s %7s %1s","Debugging",df.format(debugtime),"%");
		System.out.format("\n%1s %9s %1s","Testing",df.format(testtime),"%");
	}

}
