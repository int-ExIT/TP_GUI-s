package Act6_punt2;

public class GestiorIJF extends javax.swing.JInternalFrame {

    public GestiorIJF() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscarCategoriaJCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJT = new javax.swing.JTable();
        filtrarCategoriaJL = new javax.swing.JLabel();
        tituloJL = new javax.swing.JLabel();
        nuevoJB = new javax.swing.JButton();
        guardarJB = new javax.swing.JButton();
        actualizarJB = new javax.swing.JButton();
        eliminarJB = new javax.swing.JButton();
        cerrarJB = new javax.swing.JButton();
        panelJP = new javax.swing.JPanel();
        precioJL = new javax.swing.JLabel();
        stockJL = new javax.swing.JLabel();
        categoriaJL = new javax.swing.JLabel();
        stockJS = new javax.swing.JSpinner();
        codigoJL = new javax.swing.JLabel();
        precioJTF = new javax.swing.JTextField();
        categoriaJCB = new javax.swing.JComboBox<>();
        descripcionJTF = new javax.swing.JTextField();
        codigoJTF = new javax.swing.JTextField();
        descripcionJL = new javax.swing.JLabel();
        buscarJB = new javax.swing.JButton();

        buscarCategoriaJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCategoriaJCBActionPerformed(evt);
            }
        });

        tablaJT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaJT);

        filtrarCategoriaJL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        filtrarCategoriaJL.setText("Filtrar por categoria:");

        tituloJL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tituloJL.setText("Gestion De Productos");

        nuevoJB.setText("Nuevo");

        guardarJB.setText("Guardar");

        actualizarJB.setText("Actualizar");

        eliminarJB.setText("Eliminar");

        cerrarJB.setText("Cerrar");

        precioJL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        precioJL.setText("Precio");

        stockJL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        stockJL.setText("Stock");

        categoriaJL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        categoriaJL.setText("Categoria");

        codigoJL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codigoJL.setText("Codigo:");

        precioJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioJTFActionPerformed(evt);
            }
        });

        descripcionJL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        descripcionJL.setText("Descripción:");

        javax.swing.GroupLayout panelJPLayout = new javax.swing.GroupLayout(panelJP);
        panelJP.setLayout(panelJPLayout);
        panelJPLayout.setHorizontalGroup(
            panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(descripcionJL)
                    .addComponent(codigoJL)
                    .addGroup(panelJPLayout.createSequentialGroup()
                        .addComponent(precioJL)
                        .addGap(73, 73, 73)
                        .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioJTF)
                            .addComponent(descripcionJTF)
                            .addComponent(codigoJTF)))
                    .addGroup(panelJPLayout.createSequentialGroup()
                        .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoriaJL)
                            .addComponent(stockJL))
                        .addGap(69, 69, 69)
                        .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stockJS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoriaJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panelJPLayout.setVerticalGroup(
            panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoJL)
                    .addComponent(codigoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcionJL)
                    .addComponent(descripcionJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioJL)
                    .addComponent(precioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaJL)
                    .addComponent(categoriaJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockJL)
                    .addComponent(stockJS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        buscarJB.setText("Lupita");
        buscarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nuevoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(guardarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(actualizarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(eliminarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buscarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cerrarJB)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(filtrarCategoriaJL)
                        .addGap(99, 99, 99)
                        .addComponent(buscarCategoriaJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloJL)
                .addGap(340, 340, 340))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloJL)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtrarCategoriaJL)
                    .addComponent(buscarCategoriaJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(cerrarJB))
                    .addComponent(panelJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarCategoriaJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCategoriaJCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarCategoriaJCBActionPerformed

    private void precioJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioJTFActionPerformed

    private void buscarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarJBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarJB;
    private javax.swing.JComboBox<String> buscarCategoriaJCB;
    private javax.swing.JButton buscarJB;
    private javax.swing.JComboBox<String> categoriaJCB;
    private javax.swing.JLabel categoriaJL;
    private javax.swing.JButton cerrarJB;
    private javax.swing.JLabel codigoJL;
    private javax.swing.JTextField codigoJTF;
    private javax.swing.JLabel descripcionJL;
    private javax.swing.JTextField descripcionJTF;
    private javax.swing.JButton eliminarJB;
    private javax.swing.JLabel filtrarCategoriaJL;
    private javax.swing.JButton guardarJB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevoJB;
    private javax.swing.JPanel panelJP;
    private javax.swing.JLabel precioJL;
    private javax.swing.JTextField precioJTF;
    private javax.swing.JLabel stockJL;
    private javax.swing.JSpinner stockJS;
    private javax.swing.JTable tablaJT;
    private javax.swing.JLabel tituloJL;
    // End of variables declaration//GEN-END:variables
}
