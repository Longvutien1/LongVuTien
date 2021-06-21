package Testing_Sytem_4;

import java.time.LocalDate;

public class Account {
	int id;
	String email;
	String user;
	String firstName;
	String lastName;
	String fullName ;
	Position position;
	LocalDate createDate;
	
	
	Account(){
		
	}
	
	Account(int id, String email, String user, String firstName, String lastName){
		this.id = id;
		this.email = email;
		this.user = user;
		this.firstName = firstName;
		this.lastName = lastName;
		fullName = firstName + lastName;
		
	}
	
	Account(int id, String email, String user, String firstName, String lastName , Position position){
		this.id = id;
		this.email = email;
		this.user = user;
		this.firstName = firstName;
		this.lastName = lastName;
		fullName = firstName + lastName;
		this.position = position;
		createDate = LocalDate.now();
		
	}
}
