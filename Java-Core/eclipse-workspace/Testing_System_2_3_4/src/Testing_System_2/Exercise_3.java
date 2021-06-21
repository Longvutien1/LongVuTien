package Testing_System_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Exercise_3 {

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
					account1.fullName = "VÅ© Tiáº¿n Long";
					account1.departments = demartment1;
					account1.positions = position1;
					account1.createDate = LocalDate.of(2021, 6, 12);
			
					Account account2 = new Account();
					account2.accountID = 2;
					account2.email = "hoangvt@vti.edu.vn";
					account2.userName = "hoangvt";
					account2.fullName = "VÅ© Trá»?ng HoÃ ng";
					account2.departments = department2;
					account2.positions = position2;
					account2.createDate = LocalDate.of(2021, 4, 2);
			
					Account account3 = new Account();
					account3.accountID = 3;
					account3.email = "tiennp@vti.edu.vn";
					account3.userName = "tiennp";
					account3.fullName = "Nguyá»…n Phong Tiáº¿n";
					account3.departments = department3;
					account3.positions = position2;
					account3.createDate = LocalDate.of(2021, 1, 2);

				// create group
					Group group1 = new Group();
					group1.groupID = 1;
					group1.groupName = "NhÃ³m 1";
					group1.createDate = LocalDate.of(2021, 11, 12);
					group1.CreatorID = account1;
			
					Group group2 = new Group();
					group2.groupID = 2;
					group2.groupName = "NhÃ³m 2";
					group2.createDate = LocalDate.of(2021, 1, 1);
					group2.CreatorID = account2;
			
					Group group3 = new Group();
					group3.groupID = 3;
					group3.groupName = "NhÃ³m 3";
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
					question1.content = "CÃ¢u há»?i vá»? PHP";
					question1.categoryID = categoryQuestion1;
					question1.typeID = typeQuestion1;
					question1.creatorID = account1;
					question1.createDate = new Date();


					Question question2 = new Question();
					question2.questionID = 2;
					question2.content = "CÃ¢u há»?i vá»? Java";
					question2.categoryID = categoryQuestion2;
					question2.typeID = typeQuestion2;
					question2.creatorID = account2;
					question2.createDate = new Date();

					
					Question question3 = new Question();
					question3.questionID = 3;
					question3.content = "CÃ¢u há»?i vá»? C#";
					question3.categoryID = categoryQuestion3;
					question3.typeID = typeQuestion3;
					question3.creatorID = account3;
					question3.createDate = new Date();

				
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
					exam1.title = "Ä?á»? thi THPT Quá»‘c gia 2018";	
					exam1.duration = 90;
					exam1.createID = account1;
					exam1.categoryID = categoryQuestion1;
					exam1.createDate = new Date();
					
					Exam exam2 = new Exam();
					exam2.examID = 2;
					exam2.code = 2;
					exam2.title = "Ä?á»? thi THPT Quá»‘c gia 2019";	
					exam2.duration = 90;
					exam2.createID = account2;
					exam2.categoryID = categoryQuestion2;
					exam2.createDate = new Date();
				
					Exam exam3 = new Exam();
					exam3.examID = 3;
					exam3.code = 3;
					exam3.title = "Ä?á»? thi THPT Quá»‘c gia 2020";	
					exam3.duration = 90;
					exam3.createID = account1;
					exam3.categoryID = categoryQuestion3;
					exam3.createDate = new Date();
					
					
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
					
					
					
				
				//question 1
	
					Locale local = new Locale("vi","VN");
					DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT,local);
					String date = dateformat.format(exam2.createDate);
					
					System.err.println( date);
					
				//question 2	
						
					String pattern = "dd-MM-yyyy:HH-mm-ss";
					SimpleDateFormat dateFormate = new SimpleDateFormat(pattern);
					
					Exam[] exams = {exam1, exam2, exam3};
					for (Exam x : exams) {
						String date1 = dateFormate.format(exam1.createDate);
						System.err.println(date1);
					}
					
				//question 3
					Question[] questions = {question1, question2, question3}; 
					 String pattern2 = "yyyy";
					 SimpleDateFormat simpleDate = new SimpleDateFormat(pattern2);
					 for (Question x : questions) {
						String date2 = simpleDate.format(x.createDate);
						System.err.println(date2);
					}
					
				// question 4
					 String pattern3 = "MM-yyyy";
					 SimpleDateFormat simpleDate2 = new SimpleDateFormat(pattern3);
					 for (Question x : questions) {
						if (x.questionID == 2) {
							String date3 = simpleDate2.format(x.createDate);
							System.err.println(date3);
						}
					}
					 
				//question 5
					 String parttern4 = "MM-dd";
					 SimpleDateFormat simpleDate3 = new SimpleDateFormat(parttern4);
					 for (Question x : questions) {
						if (x.questionID == 2) {
							String date3 = simpleDate3.format(x.createDate);
							System.err.println(date3);
						}
					}
				
					 
				//
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
	}
				
					
}
