package Extra_Assignment3;

import java.util.Scanner;

public class Exercise2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		question7();
	}
	static void question1() {
		System.out.println("Mời bạn nhập họ tên: ");
		String hoTen = sc.nextLine();
		// tìm
		hoTen= hoTen.trim().toUpperCase();
		System.out.println(hoTen);
	
		
	 
	}
	
	static void question2() {
		System.out.println("Mời bạn nhập họ tên: ");
		String hoTen = sc.nextLine();
		
		int dem = 0;
		for (int i = 0; i < hoTen.length(); i++) {
			if (hoTen.charAt(i) == 'a') {
				
				dem++;
				System.out.print(i+ 1+ " ");
			}
		}
	System.out.println("\n"+dem);
	}
	
	//q3
	static void question3() {
		
		System.err.println("Mời bạn nhập vào 1 chuỗi: ");
		String str = sc.nextLine();
		
		System.out.println("Nhập kí tự muốn chuyển: ");
		char kiTuMuonChuyen = sc.nextLine().toCharArray()[0];
		
		System.out.println("Nhập kí tự  chuyển: ");
		char kiTuChuyen = sc.nextLine().toCharArray()[0];
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == kiTuMuonChuyen) {
				str = str.replace(kiTuMuonChuyen, kiTuChuyen);
			}
		}
		System.out.println("Chuỗi sau khi chuyển: "+str);
		
	
	}
	
	//q4
	static void question4() {
		
		System.err.println("Mời bạn nhập vào 1 chuỗi: ");
		String str = sc.nextLine();
		
		for (int i = str.length() - 1; i >=0; i--) {
			System.err.print(str.charAt(i));
		}
		
	
	}
	
	//q5
		static void question5() {
				
				System.err.println("Mời bạn nhập vào 1 chuỗi: ");
				String str = sc.nextLine();
				int dem = 0;
				for (int i = 0; i < str.length(); i++) {
					if (ktraSo(str.charAt(i))) {
						dem++;
					}
			
				}
				System.err.println("Kí tư: "+dem);
			
			}
		
		
		static boolean  ktraSo(int a) {
			if (a > '0' && a < '9') {
				return true;
			}
			return false;
		}
	
	
	//q7
static void question7() {
			
			System.out.println("Mời bạn nhập userName: ");
			String user1 = sc.nextLine();
			System.out.println("Mời bạn nhập pass: ");
			String pass1 = sc.nextLine();
			if (	user(user1) == "Chính xác"  ) {
				System.out.println("Đăng nhập thành công");
				
				return ;
				}
		//		else {
//				System.out.println("Đăng nhập Thất bại");
//			}
			
		}

		 static String user(String userName) {
	
			if (userName == "longvt" ) {
				return "Chính xác";
			}
			else {
				return "Sai";
			}
			
		}
		
		
	
	
	
	
	
	
	
}
