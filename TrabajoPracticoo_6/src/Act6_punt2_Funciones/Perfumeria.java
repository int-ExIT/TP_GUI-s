package Act6_punt2_Funciones;


public class Perfumeria extends Producto {
    private Long precio;
    private Integer stock;

    public Perfumeria(String nombre, Integer codigo, Long precio, Integer stock) {
        super(nombre, codigo);
        this.precio = precio;
        this.stock = stock;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
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
