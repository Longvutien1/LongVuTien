package Testing_System_3;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		question4();
		
	}
	//q1
	public static void question1() {
		float luong1 = 5240.5f;
		float luong2 = 10970.055f;
		
		int luong11 =(int) luong1;
		int luong22 = (int) luong2;
		
		System.err.println("Lương 1 = "+luong11);
		System.err.println("Luong 2 = "+ luong22);
	}
	
		//q2
		public static void question2() {
			int min = 0;
			int max = 99999;
			int x = (int) ( Math.random() * max) + min ;
			while (x < 5) {
				x = x * 10;
				
			}
			System.err.println(x);
		}
			//q3
			public static void question3() {
				int min = 0;
				int max = 99999;
				int x = (int) ( Math.random() * max) + min ;
				while (x < 5) {
					x = x * 10;
					
				}
				System.err.println("Số ngẫu nhiên: "+ x);
				String a = String.valueOf(x);
				System.err.println("2 số cuối: "+ a.substring(3));
			}
			
			//q4
			public static void question4() {
				Scanner sc = new Scanner(System.in);
				
				System.err.println("Mời bạn nhập vào a: ");
				float a = sc.nextFloat();
				System.err.println("Mời bạn nhập vào b: ");
				float b = sc.nextFloat();
				float thuong = a / b ;
				System.err.println("Thương = "+thuong);
			}
	
			
	
	
	
		
}

