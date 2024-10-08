package Act6_punt2;

public class GestorJDP extends javax.swing.JFrame {

    private GestorIJF gestor;
    private ListadoNombre porNombres;
    private ListadoPrecio porPrecio;
    
    public GestorJDP() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gestorJDP = new javax.swing.JDesktopPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        menuJMB = new javax.swing.JMenuBar();
        gestorDeProductosJM = new javax.swing.JMenu();
        gestorJMI = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        nombreJMI = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        gestorJDP.setLayer(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout gestorJDPLayout = new javax.swing.GroupLayout(gestorJDP);
        gestorJDP.setLayout(gestorJDPLayout);
        gestorJDPLayout.setHorizontalGroup(
            gestorJDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestorJDPLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(674, Short.MAX_VALUE))
        );
        gestorJDPLayout.setVerticalGroup(
            gestorJDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestorJDPLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(429, Short.MAX_VALUE))
        );

        gestorDeProductosJM.setText("Gestor de Productos");

        gestorJMI.setText("Gestor");
        gestorJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestorJMIActionPerformed(evt);
            }
        });
        gestorDeProductosJM.add(gestorJMI);

        menuJMB.add(gestorDeProductosJM);

        jMenu2.setText("Buscar Por");

        nombreJMI.setText("Nombre");
        nombreJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreJMIActionPerformed(evt);
            }
        });
        jMenu2.add(nombreJMI);

        jMenuItem1.setText("Precio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        menuJMB.add(jMenu2);

        setJMenuBar(menuJMB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gestorJDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gestorJDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestorJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestorJMIActionPerformed
        gestorJDP.removeAll();
        gestorJDP.repaint();
        
        gestor = new GestorIJF();
        gestor.setVisible(true);
        
        gestorJDP.add(gestor);
        gestorJDP.moveToFront(gestor);
    }//GEN-LAST:event_gestorJMIActionPerformed

    private void nombreJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreJMIActionPerformed
        // TODO add your handling code here:
        gestorJDP.removeAll();
        gestorJDP.repaint();
        
        porNombres = new ListadoNombre();
        porNombres.setVisible(true);
        
        gestorJDP.add(porNombres);
        gestorJDP.moveToFront(porNombres);
    }//GEN-LAST:event_nombreJMIActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        gestorJDP.removeAll();
        gestorJDP.repaint();
        
        porPrecio = new ListadoPrecio();
        porPrecio.setVisible(true);
        
        gestorJDP.add(porPrecio);
        gestorJDP.moveToFront(porPrecio);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestorJDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorJDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorJDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorJDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorJDP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu gestorDeProductosJM;
    private javax.swing.JDesktopPane gestorJDP;
    private javax.swing.JMenuItem gestorJMI;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuJMB;
    private javax.swing.JMenuItem nombreJMI;
    // End of variables declaration//GEN-END:variables
}
