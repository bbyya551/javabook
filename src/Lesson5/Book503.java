package Lesson5;

public class Book503 {
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	
	public static void methodB() {
		System.out.println("MethodB");
	}
	public static void main(String[] args) {
		methodA();
	}
}
