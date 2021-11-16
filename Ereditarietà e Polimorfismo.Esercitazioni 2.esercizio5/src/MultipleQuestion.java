
public class MultipleQuestion extends NumericQuestion{
	
	String[] opzioni = new String[3];
	private boolean error = true;
	int b;
	
	
	
		@Override
		public int ask() {
			System.out.println("la domanda è la seguente:");
			System.out.println(this.getDomanda());
			for(int i=0;i<=2;i++) {
				int d = i+1;
				System.out.println(d + ") " + opzioni[i]);
			}
			
			do {  System.out.println("digita il numero corrispondente alla risposta che ritieni essere corretta");
				  System.out.println("inserendo un valore compreso tra 1 e 3");
			try {
				setRispostaData();
				String a = getRispostaData();
				b = Integer.parseInt(a);
				error = false; }
			catch (Exception e) {
				System.out.println("hai inserito uno o più caratteri non validi");
				}
			} while (error || b<=0 || b>3);
			
			if(getRispostaData().equalsIgnoreCase(getRispostaEsatta())) {
				setPunteggio(3);
				System.out.println("risposta esatta, hai totalizzato " + getPunteggio() + " punti");}
				else {
					setPunteggio(0);
					System.out.println("risposta errata, hai totalizzato " + getPunteggio() + " punti");
				}
				return getPunteggio();
		}
	

}
