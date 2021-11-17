import java.util.Scanner;

public class NonAlimentari extends Prodotti {
	
	private String materiale;
	Scanner sc = new Scanner(System.in);
	
	public NonAlimentari(String codiceBarre, String descrizione, double prezzoUnitario, String nome) {
		super(codiceBarre, descrizione, prezzoUnitario, nome);
		setMateriale();
	}

	

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale() {
		System.out.println("inserire materiale che compone l'oggetto: " + this.getNome());
		this.materiale = sc.next();
	}

	@Override
	public double applicaSconto() {
		double a =0;
		
		if(materiale.equalsIgnoreCase("plastica") ||
				   materiale.equalsIgnoreCase("carta") ||
				   materiale.equalsIgnoreCase("vetro"))
		{
				a= getPrezzoUnitario()*0.90;
				return a;}
			else return super.applicaSconto();
		
	}
	
	
	
	

	
}
