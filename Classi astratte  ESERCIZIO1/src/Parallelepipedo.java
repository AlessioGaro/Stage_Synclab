
public class Parallelepipedo extends Tridimensionali {
	
	double lato1;
	double lato2;
	
	
	public double calcolaArea() {
		area = lato1*lato2;
		System.out.println("l'area del parallelepipedo in input è di " + area);
		return area;
	}

}
