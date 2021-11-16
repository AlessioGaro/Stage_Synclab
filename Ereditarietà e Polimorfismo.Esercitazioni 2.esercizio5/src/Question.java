import java.util.Scanner;

public class Question {
	
	private String domanda;
	private String rispostaEsatta;
	private int punteggio;
	Scanner sc = new Scanner(System.in);
	private String rispostaData;
	
	
	
	public String getDomanda() {
		return domanda;
	}



	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}



	public String getRispostaEsatta() {
		return rispostaEsatta;
	}



	public void setRispostaEsatta(String rispostaEsatta) {
		this.rispostaEsatta = rispostaEsatta;
	}



	public int getPunteggio() {
		return punteggio;
	}



	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}



	public String getRispostaData() {
		return rispostaData;
	}



	public void setRispostaData() {
		this.rispostaData = sc.next();
	}



	public int ask() {
		System.out.println("la domanda è la seguente:");
		System.out.println(this.domanda);
		setRispostaData();
		if(this.rispostaData.equalsIgnoreCase(this.rispostaEsatta)) {
			this.punteggio = 3;
			System.out.println("risposta esatta, hai totalizzato " + this.punteggio + " punti");}
			else {
				this.punteggio = 0;
				System.out.println("risposta errata, hai totalizzato " + this.punteggio + " punti");
			}
			return punteggio;
		}
	}
	


