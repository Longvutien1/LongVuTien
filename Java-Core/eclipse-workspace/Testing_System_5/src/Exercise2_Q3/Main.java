package Exercise2_Q3;

import java.util.Scanner;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public HinhVuong a;
	public static void main(String[] args) {
		Main m = new Main();
		m.menu();
	}

	public void menu() {
		while (true) {
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("|               Tạo danh sách sinh viên                              |");
			System.out.println("|1. Create Square.   												 |");
			System.out.println("|2. Tính chu vi hình vuông                		          	         |");
			System.out.println("|3. Tính diện tích hình vuông.           	                         |");
			System.out.println("|4.Thoát                                         		  	         |");
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("+----------------Lựa chọn chức năng bạn muốn sử dụng-----------------+");
			int chon = sc.nextInt();
			switch (chon) {
			case 1:
				System.out.println("Nhập vào cạnh của hình vuông: ");
				float canh = sc.nextInt();
				a = new HinhVuong(canh);
				System.out.println("Tạo thanh công hình vuông !!");
				break;

			case 2:
				System.out.println("Chu vi hình vuông = "+a.chuVi());
				
				break;
			case 3:
				System.out.println("Diện tích hình vuông = "+a.dienTich());
				break;
			case 4:
				System.out.println("Thoát thành công !");
				return;
			default:
				break;
			}
	}
}
}
