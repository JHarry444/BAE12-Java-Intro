package flow;

public class FlowOfControl {

	public static void main(String[] args) {
		// app starts here
		System.out.println("App starts");
		// where the magic happens
		sayHello();
		sayHello();
		// app ends here
		System.out.println("App finishes");
	}

	public static void sayHello() {
		System.out.print("Hello");
		System.out.print(", ");
		System.out.print("World!");
		System.out.println();
	}
}
