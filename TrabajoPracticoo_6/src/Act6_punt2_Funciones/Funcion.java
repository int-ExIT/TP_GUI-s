package Act6_punt2_Funciones;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JComboBox;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Funcion {
    
    private static final Set<Producto> productos = new TreeSet();
    private static final ArrayList<Caps> box = new ArrayList();
    private static final ArrayList<Producto> productoEncontrado = new ArrayList();
    
    private static int FLAG = 0;
    private static int codigoBusqueda = 0;
    private static Color color = new Color(255,255,255);
    private static DefaultTableModel mTabla;
    
    
    public static void capturarCampos(JPanel panel) {
        String nombre = "";
        String dato = "";
        box.clear();
        
        for (Component componente : panel.getComponents()) {
            switch (componente) {
                case JTextField texto -> {
                    if (!texto.getText().equals("")) {
                        nombre = texto.getName();
                        dato = texto.getText();
                        
                        texto.setText("");
                    }
                }
                case JComboBox combo -> {
                    nombre = combo.getName();
                    dato = (String)combo.getSelectedItem();
                }
                case JSpinner spinner -> {
                    if (!spinner.getValue().toString().equals("0")) {
                        nombre = spinner.getName();
                        dato = spinner.getValue().toString();

                        spinner.setValue(0);
                    }
                }
                default ->{
                }
            }
            
            if (!nombre.equals(null)) {
                Caps caps = new Caps(nombre, dato);
                box.add(caps);
            }
        }
    }
    
    public static void crearObjeto() {
        int codigo = 0;
        String nom = "";
        long precio = 0L;
        String tipo = "";
        int stock = -1;
        
        for (Caps datos : box) {
            switch (datos.getNombre()) {
                case "codigo" -> {
                    codigo = Integer.parseInt(datos.getDato());
                }
                case "nombre" -> {
                    nom = datos.getDato();
                }
                case "tipo" -> {
                    tipo = datos.getDato();
                }
                case "stock" -> {
                    stock = Integer.parseInt(datos.getDato());
                }
                case "precio" -> {
                    precio = Long.parseLong(datos.getDato());
                }
                default -> {
                }
            }
        }
        
        if (FLAG == 0) {
            Producto producto = new Producto(nom, codigo, precio, tipo, stock);
            productos.add(producto);
        }else {
            for (Producto producto : productos) {
                if (producto.getCodigo() == codigoBusqueda) {
                    if (!nom.equals("")) producto.setNombre(nom);
                    
                    if (codigo != 0) producto.setCodigo(codigo);
                    
                    if (precio != 0) producto.setPrecio(precio);
                    
                    if (stock != -1) producto.setStock(stock);
                    
                    producto.setTipo(tipo);
                }
            }
        }
        
        System.out.println(box.toString());
    }

    public static boolean buscarObjeto(JTextField codigo, JTextField name, JComboBox categoria) {
        productoEncontrado.clear();
        boolean resultado = false;
        
        int precioMin = 0;
        int precioMax = 0;
        
        for (Producto producto : productos) {
            switch (FLAG) {
                case 1 -> {
                    String nombreBusqueda = name.getText();
                    
                    if (producto.getNombre().equals(nombreBusqueda)) {
                        productoEncontrado.add(producto);

                        resultado = true;
                    }
                }
                case 2 -> {
                    String categoriaBusqueda = categoria.getSelectedItem().toString();
                    
                    if (producto.getTipo().equals(categoriaBusqueda)) {
                        productoEncontrado.add(producto);

                        resultado = true;
                    }
                }
                case 3 -> {
                    if (producto.getPrecio() > precioMin && producto.getPrecio() < precioMax) {
                        productoEncontrado.add(producto);

                        resultado = true;
                    }
                }
                default -> {
                    if (!codigo.getText().equals("")) {
                        codigoBusqueda = Integer.parseInt(codigo.getText());

                        if (producto.getCodigo() == codigoBusqueda) {
                            productoEncontrado.add(producto);

                            resultado = true;
                        }
                    }
                }
            }
        }

        return resultado;
    }
    
    public static void modificarObjeto(JPanel panel, JButton buscar, JButton guardar, JButton eliminar, JTextField texto) {
        Color GREEN = new Color(102,255,102);
        Color RED = new Color(255,102,102);
        
        switch (FLAG) {
            case 0 -> {
                texto.setFocusable(true);
                texto.setBackground(GREEN);
                buscar.setBackground(Color.green);
                eliminar.setText("Cancelar");

                FLAG = -1;
            }
            case -1 -> {
                if (!productoEncontrado.isEmpty()) {
                    texto.setBackground(Color.white);
                    buscar.setBackground(Color.blue);
                    guardar.setBackground(Color.green);
                    
                    color = GREEN;
                    color(panel);
                    
                    FLAG = -2;
                }else texto.setBackground(RED);
            }
            case -2 -> {
                guardar.setBackground(Color.blue);
                buscar.setBackground(Color.blue);
                eliminar.setText("Eliminar");
                color(panel);
                
                FLAG = 0;
            }
        }
    }
    
    public static void eliminarObjeto() {
        for (Producto producto : productoEncontrado) {
            productos.remove(producto);
        }
    }
    
    public static void setColum(JTable tabla) {
        mTabla = new DefaultTableModel() {
            public boolean celdaEditable(int fila, int col) {
                return false;
            }
        };

        mTabla.addColumn("Codigo");
        mTabla.addColumn("Nombre");
        mTabla.addColumn("Tipo");
        mTabla.addColumn("Stock");
        mTabla.addColumn("Precio");

        tabla.setModel(mTabla);
    }
    
    public static void setRow(JTable tabla) {
        for (Producto producto : productoEncontrado) {
            mTabla.addRow(new Object[]{
                producto.getCodigo(),
                producto.getNombre(),
                producto.getTipo(),
                producto.getStock(),
                producto.getPrecio(),
            });
        }

        tabla.setModel(mTabla);
    }
    
    public static void resetTable(JTable tabla) {
        int x = mTabla.getRowCount()-1;
        
        for (int c = x; c >= 0; c--) {
            mTabla.removeRow(c);
        }
    }
    
    public static Set<Producto> getProductos() {
        return productos;
    }

    public static int getFLAG() {
        return FLAG;
    }

    public static void setFLAG(int FLAG) {
        Funcion.FLAG = FLAG;
    }
    
    private static void color(JPanel panel) {
        for (Component component : panel.getComponents()) {
            switch (component) {
                case JTextField texto -> {
                    texto.setText("");
                    texto.setBackground(color);
                }
                case JComboBox combo -> {
                    combo.setBackground(color);
                }
                case JSpinner spinner -> {
                    spinner.setValue(0);
                    spinner.setBackground(color);
                }
                default ->{
                }
            }
        }
        
        color = new Color(255,255,255);
    }
    
    public static void cargarFuncion() {
        Producto p1 = new Producto("Lavandina", 15231, 2500L, "Limpieza", 5);
        Producto p2 = new Producto("Jabon", 15232, 700L, "Limpieza", 10);
        Producto p3 = new Producto("Costeletas", 15233, 4500L, "Comestible", 11);
        Producto p4 = new Producto("Paco", 15234, 2300L, "Perfumeria", 28);
        Producto p5 = new Producto("Bondiola", 15235, 4000L, "Comestible", 8);
        Producto p6 = new Producto("Antitraspirante", 15236, 2700L, "Perfumeria", 37);
        
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
    }
}
