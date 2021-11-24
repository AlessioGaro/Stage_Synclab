
public class Beverage {
	
	private char codice;
	private String nome;
	private double prezzo;
	private String descrizione;
	
	
	public Beverage() {
		codice = '\u0000';
		nome = null;
		prezzo = 0;
	}
	
	
	public Beverage(char codice, String nome, double prezzo) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public char getCodice() {
		return codice;
	}

	public void setCodice(char codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public void aggiungiBevanda(String a) {
		this.descrizione = a;
	}


	@Override
	public String toString() {
		return "[codice " + codice + " : " + nome + "]";
	}
	

	
	
	
	

}
