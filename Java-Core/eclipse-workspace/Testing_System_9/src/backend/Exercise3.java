package backend;

import entity.CPU;
import entity.Car;

public class Exercise3 {

	public void question1() {
		CPU cpu1 = new CPU(10);
		CPU.Processor pro = cpu1.new Processor(2, "Intel");
		CPU.Ram ram = cpu1.new Ram(16, "Micron");
		System.out.println("CaChe Processor "+pro.getCaChe());
		System.out.println("Clock Speed ram: "+ram.getClockSpeed());
	}
	
	public void question2() {
		Car car = new Car("Mazda", "8WD");
		Car.Engine engine = car.new Engine("Crysler");
		
		System.out.println("Thông tin car: "+car.toString());
		System.out.println("Thông tin động cơ: "+engine.toString());
	}
}
