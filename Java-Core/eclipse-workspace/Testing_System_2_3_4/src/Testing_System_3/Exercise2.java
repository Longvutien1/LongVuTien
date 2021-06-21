package Testing_System_3;

import java.time.LocalDate;

public class Exercise2 {

	public static void main(String[] args) {
		System.err.println("Khởi tạo mảng gồm 5 phần tử : ");
		Account[] accounts = new Account[5];
		Account acc;
		for (int i = 0; i < accounts.length; i++) {
			acc = new Account();
			acc.id = i;
			acc.email = "Email" +i;
			acc.userName = "UserName"+ i;
			acc.fullName = "FullName"+i;
			acc.createDate = LocalDate.now();
			accounts[i] = acc;
			
			System.out.println("\nThông tin account: "+i);
			System.out.println("ID: "+accounts[i].id);
			System.out.println("Email: "+accounts[i].email);
			System.out.println("UserName: "+accounts[i].userName);
			System.out.println("fullName: "+accounts[i].fullName);
			System.out.println("CreateDate: "+accounts[i].createDate);
			
		}
	}
}
