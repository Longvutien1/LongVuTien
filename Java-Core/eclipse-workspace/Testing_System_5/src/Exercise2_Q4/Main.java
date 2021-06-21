package Exercise2_Q4;

import java.util.Scanner;

public class Main {
	public Scanner sc =new Scanner(System.in);
	public MyMath my =new MyMath();
	public static void main(String[] args) {
		Main m = new Main();
		m.menu();
	}

	public void menu() {
		while (true) {
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("|               Tạo danh sách sinh viên                              |");
			System.out.println("|1. Tổng theo float  												 |");
			System.out.println("|2. Tổng theo int             		        			  	         |");
			System.out.println("|3.Thoát                                         		  	         |");
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("+----------------Lựa chọn chức năng bạn muốn sử dụng-----------------+");
			int chon = sc.nextInt();
			switch (chon) {
			case 1:
				System.out.println("Mời bạn nhập vào a: ");
				float a = sc.nextFloat();
				System.out.println("Mời bạn nhập vào b: ");
				float b = sc.nextFloat();
				System.out.println("Tổng 2 số là: "+my.getSum(a, b));
				break;
			case 2:
				System.out.println("Mời bạn nhập vào c: ");
				int c = sc.nextInt();
				System.out.println("Mời bạn nhập vào d: ");
				int d = sc.nextInt();
				System.out.println("Tổng 2 số là: "+my.getSum(c, d));
				break;
			case 3:

				return;

			default:
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
