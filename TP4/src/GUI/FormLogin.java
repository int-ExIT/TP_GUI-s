package GUI;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JDialog;

public class FormLogin extends javax.swing.JFrame {

    private final JDialog dialogo;
    private final Container contenedor;

    public FormLogin() {
        initComponents();
        this.dialogo = new JDialog();
        this.contenedor = dialogo.getContentPane();
        dialogo.setLayout(null);
        contenedor.setLayout(null);
        setLocationRelativeTo(null);
    }
    
    private void jDialog() {
        dialogo.setSize(300, 0);
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
    }    

    private void confirmarUsuario() {
        if (jTUsusario.getText().equals("alumno@ulp.edu.ar") && jPContrasenia.getText().equals("12345678")) {
            contenedor.setBackground(Color.green);
            dialogo.setTitle("Operacion Exitosa.");
            jDialog();
        }else {
            contenedor.setBackground(Color.red);
            dialogo.setTitle("Operacion Fallida.");
            jDialog();
            
            jTUsusario.setText(null);
            jPContrasenia.setText(null);
        }
    }
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLUsuario = new javax.swing.JLabel();
        jLContrasenia = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JScrollPane();
        jTUsusario = new javax.swing.JTextPane();
        jPContrasenia = new javax.swing.JPasswordField();
        jBVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel.setBackground(new java.awt.Color(51, 51, 51));

        jLUsuario.setForeground(new java.awt.Color(204, 255, 204));
        jLUsuario.setText("Usuario:");

        jLContrasenia.setForeground(new java.awt.Color(204, 255, 204));
        jLContrasenia.setText("Contraseña:");

        jTUsusario.setForeground(new java.awt.Color(0, 0, 0));
        jTUsusario.setToolTipText("");
        jTUsuario.setViewportView(jTUsusario);

        jPContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        jPContrasenia.setToolTipText("");

        jBVerificar.setBackground(new java.awt.Color(0, 0, 0));
        jBVerificar.setForeground(new java.awt.Color(255, 255, 255));
        jBVerificar.setText("Verificar");
        jBVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBVerificar)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jLUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLContrasenia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLContrasenia))
                .addGap(18, 18, 18)
                .addComponent(jBVerificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerificarActionPerformed
        // TODO add your handling code here:
        confirmarUsuario();
    }//GEN-LAST:event_jBVerificarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBVerificar;
    private javax.swing.JLabel jLContrasenia;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JPasswordField jPContrasenia;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jTUsuario;
    private javax.swing.JTextPane jTUsusario;
    // End of variables declaration//GEN-END:variables
}
