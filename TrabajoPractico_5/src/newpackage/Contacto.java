/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author IK
 */
public class Contacto {
    long dni;
    String Nombre;
    String Apellido;
    String Ciudad;
    String Direccion;

    public Contacto(long dni, String Nombre, String Apellido, String Ciudad, String Direccion) {
        this.dni = dni;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Ciudad = Ciudad;
        this.Direccion = Direccion;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
}
