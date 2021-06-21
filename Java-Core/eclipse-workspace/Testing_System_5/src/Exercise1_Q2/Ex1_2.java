package Exercise1_Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_2 {
	
	public Scanner sc = new Scanner(System.in);
	private TuyenSinh tuyenSinh = new TuyenSinh();
	
	public static void main(String[] args) {
		Ex1_2 ex = new Ex1_2();
		ex.question2();
	}
	public void question2() {
		menu();
	}

	private void menu() {
		
		while (true) {
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("|1.Thêm mới thí sinh                                                 |");
			System.out.println("|1.Hiện thị thông tin của thí sinh và khối thi của thí sinh.         |");
			System.out.println("|3.Tìm kiếm theo số báo danh.                                        |");
			System.out.println("|4.Thoát                                                             |");
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("+----------------Lựa chọn chức năng bạn muốn sử dụng-----------------+");
			int chon = sc.nextInt();
			switch (chon) {
			case 1:
				tuyenSinh.themMoiThiSinh();
				break;
			case 2:
				tuyenSinh.showThiSinh();
				break;
			case 3:
				System.out.println("Nhập số báo danh cần tìm: ");
				int id = sc.nextInt();
				sc.nextLine();
				tuyenSinh.timTheoSoBaoDanh(id);
				break;
			case 4:

				return;

			default:
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}