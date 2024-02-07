
public class Percusion extends Instrumento {

	public Percusion(String nom,int preu){
		super(nom, preu);
	}


	// Bloque estático, que también puede acceder a los atributos estáticos e inicializarlos
	 static {
		System.out.println("Bloque estático de la clase percusion, solo se carga una vez.");

	}
	public static String demostrarStatic(){
		return "Soy un metodo para demostrar el Static y cargar esta clase sin " +
				"instanciar un objeto de la misma";
	}
	
		@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return "Está sonando un instrumento de percusión";
	}

}
