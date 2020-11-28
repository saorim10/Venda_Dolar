package util;

public class Conversor {
	public static final double TAXA = 0.06;
	
	public static double total(double preco, double qtde) {
		return preco * qtde * (TAXA+1);
	}
}
