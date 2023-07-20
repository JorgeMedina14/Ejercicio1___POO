public class Electronico extends Producto{
    private String marca;
    public Electronico(int id, String nombre, double precio, int cantidad,String marca) {
        super(id, nombre, precio, cantidad);
    }

    public String getMarca(){
        return marca;
    }
    public void SetMarca(){
        this.marca = marca;
    }

    public double Calculardescuento(double Porcentajedescuento){
        return getPrecio() * (1- Porcentajedescuento / 100);
    }
}
