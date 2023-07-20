
public class Main {
    public static void main(String[] args) {
        Producto producto_1 = new Producto(1, "Refigerador", 5000, 1);
        Electronico producto_2 = new Electronico(2, "Telefono", 10000,1, "Iphone");

        System.out.println("Descuento aplicado al Telefono: "+producto_2.Calculardescuento(10)+"Q");

        Orden orden = new Orden();
        orden.Agregar(producto_1);
        orden.Agregar(producto_2);

        orden.Mostrar();
    }
}