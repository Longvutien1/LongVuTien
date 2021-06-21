package Exercise2;

public class Question9 {

	public static int COUNT = 0;
	public int id;
	public PositionName name;

	public enum PositionName {
		Dev, Test, PM;
	}

	@Override
	public String toString() {
		return "Question9 [id=" + id + ", name=" + name + "]";
	}

	public Question9() {
		super();
		COUNT++;
		this.id = COUNT;
		System.out.println("Chọn tên vị trí b muốn nhập: 1.Dev, 2.Test, 3.PM");
		int chon = Question5.inputPositive();
		switch (chon) {
		case 1:
			this.name = PositionName.Dev;
			break;
		case 2:
			this.name = PositionName.Test;
			break;
		case 3:
			this.name = PositionName.PM;
			break;

		default:
			break;
		}
	}

}
