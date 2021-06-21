package Testing_Sytem_4;

public class Account_q2 {

	private String id;
	private String name;
	private int balance;
	
		public Account_q2(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		}
		
		public String getId() {
		return id;
		}
		public String getName() {
		return name;
		}
		public int getBalance() {
		return balance;
		}
		
		public int credit(int amount) {
			return this.balance +=amount;
		}
		public int debit(int amount) {
			return this.balance -=amount;
		}
		public void tranfer(Account_q2 acc, int amount) {
			this.balance -= amount;
			acc.balance +=amount;
		}
		
		
}
