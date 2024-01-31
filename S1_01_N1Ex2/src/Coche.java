
public class Coche {
	
	// Las variables estáticas son inicializadas cuando se carga la clase, antes de que instanciemos un
	//objeto o se pueda ejecutar. Se puede inicializar directamente en la declaración o únicamente con un bloque estático.
	public static final String marca = "Renault";
	public static String modelo = "Modelo 1";

	public final int potencia;
	
	// Constructor. Inicializamos nuestros atributos, solo incilializamos la potencia porque es el unico que pertenece al objeto y no a la clase
	public Coche (int potencia) {
		this.potencia = 789;
	}
	
	//Getters
		
	public int getPotencia() {
			return this.potencia;
	}
		
	public String getModelo() {
			return Coche.modelo;
	}
	
	//Métodos
	
	public static String frenar() {
		return "Este vehículo está frenando";		
	}
	
	public String acelerar() {
		return "Este vehículo está acelerando";				
	}
		
	public String mostrarInfo() {
		return "Este coche es de la marca: " + Coche.marca + "." 
				+ "\nEs del modelo: " + this.getModelo() +
				"\nTiene una potencia de: " + this.getPotencia();
		
	}
	
}
