package Exercise4_Testing4;

import java.util.Scanner;

public class Ex6 {

	public Scanner sc = new Scanner(System.in);

	public void question1() {
		menu();
	}

	private void menu() {
		VietNamPhone vn = new VietNamPhone();
		while (true) {
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("|1. InsertContact.                                                   |");
			System.out.println("|2. RemoveContact.                                                   |");
			System.out.println("|3. UpdateContact.                                                   |");
			System.out.println("|4. SearchContact                                                    |");
			System.out.println("|5. ShowContact                                                      |");
			System.out.println("|6. Thoát khỏi chương trình.                                         |");
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("+---------------=Lựa chọn chức năng bạn muốn sử dụng----------------+");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				System.out.println("Nhập vào tên Contact: ");
				String name = sc.next();
				System.out.println("Nhập vào tên số Phone: ");
				String phone = sc.next();
				vn.insertContact(name, phone);
				break;
			case 2:
				System.out.println("Nhập vào tên Contact cần remove: ");
				String removeName = sc.next();
				vn.removeContact(removeName);
				break;
			case 3:
				System.out.println("Nhập tên cần Update: ");
				String name1 = sc.next();
				System.out.println("Nhập số Phone mới: ");
				String newPhone = sc.next();
				vn.updateContact(name1, newPhone);
				System.out.println("Kết quả: ");
				vn.searchContact(name1);
				break;
			case 4:
				System.out.println("Nhập vào tên Contact cần tìm kiếm: ");
				String searchName = sc.next();
				vn.searchContact(searchName);
				break;
			case 5:
				vn.printContact();
				break;
			case 6:
				return;
			default:
				System.out.println("Alarm: Lựa chọn đúng số trên menu");
				break;
			}

		}
	}
}
