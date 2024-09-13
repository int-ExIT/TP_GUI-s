package Act6_punt2_Funciones;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JComboBox;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Funcion {
    
    private static final Set<Producto> productos = new TreeSet();
    private static final ArrayList<String> datos = new ArrayList();
    
    public static void capturarCapos(JPanel panel) {
        for (Component componente : panel.getComponents()) {
            switch (componente) {
                case JTextField texto -> {
                    if (!texto.getText().equals("")) datos.add(texto.getToolTipText() + texto.getText());
                }
                case JComboBox combo -> {
                    if (!combo.getSelectedItem().equals("")) datos.add(combo.getToolTipText() + (String)combo.getSelectedItem());
                }
                case JSpinner spinner -> {
                    datos.add(spinner.getToolTipText() + spinner.getValue().toString());
                }
                default ->{
                }
            }
        }
    }
    
    public static void crearObjeto() {
        String nombre = "";
        String tipo = "";
        Integer codigo = 0;
        Integer precio = 0;
        Integer stock = 0;
        Producto producto = new Producto();
        
        String[] TIPO = new String[] {"A", "B", "C", "D", "E"};
        
        for (String dato : datos) {
            for (String letra : TIPO) {
                if (dato.startsWith(letra)) {
                    String FILTRO = dato.substring(1);
                    
                    switch (letra) {
                        case "A" -> {
                            nombre = FILTRO;
                        }
                        case "B" -> {
                            precio = Integer.valueOf(FILTRO);
                        }
                        case "C" -> {
                            tipo = FILTRO;
                        }
                        case "D" -> {
                            codigo = Integer.valueOf(FILTRO);
                        }
                        case "E" -> {
                            stock = Integer.valueOf(FILTRO);
                        }
                        default -> {
                        }
                    }
                }
            }
        }

        switch (tipo) {
            case "Comestible" -> {
                producto = new Comestible(nombre, precio, codigo, stock);
            }
            case "Limpieza" -> {
                producto = new Limpieza(nombre, precio, codigo, stock);
            }
            case "Perfumeria" -> {
                producto = new Perfumeria(nombre,precio, codigo, stock);
            }
            default -> {}
        }
        
        System.out.println("El producto es un Comestibe: " + (producto instanceof Comestible));
        System.out.println("El producto es de Limpieza: " + (producto instanceof Limpieza));
        System.out.println("El producto es un Perfume: " + (producto instanceof Perfumeria));
        
        productos.add(producto);
        
        System.out.println(productos.toString());
        System.out.println("");
        System.out.println(productos.size());
    }
}
