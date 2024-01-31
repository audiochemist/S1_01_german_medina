
public abstract class Instrumento {
	protected String nom;
	protected int preu;

	public Instrumento (String nom, int preu){
		this.nom = nom;
		this.preu = preu;
	}
		
	 public abstract String tocar();
	 
}
