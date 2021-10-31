package acountingApp;

public class AcountingIfApp {

	public static void main(String[] args) {

		double valueOfSupply = Double.parseDouble(args[0]);

		double vatRate = 0.1;
		double expanseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expanse = valueOfSupply * expanseRate;
		double income = valueOfSupply - expanse;
		double dividend1;
		double dividend2;
		double dividend3;

		if (valueOfSupply <= 10000) {
			dividend1 = income * 1.0;
			dividend2 = income * 0.0;
			dividend3 = income * 0.0;

		} else {
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;

		}

		System.out.println("Value of supply : " + valueOfSupply + "\n");
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expanse : " + expanse);
		System.out.println("Income : " + income);
		System.out.println("Dividend 1 : " + dividend1);
		System.out.println("Dividend 2 : " + dividend2);
		System.out.println("Dividend 3 : " + dividend3);

	}

}
