package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {
	int prezzo;
	double iva = 0.22;
	String marca, nome;
	DecimalFormat f = new DecimalFormat("#.##");

	String calcolaIva(int prezzo) {
		double prezzoConIva = prezzo + (prezzo * iva);
		String prezzoFinale = f.format(prezzoConIva) + "€";
		return prezzoFinale;
	}

}
