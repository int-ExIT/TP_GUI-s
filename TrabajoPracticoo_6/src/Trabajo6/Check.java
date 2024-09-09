package Trabajo6;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Check {
    private static DefaultTableModel mTabla;
    
    public static void setColum(JTable tabla) {
        mTabla = new DefaultTableModel() {
            public boolean celdaEditable(int fila, int col) {
                return false;
            }
        };

        mTabla.addColumn("Nombre");
        mTabla.addColumn("Categoria");
        mTabla.addColumn("Precio");
                
        tabla.setModel(mTabla);
    }
    
    public static void setRow(JTable tabla, JTextField text) {
       // for (Contacto contacto : contactos) {
            mTabla.addRow(new Object[]{
                text.getText()
                
            //    contacto.getTelefono(),
             //   contacto.getNombre(),
             //   contacto.getApellido(),
            //    contacto.getCiudad(),
             //   contacto.getDireccion(),
             //   contacto.getDNI()
            });
        //}
        
        tabla.setModel(mTabla);
        
        
    }
    
    public static Boolean checkField(JPanel jPanel) {
        Boolean flag = false;
        
        for (Component component : jPanel.getComponents()) {
            if (component instanceof JTextField jTextField) flag = !jTextField.getText().equals("");
        }
        
        return flag;
    }
    
    
    public static void cleanField(JPanel jPanel) {
        for (Component component : jPanel.getComponents()) {
            if (component instanceof JTextField jTextField) {
                JTextField box = (JTextField) component;
                box.setText("");
            }
            
            if (component instanceof JComboBox jComboBox) {
                JComboBox cBox = (JComboBox) component;
                cBox.setSelectedIndex(-1);
            }
        }
    }
    
}
