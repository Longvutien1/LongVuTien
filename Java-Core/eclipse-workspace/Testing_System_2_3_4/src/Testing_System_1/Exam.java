package Testing_System_1;

import java.time.LocalDate;
import java.util.Date;

public class Exam {

	int examID;
	int code;
	String title;
	CategoryQuestion categoryID;
	int duration ;   	// thá»�i gian thi
	Account createID;
	LocalDate createDate;    //ngÃ y táº¡o Ä‘á»� 
	Question[] questions;
	
		//exam
		public int getExamID() {
			return examID;
		}
		
		public void setIntID(int examID) {
			this.examID = examID;
		}
		//code
				public int getCode() {
					return code;
				}
				
				public void setCode(int code) {
					this.code = code;
				}
				
		//title
				public String getTitle() {
					return title;
				}
				
				public void setTitle(String title) {
					this.title = title;
				}
				
		//getCategoryID
				public CategoryQuestion getCategoryID() {
					return categoryID;
				}
				
				public void setCategoryID(CategoryQuestion categoryID) {
					this.categoryID = categoryID;
				}		
	
		//duration
				public int getDuration() {
					return duration;
				}
				
				public void setDuration(int duration) {
					this.duration = duration;
				}		
				
		//createID
				public Account getCreateID() {
					return createID;
				}
				
				public void setCreateID(Account createID) {
					this.createID = createID;
				}	
		//createID
				public LocalDate getCreateDate() {
					return createDate;
				}
				
				public void setCreateDate(LocalDate createDate) {
					this.createDate = createDate;
				}	
				
		//questions
				public Question[] getQuestions() {
					return questions;
				}
				
				public void setQuestions(Question[] questions) {
					this.questions = questions;
				}	
				
}
