import java.util.Scanner;

public class DatatypeErrorTest {

	public static void main(String[] args) {

		Scanner getCheckNum = new Scanner(System.in);
		System.out.println("Please input check number");

		while (!getCheckNum.hasNextInt()) {
			getCheckNum.next();
			System.out.println("Check number shoule be integer");
			System.out.println("Please input check number");
		}

		int checkNum = getCheckNum.nextInt();

		System.out.println("Check number is " + checkNum);

		getCheckNum.close();

	}
}

