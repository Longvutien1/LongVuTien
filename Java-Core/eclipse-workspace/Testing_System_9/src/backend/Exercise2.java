package backend;

import java.util.Date;

import entity.Student;

public class Exercise2 {

	public void question1() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2018, 05, 18);
		System.out.println(date);
	}
	
	public void question2() {
		Student student = new Student("Vũ Tiến Long");
//		mã sv cũ
		System.out.println(student.getId());
//		mã sv mới
		System.out.println(student.getIdNew());
		
		
	}
	
	
}
