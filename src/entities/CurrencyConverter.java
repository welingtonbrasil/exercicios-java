package entities;

public class CurrencyConverter {
	
	public static double converter(double dollar, double valor) {
		return (dollar * valor * 0.06) + (dollar * valor) ;
	}

}
