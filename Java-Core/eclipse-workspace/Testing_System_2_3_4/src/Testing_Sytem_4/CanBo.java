package Testing_Sytem_4;

public class CanBo {

	private String name;
	private int age;
	public Gender gender;
	private String address;
	
	
	public enum Gender {
		MALE, FEMALE, UNKNOWM
	}
	
	public CanBo(String name, int age, Gender gender, String address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		}
	
	public String getName() {
		return name;
		}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}

}
