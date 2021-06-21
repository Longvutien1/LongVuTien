package backend;

import java.util.ArrayList;
import java.util.Scanner;

import entity.HinhChuNhat;
import entity.HinhHoc;
import entity.HinhTron;
import entity.KiemTraKiTuNhapVao;
import entity.MyMath;
import entity.PrimaryStudent;
import entity.SecondaryStudent;
import entity.Student;

public class Backen {
	public static ArrayList<Student> arr = new ArrayList<Student>();
	public static Scanner sc = new Scanner(System.in);
//  q1
	public static void question1() {
		Student st1 = new Student(1, "Long", "red");
		Student st2 = new Student(1, "Vinh", "blue");
		Student st3 = new Student(1, "Hải", "yellow");
		
		Student[] stt = { st1, st2, st3};
		for (Student st : stt) {
			System.out.println(st.toString());
		}
		Student.dhBk = "Đại học FPT";
		System.out.println("\nSau khi chuyển đh: ");
		for (Student st : stt) {
			System.out.println(st.toString());
		}
	}
	
////q2
	public static void question2() {

		System.out.println("Tổng quỹ: " + (Student.moneyGroup += 300));
		System.out.println("Studen 1 lấy 50k ==> tổng quỹ còn: " + (Student.moneyGroup -= 50));
		System.out.println("Student 2 lấy 20k ==> tổng còn: " + (Student.moneyGroup -= 20));
		System.out.println("Student 2 lấy 150k ==> tổng còn: " + (Student.moneyGroup -= 150));
		System.out.println("Mỗi người đóng thêm 50k: " + (Student.moneyGroup += 150));
	}
	
	
	// q4
	public static void question4() {
		Student st = new Student();
		System.out.println("Student College: " + st.getCollege());
		st.setCollege("Đại học Thương Mại");
		System.out.println(st.getCollege());
	}

//	q5
	public static void question5() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Sinh viên thứ "+ (i+1));
			Student st = new Student();
		}
		System.out.println("Số sv đc tạo ra là: "+Student.COUNT);
	}
	
	
//	q6
	public static void question6() {
//		tạo 4 seconStudent
		SecondaryStudent seconSt1 = new SecondaryStudent();
		SecondaryStudent seconSt2 = new SecondaryStudent();
		SecondaryStudent seconSt3 = new SecondaryStudent();
		SecondaryStudent seconSt4 = new SecondaryStudent();
//		tạo 2 primaryStudent
		PrimaryStudent priSt1 = new PrimaryStudent();
		PrimaryStudent priSt2 = new PrimaryStudent();
		
		System.out.println("Số lượng sv: "+Student.COUNT);
		System.out.println("Số sv SecondaryStudent: "+SecondaryStudent.COUNTsecondaryStudent);
		System.out.println("Số sv PrimaryStudent: "+PrimaryStudent.COUNTprimaryStudent);
	}
	
	
//	q7
	public static void question7() {
		for (int i = 0; i <10; i++) {
			Student st = new Student();
			arr.add(st);
		}
		Student st = new Student();
		
		for (Student x : arr) {
			System.out.println(x);
		}
	}
	
//	q8
	public static void question8() throws Exception{
		System.out.println("Tạo 4 hcn: ");
		HinhChuNhat[] hcn4 = new HinhChuNhat[4];

		for(
		int i = 0;i<4;i++)
		{
			System.out.println("Hinh thứ " + (i + 1) + " ");
			System.out.println("Cạnh a: ");
			float a = sc.nextFloat();
			System.out.println("Cạnh b: ");
			float b = sc.nextFloat();
			HinhChuNhat hcn = new HinhChuNhat(a, b);
			hcn4[i] = hcn;
			System.out.println("Chu vi: "+hcn.chuVi(a, b));
			System.out.println("Diện tích: "+hcn.dienTich(a, b));
		}

		System.out.println("Tạo hình tròn: ");System.out.println("Nhập vào bán kính: ");
		float r = sc.nextFloat();
		HinhTron hc = new HinhTron(r, r);
		
		System.out.println("Chu vi hình tròn: "+hc.chuVi(r, r));
		System.out.println("Diện tích hình tròn: "+ hc.dienTich(r, r));
	
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
