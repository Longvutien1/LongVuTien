package Exercise2;

public class Question1 {

	public static void main(String[] args) {
		try {
			float result = devide(7,0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Cannot divide 0");
		}finally {
			System.out.println("Divide completed!");
		}
	}

	private static float devide(int i, int j) {
		// TODO Auto-generated method stub
		return i / j;
	}
}
