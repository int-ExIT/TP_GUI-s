package Directorio;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Check {
    
    /**
     * true: Campos llenos.
     * false: Campos vacios.
     * 
     * @param jPanel
     * @return Boolean
     */
    public static Boolean checkField(JPanel jPanel) {
        Boolean flag = false;
        
        for (Component component : jPanel.getComponents()) {
            if (component instanceof JTextField jTextField) flag = !jTextField.getText().equals("");
        }
        
        return flag;
    }
    
    /**
     * Recetear las cajas de texto y los combobox.
     * 
     * @param jPanel 
     */
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
