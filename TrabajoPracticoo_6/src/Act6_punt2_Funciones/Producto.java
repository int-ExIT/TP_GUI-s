package Act6_punt2_Funciones;

import java.util.Objects;

public class Producto implements Comparable<Producto> {
    
    private String nombre;
    private Integer precio;

    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto: \nNombre=: " + nombre + "\nPrecio: " + precio;
    }

    @Override
    public int compareTo(Producto t) {
        return this.getNombre().compareTo(t.getNombre());
    }
    
}
