package entity;

public class Studen2_Ex2_Q2 {

	private final int id ;
	private String name;
	
	
	public static  void hocBai(){
		System.out.println("Đang học bài");
	}
	
	public Studen2_Ex2_Q2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	
	@Override
	public String toString() {
		return "Studen2_Ex2_Q2 [id=" + id + ", name=" + name + "]";
	}
	
	
}
