package entity;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	public static int COUNT = 0;
	
	
	
	public Student() {
		
		// TODO Auto-generated constructor stub
	}


	public Student( String name) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
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
		return "Student [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
	
	
	
}
