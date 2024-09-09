package Directorio;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Funciones Directorio
 * 
 * @author ignacio
 */
public class FD {
    
    public static Map<Long, Contacto> directorio = new TreeMap(); 
    private static final Set<Contacto> contactos = new HashSet();
    private static DefaultTableModel mTabla;

    public static void addContacto(String nombre, String apellido, String ciudad, String direccion, Integer DNI, Long telefono) {
        Contacto contacto = new Contacto(nombre, apellido, ciudad, direccion, DNI, telefono);

        directorio.put(telefono, contacto);
    }
    
    public static void setColum(JTable tabla) {
        mTabla = new DefaultTableModel() {
            public boolean celdaEditable(int fila, int col) {
                return false;
            }
        };

        mTabla.addColumn("Telefono");
        mTabla.addColumn("Nombre");
        mTabla.addColumn("Apellido");
        mTabla.addColumn("Ciudad");
        mTabla.addColumn("Direccion");
        mTabla.addColumn("DNI");
        
        tabla.setModel(mTabla);
    }
    
    public static void buscar(String serch, int flag) { //Crear una varibale booleana
        contactos.removeAll(contactos);
        Boolean val = false;
        
        for (Map.Entry<Long, Contacto> datos : directorio.entrySet()) {
            switch (flag) {
                case 1: //<---Buscar Contactos x N°
                    Long numero = Long.valueOf(serch);

                    val = datos.getKey().equals(numero);
                    
                    break;
                case 2: //<---Buscar Contactos x Apellido
                    String apellido = datos.getValue().getApellido().toUpperCase();
                    
                    val = apellido.equals(serch.toUpperCase());
                    
                    break;
                case 3: //<---Buscar Contactos x Ciudad
                    String ciudad = datos.getValue().getCiudad().toUpperCase();
                    
                    val = ciudad.equals(serch.toUpperCase());
                    
                    break;
                case 4: //<---Mostrar Todos los Contactos
                    contactos.add(datos.getValue());
                    
                    break;
            }
            if (val) contactos.add(datos.getValue());
        }
    }
    
    public static void setRow(JTable tabla) {
        for (Contacto contacto : contactos) {
            mTabla.addRow(new Object[]{
                contacto.getTelefono(),
                contacto.getNombre(),
                contacto.getApellido(),
                contacto.getCiudad(),
                contacto.getDireccion(),
                contacto.getDNI()
            });
        }
        
        tabla.setModel(mTabla);
        
        contactos.removeAll(contactos);
    }
    
    public static void resetTable(JTable tabla) {
        int x = mTabla.getRowCount()-1;
        
        for (int c = x; c >= 0; c--) {
            mTabla.removeRow(c);
        }
    }
    
    public static void remContacto(Long serch) {
        directorio.remove(serch);
    }

    public static Set<Contacto> getContactos() {
        return contactos;
    }

    public static Map<Long, Contacto> getDirectorio() {
        return directorio;
    }

}
