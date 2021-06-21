package entity;

public class Student_Ex3<N> {

	private N id;
	private String name;
	
	
	public Student_Ex3() {
		super();
	}
	
	
	public Student_Ex3(N id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public N getId() {
		return id;
	}


	public void setId(N id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student_Ex3 [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	
}
