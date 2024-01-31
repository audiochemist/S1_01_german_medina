
public class Percusion extends Instrumento {
	
	
	
	public Percusion(String nom, int preu) {
	super(nom, preu);
	}
	
	//bloque de inicialización de instancia 
	{
	    System.out.println("Soy el bloque de inicialización de instancia de la Percusión");
		}

	//bloque estático, que también puede acceder a los atributos estáticos e inicializarlos
	 static {
	        System.out.println("Bloque estático de la clase percusion, solo se carga una vez.");
	    }
	 
	 public static String demostrarStatic() {
		return "Hola yo soy un método para demostrar la carga de la clase cuando se accede a mi";
		 
	 }

	
		@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return "Está sonando un instrumento de percusión";
	}

}
