package jana60.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Prodotto oggetto = new Prodotto();
		System.out.println("Inserisci il prezzo del prodotto");
		oggetto.prezzo = scan.nextInt();
		System.out.println("Il prodotto senza iva ha costo di " + oggetto.prezzo + "€ " + " Con l iva il prezzo é di "
				+ oggetto.calcolaIva(oggetto.prezzo));
		scan.close();
	}

}
