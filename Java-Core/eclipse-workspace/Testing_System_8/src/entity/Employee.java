package entity;

import java.util.Arrays;

public class Employee<T> {
	
	private static int COUNT = 0;
	private int id ;
	private String name;
	private T[] salaries;
	
	
	
	
	public Employee(int id, String name, T[] salaries) {
		super();
		this.id = id;
		this.name = name;
		this.salaries = salaries;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salaries=" + Arrays.toString(salaries) + "]";
	}
	
	
	
	public String getSalary() {
		return "Employee [id=" + id + ", name=" + name + ", salaries=" + salaries[salaries.length - 1]+ "]";
	}
	
	
	
	
}


