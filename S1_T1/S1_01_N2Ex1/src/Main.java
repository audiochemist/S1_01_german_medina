import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);

		String numTelefono = "";

		System.out.println("Introduce el numero de telefono al que quieres llamar:");
		numTelefono = sc.next();

		//Instanciar objeto
		Smartphone smartphone1 = new Smartphone("Xiaomi", "Redmi");

		//Utilizar todos los métodos
		System.out.println(smartphone1.llamar(numTelefono));
		smartphone1.fotografiar();
		smartphone1.alarma();

	}

}



