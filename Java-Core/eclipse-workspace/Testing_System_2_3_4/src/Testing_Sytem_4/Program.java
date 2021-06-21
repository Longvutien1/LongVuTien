package Testing_Sytem_4;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
	question3();
	}
	
	
	//q1
			static void question1() {
				Department department = new Department();
				department.departmentID = 1;
				department.departmentName = "Dev";
				
				Department department2 = new Department("Sales");
				
				
				System.out.println(department.departmentID+ " "+ department.departmentName);
				System.out.println(department2.departmentID+ " "+ department2.departmentName);
			}
	
	//q2
			
			
			static void question2() {
				Position position = new Position();
				position.positionID = 1;
				position.positionName = " Nhóm 2";
				Account acc = new Account(1, "longvt@fpt", "longvt", "long", "vũ", position);
				
				
				
				System.out.println(acc.position.positionName+ " "+acc.createDate+" "+ acc.fullName);
			}
			
	//q3		
			static void question3() {
				Account acc = new Account();
				acc.user = "longvt";
				Account[] acc2 = {acc};
				Group group = new Group(1, "Nhóm 1", acc, LocalDate.now(),acc2 );
				
				System.err.println(group.createDate.toString());
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
