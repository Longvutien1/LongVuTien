package Exercise2;

import java.util.Scanner;

public class Question5 {

	public static  Scanner sc = new Scanner(System.in);
	
	
//	hàm input tuổi && question7
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
	
//	hàm ktra và mời nhập lại
	public static int inputPositive() {
		while (true) {
			try {
				int positive = Integer.parseInt(sc.nextLine());
				if (positive > 0 ) {
					return positive;
				}
				else {				
					System.out.println("Nhập lại : ");
				}
			} catch (Exception e) {
				System.out.println("Nhập lại : ");
			}
		}
	}
	
//	question 8
	public static Float inputFloat() {
		
		while (true) {
			try {
				return Float.parseFloat(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Nhập lại: ");
			}
		
		}
	}
	
	
	public static String inputString() {
		while (true) {
			try {
				return sc.nextLine();
			} catch (Exception e) {
				System.out.println("Nhập lại: ");
			}
			
			System.out.println("Nhập lại");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
