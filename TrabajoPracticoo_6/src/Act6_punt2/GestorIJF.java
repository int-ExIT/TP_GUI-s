package Act6_punt2;

import Act6_punt2_Funciones.Funcion;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class GestorIJF extends javax.swing.JInternalFrame {

    public GestorIJF() {
        initComponents();
        
        Funcion.setColum(tablaGestorJT);
        Funcion.cargarFuncion();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panelGestor = new javax.swing.JPanel();
        TituloJL = new javax.swing.JLabel();
        FiltrarJL = new javax.swing.JLabel();
        filtrarJCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGestorJT = new javax.swing.JTable();
        PanelDeDatosJP = new javax.swing.JPanel();
        CodigoJL = new javax.swing.JLabel();
        NombreJL = new javax.swing.JLabel();
        PrecioJL = new javax.swing.JLabel();
        RubroJL = new javax.swing.JLabel();
        StockJL = new javax.swing.JLabel();
        nombreJTF = new javax.swing.JTextField();
        codigoJTF = new javax.swing.JTextField();
        precioJTF = new javax.swing.JTextField();
        rubroJCB = new javax.swing.JComboBox<>();
        stockJSp = new javax.swing.JSpinner();
        buscarJB = new javax.swing.JButton();
        eliminarJB = new javax.swing.JButton();
        guardarJB = new javax.swing.JButton();
        renombrarJB = new javax.swing.JButton();

        jButton1.setText("jButton1");

        panelGestor.setBackground(new java.awt.Color(51, 51, 51));

        TituloJL.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        TituloJL.setForeground(new java.awt.Color(204, 204, 204));
        TituloJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloJL.setText("Gestor de Productos");

        FiltrarJL.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        FiltrarJL.setForeground(new java.awt.Color(204, 204, 204));
        FiltrarJL.setText("Filtrar por Categoria:");

        filtrarJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumeria" }));
        filtrarJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarJCBActionPerformed(evt);
            }
        });

        tablaGestorJT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaGestorJT);

        PanelDeDatosJP.setBackground(new java.awt.Color(51, 51, 51));
        PanelDeDatosJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, new java.awt.Color(0, 0, 0), java.awt.Color.black, java.awt.Color.black));

        CodigoJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        CodigoJL.setForeground(new java.awt.Color(204, 204, 204));
        CodigoJL.setText("Codigo:");

        NombreJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        NombreJL.setForeground(new java.awt.Color(204, 204, 204));
        NombreJL.setText("Nombre:");

        PrecioJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        PrecioJL.setForeground(new java.awt.Color(204, 204, 204));
        PrecioJL.setText("Precio:");

        RubroJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        RubroJL.setForeground(new java.awt.Color(204, 204, 204));
        RubroJL.setText("Rubro");

        StockJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        StockJL.setForeground(new java.awt.Color(204, 204, 204));
        StockJL.setText("Stock:");

        nombreJTF.setName("nombre"); // NOI18N

        codigoJTF.setName("codigo"); // NOI18N

        precioJTF.setName("precio"); // NOI18N

        rubroJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumeria" }));
        rubroJCB.setName("tipo"); // NOI18N

        stockJSp.setName("stock"); // NOI18N

        javax.swing.GroupLayout PanelDeDatosJPLayout = new javax.swing.GroupLayout(PanelDeDatosJP);
        PanelDeDatosJP.setLayout(PanelDeDatosJPLayout);
        PanelDeDatosJPLayout.setHorizontalGroup(
            PanelDeDatosJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeDatosJPLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(PanelDeDatosJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreJL)
                    .addComponent(PrecioJL)
                    .addComponent(CodigoJL)
                    .addComponent(RubroJL)
                    .addComponent(StockJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDeDatosJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stockJSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDeDatosJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rubroJCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precioJTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        PanelDeDatosJPLayout.setVerticalGroup(
            PanelDeDatosJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeDatosJPLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(PanelDeDatosJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoJL)
                    .addComponent(codigoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeDatosJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeDatosJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecioJL)
                    .addComponent(precioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(PanelDeDatosJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RubroJL)
                    .addComponent(rubroJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(PanelDeDatosJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StockJL)
                    .addComponent(stockJSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        buscarJB.setBackground(new java.awt.Color(51, 51, 255));
        buscarJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        buscarJB.setForeground(new java.awt.Color(255, 255, 255));
        buscarJB.setText("Buscar");
        buscarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarJBActionPerformed(evt);
            }
        });

        eliminarJB.setBackground(new java.awt.Color(255, 51, 51));
        eliminarJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        eliminarJB.setForeground(new java.awt.Color(255, 255, 255));
        eliminarJB.setText("Eliminar");
        eliminarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarJBActionPerformed(evt);
            }
        });

        guardarJB.setBackground(new java.awt.Color(51, 51, 255));
        guardarJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        guardarJB.setForeground(new java.awt.Color(255, 255, 255));
        guardarJB.setText("Guardar");
        guardarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarJBActionPerformed(evt);
            }
        });

        renombrarJB.setBackground(new java.awt.Color(51, 51, 255));
        renombrarJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        renombrarJB.setForeground(new java.awt.Color(255, 255, 255));
        renombrarJB.setText("Renombrar");
        renombrarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renombrarJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGestorLayout = new javax.swing.GroupLayout(panelGestor);
        panelGestor.setLayout(panelGestorLayout);
        panelGestorLayout.setHorizontalGroup(
            panelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TituloJL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelGestorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGestorLayout.createSequentialGroup()
                        .addComponent(PanelDeDatosJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(eliminarJB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(guardarJB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(renombrarJB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(buscarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelGestorLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(FiltrarJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filtrarJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 24, Short.MAX_VALUE))
        );
        panelGestorLayout.setVerticalGroup(
            panelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestorLayout.createSequentialGroup()
                .addComponent(TituloJL, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiltrarJL)
                    .addComponent(filtrarJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelDeDatosJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGestorLayout.createSequentialGroup()
                        .addComponent(buscarJB)
                        .addGap(18, 18, 18)
                        .addComponent(guardarJB)
                        .addGap(18, 18, 18)
                        .addComponent(renombrarJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarJB)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarJBActionPerformed
        // TODO add your handling code here:
        boolean resultado = Funcion.buscarObjeto(codigoJTF, nombreJTF, rubroJCB);
        
        try {
            if (resultado) {
                Funcion.resetTable(tablaGestorJT);
                Funcion.setRow(tablaGestorJT);
            }else JOptionPane.showMessageDialog(rootPane, "No hay resultados para la busqueda.");

            if (Funcion.getFLAG() < 0) Funcion.modificarObjeto(PanelDeDatosJP, buscarJB, guardarJB, eliminarJB, codigoJTF);
        }catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_buscarJBActionPerformed

    private void guardarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarJBActionPerformed
        // TODO add your handling code here:
        try {
            Funcion.capturarCampos(PanelDeDatosJP);
            Funcion.crearObjeto();

            if (Funcion.getFLAG() < 0) Funcion.modificarObjeto(PanelDeDatosJP, buscarJB, guardarJB, eliminarJB, codigoJTF);
            else JOptionPane.showMessageDialog(rootPane, "El producto se a cargado con exito.");
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese los datos con los valores requeridos.");
        }
    }//GEN-LAST:event_guardarJBActionPerformed

    private void renombrarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renombrarJBActionPerformed
        // TODO add your handling code here:
        Funcion.modificarObjeto(PanelDeDatosJP, buscarJB, guardarJB, eliminarJB, codigoJTF);
    }//GEN-LAST:event_renombrarJBActionPerformed

    private void eliminarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarJBActionPerformed
        // TODO add your handling code here:
        try {
            if (Funcion.getFLAG() < 0) Funcion.modificarObjeto(PanelDeDatosJP, buscarJB, guardarJB, eliminarJB, codigoJTF);
            else if (!codigoJTF.getText().equals("")) {
                Funcion.buscarObjeto(codigoJTF, nombreJTF, rubroJCB);
                Funcion.eliminarObjeto();
                
                JOptionPane.showMessageDialog(rootPane, "Producto eliminado.");
            }else JOptionPane.showMessageDialog(rootPane, "Para eliminar primero ingrese el codigo");
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Valor ingresado incorrecto. Solo numeros.");
        }
        Funcion.capturarCampos(PanelDeDatosJP);
    }//GEN-LAST:event_eliminarJBActionPerformed

    private void filtrarJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarJCBActionPerformed
        // TODO add your handling code here:
        Funcion.setFLAG(2);
        
        Funcion.buscarObjeto(codigoJTF, nombreJTF, filtrarJCB);
        
        Funcion.resetTable(tablaGestorJT);
        Funcion.setRow(tablaGestorJT);
        
        Funcion.setFLAG(0);
    }//GEN-LAST:event_filtrarJCBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodigoJL;
    private javax.swing.JLabel FiltrarJL;
    private javax.swing.JLabel NombreJL;
    private javax.swing.JPanel PanelDeDatosJP;
    private javax.swing.JLabel PrecioJL;
    private javax.swing.JLabel RubroJL;
    private javax.swing.JLabel StockJL;
    private javax.swing.JLabel TituloJL;
    private javax.swing.JButton buscarJB;
    private javax.swing.JTextField codigoJTF;
    private javax.swing.JButton eliminarJB;
    private javax.swing.JComboBox<String> filtrarJCB;
    private javax.swing.JButton guardarJB;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JPanel panelGestor;
    private javax.swing.JTextField precioJTF;
    private javax.swing.JButton renombrarJB;
    private javax.swing.JComboBox<String> rubroJCB;
    private javax.swing.JSpinner stockJSp;
    private javax.swing.JTable tablaGestorJT;
    // End of variables declaration//GEN-END:variables
}
