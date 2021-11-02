package multiplication;

import java.util.Scanner;

public class TableMethod {

	public static void main(String[] args) {

		System.out.print("Please input multiplication table number : ");

		String inputKey;
		Scanner scan = new Scanner(System.in);
		inputKey = scan.next();
		scan.close();
		int key = Integer.parseInt(inputKey);

		multiplication(key);

	}

	public static void multiplication(int tableStepNum) {
		int A = tableStepNum;

		if (A < 0) {
			System.out.println("\nError : " + A + " is Wrong Number");
		} else {
			System.out.println("\ntable " + A);
			for (int i = 1; i < 10; i++) {

				System.out.println(A + " * " + i + " = " + A * i);
			}
		}

	}

}
