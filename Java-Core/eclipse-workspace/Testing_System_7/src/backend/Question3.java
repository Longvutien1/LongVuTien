package backend;

import java.util.Scanner;

public class Question3 {

	
//	hàm tra số nhập 

	public static int inputInt() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				return Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Nhập lại !");
			}
		}
		
	}
	public static int max(int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static int min(int a, int b) {
		if (a <=b) {
			return a;
		} else {
			return b;
		}
	}
	
	
	public static int sum(int a, int b) {
		return a + b;
	}
//	q3
	
	public static void question3() {
		System.out.println("Nhập vào số thứ 1: ");
		int a = Question3.inputInt();
		System.out.println("Nhập vào số thứ 2: ");
		int b = Question3.inputInt();
		System.out.println("Max = "+ Question3.max(a, b));
		System.out.println("Min = "+ Question3.min(a, b));
		System.out.println("Sum = "+ Question3.sum(a, b));
	}
	
}
