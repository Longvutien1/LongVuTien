package Exercise2;

public class Student implements IStudent{
	public static int COUNT ;
	private int id;
	private String name;
	private int group ;
	
//	phương thức trả về của student
	public Student(String name, int group) {
		COUNT++;
		this.id = COUNT;
		this.name = name;
		this.group = group;
	}
	
	public int getGroup() {
		return group;
		}
	
//	hàm to String
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", group=" + group + "]";
	}
	
//	hàm điểm danh
	@Override
	public void diemDanh() {
		System.out.println(name+ " điểm danh thành công");
		
	}

//	hàm học bài
	@Override
	public void hocBai() {
		System.out.println(name+ " đang học bài");
		
	}
	
//	hàm đi dọn vs
	@Override
	public void diDonVeSinh() {
		System.out.println(name+ " đi dọn vệ sinh");
		
	}
	
	
}
