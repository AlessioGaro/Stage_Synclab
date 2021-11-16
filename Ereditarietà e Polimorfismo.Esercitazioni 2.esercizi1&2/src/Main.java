
public class Main {

	public static void main(String[] args) {
		
		//ESERCIZIO 1
		
		Person Alessio = new Person("Alessio", "Garofalo", "GRFLSM95C29B300N", "Legnano");
		int annoNascita = Alessio.bornYear(Alessio.getTaxCode());
		
		String s = Alessio.toString();
		System.out.println(s +" annoNascita=" + annoNascita + "]");
	
		Stagista a = new Stagista("Ludovico", "aa", "QWUFYR67FHCFHC", "Milano", 12, 57);
		Stagista b = new Stagista("Giorgio", "bb", "QWUFYR95FHCFHC", "Genova", 15, 58);
		Stagista c = new Stagista("Carlo", "cc", "QWUFYR88FHCFHC", "Ventimiglia", 111, 59);
		
		Stagista[] array = new Stagista[3];
		
		array[0] = a;
		array[1] = b;
		array[2] = c;
		
		Stagista temp = new Stagista();
		
		for(int i=1; i<array.length; i++) {
			if(array[i-1].bornYear(array[i-1].getTaxCode()) >=  array[i].bornYear(array[i].getTaxCode())) {
				temp = array[i-1]; }
				else   temp = array[i];
			}
		
		System.out.println("Lo stagista più giovane è " + temp.getName());
		
		//ESERCIZIO 2
		
		System.out.println("ESERCIZIO 2");
		
		Employee Andrea = new Employee();
		Andrea.setStipendio(20000);
		Andrea.setName("Andrea");
		
		Employee Davide = new Employee();
		Davide.setStipendio(24500);
		Davide.setName("Davide");
		
		
		Employee Gianmarco = new Employee();
		Gianmarco.setStipendio(22500);
		Gianmarco.setName("Gianmarco");
		
		Employee[] arrayE = new Employee[3];
		
		arrayE[0] = Andrea;
		arrayE[1] = Davide;
		arrayE[2] = Gianmarco;
		
		for (int i=1; i<arrayE.length; i++) {
			for(int j=i; j>0; j--) {
				if (arrayE[j].getStipendio() < arrayE [j - 1].getStipendio()) {
				     Employee tempp = arrayE[j];
				      arrayE[j] = arrayE[j - 1];
				      arrayE[j - 1] = tempp;
				      }
				}
			
		}
		
		for (int i = 0; i < array.length; i++) {
		     System.out.println(arrayE[i].getName() + " " + arrayE[i].stipendio);
		   }
		
			
	}
}
