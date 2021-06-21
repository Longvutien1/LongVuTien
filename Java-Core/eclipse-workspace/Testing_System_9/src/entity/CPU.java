package entity;

public class CPU {

	private int price;

	public CPU(int price) {
		super();
		this.price = price;
	}

	public CPU() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
//	class processor
	public class Processor {

		private int coreAmount;
		private String menufacturer;
		
		public Processor(int coreAmount, String menufacturer) {
			super();
			this.coreAmount = coreAmount;
			this.menufacturer = menufacturer;
		}
		
		public Double getCaChe() {
			return 4.3;
		}
		
	}
	
//	class ram
	public class Ram {

		private int memory; //bộ nhớ
		private String menufacturer;
		
		
		public Ram(int memory, String menufacturer) {
			super();
			this.memory = memory;
			this.menufacturer = menufacturer;
		}
		
		public double getClockSpeed() {
			return 5.5;
		}
		
	}
	
}
