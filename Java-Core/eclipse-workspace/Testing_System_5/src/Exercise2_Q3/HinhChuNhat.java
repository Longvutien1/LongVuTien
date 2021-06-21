package Exercise2_Q3;

public class HinhChuNhat {

	private float chieuDai;
	private float chieuRong;

	
	public HinhChuNhat(float chieuDai, float chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public float chuVi(){
		return (chieuDai + chieuRong) *2;
	}
	
	public float dienTich(){
		return chieuDai * chieuRong;
	}
	
}
