import java.util.Scanner;

public class DatatypeErrorTest {

	public static void main(String[] args) {
		int checkNumber = 0 ;
		Scanner intData = new Scanner(System.in);
		System.out.println("Please input check number");
		
		while (!intData.hasNextInt()); {
			intData.next();
			System.out.println("Input value should be number");
			System.out.println("Please input check number");
		}
		
		checkNumber = intData.nextInt();
		System.out.println("check number is "+checkNumber);
		intData.close();
	}

}


/// I can't handle it yet :(