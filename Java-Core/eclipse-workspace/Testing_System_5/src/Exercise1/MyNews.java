package Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {

	public Scanner sc = new Scanner(System.in);
	public ArrayList<News> arr = new ArrayList<News>();
	
	public void question1() {
		menu();
	}
	
	private void menu() {
		while (true) {
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("|1. Insert news.                                                     |");
			System.out.println("|2. View list news.                                                  |");
			System.out.println("|3. Average rate		                                             |");
			System.out.println("|4. Thoát khỏi chương trình.                                         |");
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("+---------------=Lựa chọn chức năng bạn muốn sử dụng-----------------+");
			int chon = sc.nextInt();
			switch (chon) {
			case 1:
				sc.nextLine();
				System.out.println("Nhập vào Title");
				String title = sc.nextLine();
				System.out.println("Nhập vào PublishDate");
				String publishDate = sc.nextLine();
				System.out.println("Nhập vào Author");
				String author = sc.nextLine();
				System.out.println("Nhập vào Content");
				String content = sc.nextLine();
				System.out.println("Nhập vào đánh giá 1");
				int rate1 = sc.nextInt();
				System.out.println("Nhập vào đánh giá 2");
				int rate2 = sc.nextInt();
				System.out.println("Nhập vào đánh giá 3");
				int rate3 = sc.nextInt();
//				thêm 3 đánh giá vào 1 mảng
				int[] rates = {rate1 , rate2 ,rate3};
//				khởi tạo đối tượng new mới r gán gtri 
				News news = new News(title, publishDate, author, content, rates);
//				gán đối tượng new mới cho list
				arr.add(news);
				break;
				
			case 2:
				for (News x : arr) {
					x.display();
				}
				break;
			case 3:
				System.out.println("Đánh giá trung bình Rate");
				
				for (News x : arr) {
					System.out.println("Title: "+ x.getTitle() + "Average rate: "+ x.calculate());
				}
				break;
			case 4:
				return;
				
			default:
				break;
			}
	}
		
}

}