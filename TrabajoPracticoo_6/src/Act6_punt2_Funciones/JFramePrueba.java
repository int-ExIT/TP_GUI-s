package Act6_punt2_Funciones;

public class JFramePrueba extends javax.swing.JFrame {

    public JFramePrueba() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        Label_1 = new javax.swing.JLabel();
        Label_2 = new javax.swing.JLabel();
        Texto_1 = new javax.swing.JTextField();
        Texto_2 = new javax.swing.JTextField();
        Boton_1 = new javax.swing.JButton();
        Combo_1 = new javax.swing.JComboBox<>();
        Spinner_1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Boton_2 = new javax.swing.JButton();
        Label_3 = new javax.swing.JLabel();
        Label_4 = new javax.swing.JLabel();
        Texto_3 = new javax.swing.JTextField();
        Label_5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana de Prueba");
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        Label_1.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        Label_1.setForeground(new java.awt.Color(255, 255, 255));
        Label_1.setText("Label 1:");

        Label_2.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        Label_2.setForeground(new java.awt.Color(255, 255, 255));
        Label_2.setText("Label 2:");

        Texto_1.setBackground(new java.awt.Color(255, 255, 255));
        Texto_1.setForeground(new java.awt.Color(0, 0, 0));
        Texto_1.setToolTipText("A");
        Texto_1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Texto_1FocusLost(evt);
            }
        });

        Texto_2.setBackground(new java.awt.Color(255, 255, 255));
        Texto_2.setForeground(new java.awt.Color(0, 0, 0));
        Texto_2.setToolTipText("B");

        Boton_1.setBackground(new java.awt.Color(255, 0, 0));
        Boton_1.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Boton_1.setForeground(new java.awt.Color(255, 255, 255));
        Boton_1.setText("Boton Rojo");
        Boton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_1ActionPerformed(evt);
            }
        });

        Combo_1.setBackground(new java.awt.Color(255, 255, 255));
        Combo_1.setForeground(new java.awt.Color(0, 0, 0));
        Combo_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumeria" }));
        Combo_1.setToolTipText("C");

        Spinner_1.setToolTipText("E");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Boton_2.setBackground(new java.awt.Color(0, 0, 255));
        Boton_2.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Boton_2.setForeground(new java.awt.Color(255, 255, 255));
        Boton_2.setText("Boton Azul");
        Boton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_2ActionPerformed(evt);
            }
        });

        Label_3.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        Label_3.setForeground(new java.awt.Color(255, 255, 255));
        Label_3.setText("Label 2:");

        Label_4.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        Label_4.setForeground(new java.awt.Color(255, 255, 255));
        Label_4.setText("Label 2:");

        Texto_3.setBackground(new java.awt.Color(255, 255, 255));
        Texto_3.setForeground(new java.awt.Color(0, 0, 0));
        Texto_3.setToolTipText("D");

        Label_5.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        Label_5.setForeground(new java.awt.Color(255, 255, 255));
        Label_5.setText("Label 2:");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                            .addComponent(Label_1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Texto_1))
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelPrincipalLayout.createSequentialGroup()
                                    .addComponent(Label_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Texto_2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(Boton_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Boton_2))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Label_4)
                                            .addComponent(Label_5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Spinner_1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Texto_3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(Label_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Combo_1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 20, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combo_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Spinner_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_1ActionPerformed
        // TODO add your handling code here:
        Funcion.capturarCapos(panelPrincipal);
    }//GEN-LAST:event_Boton_1ActionPerformed

    private void Boton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_2ActionPerformed
        // TODO add your handling code here:
        System.out.println("--------------------------------------------------");
        Funcion.crearObjeto();
    }//GEN-LAST:event_Boton_2ActionPerformed

    private void Texto_1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Texto_1FocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Texto_1FocusLost

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_1;
    private javax.swing.JButton Boton_2;
    private javax.swing.JComboBox<String> Combo_1;
    private javax.swing.JLabel Label_1;
    private javax.swing.JLabel Label_2;
    private javax.swing.JLabel Label_3;
    private javax.swing.JLabel Label_4;
    private javax.swing.JLabel Label_5;
    private javax.swing.JSpinner Spinner_1;
    private javax.swing.JTextField Texto_1;
    private javax.swing.JTextField Texto_2;
    private javax.swing.JTextField Texto_3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
