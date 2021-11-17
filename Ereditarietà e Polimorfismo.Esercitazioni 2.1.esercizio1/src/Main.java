import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		
		double tot = 0.0;
		boolean tessera = false;
		
		Alimentari oreo = new Alimentari("QWD73HD95720D", "biscotti alla vaniglia", 10, "oreo");
		Alimentari sofficini = new Alimentari("qs8347dd8", "crepes surgelate ripiene", 20, "sofficini");
		Alimentari ferreroRoche = new Alimentari("qurhf92947fh", "cioccolatini ripieni di nocciola", 30, "ferreroRoche");
		
		NonAlimentari scottex = new NonAlimentari("qeyfh472","carta multiuso", 60, "scottex");
		NonAlimentari pile = new NonAlimentari("de49rhehd", "batterie stilo tipo AA",50 , "pile");
		NonAlimentari bicchiere = new NonAlimentari("qd84fh29", "calice di vetro", 40, "bicchiere");
	
		 Prodotti[] supermercato = new Prodotti[6];
		 
		 supermercato[0] = oreo;
		 supermercato[1] = sofficini;
		 supermercato[2] = ferreroRoche;
		 supermercato[3] = scottex;
		 supermercato[4] = pile;
		 supermercato[5] = bicchiere;
		 
		 
		 Prodotti[] carrello = new Prodotti[20];
		 
		 Scanner s = new Scanner(System.in);
			
		int valore = -1;
		int indice = 0;
		int elementi = 0;
		int slotRimasti = 20;
		boolean error = true;
		boolean error1 = true;
		boolean error2 = true;
		
		
		
		
		//non riesco a effettuare il controllo sul tipo di input delle variabili valore ed elementi, infatti se inserisco,
		//per esempio, una lettera, mi entra in loop infinito il ciclo do while commentato e mi esegue all'infinito
		//il codice relativo al do e quello relativo al catch senza eseguire nuovamente il try dove altrimenti procederei
		//a inserire un valore valido
		//procedendo allo stesso modo negli altri esercizi, funziona, purtroppo non capisco il perchè di questo comportamento
		
		
			while(valore != 0 &&  slotRimasti > 0) {
				System.out.println("seleziona il numero corrispondente al bene che vuoi acquistare");
				System.out.println("digita il valore 0 nel caso non voglia aggiungere ulteriori oggetti nel carrello");
				System.out.println(" hai ancora " + slotRimasti + " slot liberi su 20");
				for(int i=0; i<supermercato.length;i++) {
					int j= i+1;
					System.out.println(j + ") " + supermercato[i].getNome()); }
				
				 do {
					try {
						error = true;
						valore = s.nextInt();
						error = false;			
				} catch (InputMismatchException e) {
				System.out.println("devi inserire un valore numerico");
				s.next();
				
				}	
					} while (error); 
				
				if(valore == 0) {
					System.out.println("spesa terminata, si va alla cassa!");
				}
				else if (valore<0 || valore >6) {
					System.out.println("hai inserito un valore non valido");
				}
				else {	
					do {
						System.out.println("quante unità del prodotto vuoi acquistare? inserisci un numero positivo intero");
						
						try{
							error1 = true;
							elementi = s.nextInt();
							error1 = false;
						}
						catch (InputMismatchException e) {
							System.out.println("hai inserito un valore non ammesso");
							s.next();
						}
					}
					while(elementi<=0 || error1);
						
						if(slotRimasti < elementi) {
							System.out.println("non hai spazio a sufficienza per così tanti oggetti");
						} else {
					for(int i=indice;i<indice+elementi;i++) {
						carrello[i] = supermercato[valore-1];
					}
					indice =indice + elementi;
					slotRimasti = slotRimasti-elementi;
					
				}
				}
			}
		
		int tesserina = 0;
		
		do {
			System.out.println("dispone della tessera sconto?");
			System.out.println("digita il tasto 1 se sì");
			System.out.println("digita il tasto 2 altrimenti");
		try {	
				error2 = true;
				tesserina = s.nextInt();
				error2 = false; }
		catch (InputMismatchException e) {
			System.out.println("hai inserito un carattere non valido");
			s.next();
			}
		} while (error2 || (tesserina < 1 || tesserina >2));
		
		if(tesserina ==1) tessera = true;
		else tessera = false;
			
		for(int i=0;i<indice;i++) {
			
			System.out.println(carrello[i].getNome());
			System.out.println(carrello[i].getPrezzoUnitario());
			if(tessera == true) {
				System.out.println("prezzo scontato: " + carrello[i].applicaSconto());
				tot = tot + carrello[i].applicaSconto();
				
			} else {
				
				tot = tot + carrello[i].getPrezzoUnitario();
			}
			
			
		}
		
		System.out.println("totale della spesa effettuata al netto di eventuali sconti: " + tot);
				
				
			}
	

	}

	


