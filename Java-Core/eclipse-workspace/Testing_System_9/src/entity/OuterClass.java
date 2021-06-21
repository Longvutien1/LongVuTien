package entity;

public class OuterClass {
	
	public void show() {
		InnerClass inner = new InnerClass();
		inner.show();
	}
	
	
	
	
	public class InnerClass{
		public void show() {
			System.out.println("Đây là innerClass");
		}
		
	}
	
	
	
	
}
