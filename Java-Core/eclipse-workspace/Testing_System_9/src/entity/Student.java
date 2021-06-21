package entity;

public class Student {

	private int id;
	private String name;
	public static int COUNT = 0;
	
	
	public Student() {
		super();
	
	}
	
	
	public Student(String name) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
	}

	@Deprecated
	public int getId() {
		return id;
	}
	public String getIdNew() {
		return "Mã Sv: "+id;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}





	

	
	
	
}


