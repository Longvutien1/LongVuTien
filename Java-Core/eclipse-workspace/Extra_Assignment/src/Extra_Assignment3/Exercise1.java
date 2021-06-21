package Extra_Assignment3;

import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		question4();
	}
	
	public static void question1() {
		Scanner sc = new Scanner(System.in);
		System.err.println("Bạn muốn nhập bn số: ");
		int n = sc.nextInt();
		System.out.println("Mời bạn nhập vào dãy số thực: ");
		float[] daySo = new float[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Số thứ "+i);
			daySo[i]  = sc.nextFloat();
			
		}
		System.out.print("Dãy số bạn vừa nhập là: ");
		for (float f : daySo) {
			System.out.print(f+"\t");
		}
		float tong = 0;
		for (float f : daySo) {
			tong+=f;
			
		}
		float tongAm = 0;
		System.err.println("\nTổng dãy số: "+tong);
		// tổng các số âm
		for (float f : daySo) {
			if (f < 0) {
				tongAm+=f;
			}
			
		}System.err.println("\nTổng dãy số âm: "+tongAm);
		
	}
		
//		 static int timX(int a[], int n, int x ) {
//			int num = 0;
//			for (int i = 0; i < n; i++) {
//				if (a[i] == x) {
//					System.out.println(i);
//					num = 1;
//				}
//				if (num == 0) {
//					return -1;
//				}
//			}
//		}

		//q2 
//		static void nhapMang(int A[] ,int n ) {
//			for (int i = 0; i < n; i++) {
//				System.out.println("Nhập a: "+A[i]);
//			}
//		}
//		
//		
//		static int timViTri(int A[], int n, int x) {
//			for (int i = 0; i < n; i++) {
//				if (A[i] == x) {
//					return i;
//				}
//				return 0;
//			}
//		}
//		
//		public static void question2() {
//			Scanner sc = new Scanner(System.in);
//			int  A[] = new [100];
//			System.err.println("Nhập n: ");
//			int n = sc.nextInt();
//			System.err.println("Nhập x: ");
//			int x = sc.nextInt();
//			nhapMang(A, n);
//			int temp = timViTri(A, n, x);
//			
//			if (temp) {
//				System.out.println("\n vi tri dau tien trong mang la :"+temp);
//			}
//		}
	
	
	//q3
		 
//		 public static void question3() {
//				Scanner sc = new Scanner(System.in);
//				System.err.println("Bạn muốn nhập bn số: ");
//				int n = sc.nextInt();
//				System.out.println("Mời bạn nhập vào dãy số thực: ");
//				int[] daySo = new int[n];
//				for (int i = 0; i < n; i++) {
//					System.out.println("Số thứ "+i);
//					daySo[i]  = sc.nextInt();
//					
//				}
//				System.out.print("Dãy số bạn vừa nhập là: \n");
//				for (int i = 0; i < daySo.length; i++) {
//					for (int j = 0; j < i; j++) {
//						if (j == 3  ) {
//							System.out.printf("\n");
//							
//						}
//					}
//					System.out.print(i+ "\t");
//				}
//}
	
	
	//q4
	public static void question4() {
			Scanner sc = new Scanner(System.in);
			System.err.println("Bạn muốn nhập bn số: ");
			int n = sc.nextInt();
			System.out.println("Mời bạn nhập vào dãy số thực: ");
			int[] daySo = new int[n];
			
			for (int i = 0; i < n; i++) {
				System.out.println("Số thứ "+i);
				daySo[i]  = sc.nextInt();
				
			}
			int dem;
			for (int i = 0; i < daySo.length; i++) {
				for (int j = 0; j < i; j++) {
					
					if (daySo[i] < daySo[j]) {
						
						dem = daySo[i];
						daySo[i] = daySo[j];
						daySo[j] = dem;
					}
				}
			}
			System.err.println("Dãy số sau khi sắp sếp");
			for (int i : daySo) {
				System.out.println(i);
			}
	}
	
	

	//q5 giống q4
	
	
	
	
	
	
	
	
	
	
	
	
}
