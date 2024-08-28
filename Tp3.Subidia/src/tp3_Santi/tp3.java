package tp3_Santi;

import javax.swing.JOptionPane;

public class tp3 extends javax.swing.JFrame {

    public tp3() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        pnlInicio = new javax.swing.JPanel();
        txtInicio = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        txfContra = new javax.swing.JPasswordField();
        txfUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        pnlPie = new javax.swing.JPanel();
        btnVer = new javax.swing.JButton();
        btnOcultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));

        pnlFondo.setBackground(new java.awt.Color(102, 204, 255));

        pnlInicio.setBackground(new java.awt.Color(255, 255, 255));
        pnlInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtInicio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio de sesion.png"))); // NOI18N
        txtInicio.setText("Inicio de Sesion");

        javax.swing.GroupLayout pnlInicioLayout = new javax.swing.GroupLayout(pnlInicio);
        pnlInicio.setLayout(pnlInicioLayout);
        pnlInicioLayout.setHorizontalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(txtInicio)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        pnlInicioLayout.setVerticalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlLogin.setToolTipText("");

        txfContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfContraActionPerformed(evt);
            }
        });

        txfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfUsuarioActionPerformed(evt);
            }
        });

        txtContra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtContra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContra.setText("Contraseña");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsuario.setText("Usuario");

        btnVerificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Verificar.png"))); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContra)
                    .addComponent(txtUsuario))
                .addGap(33, 33, 33)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addComponent(txfContra)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario)
                    .addComponent(txfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContra)
                    .addComponent(txfContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pnlPie.setBackground(new java.awt.Color(255, 255, 255));
        pnlPie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnVer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ver.png"))); // NOI18N
        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnOcultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ocultar.png"))); // NOI18N
        btnOcultar.setText("Ocultar");
        btnOcultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPieLayout = new javax.swing.GroupLayout(pnlPie);
        pnlPie.setLayout(pnlPieLayout);
        pnlPieLayout.setHorizontalGroup(
            pnlPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPieLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        pnlPieLayout.setVerticalGroup(
            pnlPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPieLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(pnlPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcultarActionPerformed
        // TODO add your handling code here:
        txfContra.setEchoChar('x');
    }//GEN-LAST:event_btnOcultarActionPerformed

    private void txfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfUsuarioActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        String contra = new String(txfContra.getPassword());
        if(txfUsuario.getText().equals("alumno@ulp.edu.ar") &&  contra.equals("12345678")){
            JOptionPane.showMessageDialog(rootPane, "Bienvenido");
            txfUsuario.setText("");
            txfContra.setText("");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Usuario y/o contraseña incorrectos");
            txfUsuario.setText("");
            txfContra.setText("");
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void txfContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfContraActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        txfContra.setEchoChar((char)0);
    }//GEN-LAST:event_btnVerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tp3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOcultar;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlPie;
    private javax.swing.JPasswordField txfContra;
    private javax.swing.JTextField txfUsuario;
    private javax.swing.JLabel txtContra;
    private javax.swing.JLabel txtInicio;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
