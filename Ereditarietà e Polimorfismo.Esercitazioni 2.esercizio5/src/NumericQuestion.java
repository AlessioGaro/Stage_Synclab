

public class NumericQuestion extends Question {
	
	private boolean error = true;
	
	

	@Override
	public int ask() {
		System.out.println("la domanda è la seguente:");
		System.out.println(this.getDomanda());
		
		do {  System.out.println("rispondere solo con un valore numerico intero");
			try {
				setRispostaData();
				String a = getRispostaData();
				int b = Integer.parseInt(a);
				error = false; }
			catch (Exception e) {
				System.out.println("hai inserito uno o più caratteri non validi");
				}
		} while (error);
		
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
		
		
		
			
		
	






