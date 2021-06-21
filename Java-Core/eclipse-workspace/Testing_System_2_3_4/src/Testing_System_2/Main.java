package Testing_System_2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {

		// create department
			Department demartment1 = new Department();
			demartment1.departmentID = 1;
			demartment1.departmentName = "Sale";
	
			Department department2 = new Department();
			department2.departmentID = 2;
			department2.departmentName = "Marketing";
	
			Department department3 = new Department();
			department3.departmentID = 3;
			department3.departmentName = "Tester";
	
			// create position
			Position position1 = new Position();
			position1.positionID = 1;
			position1.positionName = "Dev";
	
			Position position2 = new Position();
			position2.positionID = 2;
			position2.positionName = "Master";
	
			Position position3 = new Position();
			position3.positionID = 3;
			position3.positionName = "PM";

		// create account
			Account account1 = new Account();
			account1.accountID = 1;
			account1.email = "longvt@fpt.edu.vn";
			account1.userName = "longvt";
			account1.fullName = "Vũ Tiến Long";
			account1.departments = demartment1;
			account1.positions = position1;
			account1.createDate = LocalDate.of(2021, 6, 12);
	
			Account account2 = new Account();
			account2.accountID = 2;
			account2.email = "hoangvt@vti.edu.vn";
			account2.userName = "hoangvt";
			account2.fullName = "Vũ Tr�?ng Hoàng";
			account2.departments = department2;
			account2.positions = position2;
			account2.createDate = LocalDate.of(2021, 4, 2);
	
			Account account3 = new Account();
			account3.accountID = 3;
			account3.email = "tiennp@vti.edu.vn";
			account3.userName = "tiennp";
			account3.fullName = "Nguyễn Phong Tiến";
			account3.departments = department3;
			account3.positions = position2;
			account3.createDate = LocalDate.of(2021, 1, 2);

		// create group
			Group group1 = new Group();
			group1.groupID = 1;
			group1.groupName = "Nhóm 1";
			group1.createDate = LocalDate.of(2021, 11, 12);
			group1.CreatorID = account1;
	
			Group group2 = new Group();
			group2.groupID = 2;
			group2.groupName = "Nhóm 2";
			group2.createDate = LocalDate.of(2021, 1, 1);
			group2.CreatorID = account2;
	
			Group group3 = new Group();
			group3.groupID = 3;
			group3.groupName = "Nhóm 3";
			group3.createDate = LocalDate.of(2021, 2, 3);
			group3.CreatorID = account3;

		// 1 group co nhieu account

			Account[] accountOfGroup1 = { account1  };
			group1.accounts = accountOfGroup1;
	
			Account[] accountOfGroup2 = { account2, account3 ,account1};
			group2.accounts = accountOfGroup2;
	
			Account[] accountOfGroup3 = { account1, account3 };
			group3.accounts = accountOfGroup3;

		// 1 account co nhieu group
			Group[] groupAccount1 = { group1, group2 };
			account1.groups = groupAccount1;
	
			Group[] groupAccount2 = {group1,group3 , group2};
			account2.groups = groupAccount2;
	
			Group[] groupAccount3 = {group2, group3};
			account3.groups = groupAccount3;
		
		
		// create typeQuestion
			TypeQuestion typeQuestion1 = new TypeQuestion();
			typeQuestion1.typeID = 1;
			typeQuestion1.typeName = TypeName.Essay;
			
			TypeQuestion typeQuestion2 = new TypeQuestion();
			typeQuestion2.typeID = 1;
			typeQuestion2.typeName = TypeName.Multiple_Choice;
			
			TypeQuestion typeQuestion3 = new TypeQuestion();
			typeQuestion3.typeID = 3;
			typeQuestion3.typeName = TypeName.Essay;
		
		
		// create category question
			CategoryQuestion categoryQuestion1 = new CategoryQuestion();
			categoryQuestion1.categoryID = 1;
			categoryQuestion1.categoryName = CategoryName.Java;
			
			CategoryQuestion categoryQuestion2 = new CategoryQuestion();
			categoryQuestion2.categoryID = 2;
			categoryQuestion2.categoryName = CategoryName.NET;
			
			CategoryQuestion categoryQuestion3 = new CategoryQuestion();
			categoryQuestion3.categoryID = 3;
			categoryQuestion3.categoryName = CategoryName.Postman;
			
			
		// create question
			Question question1 = new Question();
			question1.questionID = 1;
			question1.content = "Câu h�?i v�? PHP";
			question1.categoryID = categoryQuestion1;
			question1.typeID = typeQuestion1;
			question1.creatorID = account1;
			question1.createDate = new Date(2020, 1, 7);


			Question question2 = new Question();
			question2.questionID = 2;
			question2.content = "Câu h�?i v�? Java";
			question2.categoryID = categoryQuestion2;
			question2.typeID = typeQuestion2;
			question2.creatorID = account2;
			question2.createDate = new Date(2020, 1, 2);

			
			Question question3 = new Question();
			question3.questionID = 3;
			question3.content = "Câu h�?i v�? C#";
			question3.categoryID = categoryQuestion3;
			question3.typeID = typeQuestion3;
			question3.creatorID = account3;
			question3.createDate = new Date(2020, 3, 7);

		
		// create answer
			Answer answer1 = new Answer();
			answer1.answerID  = 1;
			answer1.content = "A";
			answer1.questionID = question1;
			answer1.isCorrect = true;
			
			Answer answer2 = new Answer();
			answer2.answerID  = 2;
			answer2.content = "B";
			answer2.questionID = question2;
			answer2.isCorrect = true;
			
			Answer answer3 = new Answer();
			answer3.answerID  = 3;
			answer3.content = "C";
			answer3.questionID = question3;
			answer3.isCorrect = false;
		
			
		// create Exam
			Exam exam1 = new Exam();
			exam1.examID = 1;
			exam1.code = 1;
			exam1.title = "�?�? thi THPT Quốc gia 2018";	
			exam1.duration = 90;
			exam1.createID = account1;
			exam1.categoryID = categoryQuestion1;
			exam1.createDate = new Date(2021, 3, 7);
			
			Exam exam2 = new Exam();
			exam2.examID = 2;
			exam2.code = 2;
			exam2.title = "�?�? thi THPT Quốc gia 2019";	
			exam2.duration = 90;
			exam2.createID = account2;
			exam2.categoryID = categoryQuestion2;
			exam2.createDate = new Date(2020, 3, 11);
		
			Exam exam3 = new Exam();
			exam3.examID = 3;
			exam3.code = 3;
			exam3.title = "�?�? thi THPT Quốc gia 2020";	
			exam3.duration = 90;
			exam3.createID = account1;
			exam3.categoryID = categoryQuestion3;
			exam3.createDate = new Date(2020, 3, 11);
			
			
			Exam[] examQuestion1 = {exam1,exam2,exam3};
			question1.exams = examQuestion1;
			
			Exam[] examQuestion2 = {exam2,exam3};
			question1.exams = examQuestion2;
			
			Exam[] examQuestion3 = {exam1,exam2};
			question1.exams = examQuestion3;
			
			
			Question[] questionExam1 = {question1, question2};
			exam1.questions = questionExam1;
			
			Question[] questionExam2 = {question2, question3};
			exam1.questions = questionExam2;
			
			Question[] questionExam3 = {question1, question3};
			exam1.questions = questionExam3;
			
			
			
			// testting_system_2
			
	// if else and ternary	
			// câu1
			if (account2.departments == null) {
				System.err.println("Nhân viên này chưa có phòng ban");
			} else {
				System.err.println("Phong ban của nhân viên này là: "+account2.departments.departmentName);
			}
				
			// câu2
				
			if (account2.groups.length == 0) {
				System.err.println("Nhân viên này chưa có group");
			} else if (account2.groups.length <= 2) {
				System.err.println("Group của nhân viên này là Java Fresher, C# Fresher");
			}
			 else if (  account2.groups.length == 3 ) {
					System.err.println("Nhân viên này quan tr�?ng ");
				}			
			 else  {
					System.err.println("Nhân viên này là ngư�?i hóng chuyện ");
				}
			
			// câu3
			System.err.println(account2.departments == null ? "Nhân viên này chưa có phòng ban " : "Phòng ban của nhân viên này là : "+ account1.departments.departmentName);
			
			// câu 4
			System.err.println(account1.positions.positionName == "Dev" ? "�?ây là Developer" : "�?ây không phải Developer");
			
			
	// swith case
			
			
			// câu 5
			int x = group2.accounts.length;
			switch (x) {
			case 1:
					System.err.println("Nhóm có 1 thành viên");
				break;
			case 2:
				System.err.println("Nhóm có 2 thành viên");
			break;
			case 3:
				System.err.println("Nhóm có 3 thành viên");
			break;
			
			default:
				System.err.println("Nhóm có nhi�?u thành viên");
				break;
			}
			
			// câu 6
			
			int y = account2.groups.length;
			switch (y) {
			case 0:
				System.err.println("Nhân viên này chưa có group");
				break;
			case 1:
				System.err.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 2:
				System.err.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.err.println("Nhân viên này là ngư�?i quan tr�?ng");
				break;
			case 4:
				System.err.println("Nhân viên này là ngư�?i hóng chuyện ");
				break;
			default:
				break;
			}
			
			// câu 7 
			String name = account2.positions.positionName;
			switch (name) {
			case "Dev":
					System.err.println("�?ây là Deverloper");
				break;

			default:
				System.err.println("�?ây không phải Deverloper");
				break;
			}
			
		// foreach
			// câu8
			for (Account b : accountOfGroup3) {
				System.err.println("\nEmail:"+ b.email);
				System.err.println(("FullName: "+ b.fullName));
				System.err.println("Tên phòng ban: "+ b.departments.departmentName );
			}
			
			
			// câu9
			Department[] department = {demartment1, department2, department3};
			for (Department c : department) {
				System.err.println("\nID: "+c.departmentID);
				System.err.println("ID: "+c.departmentName);
			}
			
		// for
			
			//câu10
			
			for (int i = 0; i< accountOfGroup2.length ; i++) {
				System.err.println("\nThông tin account thứ "+i+ " là: ");
				System.err.println("Email:"+ accountOfGroup2[i].email);
				System.err.println("FullName: "+ accountOfGroup2[i].fullName);
				System.err.println("Tên phòng ban: "+ accountOfGroup2[i].departments.departmentName );
				
			}
			
			//câu11
			for (int i = 0; i < department.length; i++) {
				System.err.println("\nID: "+department[i].departmentID);
				System.err.println("ID: "+department[i].departmentName);
			}
			
			// câu12
			for (int i = 0; i < department.length; i++) {
				if (i < 2) {
					System.err.println("\nID: "+department[i].departmentID);
					System.err.println("ID: "+department[i].departmentName);
				}
			}
			
			//câu13
			Account[] cau13 = {account1, account2, account3};
			for (int i = 0; i < cau13.length; i++) {
				if (i != 1) {
					System.err.println("\nThông tin account thứ "+(i+1)+ " là: ");
					System.err.println("Email:"+ cau13[i].email);
					System.err.println("FullName: "+ cau13[i].fullName);
					System.err.println("Tên phòng ban: "+ cau13[i].departments.departmentName );
				
				}			
			}
			
			
			//câu14
			for (int i = 0; i < cau13.length; i++) {
				
				if (cau13[i].accountID < 4) {
					System.err.println("\nThông tin account thứ "+(i+1)+ " là: ");
					System.err.println("Email:"+ cau13[i].email);
					System.err.println("FullName: "+ cau13[i].fullName);
					System.err.println("Tên phòng ban: "+ cau13[i].departments.departmentName );
				}
			}
			
			//câu 15
			System.err.printf("Số chẵn nh�? hơn 20: ");
			for (int i = 0; i <= 20; i++) {
				
				if (i % 2 ==0) {
					System.err.print(" "+ i);
				}
			}
			
		//while	
			
			//câu16
			int c16 =0;
			while (c16 < accountOfGroup2.length) {
				System.err.println("\nThông tin account thứ "+(c16+1)+ " là: ");
				System.err.println("Email:"+ accountOfGroup2[c16].email);
				System.err.println("FullName: "+ accountOfGroup2[c16].fullName);
				System.err.println("Tên phòng ban: "+ accountOfGroup2[c16].departments.departmentName );
				c16++;
			}
			
			//c16.2
			int c16_2 = 0;
			while ( c16_2 < 2) {
				System.err.println("\nID: "+department[c16_2].departmentID);
				System.err.println("ID: "+department[c16_2].departmentName);
				
				c16_2++;
			}
			
			//cau16.3
			int c16_3 = 0;
			while (c16_3 < department.length) {
				if (c16_3 == 1) {
					c16_3++;
					continue;
				}
				System.err.println("\nID: "+department[c16_3].departmentID);
				System.err.println("ID: "+department[c16_3].departmentName);
				
				c16_3++;
			}
			
			//cau16.4
			int c16_4 = 0;
			System.err.println("Số chẵn nh�? hơn 20: ");
			while ( c16_4 < 20 ) {
				if ( c16_4 % 2 ==0 ) {
					System.err.print(c16_4+ " ");
				}
				
				c16_4++;
			}
			
			
		//do-while
			//cau17.1
			int c17_1 = 0;
			do {
				System.err.println("\nThông tin account thứ "+(c17_1+1)+ " là: ");
				System.err.println("Email:"+ accountOfGroup2[c17_1].email);
				System.err.println("FullName: "+ accountOfGroup2[c17_1].fullName);
				System.err.println("Tên phòng ban: "+ accountOfGroup2[c17_1].departments.departmentName );
				c17_1++;
			} while (c17_1 < accountOfGroup2.length);
			
			//cau17.2
			int c17_2 = 0;
			do {
				System.err.println("\nID: "+department[c17_2].departmentID);
				System.err.println("ID: "+department[c17_2].departmentName);
				c17_2 ++;
				
			} while (c17_2 < 2);
			
			//cau17.3
			int c17_3 = 0;
			do {
				if (c17_3 == 1) {
					c17_3++;
					continue;
				}
				System.err.println("\nID: "+department[c17_3].departmentID);
				System.err.println("ID: "+department[c17_3].departmentName);
				c17_3 ++;
				
			} while (c17_3 < department.length);
			
			
			
		
			
			
			
			
			
			
			
			
			
			
		
	}
}
