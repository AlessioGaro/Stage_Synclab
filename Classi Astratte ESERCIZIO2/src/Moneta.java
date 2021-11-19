
public class Moneta extends ValoriCasuali {

	public Moneta(String nome) {
		super(nome, 2);
	}
	
	public int determinaResult() {
		int esito = random.nextInt(getNumeroEsiti())+1;
		System.out.println("lancio di " + getNome() + " effettuato");
		if (esito == 1) {
		System.out.println("hai ottenuto testa!"  );
		} else {
			System.out.println("hai ottenuto croce!"  );
		}
		return esito;
	}
	
	
}
