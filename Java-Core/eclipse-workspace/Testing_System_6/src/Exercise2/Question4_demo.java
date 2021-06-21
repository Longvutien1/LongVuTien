package Exercise2;

public class Question4_demo {

	
	
	public static void main(String[] args) {
		Question4 department1 = new Question4("Dev");
		Question4 department2 = new Question4("Sale");
		Question4 department3 = new Question4("Test");
		Question4[] departments = {department1, department2, department3};
		try {
			System.out.println(departments[10]);
		} catch (Exception e) {
			System.out.println("Cannot find department");
		}
	}
	
	
}
