public class VentaVaciaExcepcion extends Exception {

    public VentaVaciaExcepcion(){
        super("Para hacer una venta primero debes añadir productos");
    }

}
