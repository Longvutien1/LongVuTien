package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Employee;
import entity.MyMap;
import entity.Phone;
import entity.Staff;
import entity.Student_Ex3;

public class Exercise3 {
	public static Scanner sc = new Scanner(System.in);
	public static List<Student_Ex3> list = new ArrayList();
	public void question1() {
		
//		id theo kiểu int
		Student_Ex3<Integer> st1 = new Student_Ex3<Integer>(1,"Long vũ");
//		id theo kiểu float
		Student_Ex3<Float> st2 = new Student_Ex3<Float>(1.2f,"Long vũ");
//		id theo kiểu double
		Student_Ex3<Double> st3 = new Student_Ex3<Double>(13.0,"Long vũ");
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		printStudent(list.get(1));
	}
	
	
//	Question 2 xuất sv khi người dùng nhập 
	<T> void printStudent(T a) {
		System.out.println("Sinh viên: "+ a);

	}
	
	
	public void question4() {
		Integer[] arrInt = { 5, 10, 15 };
		Float[] arrFloat = { 6f, 5f, 15f };
		Double[] arrDouble = { 5.2, 2.6, 6.9 };
		
//		xuất mảng
		printArr(arrInt);
		printArr(arrFloat);

		
	}
	
//	xuất mảng arr
	<T> void printArr(T[] arr) {
		for (T t : arr) {
			System.out.println(t);
		}
	}
	
	public void question5() {
		Integer salaries[] = {1000, 1200, 1500 };
		Employee<Integer> employee1 = new Employee<Integer>(1, "Long", salaries);
		System.out.println("Employee vừa tạo: ");
		printStudent(employee1);
		System.out.println("Tháng lương cuối cùng của employee: "+employee1.getSalary());
		
		
	}
	
	
	public void question6() {
		
		MyMap<Integer, String> my = new MyMap<Integer, String>(1, "Long");
		
		System.out.println("Sinh viên vừa khởi tạo là: ");
		System.out.println("Get value: "+my.getValue());
		System.out.println("Get key: "+my.getKey());
		System.out.println(my.toString());
	}
	
	public void question7() {
		System.out.println("Với key là email");
		Phone<String, String> phone1 = new Phone<String, String>("longvt@fpt.edu.vn", "0392127");
		System.out.println("Xuất thông tin phone: "+phone1.getKey());
		
		System.out.println("Với key là số thứ tự");
		Phone<Integer, String> phone2 = new Phone<Integer, String>(1, "0392127");
		System.out.println("Xuất thông tin phone: "+phone2.getKey());

		System.out.println("Với key là tên của người sử dụng");
		Phone<String, String> phone3 = new Phone<String, String>("Vũ Tiến Long", "0392127");
		System.out.println("Xuất thông tin phone: "+phone3.getKey());
	}
	
	
	public void question8() {
		Staff<Integer> staff = new Staff<Integer>(1, "Long");
		System.out.println("Xuất theo id: "+staff.getId());
		System.out.println("Xuất theo name: "+staff.getName());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
