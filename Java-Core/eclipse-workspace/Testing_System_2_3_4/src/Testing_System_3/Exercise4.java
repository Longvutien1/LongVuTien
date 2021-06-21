package Testing_System_3;

import java.util.Scanner;

public class Exercise4 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		question6();
	}
	
	//q1
	static void question1() {
		Scanner sc = new Scanner(System.in);
	
		System.err.println("Mời bạn nhập kí tự bất kì: ");
		String nhap = sc.nextLine();
//		String[] kitu = nhap.split(" ");
//		int tong = kitu.length + nhap.length();
		System.out.println("Số kí tự: "+ nhap.length());
		
	}
	
	
	//q2
	static void question2() {
		Scanner sc = new Scanner(System.in);
		System.err.println("Mời nhập chuỗi kí tự chứ 1: ");
		String a1 = sc.nextLine();
		System.err.println("Mời nhập chuỗi kí tự chứ 2: ");
		String a2 = sc.nextLine();
		
		String tong = a1+ a2;
		
		System.out.println(tong);
	}
	
	//q3
		static void question3() {
			Scanner sc = new Scanner(System.in);
			System.err.println("Mời nhập vào tên: ");
			String ten = sc.nextLine();
			String firstCharacter = ten.substring(0, 1).toUpperCase();
			String leftTen = ten.substring(1);
			String name = firstCharacter + leftTen;
//			System.out.println("char at:"+ leftTen.charAt(1));
			
			System.out.println(name);

		}
		
		
		//q4
		static void question4() {
			Scanner sc = new Scanner(System.in);
			System.err.println("Nhập tên: ");
			String name = sc.nextLine();
			for (int i = 0; i < name.length(); i++) {
				System.err.println("Kí tự thứ "+i +" = "+ name.toUpperCase().charAt(i));
			}
		}
		
		//q5
		static void question5() {
			Scanner sc = new Scanner(System.in);
			System.err.println("Nhập họ: ");
			String firstName = sc.nextLine();
			System.out.println("Nhập tên: ");
			String lastName = sc.nextLine();
			System.out.println("Họ tên đầy đủ: " + firstName.concat(lastName));

		}
		
		//q6
		static void question6() {
			Scanner sc = new Scanner(System.in);
			System.err.println("Mời bạn nhập vào họ tên: ");
			String name = sc.nextLine();
			String firstName = "";
			String lastName = "";
			String midName = "";
			
			// tìm
			String[] dauCach = name.split(" ");
			firstName = dauCach[ dauCach.length - 1];
			lastName = dauCach[0];
			for (int i = 1; i <= dauCach.length - 2; i++) {
				midName += dauCach[i] + " ";
				
			}
			
			System.err.println("Họ là: "+ lastName);
			System.err.println("Tên là: "+firstName);
			System.err.println("Tên đệm là: : "+midName);
		}
		
		//q7
		static void question7() {
			Scanner sc = new Scanner(System.in);
			System.err.println("Mời bạn nhập vào họ tên: ");
			String name = sc.nextLine();

			// tìm
			name = name.trim();
			name = name.replaceAll("\\s+", " ");
			System.out.println("test "+ name);
			String[] words = name.split(" ");
			name = "";
			
			for (String x : words) {
				String firstCharacter = x.substring(0,1).toUpperCase();
				String leftCharacter = x.substring(1);
				x = firstCharacter + leftCharacter;
				name += x+ " ";
			}
			System.out.println("Họ tên: "+ name);
		}
	
		//q8
		static void question8() {
			String[] groups = {	"Java with tiến long", "Học java cơ bản", "Nhập môn Java"	};
			for (String x : groups) {
				if (x.contains("Java")) {
					System.out.println(x);
				}
			}
			
		}
	
		//q9
		static void question9() {
			String[] groups = {	"Java", "C#", "SQL"	};

				for (String x : groups) {
					if (x.equals("C#")) {
						System.out.println(x);
					}
				}
			
		}
		
		//q11
				static void question11() {
					Scanner sc = new Scanner(System.in);
					System.err.println("Mời bạn nhập vào 1 chuỗi: ");
					String name = sc.nextLine();
					sc.close();
						int dem = 0;
						for (int i = 0; i < name.length(); i++) {
							if (name.charAt(i) == 'a') {
								dem++;
							}
						}
					System.out.println(dem);
				}
				
			//q12
				static void question12() {
					Scanner sc = new Scanner(System.in);
					System.err.println("Mời bạn nhập vào 1 chuỗi: ");
					String name = sc.nextLine();
					
					String bienDem = "";
						int dem = 0;
						for (int i = name.length() - 1; i >= 0; i--) {
							bienDem+=name.charAt(i);
						}
					System.out.println(bienDem);
				}
				
			//q13
				
				static void question13() {
					Scanner sc = new Scanner(System.in);
					System.err.println("Mời bạn nhập vào 1 chuỗi: ");
					String name = sc.nextLine();
					
					for (int i = 0; i < name.length(); i++) {
						if ((checkNumber(name.charAt(i)) )){
							System.out.println("false");
							return;
						}
					}
					System.out.println("true");
				}
				
				static boolean checkNumber(int a) {
					if (a >='0' && a <= '9') {
						return true ;
					}
					return false;
				}
				
			//q14
				static void question14() {
					Scanner sc = new Scanner(System.in);
					System.err.println("Mời bạn nhập vào 1 chuỗi: ");
					String str = sc.nextLine();
					
					System.out.println("Nhập kí tự muốn chuyển: ");
					char kiTuMuonChuyen = sc.nextLine().toCharArray()[0];
					
					System.out.println("Nhập kí tự  chuyển: ");
					char kiTuChuyen = sc.nextLine().toCharArray()[0];
					sc.close();
					for (int i = 0; i < str.length(); i++) {
						if (str.charAt(i) == kiTuMuonChuyen) {
							str = str.replace(kiTuMuonChuyen, kiTuChuyen);
						}
					}
					System.out.println("Chuỗi sau khi chuyển: "+str);
				}
	
	
				//q15
				static void question15() {
					Scanner sc = new Scanner(System.in);
					System.err.println("Mời bạn nhập vào 1 chuỗi: ");
					String str = sc.nextLine();
					
					str = str.trim();
					str = str.replaceAll("\\s+", " ");
					System.out.println("Sau khi bỏ hết các dấu cách : "+str);
//					cắt chuỗi thành từng từ theo dấu cách
					String[] words = str.split(" ");
					
					
					for (int i = words.length - 1; i >= 0; i--) {
						System.out.print(words[i]+ " ");
					}
				}
				
			//q16
				static void question16() {
					Scanner sc = new Scanner(System.in);
					System.err.println("Mời bạn nhập vào 1 chuỗi: ");
					String str = sc.nextLine();
					
					System.err.println("Nhập n: ");
					int n = sc.nextInt();
					
					if (str.length() % n != 0   || str.isEmpty() ) {
						System.err.println("No");
						return ;
					}
					
					for (int i = 0; i < str.length(); i+=n) {
						System.out.println(str.substring(i,i+n));
					}
				}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
