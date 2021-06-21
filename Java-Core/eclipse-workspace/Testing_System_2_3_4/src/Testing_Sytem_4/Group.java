package Testing_Sytem_4;

import java.time.LocalDate;

public class Group {

	int id;
	String name;
	Account creator;
	LocalDate createDate;
	Account[] accounts;
	
	//không có parameters
	Group(){
		
	}
	
	//có parameters
	//c
	Group( int id, String name, Account creator, LocalDate createDate, Account[] accounts){
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
		//accounts
//		Account[] acc = new Account[accounts];
//		for (int i = 0; i < accounts.length; i++) {
//			
//		}
		
	}
}
