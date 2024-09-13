package Act6_punt2_Funciones;

public class Limpieza extends Producto {
    private Integer precio;
    private Integer stock;

    public Limpieza(String nombre, Integer codigo, Integer precio, Integer stock) {
        super(nombre, codigo);
        this.precio = precio;
        this.stock = stock;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPrecio: " + precio + "\nStock: " + stock + "\n";
    }
}
