package multiplication;

public class tableAll {
	public static void main(String[] args) {

		System.out.println("All multiplication table");
		System.out.println(" ");

		for (int table = 2; table < 10; table++) {
			System.out.println(" ");
			System.out.println("<table " + table+">");
			for (int i = 1; i < 10; i++) {
				System.out.println(table + " * " + i + " = " + table * i);
			}
		}

	}

}
