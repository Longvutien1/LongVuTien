package Q2_Ex4_Testing4;

public abstract class User {

	private String name;
	public Double salary;
	
	protected void name() {
		
	}
	public User(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
//	hàm calutatePay
	public abstract Double calculatePay();
//	hàm display infor
	
	public void displayInfor() {
		System.out.println("Name: "+name);
		System.out.println("salary: "+salary);
		System.out.println("Lương chi chả: "+calculatePay());
		
	}
}
