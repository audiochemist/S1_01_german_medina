
public class Cuerda extends Instrumento {

public Cuerda(String nom,int preu){
	super(nom, preu);
}
	
	//bloque estático
	 static {
	        System.out.println("Bloque estático de la clase cuerda, solo se carga una vez");
	    }
	  
	
	@Override 
	public String tocar() {
		// TODO Auto-generated method stub
		return "Está sonando un instrumento de cuerda";
	}

}
