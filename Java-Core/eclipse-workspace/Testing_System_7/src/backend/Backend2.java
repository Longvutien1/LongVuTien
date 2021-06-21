package backend;

import entity.KiemTraKiTuNhapVao;
import entity.MyMath;
import entity.Studen2_Ex2_Q2;

public class Backend2 {

//	ex2_q1
	public static void ex2_q1() {
		System.out.println("Nhập a: ");
		float a = KiemTraKiTuNhapVao.inputFloat();
		System.out.println("Tổng của a là PI là: "+MyMath.sum(a));

//		MyMath.PI = 3;      	có final sẽ báo lỗi
		
	}
	
//	q2
	public static void ex2_q2() {
		System.out.println("Nhập id: ");
		int id = KiemTraKiTuNhapVao.inputInt();
		System.out.println("Nhập name: ");
		String name = KiemTraKiTuNhapVao.inputString();
		Studen2_Ex2_Q2 ex2 = new Studen2_Ex2_Q2(id, name);
		System.out.println("Thông tin của bạn: "+ex2.toString());
		ex2.hocBai();

	}
}
