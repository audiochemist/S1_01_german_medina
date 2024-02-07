import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Producto> listaProductos = new ArrayList<>();

        Producto producto1 = new Producto("manzana", 45);
        Producto producto2 = new Producto("platano", 12);

        //Al no añadir ninguno de los productos a la lista (comentados) y esta estar vacía,
        //Se lanza y se atrapa una excepción de tipo ArrayIndexOutOfBoundsException

        // listaProductos.add(producto1);
        //listaProductos.add(producto2);


    new Venta(listaProductos);


    }

}
