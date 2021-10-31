import java.util.Scanner;

public class RepetitionTest_failed {

	public static void main(String[] args) {

		int endNumber = 0;

		Scanner getEndNumber = new Scanner(System.in);

		

		while (!getEndNumber.hasNextInt()) {
			getEndNumber.next();
			System.out.print("Error : End number should be number");
			System.out.print("Please input end number ");

		}
		
		System.out.print("Please input end number ");

		while (endNumber != 9) {

			endNumber = getEndNumber.nextInt();
			System.out.print("Please input end number ");

		}

		System.out.println("Program is ended");
		getEndNumber.close();

	}

}
