import java.util.Random;

public abstract class ValoriCasuali {
	
	private String nome;
	private int numeroEsiti;
	Random random = new Random();
	
	public ValoriCasuali (String nome, int numeroEsiti) {
		this.nome = nome;
		this.numeroEsiti = numeroEsiti;
	}
	
	public abstract int determinaResult();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroEsiti() {
		return numeroEsiti;
	}

	public void setNumeroEsiti(int numeroEsiti) {
		this.numeroEsiti = numeroEsiti;
	}

	
	
	
		
	
	

	
	

}
