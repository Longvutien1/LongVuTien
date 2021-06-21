package entity;

public class HinhChuNhat extends HinhHoc{

	public HinhChuNhat(float a, float b) throws Exception {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float chuVi(float a, float b) {
		// TODO Auto-generated method stub
		return (a + b / 2);
	}

	@Override
	public float dienTich(float a, float b) {
		// TODO Auto-generated method stub
		return (a * b);
	}

	

	
}
