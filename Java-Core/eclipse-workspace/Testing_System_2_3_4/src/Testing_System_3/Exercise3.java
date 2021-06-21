package Testing_System_3;

public class Exercise3 {

	public static void main(String[] args) {
		question3();
	}
	
	
	//q1
	static void question1() {
		Integer luong = 5000;
		float luong2 = (float) luong;
		
		System.err.printf("%.2f",luong2);
	}
	//q2
	static void question2() {
		String so = "1234567";
		int so2 = Integer.parseInt(so);
		System.err.println(so2);
	}
	
	//q3
	static void question3() {
		Integer so = 1234567;
		int so2 = so.intValue();
		System.err.println(so2);
	}
	
}
