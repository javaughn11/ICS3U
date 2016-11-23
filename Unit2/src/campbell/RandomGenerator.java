/** 
 *RandomGenerator.java
 *Random Generator, exercise 8 on page 95
 *Created on November 15, 2016
 *Made by Javaughn Campbell
 *program displays a random generator application which shows the linear congruential method 
 */ 

package campbell;

import java.util.Scanner;

public class RandomGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);	
		
		int seed = 12;
		int a = 1246;
		int c = 200;
		int m = 50;
		
		int x1;
		int x2;		
		int x3;
		int x4;
		int x5;
		int x6;
		int x7;
		int x8;
		int x9;
		int x10;
		
		x1=(a*seed+c)%m;
		x2=(a*x1+c)%m;
		x3=(a*x2+c)%m;
		x4=(a*x3+c)%m;
		x5=(a*x4+c)%m;
		x6=(a*x5+c)%m;
		x7=(a*x6+c)%m;
		x8=(a*x7+c)%m;
		x9=(a*x8+c)%m;
		x10=(a*x9+c)%m;
		
		System.out.println("Seed =" + seed + ", a = " + a + ", c =" + c + ", m = " + m + "\n\n");
		
		System.out.println("(" + a + "*" + seed + " + " + c + ")" + " % " + m + "=" + x1);
		System.out.println("(" + a + "*" + x1 + " + " + c + ")" + " % " + m + "=" + x2);
		System.out.println("(" + a + "*" + x2 + " + " + c + ")" + " % " + m + "=" + x3);
		System.out.println("(" + a + "*" + x3 + " + " + c + ")" + " % " + m + "=" + x4);
		System.out.println("(" + a + "*" + x4 + " + " + c + ")" + " % " + m + "=" + x5);
		System.out.println("(" + a + "*" + x5 + " + " + c + ")" + " % " + m + "=" + x6);
		System.out.println("(" + a + "*" + x6 + " + " + c + ")" + " % " + m + "=" + x7);
		System.out.println("(" + a + "*" + x7 + " + " + c + ")" + " % " + m + "=" + x8);
		System.out.println("(" + a + "*" + x8 + " + " + c + ")" + " % " + m + "=" + x9);
		System.out.println("(" + a + "*" + x9 + " + " + c + ")" + " % " + m + "=" + x10);
		
	}

}
