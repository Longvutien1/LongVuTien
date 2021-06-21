package Testing_System_2;

import java.time.LocalDate;

public interface Exercise_6 {
	public static void main(String[] args) {
		question2();
		question3();
	}
	
	
	public static void question1() {
		//Q1
		System.err.println("Các số chẵn nh�? hơn 10: ");
		for (int i = 1; i < 10; i++) {
				if (i % 2 == 0) {
					System.err.print(i+ " ");
				}
		}
	}
	
	public static void question2() {
		//q2
		Account[] accounts = inputAccounts();
		for (int i = 0; i < accounts.length; i++) {
			System.err.println("Thông tin account thứ "+(i+1)+": " );
			System.err.println("ID: "+accounts[i].accountID);
			System.err.println("Email: "+accounts[i].email);
			System.err.println("Usser name: "+accounts[i].userName);
			System.err.println("Full name: "+accounts[i].fullName);
			System.err.println("Create date: "+accounts[i].createDate);
			System.err.println("\n");
		}
	}
	public static Account[] inputAccounts() {
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "longvt@gmail.com";
		account1.userName = "longvu";
		account1.fullName = "Vũ Tiến Long";
		account1.createDate = LocalDate.of(2020, 6, 1);

		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "hamd@gmail.com";
		account2.userName = "haManh";
		account2.fullName = "Hà Mạnh Dũng";
		account2.createDate = LocalDate.of(2020, 6, 2);

		Account account3 = new Account();
		account3.accountID = 3;
		account3.email = "lePhong@gmail.com";
		account3.userName = "lePhong";
		account3.fullName = "Dương Lê Phong";
		account3.createDate = LocalDate.of(2020, 6, 3);

		Account[] accounts = { account1, account2, account3 };

		return accounts;
	}
	
	
	public static void question3() {
		//Q3
		System.err.println("Các số nguyên dương nh�? hơn 10: ");
		for (int i = 0; i < 10; i++) {
			System.err.print(i+ " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
