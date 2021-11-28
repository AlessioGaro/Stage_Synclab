import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean valid;
		int a = 0;
		
		ElementoMultimediale[] lettore = new ElementoMultimediale[5];
		
		for(int i=0; i<lettore.length; i++) {
			
			do { valid = false;
				 System.out.println("aggiungi elemento nella memoria del lettore");
				 System.out.println("digita 1 per inserire un'immagine");
				 System.out.println("digita 2 per inserire una registrazione");		 
				 System.out.println("digita 3 per inserire un filmato");
				 
				 
				try {  int insert = sc.nextInt();
						if(insert == 1) {
							valid = true;
							lettore[i] = new Immagine();
							System.out.println("digita il titolo dell'immagine");
							lettore[i].setTitolo(sc.next());
							System.out.println("seleziona la luminosita");
							((Immagine) lettore[i]).setLuminosita(sc.nextInt());
							
						}
						else if (insert == 2) {
							valid = true;
							lettore[i] = new Registrazione();
							System.out.println("digita il titolo del file audio");
							lettore[i].setTitolo(sc.next());
							System.out.println("seleziona il volume");
							((Registrazione) lettore[i]).setVolume(sc.nextInt());
							System.out.println("seleziona la durata");
							((Registrazione) lettore[i]).setDurata(sc.nextInt());
							
							
							
						}
						else if (insert == 3) {
							valid = true;
							lettore[i] = new Filmato();
							System.out.println("digita il titolo del video");
							lettore[i].setTitolo(sc.next());
							System.out.println("seleziona il volume");
							((Filmato) lettore[i]).setVolume(sc.nextInt());
							System.out.println("seleziona la luminosita");
							((Filmato) lettore[i]).setLuminosita(sc.nextInt());
							System.out.println("seleziona la durata");
							((Filmato) lettore[i]).setDurata(sc.nextInt());
							
						}
				}
				
				catch(Exception e) 
				{	System.out.println("inserisci un valore numerico compreso tra uno e tre!");
					sc.next();
					
				}
			}while(valid == false);
		}
		
		do { 
			System.out.println("quale elemento vuoi eseguire? digita il corrispettivo numero per eseguire un file:");
			System.out.println("1 : " + lettore[0].getTitolo());
			System.out.println("2 : " + lettore[1].getTitolo());
			System.out.println("3 : " + lettore[2].getTitolo());
			System.out.println("4 : " + lettore[3].getTitolo());
			System.out.println("5 : " + lettore[4].getTitolo());
			System.out.println("digita il valore 0 per spegnere il lettore");
		try { a = sc.nextInt();
			  if (a>0 && a<6) {
				  if(lettore[a-1] instanceof Immagine) {
				  ((Immagine) lettore[a-1]).show(); 
				  ((Immagine) lettore[a-1]).modificaLuminosita(); } 
				  else if(lettore[a-1] instanceof Registrazione)
				  {  ((Registrazione) lettore[a-1]).play();
				      ((Registrazione) lettore[a-1]).modificaVolume(); }
				  else if(lettore[a-1] instanceof Filmato)
				  {  ((Filmato) lettore[a-1]).play();
				     ((Filmato) lettore[a-1]).modificaVolume(); 
				     ((Filmato) lettore[a-1]).modificaLuminosita(); }
			 }
		} catch(Exception e) {
			System.out.println("inserisci un valore numerico");
			sc.next();
			}
		} while(a!=0);
		
		System.out.println("lettore spento correttamente, a presto");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
