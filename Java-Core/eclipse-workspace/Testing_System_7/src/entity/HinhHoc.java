package entity;

public abstract class HinhHoc {

	private float a;
	private float b;
	public static int COUNT = 0;
	
	public abstract float chuVi(float a, float b);
	
	public abstract float dienTich(float a, float b);

	public HinhHoc(float a, float b) throws Exception{
		super();
		COUNT++;
		if (COUNT <= Config.soLuongHinhToiDa) {
			this.a = a;
			this.b = b;
		}else {
			System.out.println("Đạt số lượng hình học tối đa");
		}
	}
	
	
	
	
	
}
