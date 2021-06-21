package Testing_System_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Exercise4 {

	public static void main(String[] args) {
		
		
		question4();
		
		
		
		
		
		//question 5: lấy ngẫu nhiên 1 ngày trong khoảng tg trở lại đây
		
		
		//question 6;lấy ngẫu nhiên 1 ngày trong qk
		
		
		
		
		
		
		
	}
	
	public static void question1() {
		//question1
				Random random1 = new Random();
				int x = random1.nextInt();
				System.err.println("Số random ngẫu nhiên: "+x);
				
				
				
	}
	public static void question2() {
	
		//question2
		Random random1 = new Random();
		float a = random1.nextFloat();
		System.err.println("Random số thực: "+a);
				
				
				
	}
	public static void question3() {
		Random random1 = new Random();
		 //question3
		String[] names = {"Long","Hải","Minh","Nhật"};
		int b = random1.nextInt(names.length);
		System.err.println(names[b]);
		float a = random1.nextFloat();
		System.err.println("Random số thực: "+a);
				
				
				
	}
	
	
	
	public static void question4() {
		//question4: lấy ngẫu nhiên 1 ngày trong khoảng tg 24-7-1995 tới 20-12-1995
		
		Random a  = new Random();
		int minday = (int) LocalDate.of(1995, 7, 24).toEpochDay();
		int maxday = (int) LocalDate.of(1995,12,20).toEpochDay();
		
		int ranDomint = minday+ a.nextInt(maxday - minday);
		LocalDate randomDay = LocalDate.ofEpochDay(ranDomint);
		System.err.println(randomDay);
	}
	
	
	public static void question7() {
		//question 7: lấy ngẫu nhiên 1 số có 3 chữ số
		
				double z = Math.random()* (999-100 + 1) +100;
				
				System.err.printf("%.0f",z);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
