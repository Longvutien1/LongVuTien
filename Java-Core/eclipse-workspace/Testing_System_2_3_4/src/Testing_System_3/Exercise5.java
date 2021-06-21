package Testing_System_3;

import java.util.Comparator;

public class Exercise5 implements Comparator<Exercise5>{
	
		int id;
		String name;
		
		@Override
		public String toString() {
		return "Exercise{" + "id=" + id + ", name='" + name + '\'' + '}';
		}
	
		@Override
		public boolean equals(Object x) {
		if (this == x) {
		return true;
		}
		Exercise5 ex = (Exercise5) x;
		if (name.equals(ex.name)) {
		return true;
		}
		return false;
		}
		
		
		@Override
		public int compare(Exercise5 o1, Exercise5 o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}
		

		
		public static void main(String[] args) {
			Exercise5[] exercises = new Exercise5[5];
			
			Exercise5 exercises1 = new Exercise5();
			exercises1.id = 1;
			exercises1.name = "Long";
			
			Exercise5 exercises2 = new Exercise5();
			exercises2.id = 2;
			exercises2.name = "Long";
			
			Exercise5 exercises3 = new Exercise5();
			exercises3.id = 3;
			exercises3.name = "Hoa";
			
			Exercise5 exercises4 = new Exercise5();
			exercises4.id = 4;
			exercises4.name = "Long";
			
			Exercise5 exercises5 = new Exercise5();
			exercises5.id = 5;
			exercises5.name = "Hải";
			
			exercises[0] = exercises1;
			exercises[1] = exercises2;
			exercises[2] = exercises3;
			exercises[3] = exercises4;
			exercises[4] = exercises5;
			
			question1(exercises[1]);
			question2(exercises);
			question3(exercises5);
			question4(exercises5);
			question5(exercises1, exercises5);
			question6(exercises);
		}
		
		
		
		//----------------------------question--------------------
		
	
	public static void question1(Exercise5 ex) {
	
			
			System.out.println(ex.toString());
			}
			
		
		//q2
	
			public static void question2(Exercise5[] exs) {
					for (Exercise5 x : exs) {
						System.out.println(x);
					}
			}
		//q3
			
			public static void question3(Exercise5 ex) {
				System.out.println(ex.hashCode());
			}
			
			
		//q4
			public static void question4(Exercise5 ex) {
				if (ex.name.equals("Long")) {
					System.err.println("Yes");
				}else {
					System.out.println("No");
				}
			}
			
		//q5
			public static void question5(Exercise5 ex1 , Exercise5 ex2) {
				if (ex1.equals(ex2)) {
					System.err.println("Yes");
				}else {
					System.out.println("No");
				}
			}
			
		//q6
			public static void question6(Exercise5[] ex) {
				Exercise5 temp;
				for (int i = 0; i < ex.length; i++) {
					for (int j = 0; j < ex.length; j++) {
						
						if (ex[i].name.compareToIgnoreCase(ex[j].name) < 0 ) {
							
							 temp = ex[i];
							ex[i] = ex[j];
							ex[j] = temp;
							
						}
					}
				}
				for (Exercise5 x : ex) {
					System.out.println(x);
				}
				
			}
			
		
}	
		
		
		
		
		
		
		
		
		
		
		
		




		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		