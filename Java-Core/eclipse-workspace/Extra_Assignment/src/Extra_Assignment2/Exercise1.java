package Extra_Assignment2;

import java.util.Scanner;

public class Exercise1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		question3();
//		question1();
//		question2();
//		quesition4(35.4f,24.5f);
//		question5();
		question6();
				
				
				
	}
	
	public static void question1() {
		//question1
		
				System.err.println("Mời bạn nhập vào số thực: ");
				float a = sc.nextFloat();
				float b = (float) (a*2.54);
				float c = (float) (b* 12);
				System.err.println("Foot: "+b);
				System.err.println("Inch: "+c);
				
				
	}
	
	//question 2
	public static void question2() {
		//question2
		System.err.println("Mời bạn nhập vào số từ 0 tới 68399: ");
		int x = sc.nextInt();
		//khai báo 3 biến đại diện cho giờ phút giây
		int house,minues,second;
		//1h = 3600s --> house = a/3600;
		house = x / 3600;
		// 1p = 60s , vì ở trên ta đã chia 3600 để lấy giờ, vậy lên lấy phần dư chia cho 60
		minues = x % 3600 / 60;
		// phần dư còn lại chính là số giây
		second = x % 3600 % 60;
		
		System.out.printf("Đổi %d thành giờ phút giây = %d:%d:%d",x,house,minues,second);

	}
	
	//question 3
	public static void question3() {
		int max= 0;
		int min = 999;
		int temp;
		int array[] = new int[4];
		System.err.println("Mời bạn nhập vào 4 số nguyên: ");
		for (int i = 0; i < 4; i++) {
			System.err.println("Số thứ "+(i+1));
			array[i] = sc.nextInt();
		}
		// sắp xếp
		for (int i = 0; i < 4-1; i++) {
			for (int j = i+1 ; j < 4-1; j++) {
					if (array[j] < array[i]) {
						temp = array[i];
						array[i] = array[j];
						array[i] = temp;
					}
				}
			}
		
		// hiển thị mảng vừa nhập
		System.err.println("Mảng bạn vừa nhập là: ");
		for (int i = 0; i < 4; i++) {
			System.err.printf(array[i]+" \t");
		}
		// sắp xếp
		for (int i = 0; i < 4 - 1; i++) {
			for (int j = i + 1; j <= 4 -1; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		//mảng sau khi sắp sếp
		System.err.println("Mảng sau khi sắp xếp là: ");
		for (int i = 0; i < 4; i++) {
			System.err.print(array[i]+ "\t");
		}
		System.err.println("\nMax = "+array[3]);
		System.err.println("Min = "+array[0]);

	}
	//question 4
	public static float quesition4(float a, float b) {
		if (a > b) {
			System.err.println("Số thứ nhất lớn hơn số thứ 2");
		}else {
			System.err.println("Số thứ hai lớn hơn số thứ nhất");
		}
		System.err.println("Hiệu của 2 số là: "+(a-b));
		return a - b;
	}
	
	//question 5
	public static void question5() {
		System.err.println("Mời bạn nhập vào 2 số: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a % b ==0) {
			System.err.println("Chia hết");
		}else {
			System.err.println("Không chia hết");
		}
	}
	
	public static void question6() {
			System.err.println("Mời bạn nhập điểm toán: ");
			float toan = sc.nextFloat();
			System.err.println("Mời bạn nhập điểm lý: ");
			float ly = sc.nextFloat();
			System.err.println("Mời bạn nhập điểm hóa: ");
			float hoa = sc.nextFloat();
			float diemTb = (( toan * 2 ) + ly + hoa ) / 4;
			System.err.println("Điểm rung bình: "+diemTb);
			if (diemTb >=9) {
				System.err.println("Bạn là học sinh xuất sắc");
			} else if(diemTb >=8 && diemTb <9){
				System.err.println("Bạn là học sinh giỏi");
			}
			else if(diemTb >=7 && diemTb <8){
				System.err.println("Bạn là học sinh khá");
			}
			else if(diemTb >=6 && diemTb <7){
				System.err.println("Bạn là học sinh trung bình khá");
			}
			else if(diemTb >=5 && diemTb <6){
				System.err.println("Bạn là học sinh trung bình ");
			}
			else if(diemTb <=5){
				System.err.println("Bạn là học sinh kém  ");
			}
			
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
