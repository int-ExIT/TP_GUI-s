package Act6_punt2_Funciones;

public class JFramePrueba extends javax.swing.JFrame {

    public JFramePrueba() {
        initComponents();
        setLocationRelativeTo(null);
        
        Funcion.setColum(jTable1);
        Funcion.cargarFuncion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        Label_1 = new javax.swing.JLabel();
        Label_2 = new javax.swing.JLabel();
        codigoJTF = new javax.swing.JTextField();
        nombreJTF = new javax.swing.JTextField();
        Boton_Eliminar = new javax.swing.JButton();
        tipoJCB = new javax.swing.JComboBox<>();
        stockJS = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Boton_Guardar = new javax.swing.JButton();
        Label_3 = new javax.swing.JLabel();
        Label_4 = new javax.swing.JLabel();
        precioJTF = new javax.swing.JTextField();
        Label_5 = new javax.swing.JLabel();
        Boton_Buscar = new javax.swing.JButton();
        Boton_Renombrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana de Prueba");
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        Label_1.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        Label_1.setForeground(new java.awt.Color(255, 255, 255));
        Label_1.setText("Codigo:");

        Label_2.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        Label_2.setForeground(new java.awt.Color(255, 255, 255));
        Label_2.setText("Nombre:");

        codigoJTF.setBackground(new java.awt.Color(255, 255, 255));
        codigoJTF.setForeground(new java.awt.Color(0, 0, 0));
        codigoJTF.setToolTipText("A");
        codigoJTF.setName("codigo"); // NOI18N

        nombreJTF.setBackground(new java.awt.Color(255, 255, 255));
        nombreJTF.setForeground(new java.awt.Color(0, 0, 0));
        nombreJTF.setToolTipText("B");
        nombreJTF.setName("nombre"); // NOI18N

        Boton_Eliminar.setBackground(new java.awt.Color(255, 0, 0));
        Boton_Eliminar.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Boton_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Eliminar.setText("Eliminar");
        Boton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarActionPerformed(evt);
            }
        });

        tipoJCB.setBackground(new java.awt.Color(255, 255, 255));
        tipoJCB.setForeground(new java.awt.Color(0, 0, 0));
        tipoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumeria" }));
        tipoJCB.setToolTipText("C");
        tipoJCB.setName("tipo"); // NOI18N

        stockJS.setToolTipText("D");
        stockJS.setName("stock"); // NOI18N

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

        Boton_Guardar.setBackground(new java.awt.Color(0, 0, 255));
        Boton_Guardar.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Boton_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Guardar.setText("Guardar");
        Boton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarActionPerformed(evt);
            }
        });

        Label_3.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        Label_3.setForeground(new java.awt.Color(255, 255, 255));
        Label_3.setText("Tipo:");

        Label_4.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        Label_4.setForeground(new java.awt.Color(255, 255, 255));
        Label_4.setText("Precio:");

        precioJTF.setBackground(new java.awt.Color(255, 255, 255));
        precioJTF.setForeground(new java.awt.Color(0, 0, 0));
        precioJTF.setToolTipText("E");
        precioJTF.setName("precio"); // NOI18N

        Label_5.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        Label_5.setForeground(new java.awt.Color(255, 255, 255));
        Label_5.setText("Stock:");

        Boton_Buscar.setBackground(new java.awt.Color(0, 0, 255));
        Boton_Buscar.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Boton_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Buscar.setText("Buscar");
        Boton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BuscarActionPerformed(evt);
            }
        });

        Boton_Renombrar.setBackground(new java.awt.Color(0, 0, 255));
        Boton_Renombrar.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Boton_Renombrar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Renombrar.setText("Renom");
        Boton_Renombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_RenombrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Boton_Buscar)
                                    .addComponent(Boton_Renombrar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Boton_Eliminar)
                                    .addComponent(Boton_Guardar))
                                .addGap(23, 23, 23))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(Label_5)
                                        .addGap(18, 18, 18)
                                        .addComponent(stockJS, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(Label_4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(precioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Label_3)
                                            .addComponent(Label_2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tipoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Label_1)
                        .addGap(12, 12, 12)
                        .addComponent(codigoJTF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stockJS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_Renombrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void Boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarActionPerformed
        if (Funcion.getFLAG() != 0) Funcion.modificarObjeto(panelPrincipal, Boton_Buscar, Boton_Guardar, Boton_Eliminar, codigoJTF);
        
//        Funcion.capturarCampos(panelPrincipal);
    }//GEN-LAST:event_Boton_EliminarActionPerformed

    private void Boton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarActionPerformed
        Funcion.capturarCampos(panelPrincipal);
        Funcion.crearObjeto();
        
        if (Funcion.getFLAG() != 0) Funcion.modificarObjeto(panelPrincipal, Boton_Buscar, Boton_Guardar, Boton_Eliminar, codigoJTF);
        
        System.out.println("\n" + Funcion.getProductos().toString());
    }//GEN-LAST:event_Boton_GuardarActionPerformed

    private void Boton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BuscarActionPerformed
        Funcion.buscarObjeto(codigoJTF, nombreJTF, tipoJCB);
        Funcion.resetTable(jTable1);
        Funcion.setRow(jTable1);
        
        if (Funcion.getFLAG() != 0) Funcion.modificarObjeto(panelPrincipal, Boton_Buscar, Boton_Guardar, Boton_Eliminar, codigoJTF);
    }//GEN-LAST:event_Boton_BuscarActionPerformed

    private void Boton_RenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RenombrarActionPerformed
        Funcion.modificarObjeto(panelPrincipal, Boton_Buscar, Boton_Guardar, Boton_Eliminar, codigoJTF);
    }//GEN-LAST:event_Boton_RenombrarActionPerformed

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
    private javax.swing.JButton Boton_Buscar;
    private javax.swing.JButton Boton_Eliminar;
    private javax.swing.JButton Boton_Guardar;
    private javax.swing.JButton Boton_Renombrar;
    private javax.swing.JLabel Label_1;
    private javax.swing.JLabel Label_2;
    private javax.swing.JLabel Label_3;
    private javax.swing.JLabel Label_4;
    private javax.swing.JLabel Label_5;
    private javax.swing.JTextField codigoJTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField precioJTF;
    private javax.swing.JSpinner stockJS;
    private javax.swing.JComboBox<String> tipoJCB;
    // End of variables declaration//GEN-END:variables
}
