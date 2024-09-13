package Act6_punt2_Funciones;

import java.util.Objects;

public class Perfumeria extends Producto {
    private Integer codigo;
    private Integer stock;

    public Perfumeria(String nombre, Integer precio, Integer codigo, Integer stock) {
        super(nombre, precio);
        this.codigo = codigo;
        this.stock = stock;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.codigo);
        hash = 73 * hash + Objects.hashCode(this.stock);
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
        final Perfumeria other = (Perfumeria) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return Objects.equals(this.stock, other.stock);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCodigo: " + codigo + "\nStock: " + stock;
    }
}
