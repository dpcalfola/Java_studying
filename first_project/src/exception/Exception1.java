package exception;

public class Exception1 {

	public static void main(String[] args) {

		System.out.println(1);

		try {
			System.out.println(2 / 0);
		} catch (ArithmeticException e) {
			System.out.println("You can't divided be into zero");
		}
		System.out.println(3);


	}

}
