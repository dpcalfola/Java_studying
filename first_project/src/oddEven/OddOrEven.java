package oddEven;

import java.util.Scanner;

public class OddOrEven {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("< A program that distinguishes odd and even number >\n\n");
		System.out.print("How many numbers do you want to check up?");

		int numToRepeat = scan.nextInt();
		System.out.println("");

		judgeNum(numToRepeat);

		System.out.println("\n < Program is ended >");
	}

	private static void judgeNum(int numToRepeat) {
		int A = numToRepeat;

		for (int i = 1; i <= A; i++) {
			System.out.print("Please input Number" + i + " ");
			int number = scan.nextInt();
			if (number % 2 == 0) {
				System.out.println(number + " is even\n");

			} else {
				System.out.println(number + " is odd\n");

			}

		}

	}
}
