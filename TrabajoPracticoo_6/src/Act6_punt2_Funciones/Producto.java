package Act6_punt2_Funciones;

import java.util.Objects;

public class Producto implements Comparable<Producto> {
    
    private String nombre;
    private Integer codigo;
    private Long precio;
    private String tipo;
    private Integer stock;

    public Producto(String nombre, Integer codigo, Long precio, String tipo, Integer stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.tipo = tipo;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.codigo);
        hash = 53 * hash + Objects.hashCode(this.precio);
        hash = 53 * hash + Objects.hashCode(this.tipo);
        hash = 53 * hash + Objects.hashCode(this.stock);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.precio, other.precio)) {
            return false;
        }
        return Objects.equals(this.stock, other.stock);
    }

    @Override
    public int compareTo(Producto t) {
        return this.getCodigo() - t.getCodigo();
    }

    @Override
    public String toString() {
        return "Producto: \nNombre: " + nombre + "\nCodigo: " + codigo + "\nPrecio: " + precio + "\nTipo: " + tipo + "\nStock: " + stock;
    }
    
}
