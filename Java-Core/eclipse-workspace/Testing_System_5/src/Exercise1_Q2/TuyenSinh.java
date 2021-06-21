package Exercise1_Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{
	public Scanner sc =new Scanner(System.in);
	public ArrayList<ThongTinThiSinh> arr = new ArrayList<ThongTinThiSinh>();
	
	
	
	
	@Override
	public void themMoiThiSinh() {
		System.out.println("Nhập vào tên thí sinh:");
		String name = sc.nextLine();
		System.out.println("Nhập vào địa chỉ thí sinh:");
		String address = sc.nextLine();
		System.out.println("Nhập vào mức ưu tiên thí sinh:");
		int priority = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập vào khối thí sinh chọn các khối A, B, C :");
		String block = sc.nextLine();
		
		ThongTinThiSinh thongTin = new ThongTinThiSinh(name, address, priority, new Block(block)); //add block mới vào block
		arr.add(thongTin);
		
	}
// b hiển thị thông tin 
	@Override
	public void showThiSinh() {
		for (ThongTinThiSinh thongTinThiSinh : arr) {
			System.out.println(thongTinThiSinh);
		}
		
	}
// tìm kiếm theo số báo danh
	@Override
	public void timTheoSoBaoDanh(int id) {
		for (ThongTinThiSinh thongTinThiSinh : arr) {
			if (thongTinThiSinh.getId() == id ) {
				System.out.println(thongTinThiSinh);
			}
		}
		
	}

	
	
	
	
}
