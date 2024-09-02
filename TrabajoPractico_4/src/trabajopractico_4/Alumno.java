/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico_4;

import java.util.HashSet;

/**
 *
 * @author santi
 */
public class Alumno {
    int legajo;
    String apellido;
    String nombre;
    HashSet<Materia> listaDeMate;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        listaDeMate = new HashSet<Materia>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getListaDeMate() {
        return listaDeMate;
    }

    public void setListaDeMate(HashSet<Materia> listaDeMate) {
        this.listaDeMate = listaDeMate;
    }
    
    public boolean agregarMateria(Materia m){
        return listaDeMate.add(m);
    }
    
    public int cantidadMateria(){
        int n=0;
        
        for(Materia m:listaDeMate){
            n++;
        }
        
        return n;
    }
    
    
}
