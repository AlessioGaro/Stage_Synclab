import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Dispenser {
	
	Set <Beverage> listOfProd;
	
	ArrayList<ArrayList<Beverage>> column;
	
	int clmn = 0;
	Beverage temp;
	
	
	Scanner c = new Scanner(System.in);
	
	public void getInfo() throws BevandaNonValidaException{
		boolean found = false;
		char code;
		String codice;
		
		
		do {
			System.out.println("select a code associated to a product to retrieve name and price of the prod. (must be only one char!)");
			codice = c.next();
			} while(codice.length() >1);
		
		code = codice.charAt(0);
		
		for (Beverage b : listOfProd) {
			if (b.getCodice() == code) {
				found = true;
				System.out.println("Product found!");
				System.out.println("name : " + b.getNome() + ", price for single unit: " + b.getPrezzo());
				break;
			}
		}
		if(!found) {
			throw new BevandaNonValidaException("there is no beverage that match the code in input");
		}
	}
		
		
	public void aggiornaColonna () throws BevandaNonValidaException {
		int i = 0;
		boolean col = false;
		boolean found = false;
		char code;
		String codice;
		int quantità;
		
		do {
			System.out.println("select a code associated to a valid code product (must be only one char!)");
			codice = c.next();
			} while(codice.length()>1);
		
		code = codice.charAt(0);
		
		for (Beverage b : listOfProd) {
			if (b.getCodice() == code) {
				found = true;
				temp = b;
				System.out.println("Product found!");
				break; }
		}
			if(!found) {
				throw new BevandaNonValidaException("there is no beverage that match the code in input");
			}else {
				System.out.println("with how manies tin of product " + code + " do you want to refill the disponser?");
			   
				do {
					quantità = c.nextInt();
				} while (quantità<=0);
				System.out.println("wich column do you want to refill? if the column already contains a different product all the tins of that product will be replaced by the new ones");
				
				do {
					System.out.println("the dispenser has 4 columns, select a number between 1 and 4 includes");
					clmn = c.nextInt();
				} while(clmn<=0 || clmn>4);
			}
			
			
			for(ArrayList<Beverage> a : column) {
				i++;
				if (i == clmn) {
					col = true;
					if(!(a.isEmpty()) && a.get(0).getCodice() == code ) {
						
						for(int q=0; q<quantità;q++) {
							a.add(temp);
						}
					} else if (!(a.isEmpty()) && a.get(0).getCodice() != code) {
						System.out.println(a.get(0).getNome() + " sostutiuto con " + temp.getNome());
						a.clear();
						
						for(int q=0; q<quantità;q++) {
							a.add(temp);
						}
					} else {
						
						for(int q=0; q<quantità;q++) {
							a.add(temp);
						}
					}
				}
			}
			if(col == false) {
				System.out.println("colonna non valida");
			}
	}
	
	public void lattineDisponibili(char o) {
		boolean found = false;
		int counter = 0;
		Beverage temp = new Beverage();
		
		for (Beverage b : listOfProd) {
			if (b.getCodice() == o) {
				found = true;
				temp =b;
				break;
			}
		}
		for(ArrayList<Beverage> a : column) {
			if (!(a.isEmpty()) && a.get(0).getCodice() == o) {
				counter = counter+a.size();
			}
		}
		System.out.println("the dispenser has " + counter + " tins of product: " + temp.getNome());
	}

	
	
	public void eroga(Bank bank) throws CreditoInsufficienteException, TesseraNonValidaException, BevandaEsauritaException {
		System.out.println("select the code of the drink you want");
		String o = c.next();
		boolean available = false;
		char code = o.charAt(0);
		for(ArrayList<Beverage> a : column) {
			if (!(a.isEmpty()) && a.get(0).getCodice() == code) {
				available = true;
				double price = a.get(0).getPrezzo();
				System.out.println("digit the code of you credit card");
				int cod = c.nextInt();
				Integer codex = Integer.valueOf(cod);
			
				if(bank.prelievo(codex, price)) {
					a.remove(a.get(0));
					
				}
				
			}
		}
		if(available == false) {
			throw new BevandaEsauritaException("Bevanda non disponibile");
		}
			
	}

















}
	
	
	
	
	


