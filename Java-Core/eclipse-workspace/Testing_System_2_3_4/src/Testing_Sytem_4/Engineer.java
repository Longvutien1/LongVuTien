package Testing_Sytem_4;

public class Engineer extends CanBo{

	private	String specialized; //chuyên nghành
	
	public Engineer(String name, int age, Gender gender, String address, String specialized) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
		this.specialized = specialized;
	}

	@Override
	public String toString() {
	return super.toString() + "Position: Engineer [specialized=" + 
			specialized + "]";
	}

}
