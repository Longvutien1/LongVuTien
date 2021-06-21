package Exercise2;

public class Question4 {
	
	public static int COUNT = 0;
	private int id;
	private String name;
	
	public Question4( String name) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Question4 [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}
