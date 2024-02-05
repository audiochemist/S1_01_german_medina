import java.util.ArrayList;
public class Venta {

    private ArrayList<Producto> listaProductos;
    private double precioTotal;

    public Venta(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
        try {
            this.precioTotal = this.calcularTotal();
        } catch (VentaVaciaExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

    public double calcularTotal() throws VentaVaciaExcepcion {
        if (this.listaProductos.isEmpty()) {
            throw new VentaVaciaExcepcion();
        }
        return this.listaProductos.stream().mapToDouble(Producto::getPrecio).sum();



    }
}
