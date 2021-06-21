package entity;

import java.util.Scanner;

public class Student {

	private  int id;
	private String name;
	private String color;
	
	public static int moneyGroup; 
	public static String dhBk  ;
	public static String college;
	public static int COUNT = 0;
	public static Scanner sc = new Scanner(System.in);
	public static String getDhBk() {
		return dhBk  ;
	}
	
	

	
	public Student() {
		
		super();
		COUNT++;
		if (COUNT >7) {
			System.out.println("Đã đạt đủ sv k nhận thêm !");
		} else {
			System.out.println("Nhập vào tên sv: ");
			this.name = sc.nextLine();
		}
	}




	public Student(int id, String name, String color) {	
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
		this.color = color;
		dhBk = "Đại Học Bách Khoa";
	}
	
	//q4
	
	
	public int getId() {
		return id;
	}
	
	public static String getCollege() {
		return college;
	}



	public static void setCollege(String college) {
		Student.college = college;
	}



	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", color=" + color +" " +dhBk +"]";
	}
	

	
	
	
}
