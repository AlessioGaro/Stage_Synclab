
public class Employee extends Person {
	
	public int annoAssunzione;
	public int stipendio;
	
	public Employee() {
		super();
		this.annoAssunzione = 0;
		this.stipendio = 0;
		
	}
	
	public Employee(String name, String surname, String taxCode, String city, int annoAssunzione, int stipendio) {
		super(name, surname, taxCode, city);
		this.annoAssunzione = annoAssunzione;
		this.stipendio = stipendio;
	}

	public int getAnnoAssunzione() {
		return annoAssunzione;
	}

	public void setAnnoAssunzione(int annoAssunzione) {
		this.annoAssunzione = annoAssunzione;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return super.toString() + "[annoAssunzione=" + annoAssunzione + ", stipendio=" + stipendio + "]"; 
	}
	
	public boolean gainsMore(Employee emp) {
		if(this.stipendio > emp.stipendio) {
			return true; }
			else return false;
	}
		

}
