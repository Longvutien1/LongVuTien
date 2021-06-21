package Testing_Sytem_4;

public class Employee extends CanBo{
	private String task; //nhiệm vụ
	
	
	public Employee(String name, int age, Gender gender, String address, String task ) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
		this.task = task;
	}

	
	@Override
	public String toString() {
	return super.toString() + "Position: Employee [task=" + task + 
	"]";
	}
	
}
