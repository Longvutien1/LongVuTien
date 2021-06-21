package Q2_Ex4_Testing4;

public class Employee extends User{

	public Employee(String name, Double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calculatePay() {
		// TODO Auto-generated method stub
		return salary * 420;
	}

	
	
}
