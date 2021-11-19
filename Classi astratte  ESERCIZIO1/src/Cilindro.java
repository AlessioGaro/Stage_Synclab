

public class Cilindro extends Tridimensionali {
	
	double raggio;
	
	public double calcolaArea() {
		area = raggio*raggio* Math.PI;
		System.out.println("l'area del cilindro in input è di " + area);
		return area;
	}
	
	

}
