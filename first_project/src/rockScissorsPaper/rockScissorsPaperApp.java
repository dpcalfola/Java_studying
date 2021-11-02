package rockScissorsPaper;

import java.util.Scanner;

public class rockScissorsPaperApp {

	public static void main(String[] args) {

		String[] rockScissorsPaper = new String[3];
		rockScissorsPaper[0] = "Rock";
		rockScissorsPaper[1] = "Scissors";
		rockScissorsPaper[2] = "Paper";

		double computerChoiceDouble = Math.floor(Math.random() * 3);
		int computerChoiceInt = (int) computerChoiceDouble;
		int userChoiceInt = 9;

		System.out.println("Rock Scissors Paper!!");
		System.out.print("\nPlese input your choice - r or s or p : ");

		Scanner scannerUserInput = new Scanner(System.in);
		String userChoiceString = scannerUserInput.next();

		if (userChoiceString.equals("r")) {
			userChoiceInt = 0;
			System.out.println("\nYour choice is : " + rockScissorsPaper[0]);
			System.out.println("Computer's choice is : " + rockScissorsPaper[computerChoiceInt]);

		} else if (userChoiceString.equals("s")) {
			userChoiceInt = 1;
			System.out.println("\nYour choice is : " + rockScissorsPaper[1]);
			System.out.println("Computer's choice is : " + rockScissorsPaper[computerChoiceInt]);

		} else if (userChoiceString.equals("p")) {
			userChoiceInt = 2;
			System.out.println("\nYour choice is : " + rockScissorsPaper[2]);
			System.out.println("Computer's choice is : " + rockScissorsPaper[computerChoiceInt]);

		} else {
			System.out.println("\nError :You have to input r or s or p");

		}

		boolean tie = userChoiceInt == computerChoiceInt;
		boolean userwin = (userChoiceInt == 0 && computerChoiceInt == 1)
				|| (userChoiceInt == 1 && computerChoiceInt == 2) || (userChoiceInt == 2 && computerChoiceInt == 0);
		boolean userlose = (userChoiceInt == 0 && computerChoiceInt == 2)
				|| (userChoiceInt == 1 && computerChoiceInt == 0) || (userChoiceInt == 2 && computerChoiceInt == 1);

		if (tie) {
			System.out.println("\nYou and Computer tied");

		} else if (userwin) {
			System.out.println("\nYou won");

		} else if (userlose) {
			System.out.println("\nYou lost");

		}

		scannerUserInput.close();

	}

}
