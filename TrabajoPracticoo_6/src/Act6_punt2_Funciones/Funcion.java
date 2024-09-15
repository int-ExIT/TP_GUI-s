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
import javax.swing.JTextField;

public class Funcion {
    
    private static final Set<Producto> productos = new TreeSet();
    private static final ArrayList<Object> datos = new ArrayList();
    
    private static int FLAG = 0;
    private static int codigoBusqueda = 0;
    private static Color color = new Color(255,255,255);
    
    private static int codigo = 0;
    private static String nombre = "";
    private static long precio = 0L;
    private static String tipo = "";
    private static int stock = 0;

    
    public static void capturarCampos(JPanel panel) {
        codigo = 0;
        nombre = "";
        precio = 0L;
        tipo = "";
        stock = 0;
        datos.clear();
        
        for (Component componente : panel.getComponents()) {
            switch (componente) {
                case JTextField texto -> {
                    if (!texto.getText().equals("")) {
                        datos.add(texto.getToolTipText() + texto.getText());
                        
                        texto.setText("");
                    }
                    
                    texto.setBackground(color);
                }
                case JComboBox combo -> {
                    datos.add(combo.getToolTipText() + (String)combo.getSelectedItem());
                
                    combo.setBackground(color);
                }
                case JSpinner spinner -> {
                    datos.add(spinner.getToolTipText() + spinner.getValue().toString());
                    
                    spinner.setValue(0);
                    spinner.setBackground(color);
                }
                default ->{
                }
            }
        }
        
        color = new Color(255,255,255);
    }
    
    public static void setearValores() {
        String[] TIPO = new String[] {"A", "B", "C", "D", "E"};
        
        for (Object dato : datos) {
            for (String letra : TIPO) {
                if (dato.toString().startsWith(letra)) {
                    String FILTRO = dato.toString().substring(1);
                    
                    switch (letra) {
                        case "A" -> {
                            codigo = Integer.parseInt(FILTRO);
                        }
                        case "B" -> {
                            nombre = FILTRO;
                        }
                        case "C" -> {
                            tipo = FILTRO;
                        }
                        case "D" -> {
                            stock = Integer.parseInt(FILTRO);
                        }
                        case "E" -> {
                            precio = Long.parseLong(FILTRO);
                        }
                        default -> {
                        }
                    }
                }
            }
        }
        
        datos.clear();
    }
    
    public static void crearObjeto() {
        Producto producto = new Producto(nombre, codigo, precio, tipo, stock);
        productos.add(producto);
    }
    
    public static boolean buscarObjeto(JTextField texto) {
        codigoBusqueda = Integer.parseInt(texto.getText());
        boolean resultado = false;
        
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigoBusqueda) {
                datos.add(producto);
                
                resultado = true;
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

                FLAG = 1;
            }
            case 1 -> {
                if (!datos.isEmpty()) {
                    texto.setBackground(Color.white);
                    buscar.setBackground(Color.blue);
                    guardar.setBackground(Color.green);
                    
                    color = GREEN;
                    capturarCampos(panel);
                    
                    FLAG = 2;
                }else texto.setBackground(RED);
            }
            case 2 -> {
                guardar.setBackground(Color.blue);
                buscar.setBackground(Color.blue);
                eliminar.setText("Eliminar");
                
                for (Producto producto : productos) {
                    if (producto.getCodigo() == codigoBusqueda) {
                        if (codigo != 0) producto.setCodigo(codigo);
                        if (!nombre.equals("")) producto.setNombre(nombre);
                        if (precio != 0) producto.setPrecio(precio);
                        if (!tipo.equals("")) producto.setCodigo(codigo);
                        if (stock != 0) producto.setStock(stock);
                    }
                }
                
                datos.clear();
                FLAG = 0;
            }
        }
    }

    public static Set<Producto> getProductos() {
        return productos;
    }

    public static int getFLAG() {
        return FLAG;
    }
    
}
