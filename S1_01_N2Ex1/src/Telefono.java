
public class Telefono {

	protected String marca;
	protected String modelo;

	public Telefono (String marca, String modelo) {
		this.modelo = modelo;
		this.marca = marca;
	}


	public String llamar(String numTelefono) {
		return "Se está llamando al número " + numTelefono;

	}



}
