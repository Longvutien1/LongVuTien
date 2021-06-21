package Testing_Sytem_4;

public class Worker extends CanBo{
	private int rank;
	
	
	
	public Worker(String name, int age, Gender gender, String address, int rank) {
		super(name, age, gender, address);
		this.rank = rank;
	}

	@Override
	public String toString() {
		return super.toString() + "Position: Worker [rank=" + rank + "]";
	}

	
}
