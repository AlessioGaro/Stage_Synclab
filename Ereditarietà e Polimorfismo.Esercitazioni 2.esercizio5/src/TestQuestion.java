import java.util.Random;

public class TestQuestion {

	public static void main(String[] args) {
		
		MultipleQuestion domanda1 = new MultipleQuestion();
		domanda1.setDomanda("quanto fa 10+10");
		domanda1.opzioni[0] = "20";
		domanda1.opzioni[1] = "35";
		domanda1.opzioni[2] = "19";
		domanda1.setRispostaEsatta("1");
		
		
		MultipleQuestion domanda2 = new MultipleQuestion();
		domanda2.setDomanda("qual'è la capitale di Italia");
		domanda2.opzioni[0] = "Roma";
		domanda2.opzioni[1] = "Napoli";
		domanda2.opzioni[2] = "Milano";
		domanda2.setRispostaEsatta("1");
		
		
		MultipleQuestion domanda3 = new MultipleQuestion();
		domanda3.setDomanda("quale squadra ha vinto gli ultimi europei di calcio?");
		domanda3.opzioni[0] = "Francia";
		domanda3.opzioni[1] = "Spagna";
		domanda3.opzioni[2] = "Italia";
		domanda3.setRispostaEsatta("3");
		
		
		Question domanda4 = new QuestionYesNO();
		domanda4.setDomanda("i ragni hanno 6 zampe?");
		domanda4.setRispostaEsatta("no");
		
		Question domanda5 = new QuestionYesNO();
		domanda5.setDomanda("Legnano si trova in provincia di Varese?");
		domanda5.setRispostaEsatta("no");
		
		Question domanda6 = new QuestionYesNO();
		domanda6.setDomanda("In Italia ci sono 20 regioni?");
		domanda6.setRispostaEsatta("sì");
		
		Question domanda7 = new NumericQuestion();
		domanda7.setDomanda("quanto fa 1850+149");
		domanda7.setRispostaEsatta("1999");
		
		Question domanda8 = new NumericQuestion();
		domanda8.setDomanda("in che anno scoppiò la rivoluzione francese?");
		domanda8.setRispostaEsatta("1789");
		
		Question[] domande = new Question[8];
		
		
		domande[0] = domanda1;
		domande[1] = domanda2;
		domande[2] = domanda3;
		domande[3] = domanda4;
		domande[4] = domanda5;
		domande[5] = domanda6;
		domande[6] = domanda7;
		domande[7] = domanda8;
		
		Question[] esame = new Question[3];
		
		int i=0;
		boolean already;
		Random rd = new Random();
		
		while (i<3) {
			already = false;
			int nxt = rd.nextInt(domande.length);
			System.out.println(nxt);
				for(int j=0; j<esame.length;j++) {
					if(esame[j] == domande[nxt]) {
						already = true; 
					}
				}
			if (already != true) {
				esame[i] = domande[nxt];
				i++;
				}
		}
		
		int punteggioTotale = 0;
		
		for(int k=0; k<esame.length;k++) {
			esame[k].ask();
			if (esame[k].getRispostaData().equals(esame[k].getRispostaEsatta())) {
				punteggioTotale = punteggioTotale +3; }
		}
		System.out.println("in totale hai totalizzato " + punteggioTotale + "/9 punti");
		
				
				
				
					
					
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
