package Testing_System_1;

import java.time.LocalDate;

public class Account {
	int accountID;
	String email;
	String userName;
	String fullName;	
	LocalDate createDate;
	Department  departments;
	Position positions;
	Group[] groups;
	
	
		//getter and setter
		public int getID() {
			return accountID;
		}
		public void setID(int accountID) {
			this.accountID = accountID;
		}
		//email
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		//user
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		//fullname
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		//createDate
		public LocalDate getCreateDate() {
			return createDate;
		}
		public void setCreateDate(LocalDate createDate) {
			this.createDate = createDate;
		}
		
		//department
		public Department getDepartments() {
					return departments;
		}
		public void setDepartments(Department departments) {
			this.departments = departments;
		}
	
		//Position
		public Position getPosition() {
					return positions;
		}
		public void setPosition(Position positions) {
			this.positions = positions;
		}
		
		//group
		public Group[] getGroup() {
			return groups;
		}
		public void setGroup(Group[] groups) {
			this.groups = groups;
		}
	
	
	
	
	
	
	
	
	
}
