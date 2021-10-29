package multiplication;

import java.util.Scanner;

public class table6 {
	public static void main(String[] args) {
		System.out.println("please input multiplication table number");
		Scanner getNumber = new Scanner(System.in);
		int number = getNumber.nextInt();
		int i = 1;
		System.out.println("multiplication table " + number);

		while (i < 10) {
			System.out.println(number * i);
			i = i + 1;

		}

	}

}
