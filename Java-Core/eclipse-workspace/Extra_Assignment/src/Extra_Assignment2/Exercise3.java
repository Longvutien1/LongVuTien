package Extra_Assignment2;

import java.util.Iterator;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		question2();
	}
	
	public static void question1() {
		System.err.println();
		for (int i = 1; i <= 5; ++i) {
		      for (int j = 1; j <= i; ++j) {
		        System.out.print("* ");
		      }
		      System.out.println();
		    }
	}
	
	public static void question1_2() {
		System.err.println();
		for (int i = 9; i >= 1; i--) {
		      for (int j = 1; j <= i; j++) {
		        System.out.print("* ");
		      }
		      System.out.println();
		    }
	}
	
	
	public static void question2() {
		int fact = 1;
	Scanner sc = new Scanner(System.in);
	System.err.println("Mời bạn nhập vào 1 số: ");
	int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			fact*=i;
			
			
		}
		 System.out.println("!"+n+ "= "+fact);
	
		
	}
}
	