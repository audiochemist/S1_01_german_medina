
public class Main {
	

	public static void main(String[] args) {

	     // Carga de clase a través de la instancia de un objeto de la misma
        Viento viento1 = new Viento("flauta", 400);
        Cuerda cuerda1 = new Cuerda("cello", 500);
                
	     // Carga de clase a través del acceso a un miembro estatico de esta       
        System.out.println(Percusion.demostrarStatic());
        
        //Ahora creamos la primera instancia de un objeto Percusion, 
        //y podemos ver como ya esta cargada y no se ejectua el bloque estático de nuevo
        Percusion percusion1 = new Percusion("timbales", 300);

          
        // Siempre intentar hacer impresiones en el metodo main y no desde metodos de clases
        System.out.println(viento1.tocar());
        System.out.println(cuerda1.tocar());
        System.out.println(percusion1.tocar());



    }
		
	

}
