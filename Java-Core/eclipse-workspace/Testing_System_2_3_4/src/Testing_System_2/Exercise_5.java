package Testing_System_2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Exercise_5 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		question9();


		
	};
	
	// Q1
	public static void question1() {
	
		System.err.println("M�?i bạn nhập vào 3 số nguyên: ");
		for (int i = 0; i < 3; i++) {
			int x = sc.nextInt();
			System.err.println("Số bạn vừa nhập: "+x);
		}
		
		//Q2
		System.err.println("M�?i bạn nhập 2 số thực: ");
		for (int i = 0; i < 2; i++) {
			float x = sc.nextFloat();
			System.err.println("Số bạn vừa nhập là: "+x);
		}
	}
	
	
	public static void question3() {
		//Q3
		System.err.println("M�?i bạn nhập h�?: ");
		String ho = sc.next();
		System.err.println("M�?i bạn nhập tên: ");
		String ten = sc.next();
		System.err.println("H�? và tên của bạn là: "+ho+" "+ten);
	}
	
	//Q4
	public static void question4() {
	
//		System.err.println("M�?i bạn nhập ngày sinh: ");
//		String ngaySinh = sc.next();
//		String pattern = "dd-MM-yyyy";
//		SimpleDateFormat simple = new SimpleDateFormat(pattern);
//		Date date1 = simple.parse(ngaySinh);
//		System.err.println(date1);
		
	}
	
	//Q5
	public static void question5() {
		// Q5

		System.out.println("M�?i bạn nhập thông tin account: ");		
		System.out.println("M�?i bạn nhập ID: ");	
		int a = sc.nextInt();
		System.out.println("M�?i bạn nhập email: ");
		String b = sc.next();
		System.out.println("M�?i bạn nhập userName: ");
		String c = sc.next();
		System.out.println("M�?i bạn nhập fullName: ");
		String d = sc.next();
		System.out.println("M�?i bạn nhập ngày sinh: ");
		String e = sc.next();
		System.out.println("M�?i bạn nhập position(1,2,3): ");
		int f = sc.nextInt();
		
		System.out.println("Account của bạn là: ");
		System.out.println("ID: "+a);
		System.out.println("Email: "+b);
		System.out.println("UserName: "+c);
		System.out.println("FullName: "+d);
		System.out.println("Ngày sinh: "+e);
		if (f == 1) {
			System.err.println("Position: Dev");	
		}else if (f == 2) {
			System.err.println("Position: Test");
		}
		else if (f == 3) {
			System.err.println("Position: PM");
		}
	}
	
	//Q6
	public static void question6() {
		
		//Q6
			System.err.println("M�?i bạn nhập thông tin department: ");		
			System.out.println("M�?i bạn nhập ID: ");	
			int a1 = sc.nextInt();
			System.err.println("M�?i bạn nhập department name: ");
			String b1 = sc.next();
			
			System.out.println("Department của bạn là: ");
			System.out.println("ID: "+a1);
			System.out.println("Department Name: "+b1);
	}
	
	
	public static void question8() {
		//Q8
		do {
			System.out.println("+------------Menu-----------+");
			System.out.println("|1.Tạo account              |");
			System.out.println("|2.Tạo department           |");
			System.out.println("+---------------------------+");
			System.err.println("\nM�?i bạn nhập chức năng muốn sử dung(1,2): ");
			int x = sc.nextInt();
			switch (x) {
			case 1:
				question5();
				
				break;
			case 2:				
				question6();
			break;
			
			default:
				System.err.println("M�?i bạn nhập lại !");
				break;
			}
			
		} while (true);
	
	}
	
	//Q9
	public static void question9() {
		// create account
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "longvt@fpt.edu.vn";
		account1.userName = "longvt";
		account1.fullName = "Vũ Tiến Long";
		account1.createDate = LocalDate.of(2021, 6, 12);

		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "hoangvt@vti.edu.vn";
		account2.userName = "hoangvt";
		account2.fullName = "Vũ Tr�?ng Hoàng";
		account2.createDate = LocalDate.of(2021, 4, 2);

		Account account3 = new Account();
		account3.accountID = 3;
		account3.email = "tiennp@vti.edu.vn";
		account3.userName = "tiennp";
		account3.fullName = "Nguyễn Phong Tiến";
		account3.createDate = LocalDate.of(2021, 1, 2);

	// create group
		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "Nhóm1";
		group1.createDate = LocalDate.of(2021, 11, 12);
		group1.CreatorID = account1;

		Group group2 = new Group();
		group2.groupID = 2;
		group2.groupName = "Nhóm2";
		group2.createDate = LocalDate.of(2021, 1, 1);
		group2.CreatorID = account2;

		Group group3 = new Group();
		group3.groupID = 3;
		group3.groupName = "Nhóm3";
		group3.createDate = LocalDate.of(2021, 2, 3);
		group3.CreatorID = account3;
	
		//tạo mnảng
		Account[] accounts = {account1, account2, account3};
		Group[] groups = {group1, group2, group3};
		// in mảng
		System.err.println("Danh sách cách username: ");
		for (int i = 0; i < accounts.length; i++) {
			System.out.print(accounts[i].userName+ " ");
		}
		
		System.out.println("\nM�?i bạn nhập vào user name của account");			
		String username = sc.next();
		
		System.out.println("Danh sách cách group: ");
		for (int i = 0; i < groups.length; i++) {
			System.out.print(groups[i].groupName + " ");
		}
		System.out.println("\nM�?i bạn nhập vào tên group: ");
		String groupname = sc.next();
		
		
		//kiểm tra tên group ngư�?i dùng nhập có trùng với tên group có sẵn k nếu trùng lưu phần thử thứ i = index
		int indexGroup= -1;
		for (int i = 0; i < groups.length; i++) {
			if (groups[i].groupName.equalsIgnoreCase(groupname)) {
				indexGroup = i;
			}
		}
		//kiểm tra tên account ngư�?i dùng nhập có trùng với tên account có sẵn k nếu trùng lưu phần thử thứ i = index
		int indexAccount = -1;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].userName.equalsIgnoreCase(username)) {
				indexAccount = i;
			}
		}
		
		// đk nếu k trùng
		if (indexAccount < 0 || indexGroup < 0) {
			System.err.println("Không có account hoặc group này trên hệ thống ! ");
		}else {
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i].userName.equals(username)) {
					 groups[indexGroup].accounts = new Account[] {accounts[indexAccount]};
					 System.out.println("Thêm thành công account");
				}
			}
			
		}
		
		
	}
	
	//Q10
	public static void question10() {
		int x ;
		do {
			System.err.println("+----------------Menu----------------+");
			System.out.println("|1.Tạo account                       |");
			System.out.println("|2.Tạo department                    |");
			System.out.println("|3.Thêm group vào account            |");
			System.out.println("|4.Thêm account vào group ngẫu nhiên |");
			System.out.println("|0.Thoát                             |");
			System.out.println("+------------------------------------+");
			
			System.out.println("\nM�?i bạn nhập chức năng muốn sử dung(1,2): ");
			 x = sc.nextInt();
			switch (x) {
			case 1:
				question5();
				
				break;
			case 2:				
				question6();
				
			break;
			case 3:				
				question9();
			break;
			
			case 4:				
				question11();
			break;
			case 0:
			
				
				break;
				
			default:
				System.err.println("M�?i bạn nhập lại !");
				break;
			}
			System.out.println("Bạn có muốn ch�?n tiếp hay k( Có or Không): ");
			String chon2 = sc.next();
			switch (chon2) {
			case "Có":
				
				break;
			case "Không":		
				x = 0;
				
			default:
				break;
			}
			
		} while (x != 0);
		
	}
	
	
	
	//Q11
	public static void question11() {
		// create account
				Account account1 = new Account();
				account1.accountID = 1;
				account1.email = "longvt@fpt.edu.vn";
				account1.userName = "longvt";
				account1.fullName = "Vũ Tiến Long";
				account1.createDate = LocalDate.of(2021, 6, 12);

				Account account2 = new Account();
				account2.accountID = 2;
				account2.email = "hoangvt@vti.edu.vn";
				account2.userName = "hoangvt";
				account2.fullName = "Vũ Tr�?ng Hoàng";
				account2.createDate = LocalDate.of(2021, 4, 2);

				Account account3 = new Account();
				account3.accountID = 3;
				account3.email = "tiennp@vti.edu.vn";
				account3.userName = "tiennp";
				account3.fullName = "Nguyễn Phong Tiến";
				account3.createDate = LocalDate.of(2021, 1, 2);

			// create group
				Group group1 = new Group();
				group1.groupID = 1;
				group1.groupName = "Nhóm1";
				group1.createDate = LocalDate.of(2021, 11, 12);
				group1.CreatorID = account1;

				Group group2 = new Group();
				group2.groupID = 2;
				group2.groupName = "Nhóm2";
				group2.createDate = LocalDate.of(2021, 1, 1);
				group2.CreatorID = account2;

				Group group3 = new Group();
				group3.groupID = 3;
				group3.groupName = "Nhóm3";
				group3.createDate = LocalDate.of(2021, 2, 3);
				group3.CreatorID = account3;
			
				Account[] accounts = {account1, account2, account3};
				Group[] groups = {group1, group2, group3};
				//in danh sách user
				System.err.println("Danh sách các user có trên hệ thống: ");
				for (int i = 0; i < accounts.length; i++) {
					System.out.print(accounts[i].userName+ " ");
				}
				//nhập
				System.out.println("\nNhập vào userName: ");
				String userName = sc.next();
				
				//in ds group
				System.err.println("Danh sách các group có trên hệ thống: ");
				for (int i = 0; i < groups.length; i++) {
					System.out.print(groups[i].groupName+ " ");
				}
				
				//random
				Random random = new Random();
				int indexGroup = random.nextInt(2);
				
				int indexAccount = -1;
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i].userName.equalsIgnoreCase(userName)) {
						indexAccount = i;
					}
				}
				
				if (indexAccount < 0) {
					System.err.println("Account này k nằng trong hệ thống");
				}
				else {
					for (int i = 0; i < accounts.length; i++) {
						if (accounts[i].userName.equalsIgnoreCase(userName)) {
							Group[] add = { groups[indexGroup] };
							accounts[i].groups = add;
							
							System.out.println("\nBạn vừa thêm group "+ accounts[indexAccount].groups[0].groupName + " cho account "+ accounts[indexAccount].userName);
						}
					}
				}
				
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
