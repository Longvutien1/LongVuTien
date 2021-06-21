package Exersice2_Q2;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {

	private String name;
	private Gender gioiTinh;
	private LocalDate date;
	private String diaChi;

	public Person() {
		super();
	}

	public enum Gender {
		MALE, FEMALE, UNKNOWN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(Gender gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

//	hàm sâu infore
	public String showInfo() {
		return "Person [name=" + name + ", gioiTinh=" + gioiTinh + ", date=" + date + ", diaChi=" + diaChi + "]";
	}

//	hàm input infore
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập thông tin Person : ");
		System.out.println("Name: ");
		this.name = sc.nextLine();
		System.out.println("Giới tính: 1.MALE, 2.FEMALE, 3.UNKNOWN : ");
		int gioiTinh = sc.nextInt();
		switch (gioiTinh) {
		case 1:
			this.gioiTinh = Gender.MALE;
			break;
		case 2:
			this.gioiTinh = Gender.FEMALE;
			break;
		case 3:
			this.gioiTinh = Gender.UNKNOWN;
			break;

		default:
			System.out.println("Sai cú pháp");
			break;
		}

	}

}
