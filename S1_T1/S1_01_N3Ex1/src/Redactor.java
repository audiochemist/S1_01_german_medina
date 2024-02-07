import java.util.ArrayList;

public class Redactor {

	private ArrayList<Noticia> noticias;
	private String nombre;
	private final String dni;
	private static int sueldo;
	
	
	public Redactor(String nombre, String dni, int sueldo) {
		this.nombre = nombre;
		this.dni = dni;
		Redactor.sueldo = 1500;
		
	}
	
	
}
