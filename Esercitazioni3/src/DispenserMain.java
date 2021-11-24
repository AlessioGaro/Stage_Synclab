import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class DispenserMain {

	public static void main(String[] args) throws BevandaNonValidaException, TesseraNonValidaException, CreditoInsufficienteException, BevandaEsauritaException {
		
		Dispenser dis = new Dispenser();
		
		Beverage acqua = new Beverage('A', "acqua", 0.20);
		Beverage coca = new Beverage('C', "coca-cola", 0.30);
		Beverage birra = new Beverage('B', "birra", 1.00);
		
		Set <Beverage> list1 = new HashSet<Beverage>() ;
		
		dis.listOfProd = list1;
		
		list1.add(acqua);
		list1.add(coca);
		list1.add(birra);
		list1.add(birra); //hashSet should prevent from duplicated
		
		dis.column = new ArrayList <ArrayList<Beverage>>(4);
		ArrayList<Beverage> column1 = new ArrayList<Beverage>();
		ArrayList<Beverage> column2 = new ArrayList<Beverage>();
		ArrayList<Beverage> column3 = new ArrayList<Beverage>();
		ArrayList<Beverage> column4 = new ArrayList<Beverage>();
			
		dis.column.add(column1);
		dis.column.add(column2);
		dis.column.add(column3);
		dis.column.add(column4);
		
		
		//Iterator allows to print a list of the Beverage supposed to be in the Dispenser
		System.out.println("Drinks available:");
		
		Iterator<Beverage> iter = dis.listOfProd.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().toString() );
		}
		
		Bank ubiBank = new Bank();
		
		CreditCard card1 = new CreditCard(111, 2.0);
		CreditCard card2 = new CreditCard(222, 1.25);
		CreditCard card3 = new CreditCard(333, 1.0);
		
		HashMap<Integer, Double> lista = new HashMap<>();
		
		card1.caricaTessera(0.35);
		card2.caricaTessera(0.40);
		card3.caricaTessera(0.20);
		
		ubiBank.listaCarte = lista;
		ubiBank.listaCarte.put(card1.getCode(), card1.getCredit());
		ubiBank.listaCarte.put(card2.getCode(), card2.getCredit());
		ubiBank.listaCarte.put(card3.getCode(), card3.getCredit());
		
		ubiBank.leggiCredito(222);
		ubiBank.leggiCredito(333);
		ubiBank.leggiCredito(111);
		
		// genera eccezione poichè 444 non è chiave per nessuna creditcard
		
	//	ubi.leggiCredito(444);
		
	
		
		
		
		dis.getInfo();
		dis.aggiornaColonna();
		dis.aggiornaColonna();
		dis.aggiornaColonna();
		
		dis.lattineDisponibili('A');
		dis.lattineDisponibili('B');
		dis.lattineDisponibili('C');
		
		dis.eroga(ubiBank);
		
		dis.lattineDisponibili('A');
		dis.lattineDisponibili('B');
		dis.lattineDisponibili('C');
		
		dis.eroga(ubiBank);
		
		dis.lattineDisponibili('A');
		dis.lattineDisponibili('B');
		dis.lattineDisponibili('C');
		
		
		
		
		
		
	
	}

}
