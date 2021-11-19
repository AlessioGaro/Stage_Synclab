
public abstract class Tridimensionali {
	
	String nome;
	double altezza;
	double area;
	
	@Override
	public String toString() {
		return "tipo di oggetto: " + nome + " con area = " + area + " e altezza = " + altezza;
	}

	public abstract double calcolaArea();
	
	public double calcolaVolume() {
		double volume = area * altezza;
		System.out.println(toString() + " ha un volume di " + volume);
		return volume;
	}

	
}
