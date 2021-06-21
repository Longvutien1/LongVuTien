package Exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {

	public Scanner sc = new Scanner(System.in);
	public ArrayList<Student> arr = new ArrayList<Student>();
	public Random random = new Random();
	public static void main(String[] args) {
		Ex2 ex = new Ex2();
		ex.menu();
	}
	
	public void menu() {
		while (true) {
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("|1.Tạo danh sách sinh viên                                           |");
			System.out.println("|1.Kêu gọi cả lớp điểm danh   										 |");
			System.out.println("|3.Gọi nhóm 1 đi học bài                		          	         |");
			System.out.println("|4.Gọi nhóm 2 đi dọn vệ sinh             	                         |");
			System.out.println("|5.Danh sách sv                                           	         |");
			System.out.println("|6.Thoát                                           	         |");
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("+----------------Lựa chọn chức năng bạn muốn sử dụng-----------------+");
			int chon = sc.nextInt();
			switch (chon) {
			case 1:
				taoHocSinh();
				System.out.println("Tạo thành công !!");
				break;
			case 2:
				System.out.println("Cả lớp điểm danh !!");
				for (Student student : arr) {
					student.diemDanh();
				}
				break;
			case 3:
//				c.nhóm 1 đi học bài
				System.out.println("Nhóm 1 đi học bài");
				for (Student student : arr) {
					if (student.getGroup() == 1) {
						student.hocBai();
					}
				}
				break;
			case 4:
//				nhóm 4 đi dọn vss
				System.out.println("Nhóm 4 đi dọn vs");
				for (Student student : arr) {
					if (student.getGroup() ==2) {
						student.diDonVeSinh();
					}
				}
				break;
			case 5:
//				xuất sv
				for (Student student : arr) {
					System.out.println(student);
				}
				break;
			case 6:
				return;
			default:
				System.out.println("Sai cú pháp vui lòng thử lại");
				break;
			}
		}
	}
	
//	a. tạo 10 sv
	private void taoHocSinh() {
		for (int i = 0; i < 10; i++) {
			Student st = new Student("Student "+ (i+1),random.nextInt(3)+1);
			arr.add(st);
		}
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
