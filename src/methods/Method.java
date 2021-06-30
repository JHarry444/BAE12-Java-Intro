package methods;

public class Method {

	public static void main(String[] args) {
		System.out.println(isEven(22));
		System.out.println(isEven(33));
		System.out.println(isEven(78));

		String message = hello(); // jotting down the address of "Hello, World!"
		System.out.println(message);
		System.out.println(message.length());
		System.out.println(hello());
		sayHello();
		return; // return -> returns a value and ends the method (void has no value)
	}

	public static void sayHello() {
		System.out.println("Hello, World!");
	}

	// boolean = return type -> method will return true/false
	// int i = parameter -> variable 'passed in' to the method
	public static boolean isEven(int i) {
		boolean isEven = i % 2 == 0;
		return isEven; // return value - ends method
	}

	public static String hello() {
		return "Hello, World!";
	}
}
