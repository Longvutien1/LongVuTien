package frontend;

import entity.OuterClass;
import entity.OuterClass.InnerClass;

public class MainClass {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.show();
		
		InnerClass inner = outer.new InnerClass();
		inner.show();
	}
}
