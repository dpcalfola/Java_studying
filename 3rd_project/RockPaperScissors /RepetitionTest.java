import java.util.Scanner;

public class RepetitionTest {

	public static void main(String[] args) {

		int endNumber = 0;

		Scanner getEndNumber = new Scanner(System.in);

		while (endNumber != 9) {
			System.out.print("Please input end number ");
			endNumber = getEndNumber.nextInt();

		}

		System.out.println("Program is ended");
		getEndNumber.close();

	}

}
