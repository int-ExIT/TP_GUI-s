/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author IK
 */
public class Directorio {

    private TreeMap<Long, Contacto> ListaCont;
//constructor

    public Directorio() {
        ListaCont = new TreeMap< Long, Contacto>();
    }

    public void agregarContacto(Long tel, Contacto cont) {
        ListaCont.put(tel, cont);
    }

    public Contacto buscarContacto(Long tel) {

        for (Long telef : ListaCont.keySet()) {
            if (telef == tel) {
                return ListaCont.get(tel);
            }
        }
        return null;
    }

    public Set bucarTelefono(String ape) {
        Set<Long> listNumeros = new TreeSet<Long>();

        for (Map.Entry<Long, Contacto> entry : ListaCont.entrySet()) {
            if (entry.getValue().getApellido().equals(ape)) {
                listNumeros.add(entry.getKey());
            }
        }

        return listNumeros;
    }

    public ArrayList buscarContactos(String ciu) {
        ArrayList<Contacto> listContacto = new ArrayList();

        for (Contacto c : ListaCont.values()) {
            if (c.getCiudad().equals(ciu)) {
                listContacto.add(c);

                //*  if (ciu != null && ciu.equals(c.getCiudad())) { //Estuve viendo y leyendo algo de teoria 
                //* listContacto.add(c);                    y se me ocurrio probar este metodo para que ciu no de nulo antes de comparar
            }
        }

        return listContacto;
    }

    //Quedamos para debatir
    public void borrarContacto(Long tel) {
        ListaCont.remove(tel);
    }


 
 
 
 
 
 
}
