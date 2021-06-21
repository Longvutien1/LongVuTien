package backend;

import entity.MyMath;
import entity.MyNumber;
import entity.Salary;

public class Exercise4 {

	public void question1() {
		Salary<Integer> salary1 = new Salary<Integer>(12000);
		
		System.out.println(salary1.toString());
	}
	
	public void question2() {
		MyNumber<Double> myNumber1 = new MyNumber<Double>(0392127565.0);
		System.out.println(myNumber1.toString());
	}
//	public void question3() {
//		MyMath<Integer, Integer> math = new MyMath<Integer, Integer>(1, 3);
//		
//		System.out.println("Tổng = "+math.);
//	}
}
