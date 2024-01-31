

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Podemos acceder a los atributos estáticos y cargar la clase en memoria, pero no podemos para el atributo potencia (no estático)
		System.out.println(Coche.marca);
		System.out.println(Coche.modelo);
		//System.out.println(Coche.potencia);
		
		// Instanciamos un objeto de la clase coche, le damos el parametro para inicializar.
        Coche coche1 = new Coche(788);
        
        System.out.println(coche1.mostrarInfo());
        
        
		// Invocamos un método no estático sobre el objeto instanciado con anterioridad.	
		System.out.println(coche1.acelerar());	
		
		//De esta manera invocamos el método estático. Un método estático es como un método de clase ya que no lo invocamos sobre un objeto sino nos
		// referimos a la clase.
		System.out.println(Coche.frenar());	

		
	}
		

}
