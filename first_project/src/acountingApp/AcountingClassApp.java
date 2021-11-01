package acountingApp;

class Accounting {
	public double valueOfSupply;
	public double vatRate;
	public double expanseRate;

	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVat());
		System.out.println("Total : " + getTotal());
		System.out.println("Expanse : " + getExpanse());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend 1 : " + getDividend1());
		System.out.println("Dividend 2 : " + getDividend2());
		System.out.println("Dividend 3 : " + getDividend3());
		System.out.println("\n");
	}

	public double getDividend1() {
		return getIncome() * 0.5;
	}

	public double getDividend2() {
		return getIncome() * 0.3;
	}

	public double getDividend3() {
		return getIncome() * 0.2;
	}

	public double getIncome() {
		return valueOfSupply - getExpanse();
	}

	public double getExpanse() {
		return valueOfSupply * expanseRate;
	}

	public double getTotal() {
		return valueOfSupply + getVat();
	}

	public double getVat() {
		return valueOfSupply * vatRate;
	}

}

public class AcountingClassApp {

	public static void main(String[] args) {

		
		
		Accounting a1 = new Accounting();   //  <<- instance
		a1.valueOfSupply = 50000.0;
		a1.vatRate = 0.1;
		a1.expanseRate = 0.3;
		a1.print();

		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expanseRate = 0.4;
		a2.print();

	}

}
