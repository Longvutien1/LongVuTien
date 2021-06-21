package backend;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import entity.Student;

public class Exercise1 {
	public static Scanner sc = new Scanner(System.in);
	public static java.util.List<Student> list = new ArrayList<Student>();

	public void question1() {
		System.out.println("Nhập số sinh viên muốn thêm: ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			Student st = new Student("Long " + (i + 1));
			list.add(st);
		}
		menu();
	}

	void menu() {
		while (true) {
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("|1. In ra tổng số phần tử của students                               |");
			System.out.println("|2. Lấy phần tử thứ 4 của students                                   |");
			System.out.println("|3. In ra phần tử đầu và phần tử cuối của students	                 |");
			System.out.println("|4. Thêm 1 phần tử vào vị trí đầu của student                        |");
			System.out.println("|5. Thêm 1 phần tử vào vị trí cuối của students                	 	 |");
			System.out.println("|6. Đảo ngược vị trí của students                                    |");
			System.out.println("|7. Tạo 1 method tìm kiếm student theo id                        	 |");
			System.out.println("|8. Tạo 1 method tìm kiếm student theo name                          |");
			System.out.println("|9. Tạo 1 method để in ra các student có trùng tên                   |");
			System.out.println("|10.Xóa name của student có id = 2;                                  |");
			System.out.println("|11.Delete student có id = 5;                                        |");
			System.out.println("|0. Thoát                                                            |");
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("+---------------=Lựa chọn chức năng bạn muốn sử dụng-----------------+");
			int chon = sc.nextInt();
			switch (chon) {
			case 1:
				System.out.println("Tổng số sv là: " + list.size());
				break;
			case 2:
				System.out.println("Sinh viên thứ 4: " + list.get(3));
				break;
			case 3:
				System.out.println(
						"Sinh viên đầu =" + list.get(0) + "và sinh viên cuối = " + (list.get(list.size() - 1)));
				break;
			case 4:
				System.out.println("Nhập tên sv bạn muốn thêm: ");
				String name = sc.nextLine();
				list.add(0, new Student(name));
				System.out.println("Thêm thành công!!");
				printStudent();
				break;
			case 5:
				System.out.println("Nhập tên sv mà bạn muốn thêm: ");
				String name2 = sc.nextLine();
				list.add(new Student(name2));
				System.out.println("Thêm thành công!!");
				printStudent();
				break;
			case 6:
				Collections.reverse(list);
				System.out.println("Đảo ngược thành công");
				printStudent();
				break;
			case 7:
				System.out.println("Nhập vào id cần tìm kiếm: ");
				int id = sc.nextInt();
				for (Student student : list) {
					if (student.getId() == id) {
						System.out.println(student);
					}
				}
				break;
			case 8:
				System.out.println("Nhập tên cần tìm kiếm: ");
				sc.nextLine();
				String nameTimKiem = sc.nextLine();
				for (Student student : list) {
					if (student.getName().equals(nameTimKiem)) {
						System.out.println(student);
					}
				}
				break;
			case 9:
				System.out.println("Các sv trung tên: ");
				for (int i = 0; i < list.size(); i++) {
					for (int j = i + 1; j < list.size(); j++) {
//						đk nếu tên của i giống tên của j 
						if (list.get(i).getName().equals(list.get(j).getName())) {
							System.out.println(list.get(i).toString());
						}
					}
				}
				break;
			case 10:
				System.out.println("Nhập vào id bạn muốn xóa tên: ");
				int id10 = sc.nextInt();
				for (Student student : list) {
					if (student.getId() == id10) {
						student.setName(null);
					}
				}
				printStudent();
				break;
			case 11:
				System.out.println("Nhập vào id bạn muốn xóa: ");
				Student students = new Student();
				int id11 = sc.nextInt();
				for (Student student : list) {
					if (student.getId() == id11) {
						list.remove(id11);
					}
				}
				printStudent();
				break;
			case 12:
				System.out.println("Tạo list ArrayCopy:");
				java.util.List<Student> listCopy = new ArrayList<Student>();
				listCopy.addAll(list);
				System.out.println("In phần tử trong ArrayCopy: ");
				for (Student student : listCopy) {
					System.out.println(student);
				}
				break;
			case 0:

				return;
			default:
				break;
			}

		}
	}

	void printStudent() {
		System.out.println("Thông tin sv: ");
		for (Student student : list) {
			System.out.println(student);
		}
	}

	public void question2() {
		System.out.println("+---------------------Menu--------------------+");
		System.out.println("1.Quản lí sv bằng stark");
		System.out.println("2.Quản lí sv bằng queue");
		System.out.println("0.Thoát");
		System.out.println("Mời bạn chọn chức năng: ");
		int chon = sc.nextInt();
		switch (chon) {
		case 1:
			stark();
			break;
		case 2:
			queue();
			break;
		case 0:

			return;

		default:
			break;
		}
	}

	void queue() {
		Queue<Student> queueStudent = new LinkedList<Student>();
		System.out.println("Nhập vào số sv muốn quản lí bằng queue: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Student stQueue = new Student("Student queue " + (i + 1));
			queueStudent.add(stQueue);

		}
		System.out.println("Thêm thành công sv!");
		System.out.println("Danh sách sv vừa thêm: " + queueStudent.toString());
		System.out.println("Danh sách sv từ đầu tới cuối: ");
		for (int i = 0; i < queueStudent.size(); i++) {
			System.out.println(queueStudent.poll());
		}
		System.out.println("Số sv còn lại : "+queueStudent.size());
	}
	
	
// stark
	void stark() {
		Stack<Student> starkStudent = new Stack<Student>();
		System.out.println("Nhập số sv muốn tạo: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Student st = new Student("Student" + (i + 1));
			starkStudent.push(st);
//			lưu vào stark
		}
//		 b thứ tự sv
		System.out.println("Thứ tự sv: ");
		Iterator<Student> iterStudent = starkStudent.iterator();
		while (iterStudent.hasNext()) {
			Student st = iterStudent.next();
			System.out.println(st);
		}
		System.out.println("Sinh viên đến muộn nhất:" + starkStudent.peek());
		System.out.println("Thứ tự sv từ muộn nhất tới sớm nhất : ");
		for (int i = 0; i < starkStudent.size(); i++) {
			System.out.println(starkStudent.pop());

		}
		System.out.println("Số sv còn lại: " + starkStudent.size());

	}

	
	public void question3() {
		Set<Student> setStudent = new HashSet<Student>();
		
		System.out.println("Nhập số sv muốn tạo: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Student st = new Student("Student" + (i + 1));
			setStudent.add(st);
	}
		System.out.println("Tạo thành công sv !!");
		System.out.println("Xuất sv: ");
		Iterator<Student> iterSt = setStudent.iterator();
		for (int j = 0; j < setStudent.size(); j++) {
			System.out.println(iterSt.next());
		}
		
		System.out.println("Phần tử thứ 4 trong set");
		Iterator<Student> iterSt4 = setStudent.iterator();
//		tìm ra 3 phần tử trước
		for (int i = 0; i < 3; i++) {
			iterSt4.next();
		}
//		in phần tử thứ 4
		System.out.println(iterSt4.next());
		
//		in ra phần tử đầu và phần tử cuối của set
		Iterator<Student> iterSt5 = setStudent.iterator();
		System.out.println("Phần tử đầu của set: "+iterSt5.next());
		
			for (int i = 0; i < setStudent.size() - 2; i++) {
				iterSt5.next();
			}
			System.out.println("Phần tử cuối của set "+iterSt5.next());
	}
	
	
	public void question4() {
		Set<Student> setStNew = new HashSet<Student>();
		System.out.println("Nhập số lượng sv: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập tên sv: ");
			String name = sc.nextLine();
			Student st = new Student(name);
			setStNew.add(st);
		}
		System.out.println("Tổng số sv là: "+setStNew.size());
		Iterator<Student> iterStu = setStNew.iterator();
//		xuất sv
		System.out.println("Xuất sv:  ");
		for (int i = 0; i < setStNew.size(); i++) {
			System.out.println(iterStu.next());
		}
		
	}
	
	public void question5() {
		Set<Student> setStNew = new HashSet<Student>();
		System.out.println("Nhập số lượng sv: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập tên sv: ");
			String name = sc.nextLine();
			Student st = new Student(name);
			setStNew.add(st);
		}
		System.out.println("Tổng số sv là: "+setStNew.size());
		Iterator<Student> iterStu = setStNew.iterator();
//		xuất sv
		System.out.println("Xuất sv:  ");
		for (int i = 0; i < setStNew.size(); i++) {
			System.out.println(iterStu.next());
		}
		
//		sắp sếp
		java.util.List<Student> list = new ArrayList<Student>(setStNew);
		Collections.sort(list);
		System.out.println("Sau khi sắp sếp: ");
		for (Student student : list) {
			System.out.println(student);
		}
		
	}
	
	
	public void question6_7() {
		Map<Integer, String> mapSt = new HashMap<Integer, String>();
		System.out.println("Bạn muốn nhập bn sinh viên: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập vào tên sv: ");
			String name = sc.nextLine();
			mapSt.put(Student.COUNT++, name);
		}
		System.out.println("Danh sách các sv trong map: ");
		for (Entry<Integer, String> student : mapSt.entrySet()) {
			System.out.println(student.toString());
		}
		System.out.println("In ra các key của student: ");
		for (Entry<Integer, String> student : mapSt.entrySet()) {
			System.out.println(student.getKey());
		}
		System.out.println("In ra các value của student: ");
		for (Entry<Integer, String> student : mapSt.entrySet()) {
			System.out.println(student.getValue());
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
