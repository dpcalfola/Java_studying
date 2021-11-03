package multiplication;

import java.util.Scanner;

public class TableMethod3 {

	public static void main(String[] args) {

		multiplication(getInputNumber());

	}

	public static int getInputNumber() {
		System.out.print("Please input multiplication table number : ");

		String inputKey;
		Scanner scan = new Scanner(System.in);
		inputKey = scan.next();
		scan.close();

		inputKey = inputKey.replaceAll("[^\\d]", "");

		if (inputKey == "") {
			System.out.println("Error : Input value have to be number ");
			System.exit(0);
			
		}

		int returnNum = Integer.parseInt(inputKey);

		return returnNum;
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
