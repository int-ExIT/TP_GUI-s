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
    
    
    public static Boolean checkField(JPanel panel) {
        Boolean flag = false;

        for (Component component : panel.getComponents()) {
            if (component instanceof JTextField jTextField) {
                flag = !jTextField.getText().equals("");
            }
        }

        return flag;
    }
    
    public static void capturarCampos(JPanel panel) {
        box.clear();
        
        String nombre = "";
        String dato = "";
        
        for (Component componente : panel.getComponents()) {
            
            switch (componente) {
                case JTextField texto -> {
                    nombre = texto.getName();
                    dato = texto.getText();

                    texto.setText("");
                }
                case JSpinner spinner -> {
                    nombre = spinner.getName();
                    dato = spinner.getValue().toString();

                    spinner.setValue(0);
                }
                case JComboBox combo -> {
                    nombre = combo.getName();

                    dato = (String)combo.getSelectedItem();
                }
                default ->{
                }
            }
            
            if (!dato.equals("")) {
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
        
        productoEncontrado.clear();
        
        if (FLAG == 0) {
            Producto producto = new Producto(nom, codigo, precio, tipo, stock);
            productos.add(producto);
            
            productoEncontrado.add(producto);
        }else {
            for (Producto producto : productos) {
                if (producto.getCodigo() == codigoBusqueda) {
                    
                    if (!nom.equals("")) producto.setNombre(nom);
                    
                    if (codigo != 0) producto.setCodigo(codigo);
                    
                    if (precio != 0) producto.setPrecio(precio);
                    
                    if (stock != -1) producto.setStock(stock);
                    
                    producto.setTipo(tipo);
                    
                    productoEncontrado.add(producto);
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

        mTabla.addColumn("N°");
        mTabla.addColumn("Codigo");
        mTabla.addColumn("Nombre");
        mTabla.addColumn("Tipo");
        mTabla.addColumn("Stock");
        mTabla.addColumn("Precio");

        tabla.setModel(mTabla);
    }
    
    public static void setRow(JTable tabla) {
        if (FLAG == 4) {
            productoEncontrado.addAll(productos);
            
            FLAG = 0;
        }
        
        Integer cont = 0;
        
        for (Producto producto : productoEncontrado) {
            cont++;
            mTabla.addRow(new Object[]{
                cont,
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
    
    public static void color(JPanel panel) {
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
        Producto p4 = new Producto("Talco", 15234, 2300L, "Perfumeria", 28);
        Producto p5 = new Producto("Bondiola", 15235, 4000L, "Comestible", 8);
        Producto p6 = new Producto("Antitraspirante", 15236, 2700L, "Perfumeria", 37);
        Producto p7 = new Producto("Detergente", 15237, 1000L, "Limpieza", 3);
        Producto p8 = new Producto("Asado", 15238, 5000L, "Comestible", 15);
        Producto p9 = new Producto("Esmalte", 15239, 500L, "Perfumeria", 9);
        Producto p10 = new Producto("Dior", 15240, 6000L, "Perfumeria", 3);
        Producto p11 = new Producto("Lechuga", 15241, 400L, "Comestible", 20);
        Producto p12 = new Producto("Palta", 152342, 3000L, "Comestible", 9);
        Producto p13 = new Producto("Cepillo Dientes", 15243, 1200L, "Limpieza", 30);
        Producto p14 = new Producto("Brilla Piso", 15244, 1700L, "Limpieza", 10);
        Producto p15 = new Producto("Costillas", 15245, 5500L, "Comestible", 11);
        Producto p16 = new Producto("Shampoo", 15246, 2300L, "Limpieza", 18);
        Producto p17 = new Producto("Tomate", 15247, 1000L, "Comestible", 8);
        Producto p18 = new Producto("Zanahoria", 15248, 700L, "Comestible", 17);
        
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
        productos.add(p7);
        productos.add(p8);
        productos.add(p9);
        productos.add(p10);
        productos.add(p11);
        productos.add(p12);
        productos.add(p13);
        productos.add(p14);
        productos.add(p15);
        productos.add(p16);
        productos.add(p17);
        productos.add(p18);
    }
}
