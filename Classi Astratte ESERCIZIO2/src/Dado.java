
public class Dado extends ValoriCasuali {

	public Dado(String nome, int numeroEsiti) {
		super(nome, numeroEsiti);
	}
	
	public int determinaResult() {
		int esito = random.nextInt(getNumeroEsiti())+1;
		System.out.println("lancio di " + getNome() + " effettuato");
		System.out.println("hai ottenuto " + esito + " su un massimo di " + getNumeroEsiti() );
		return esito;
	}
	
	
	
	

}
