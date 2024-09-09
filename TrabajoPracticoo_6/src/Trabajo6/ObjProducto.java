
package Trabajo6;


public class ObjProducto {
   private String nombre;
   private String Categoria;
   private Double Precio;

    public ObjProducto(String nombre, String Categoria, Double Precio) {
        this.nombre = nombre;
        this.Categoria = Categoria;
        this.Precio = Precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "ObjProducto{" + "nombre=" + nombre + ", Categoria=" + Categoria + ", Precio=" + Precio + '}';
    }
    
}
