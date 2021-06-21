package Exercise1_Q2;

public class Block {

	private String name;
	private String subject;

	public Block(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		switch (this.name) {
		case "A":
			this.subject = "Toán, lý, hóa";
			break;
		case "B":
			this.subject = "Toán, Hóa, Sinh";		
					break;
		case "C":
			this.subject = "Văn, Sử, Địa";
			break;

		default:
			break;
		}
		
		return this.subject;
	}
}
