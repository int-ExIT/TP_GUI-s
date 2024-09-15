package Act6_punt2_Funciones;

public class Caps {
    
    private String nombre;
    private String dato;

    public Caps(String nombre, String dato) {
        this.nombre = nombre;
        this.dato = dato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato.toUpperCase().charAt(0) + dato.substring(1, dato.length()).toLowerCase();
    }

    @Override
    public String toString() {
        return "Box[Nombre: " + nombre + ", Dato: " + dato + "]";
    }
    
}
