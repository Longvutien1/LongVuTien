package FileManager;

import entity.KiemTraKiTuNhapVao;

public class Backend_Ex3 {

	public static void menu() throws Exception {
		while (true) {
			System.out.println("+----------------------------Menu-------------------------------+");
			System.out.println("|1.Check file exists                                            |");
			System.out.println("|2. Check Folder                                                |");
			System.out.println("|3.Tạo file mới                                                 |");
			System.out.println("|4. Tạo mới file từ đường dẫn và tên file riêng                 |");
			System.out.println("|5. Xóa file                                            	    |");
			System.out.println("|6. Check path is File or Folder                                |");
			System.out.println("|7. Get all file in Folder                                  	|");
			System.out.println("|8. Copy File                                                   |");
			System.out.println("|9. Move File                                                 	|");
			System.out.println("|10. Rename File                                                |");
			System.out.println("|11. Tạo Folder                                                 |");
			System.out.println("|12. Download File                                              |");
			System.out.println("|0.Thoát				                                        |");
			System.out.println("+---------------------------------------------------------------+");
			System.out.println("Mời bạn chọn chức năng: ");
			int chon = KiemTraKiTuNhapVao.inputInt();
			switch (chon) {
			case 1:
				question1();
				break;
			case 2:
				question2();
				break;
			case 3:
				question3();
				break;
			case 4:
				question4();
				break;
			case 5:
				question5();
				break;
			case 6:
				question6();
				break;
			case 7:
				question7();
				break;
			case 8:
				question8();
				break;
			case 9:
				question9();
				break;
			case 10:
				question10();
				break;
			case 11:
				question11();
				break;
			case 12:
				question12();
				break;
			case 0:
				return;

			default:
				break;
			}
		}
	}
	
	
	static void question1() {
		System.out.println("Nhập vào flie cần ktra: ");
		String file = KiemTraKiTuNhapVao.inputString();
		if (FileUltis.isFileExists(file)) {
			System.out.println("Tồn tại");
		}else {
			System.out.println("Không tồn tại");
		}
	}
	
	
	static void question2() {
		System.out.println("Nhập vào Folder cần kiểm tra: ");
		String path2 = KiemTraKiTuNhapVao.inputString();
		if (FileUltis.isFolderExists(path2)) {
		System.out.println("Có Folder trên hệ thống");
		} else {System.out.println("Không có Folder trên hệ thống");
		}
	}
	
	static void question3() throws Exception {
		System.out.println("Nhập vào đường dẫn và tên file cần tạo: ");
		String path3 = KiemTraKiTuNhapVao.inputString();
		FileUltis.createNewFile(path3);
	}
	
	static void question4() throws Exception {
		System.out.println("Nhập vào đường dẫn: ");
		String path4 = KiemTraKiTuNhapVao.inputString();
		System.out.println("Nhập vào tên file cần tạo: ");
		String fileName4 = KiemTraKiTuNhapVao.inputString();
		FileUltis.createNewFile(path4, fileName4);
	}
	
	static void question5() throws Exception {
		System.out.println("Nhập vào đường dẫn và tên file cần xóa: ");
		String path5 = KiemTraKiTuNhapVao.inputString();
		FileUltis.deleteFile(path5);

	}
	
	static void question6() {
		System.out.println("Nhập vào Path cần kiểm tra ");
		String path6 = KiemTraKiTuNhapVao.inputString();
		FileUltis.isFolderOrFile(path6);

	}
	
	static void question7() {
		System.out.println("Nhập vào Path cần kiểm tra ");
		String path7 = KiemTraKiTuNhapVao.inputString();
		String[] list = FileUltis.getAllFileName(path7);
		for (int i = 0; i < list.length; i++) {
		System.out.println(list[i]);
		}

	}
	
	static void question8() throws Exception {
		System.out.println("Nhập vào source nguồn: ");
		String source8 = KiemTraKiTuNhapVao.inputString();
		System.out.println("Nhập vào Folder đích: ");
		String path8 = KiemTraKiTuNhapVao.inputString();
		FileUltis.copyFile(source8, path8);


	}
	
	static void question9() {


	}
	
	static void question10() throws Exception {
		System.out.println("-- Chú ý nhập vào đầy đủ cả đường dẫn và tên file.");
				System.out.println("Nhập vào file nguồn: ");
				String source10 = KiemTraKiTuNhapVao.inputString();
				System.out.println("Nhập vào file đích: ");
				String des10 = KiemTraKiTuNhapVao.inputString();
				FileUltis.renameFile(source10, des10);
	}
	
	static void question11() throws Exception {
		System.out.println("Nhập vào đường dẫn folder cần tạo: ");
		String newPathFolder = KiemTraKiTuNhapVao.inputString();
		FileUltis.createNewFolder(newPathFolder);
	}
	
	static void question12() {
		System.out.println("No Data");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
