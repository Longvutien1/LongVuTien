package Q2_Ex4_Testing4;

public class Manager extends User{

	public Manager(String name, Double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calculatePay() {
		// TODO Auto-generated method stub
		return salary * 520;
	}

}
