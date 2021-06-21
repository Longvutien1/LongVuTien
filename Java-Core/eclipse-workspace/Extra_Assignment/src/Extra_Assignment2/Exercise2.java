package Extra_Assignment2;

import java.util.Scanner;

public class Exercise2 {

	
	public static void main(String[] args) {
		question6();
		
//		q5
		Scanner sc = new Scanner(System.in);
		System.err.println("Mời bạn nhập vào số nguyên tố: ");
		int x = sc.nextInt();
		
			phanTichNguyenTo(x);
		
		
		
	}
	
	
	  static void question1() {
		  Scanner sc = new Scanner(System.in);
		 
		System.err.println("Mời bạn nhập vào số thực n: ");
		int n = sc.nextInt();
		float[] arr = new float [(int) n] ;
		for (int i = 0; i < n; i++) {
			System.err.println("Mời bạn nhâp vào số thứ "+ i + ": " );
			arr[i] = sc.nextFloat();
			
		}
//		in mảng
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Phần tử xuất hiện 1 lần là: ");
//		số phần tử xuất hiện 1 lần
		
		for (int i = 0; i < arr.length; i++) {
			int dem = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					dem++;
				}		
			}
			if (dem == 1) {
				System.out.println(arr[i]+ " ");
			}
			
		
		}
		
	}
	  
	  
	  static void question2() {
		  Scanner sc = new Scanner(System.in);
		  System.err.println("Mời bạn nhập vào số phần tử: ");
		  int x = sc.nextInt();
		  float[] arr = new float[(int) x];
		  for (int i = 0; i < x; i++) {
			System.out.println("Mời bạn nhập phần tử thứ "+i+": ");
			arr[i] = sc.nextFloat();
		}
		  
		  System.out.println("Phần tử xuất hiện 2 lần là: ");
		  for (int i = 0; i < arr.length; i++) {
			int dem = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					dem++;
				}
				
			}
			if (dem == 2) {
				System.err.println(arr[i]+" ");
			}
		}
		  
		  
	  }
	  
	  
	  static void question3() {
		  Scanner sc = new Scanner(System.in);
		  System.err.println("Mời bạn nhập vào số phần tử: ");
		  int x = sc.nextInt();
		  float[] arr = new float[(int) x];
		  for (int i = 0; i < x; i++) {
			System.out.println("Mời bạn nhập phần tử thứ "+i+": ");
			arr[i] = sc.nextFloat();
		}
		  
		  //tính số lần xuất hiện
		 
		  for (int i = 0; i < arr.length; i++) {
			  int dem = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {	
					dem++;
				}
			
			}			
				System.err.println("Phần tử "+arr[i]+ "số lần xuất hiện " + dem	);
			
		}
		
		  
	  }
	  
	  
	  static void question4() {
		  Scanner sc = new Scanner(System.in);
		  int sum = 0;
		  int dem;
		  System.err.println("Mời bạn nhập 1 số nguyên: ");
		  int n = sc.nextInt();
		  
		 while (n< 0) {
			 System.err.println("Nhỏ hơn 0 vui lòng nhập lại : ");
			  n = sc.nextInt();
		}
		 while ( n > 0) {
			dem = n % 10 ;
			sum+= dem ;
			n = n / 10 ;
			
		}
		 System.out.println("Tổng :" +sum);
	  }
	  
//	  q5
	
		  static  boolean checkNguyenTo(int a) {
//			  n < 2 k phải số nguyên tố	
		    	if (a < 2) {
					return false;
				}
//					khi a >= 2
					for (int i = 2; i < Math.sqrt(a); i++) {
						if (a % i == 0) {
							return false;
						}
					
				}
		    	
				return true;
			  
		  }
		    //phân tích số nguyên tố
		  static   void phanTichNguyenTo(int n) {
				System.err.print(n+ " = " );
				for (int i = 2; i <= n; i++) {
					while (checkNguyenTo(i) && n % i==0) {
						System.err.print(" "+i+ "*");
						n/=i;
						
					}
					
				}
			  }
	  
	    //q6
		  
	    public static void question6() {
	    	Scanner sc = new Scanner(System.in);
	    	System.err.println("Mời bạn nhập vào 1 số: ");
	    	int n = sc.nextInt();
	    	if (n < 2) {
				System.err.println("Không phải số nguyên tố");
			}
	    	for (int i = 3; i < n; i+=2) {
				if (checkNguyenTo(i)) {
					System.err.println(" "+i);
				}
			}
	    }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
