
public class Person {
	
	private String name;
	private String surname;
	private String taxCode;
	private String city;
	
	//costruttore di default esplicito
	
	public Person() {
		name = null;
		surname = null;
		taxCode = null;
		city = null;
	}
	
	// costruttore parametrico
	
	public Person(String name, String surname, String taxCode, String city) {
		this.name = name;
		this.surname = surname;
		this.taxCode = taxCode;
		this.city = city;
	}
	
	//get & set
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	// ricavo le due cifre dell'anno sottoforma di char, li concateno aggiungendo "19" davanti e poi trasformo da string a int
	// non saprei come stabilire se la persona in questione è nata nel 1900 o nel 2000 solo dalle ultime due cifre dell'anno di nascita
	
	public int bornYear (String codFiscale) {
		char annoNascitaDecine = codFiscale.charAt(6);
		char annoNascitaUnità = codFiscale.charAt(7);
		String annoNascita = new StringBuilder("19").append(annoNascitaDecine).append(annoNascitaUnità).toString();
		int nascita = Integer.parseInt(annoNascita);
		return nascita;
		
	}

	//metodo toString
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ",";
	}
	
	
	
	
	

}
