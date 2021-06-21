package Exersice2_Q2;

import java.util.Scanner;

public class Student extends Person {

	private int id;
	private int diemTb;
	private String email;

	@Override
	public String showInfo() {
		return super.showInfo() + " id= " + id + ", Điểm trung bình=" + diemTb + ", email=" + email + "]";
	}

//	input
	@Override
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		super.inputInfo();
		System.out.println("ID: " + id);
		this.id = sc.nextInt();
		System.out.println("Điểm trung bình: ");
		this.diemTb = sc.nextInt();
		System.out.println("Email: ");
		sc.nextLine();
		this.email = sc.nextLine();

	}

	public boolean hocBong() {
		return diemTb > 8 ? true : false ;
	}
}
