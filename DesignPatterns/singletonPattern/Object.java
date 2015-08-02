package singletonPattern;

public class Object {
	//forces the Object class to be instantiated only within the pattern
	//private constructor wont allow "Object" to be instantiated by other classes
	private static Object instance = new Object();
	
	private Object(){};
	
	public static Object getInstance(){
		return instance;
	}

	public void print(){
		System.out.println("It worked");
	}
}
