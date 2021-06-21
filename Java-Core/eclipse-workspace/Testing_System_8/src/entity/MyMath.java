package entity;

public class MyMath<T, N> {


	private T number1;
	private N number2;
	
	
	public T getNumber1() {
		return number1;
	}
	public void setNumber1(T number1) {
		this.number1 = number1;
	}
	public N getNumber2() {
		return number2;
	}
	public void setNumber2(N number2) {
		this.number2 = number2;
	}
	
//	contructor
	public MyMath(T number1, N number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}
	
	
	
	

	
	
	
	
	
	
}
