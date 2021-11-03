package maxMin;

import java.util.Scanner;

public class MaxMinApp {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("< A program that show Max and min among input numbers >\n");
		System.out.print("How many numbers do you want to input? : ");
		System.out.println("");

		int totalNumbers = scan.nextInt();

		printJudgeMaxMin(totalNumbers);

		System.out.println("\n < Program is ended >");

	}

	private static void printJudgeMaxMin(int totalNumbers) {
		int A = totalNumbers;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= A; i++) {
			System.out.print("Please input Number" + i + ":");
			int inputNum = scan.nextInt();
			if (inputNum >= max) {
				max = inputNum;
			}
			if (inputNum <= min) {
				min = inputNum;
			}
		}
		System.out.println("");
		System.out.println("Max number is " + max);
		System.out.println("min number is " + min);

	}

}
