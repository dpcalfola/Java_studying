package acountingApp;

public class AcountingArrayApp {

	public static void main(String[] args) {

		double valueOfSupply = Double.parseDouble(args[0]);
		 
		
		double vatRate = 0.1;
		double expanseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expanse = valueOfSupply * expanseRate;
		double income = valueOfSupply - expanse;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5 ;
		dividendRates[1] = 0.3 ;
		dividendRates[2] = 0.2 ;
		
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];

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
