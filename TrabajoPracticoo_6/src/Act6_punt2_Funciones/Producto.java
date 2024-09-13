package Act6_punt2_Funciones;

import java.util.Objects;

public class Producto implements Comparable<Producto> {
    
    private String nombre;
    private Integer codigo;

    public Producto(String nombre, Integer codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Producto() {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nombre);
        hash = 19 * hash + Objects.hashCode(this.codigo);
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
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "\nProducto: \nNombre=: " + nombre + "\nCodigo: " + codigo;
    }

    @Override
    public int compareTo(Producto t) {
        return this.getCodigo() - t.getCodigo();
    }
    
}
