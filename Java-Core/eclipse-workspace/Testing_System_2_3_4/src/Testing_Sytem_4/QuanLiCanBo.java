package Testing_Sytem_4;

import java.util.ArrayList;
import java.util.Scanner;

import Testing_Sytem_4.CanBo.Gender;

public class QuanLiCanBo  {

	public ArrayList<CanBo> arr = new ArrayList<CanBo>();
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		QuanLiCanBo ql = new QuanLiCanBo();
		ql.menu();
	}
	
	public void menu() {
		while (true) {
			System.out.println("+----------------------Menu-----------------------+");
			System.out.println("|1.Thêm cán bộ                                    |");
			System.out.println("|2.Tìm kiếm theo họ tên                           |");
			System.out.println("|3.Hiển thị theo thông tin danh sách các cán bộ   |");
			System.out.println("|4.Xóa cán bộ                                     |");
			System.out.println("|5.Thoát                                          |");
			System.out.println("+-------------------------------------------------+");
			System.out.println("Mời bạn chọn chức năng: ");
			int chon = sc.nextInt();
			switch (chon) {
			case 1:
				addCanBo();
				break;
			case 2:
				timTen();
				break;

			case 3:
				hienThongTin();
				break;

			case 4:
				xoaCanBo();
				break;

			case 5:
				
				break;


			default:
				break;
			}
		}
	}
	
//	thêm cán bộ
		private  void addCanBo() {
			System.out.println("-------------------");
			System.out.println("1. Thêm Engineer");
			System.out.println("2. Thêm Worker");
			System.out.println("3. Thêm Employeee");
			System.out.println("-------------------");
			int chon2 = sc.nextInt();
			switch (chon2) {
			case 1:
				System.out.println("Nhập vào tên: ");
				String nameEngineer = sc.next();
				
				System.out.println("Nhập vào tuổi Engineer: ");
				int ageEngineer = sc.nextInt();
				
				System.out.println("Nhập vào giới tính Engineer 1.Male, 2.Female, 3.Unknown: ");
				int flagEngineer = sc.nextInt();
				Gender genderName1 = null;
				switch (flagEngineer) {
				case 1:
				genderName1 = Gender.MALE;
				break;
				case 2:
				genderName1 = Gender.FEMALE;
				break;
				case 3:
				genderName1 = Gender.UNKNOWM;
				break;
				}
				
				System.out.println("Nhập vào địa chỉ Engineer: ");
				String addEngineer = sc.next();
				System.out.println("Nhập vào chuyên ngành Engineer: ");
				String specializedEngineer = sc.next();
				
				CanBo employee = new Engineer(nameEngineer,ageEngineer,genderName1,addEngineer,specializedEngineer);
				arr.add(employee);
				System.out.println("Thêm thành công !!");
				
				break;
// hết employee các cán bộ còn lại giống nhau
			default:
				break;
			}
		}
//		b. tìm theo tên 
		private void timTen() {
			System.out.println("Nhập vào tên muốn tìm: ");
			String name = sc.next();
			for (CanBo canBo : arr) {
				if (canBo.getName().equals(name)) {
					System.out.println(canBo);
				}
			}
			
		}
//	c.hiện thông tin danh sách cán bộ
		
		private void hienThongTin() {
			System.out.println("Danh sách cán bộ: ");
			for (CanBo canBo : arr) {
				System.out.println(canBo);
			}
		}
//	d.xóa cán bộ bằng tên
		private void xoaCanBo() {
		
			System.out.println("Mời nhập tên cán bộ cần xóa: ");
			String name = sc.next();
//			for (CanBo canBo : arr) {
//				if (canBo.getName().equalsIgnoreCase(name)) {
//					System.out.println(canBo.getName());
//					arr.remove(canBo);
//				}
//			}
			arr.removeIf(arr -> arr.getName().equals(name));
			hienThongTin();
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
