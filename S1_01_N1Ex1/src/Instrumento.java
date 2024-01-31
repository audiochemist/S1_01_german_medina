
public abstract class Instrumento {

	protected String nom;
	protected int preu;
	
	public Instrumento (String nom, int preu) {
		this.nom = nom;
		this.preu = preu;
	}
	
	 public int getPreu() {
	        return this.preu;
	    }

	    public String getNom() {
	        return this.nom;
	    }
	
		
	 public abstract String tocar();
	 
}
