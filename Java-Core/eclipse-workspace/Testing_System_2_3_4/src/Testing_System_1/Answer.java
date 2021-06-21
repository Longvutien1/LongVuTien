package Testing_System_1;

public class Answer {

	int answerID;
	String content;
	Question questionID;
	boolean isCorrect;
	
	
	//answerID
			public int getAnswerID() {
						return answerID;
			}
			public void setAnswerID(int answerID) {
				this.answerID = answerID;
			}
			
	//content
			public String getContent() {
						return content;
			}
			public void setContent(String content) {
				this.content = content;
			}	
			
	//questionID
			public Question getquestionID() {
						return questionID;
			}
			public void setContent(Question questionID) {
				this.questionID = questionID;
			}	
	//isCorrect
			public boolean getIsCorrect() {
						return isCorrect;
			}
			public void setIsCorrect(boolean isCorrect) {
				this.isCorrect = isCorrect;
			}	
			
}
