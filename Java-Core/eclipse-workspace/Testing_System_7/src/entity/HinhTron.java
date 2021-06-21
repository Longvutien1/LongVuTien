package entity;

public class HinhTron  extends HinhHoc{

	
	public HinhTron(float a, float b) throws Exception {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public  float chuVi(float a, float b) {
		// TODO Auto-generated method stub
		return 2 * a *(Config.PI);
	}

	@Override
	public float dienTich(float a, float b) {
		// TODO Auto-generated method stub
		return (float) (Config.PI * (Math.pow(a, 2)));
	}
	
	
}
