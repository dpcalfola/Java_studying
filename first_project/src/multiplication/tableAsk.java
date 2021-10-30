package multiplication;

import java.util.Scanner;

public class tableAsk {
	public static void main(String[] args) {
		
		System.out.println("Please input multiplication table number ");
		Scanner getTableNumber = new Scanner(System.in);
		
		int tableNumber = getTableNumber.nextInt();
		
		if ( tableNumber <= 1 || tableNumber > 9 ) {
			System.out.println("Wrong number. Table number should be 2 to 9");
		}
		else {
			System.out.println("<table " + tableNumber + ">");
			for (int i = 1 ; i < 10 ; i++) {
				System.out.println(tableNumber * i);
				
			}
			
		}
		
		getTableNumber.close();
			
		
	}

}
