package operators;

public class Operators {

	public static void main(String[] args) {
		// binary - two values
		System.out.println(27 + 88);
		System.out.println(27 - 88);
		System.out.println(27 * 88);
		System.out.println(27 / 88);
		System.out.println(31 % 6);

		System.out.println();
		// unary - 1 value
		int i = 1;
		System.out.println(i);

		i = i + 1;
		System.out.println(i);
		i += 1;
		System.out.println(i);
		i++;
		System.out.println(i);
		i = i - 1;
		System.out.println(i);
		i -= 1;
		System.out.println(i);
		i--;
		System.out.println(i);

		i *= 8;
		System.out.println(i);
		i /= 8;
		System.out.println(i);

		// conditional operators
		System.out.println(22 > 10);
		System.out.println(22 >= 10);
		System.out.println(22 < 10);
		System.out.println(22 <= 10);
		System.out.println(22 == 10);
	}
}
