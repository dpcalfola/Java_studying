package digitUnion;

import java.util.Scanner;

public class Union {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("< A program that unify tenth digit and unit digit >");

		System.out.print("\rPlease input tenth digit number : ");
		int t = TenthDigit.key(scan.nextInt());

		System.out.print("\rPlease input unit digit number : ");
		int u = UnitDigit.key(scan.nextInt());
		
 		int union = t + u ;
 		
 		System.out.println("\rThe result is " + union);
 		
 		
 		System.out.println("\r< Program is ended >");
 		

	}

}
