package singletonPattern;

public class Demo {

	public static void main(String[] args) {
		//wont work
		//Object test = new Object();
		
		Object test = Object.getInstance();
		test.print();
	}

}
