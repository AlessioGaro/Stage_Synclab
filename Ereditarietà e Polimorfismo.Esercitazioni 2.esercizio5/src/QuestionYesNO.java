
public class QuestionYesNO extends Question{

	
	@Override
	public int ask() {
		System.out.println("la domanda � la seguente:");
		System.out.println(this.getDomanda());
		
		do {
			System.out.println("rispondere solo con s� o no");
			setRispostaData();
		} while (!getRispostaData().equalsIgnoreCase("no") &&
				 !getRispostaData().equalsIgnoreCase("s�") );
		
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
