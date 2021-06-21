package Testing_Sytem_4;

import Testing_System_1.Main;

public class Student {
	
	private int id;
	private String name;
	private String hometown;
	private int diemHocLuc;
//	b
	public Student() {
		
	}
	
	public Student(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.diemHocLuc = (int) 0 ;
	}
	
//	c
	public void setDiem(int diemHocLuc) {
		this.diemHocLuc = diemHocLuc;
	}
	
// d
	public void setThemDiem(int diemHocLuc) {
		this.diemHocLuc = this.diemHocLuc + diemHocLuc;
		
	}
	
	@Override
	public String toString() {
		String hocLuc = null;
		if (this.diemHocLuc < 4) {
			hocLuc = "yếu";
		}else if (this.diemHocLuc < 6) {
			hocLuc = "trung bình";
		}
			else if (this.diemHocLuc <8) {
				hocLuc = "khá";
			}else {
				hocLuc = "giỏi";
			}
		return "Student:"+name+"có học lực: "+hocLuc;
	}
	
	
	public void demo() {
		Student st1 = new Student("Long","Hà nội");
		st1.diemHocLuc = 10;
		Student st2 = new Student("Huy","Hà nội");
		st1.diemHocLuc = 2;
		
		System.out.println(st1);
		System.out.println(st2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

