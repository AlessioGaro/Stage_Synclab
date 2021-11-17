
public class Prodotti {
	
	private String codiceBarre;
	private String descrizione;
	private double prezzoUnitario;
	private String nome;
	
	
	public Prodotti(String codiceBarre, String descrizione, double prezzoUnitario, String nome) {
		this.codiceBarre = codiceBarre;
		this.descrizione = descrizione;
		this.prezzoUnitario = prezzoUnitario;
		this.nome = nome;
	}
	public String getCodiceBarre() {
		return codiceBarre;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public double getPrezzoUnitario() {
		return prezzoUnitario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCodiceBarre(String codiceBarre) {
		this.codiceBarre = codiceBarre;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public void setPrezzoUnitario(double prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}
	
	public double applicaSconto() {
		double a = 0;
		 a = getPrezzoUnitario()*0.95;
		 return a;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceBarre == null) ? 0 : codiceBarre.hashCode());
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prezzoUnitario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prodotti other = (Prodotti) obj;
		if (codiceBarre == null) {
			if (other.codiceBarre != null)
				return false;
		} else if (!codiceBarre.equals(other.codiceBarre))
			return false;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
			return false;
		if (Double.doubleToLongBits(prezzoUnitario) != Double.doubleToLongBits(other.prezzoUnitario))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Prodotti [codiceBarre=" + codiceBarre + ", descrizione=" + descrizione + ", prezzoUnitario="
				+ prezzoUnitario + "]";
	}
	
		
	
	
	

}
