package Exercise1_Q2;

public class ThongTinThiSinh {

	public static int COUNT = 0;
	private int id;
	private String name;
	private String address;
	private int priority;
	private Block block;

//	return ra id
	public int getId() {
		return id;
	}

	public ThongTinThiSinh(String name, String address, int priority, Block block) {
		COUNT++;
		this.id = COUNT;
		this.name = name;
		this.address = address;
		this.priority = priority;
		this.block = block;
	}

	@Override
	public String toString() {
		return "Contestant [idNum=" + id + ", name=" + name + ", address=" + address + ", priority=" + priority
				+ ", block=" + block.getName() + ", Subject =" + block.getSubject() + "]";
		}
}
