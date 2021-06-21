package backend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entity.Student_Ex2;

public class Exercise2 {

	public static Scanner sc = new Scanner(System.in);
	public static List<Student_Ex2> list = new ArrayList<Student_Ex2>();
	
	
	
	public void question1() {
		System.out.println("Bạn muốn nhập bao nhiêu sv: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Sinh viên thứ "+(i+1)+" : ");
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Ngày sinh: ");
			String localDate = sc.nextLine();
			System.out.println("Nhập vào điểm: ");
			int score = sc.nextInt();
			sc.nextLine();
			Student_Ex2 st2 = new Student_Ex2(name, localDate, score);
			list.add(st2);
		}
		System.out.println("Danh sách sv vừa nhập: ");
		for (Student_Ex2 student_Ex2 : list) {
			System.out.println(student_Ex2);
		}
		Collections.sort(list);
		System.out.println("Danh sách sv sau khi sắp sếp theo tên: ");
		for (Student_Ex2 student_Ex2 : list) {
			System.out.println(student_Ex2);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
