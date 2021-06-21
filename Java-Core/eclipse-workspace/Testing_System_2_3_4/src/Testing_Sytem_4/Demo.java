package Testing_Sytem_4;

import Testing_System_1.Question;

public class Demo {

	public static void main(String[] args) {
//		Student st1 = new Student();
//		st1.demo();
//		System.out.println(st1);
		
		question2();
	//	q2
		
	}
	public static void question2() {
		System.out.println("-----Demo-----");
		Circle circle = new Circle(2.0, "red");

		System.out.println("Diện tích hình tròn là: " + circle.getArea());
		
		System.out.println("---- Demo q2 -----");
		Account_q2 accQues1 = new Account_q2("1", "accQues1", 10);
		Account_q2 accQues2 = new Account_q2("2", "accQues2", 20);
		System.out.println("Số tiền ban đầu của: accQues1: " + accQues1.getBalance() + " accQues2: " + accQues2.getBalance());
				accQues1.credit(50);
		System.out.println("Balace của accQues1 sau khi Credit 50: " + accQues1.getBalance());
		
		
		accQues1.debit(20);
		System.out.println("Balace của accQues1 sau khi debit 20: " + 
		accQues1.getBalance());
		System.out.println("accQues1 chuyển 20 cho accQues2: ");
		accQues1.tranfer(accQues2, 20);
		
		System.out.println("Sau khi chuyển số tiền của accQues1: " + 
				accQues1.getBalance() + " accQues2: "
				+ accQues2.getBalance());
//		date
		System.out.println("---- Demo Date -----");
		Date date1 = new Date(25, 04, 2000);
		System.out.println("Bạn vừa tạo ngày: " + date1.getDay());
		
		System.out.println("Check năm nhuận: ");
		if (date1.isLeapYear()) {
		System.out.println("Đây là năm nhuận");
		} else {
		System.out.println("Đây không phải là năm nhuận");
		}

	}
}
