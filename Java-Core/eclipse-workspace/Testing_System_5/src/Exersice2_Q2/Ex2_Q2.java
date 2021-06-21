package Exersice2_Q2;

import java.util.Scanner;

public class Ex2_Q2 {

	public Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Ex2_Q2 ex = new Ex2_Q2();
		ex.menu();
	}

	public void menu() {
		while (true) {
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("|1. Demo Person.                                                     |");
			System.out.println("|2. Demo Student.                                       	           	 |");
			System.out.println("|3. Thoát khỏi chương trình.                                         |");
			System.out.println("+---------------=Lựa chọn chức năng bạn muốn sử dụng-----------------+");
			int chon = sc.nextInt();
			switch (chon) {
			case 1:
				demoPerson();
				break;
			case 2:
				demoStudent();
				break;
			case 3:

				return;

			default:
				System.out.println("Sai cú pháp");
				break;
			}
		}
	}

	public void demoPerson() {
		Person person = new Person();
		person.inputInfo();
		System.out.println("Thông tin Person: " + person.showInfo());

	}

	public void demoStudent() {
		Student st = new Student();
		st.inputInfo();
		System.out.println("Thông tin Student: " + st.showInfo());
		if (st.hocBong()) {
			System.out.println("Sinh viên này đạt học bổng 1 tỉ đô");
		} else {
			System.out.println("Sinh viên này k đc gì cả");
		}
	}

}
