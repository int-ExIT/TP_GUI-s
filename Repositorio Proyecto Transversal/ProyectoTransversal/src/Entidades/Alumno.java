
package Entidades;

import java.time.LocalDate;
import java.util.Objects;
import java.util.logging.Logger;


public class Alumno {
    String nombre;
    LocalDate fechaNac;
    boolean estado;

    public Alumno(String nombre, LocalDate fechaNac, boolean estado) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.estado = estado;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.fechaNac);
        hash = 89 * hash + (this.estado ? 1 : 0);
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
        final Alumno other = (Alumno) obj;
        if (this.estado != other.estado) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.fechaNac, other.fechaNac);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + ", estado=" + estado + '}';
    }
    private static final Logger LOG = Logger.getLogger(Alumno.class.getName());
    
}
