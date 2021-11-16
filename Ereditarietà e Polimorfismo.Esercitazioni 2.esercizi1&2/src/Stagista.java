
public class Stagista extends Person {
	
	private int numberOfPresence;
	private int idNumber;
	
	public Stagista() {
		super();
		numberOfPresence = 0;
		idNumber = 0;
	}
	
	public Stagista(String name, String surname, String taxCode, String city, int numberOfPresence, int idNumber) {
		super(name, surname, taxCode, city);
		this.numberOfPresence = numberOfPresence;
		this.idNumber = idNumber;
	}

	public int getNumberOfPresence() {
		return numberOfPresence;
	}

	public void setNumberOfPresence(int numberOfPresence) {
		this.numberOfPresence = numberOfPresence;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	
	

}
