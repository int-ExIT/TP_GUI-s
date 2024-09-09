package Directorio;

import javax.swing.JOptionPane;

public class BuscarIJF extends javax.swing.JDialog {

    private int flag;
    
    public BuscarIJF() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        busquedaJTF.setEnabled(false);
        
        FD.setColum(tablaJT);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBusquedaJP = new javax.swing.JPanel();
        buscarPorJL = new javax.swing.JLabel();
        apellidoJRB = new javax.swing.JRadioButton();
        ciudadJRB = new javax.swing.JRadioButton();
        numeroJRB = new javax.swing.JRadioButton();
        busquedaJL = new javax.swing.JLabel();
        busquedaJTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJT = new javax.swing.JTable();
        buscarJB = new javax.swing.JButton();
        todoJRB = new javax.swing.JRadioButton();

        setTitle("Buscar Contacto");

        panelBusquedaJP.setBackground(new java.awt.Color(51, 51, 51));
        panelBusquedaJP.setForeground(new java.awt.Color(255, 255, 255));

        buscarPorJL.setBackground(new java.awt.Color(51, 51, 51));
        buscarPorJL.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        buscarPorJL.setForeground(new java.awt.Color(255, 102, 0));
        buscarPorJL.setText("Buscar por:");

        apellidoJRB.setBackground(new java.awt.Color(51, 51, 51));
        apellidoJRB.setForeground(new java.awt.Color(255, 255, 255));
        apellidoJRB.setText("Apellido");
        apellidoJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoJRBActionPerformed(evt);
            }
        });

        ciudadJRB.setBackground(new java.awt.Color(51, 51, 51));
        ciudadJRB.setForeground(new java.awt.Color(255, 255, 255));
        ciudadJRB.setText("Ciudad");
        ciudadJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadJRBActionPerformed(evt);
            }
        });

        numeroJRB.setBackground(new java.awt.Color(51, 51, 51));
        numeroJRB.setForeground(new java.awt.Color(255, 255, 255));
        numeroJRB.setText("Numero");
        numeroJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroJRBActionPerformed(evt);
            }
        });

        busquedaJL.setBackground(new java.awt.Color(51, 51, 51));
        busquedaJL.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        busquedaJL.setForeground(new java.awt.Color(255, 102, 0));
        busquedaJL.setText("Ingrese Apellido:");

        tablaJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Nombre", "Apellido", "Ciudad", "Direccion", "DNI"
            }
        ));
        jScrollPane1.setViewportView(tablaJT);

        buscarJB.setBackground(new java.awt.Color(255, 102, 0));
        buscarJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        buscarJB.setForeground(new java.awt.Color(255, 255, 255));
        buscarJB.setText("Buscar");
        buscarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarJBActionPerformed(evt);
            }
        });

        todoJRB.setBackground(new java.awt.Color(51, 51, 51));
        todoJRB.setForeground(new java.awt.Color(255, 255, 255));
        todoJRB.setText("Most. Todo");
        todoJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todoJRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaJPLayout = new javax.swing.GroupLayout(panelBusquedaJP);
        panelBusquedaJP.setLayout(panelBusquedaJPLayout);
        panelBusquedaJPLayout.setHorizontalGroup(
            panelBusquedaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
            .addGroup(panelBusquedaJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusquedaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaJPLayout.createSequentialGroup()
                        .addComponent(busquedaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busquedaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarJB))
                    .addGroup(panelBusquedaJPLayout.createSequentialGroup()
                        .addComponent(buscarPorJL)
                        .addGap(18, 18, 18)
                        .addComponent(numeroJRB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(apellidoJRB)
                        .addGap(18, 18, 18)
                        .addComponent(ciudadJRB)
                        .addGap(18, 18, 18)
                        .addComponent(todoJRB)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBusquedaJPLayout.setVerticalGroup(
            panelBusquedaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaJPLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(panelBusquedaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarPorJL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroJRB)
                    .addComponent(apellidoJRB)
                    .addComponent(ciudadJRB)
                    .addComponent(todoJRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBusquedaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busquedaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busquedaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarJB))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBusquedaJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBusquedaJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroJRBActionPerformed
        // TODO add your handling code here:
        FD.resetTable(tablaJT);
        
        ciudadJRB.setSelected(false);
        apellidoJRB.setSelected(false);
        todoJRB.setSelected(false);
        
        busquedaJTF.setEnabled(numeroJRB.isSelected());

        flag = 1;
    }//GEN-LAST:event_numeroJRBActionPerformed

    private void apellidoJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoJRBActionPerformed
        // TODO add your handling code here:
        FD.resetTable(tablaJT);
        
        ciudadJRB.setSelected(false);
        numeroJRB.setSelected(false);
        todoJRB.setSelected(false);
        
        busquedaJTF.setEnabled(apellidoJRB.isSelected());
        
        flag = 2;
    }//GEN-LAST:event_apellidoJRBActionPerformed

    private void ciudadJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadJRBActionPerformed
        // TODO add your handling code here:
        FD.resetTable(tablaJT);
        
        numeroJRB.setSelected(false);
        apellidoJRB.setSelected(false);
        todoJRB.setSelected(false);
        
        busquedaJTF.setEnabled(ciudadJRB.isSelected());
        
        flag = 3;
    }//GEN-LAST:event_ciudadJRBActionPerformed

    private void todoJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todoJRBActionPerformed
        // TODO add your handling code here:
        FD.resetTable(tablaJT);
        
        numeroJRB.setSelected(false);
        apellidoJRB.setSelected(false);
        ciudadJRB.setSelected(false);
        busquedaJTF.setEnabled(false);
        
        flag = 4;
    }//GEN-LAST:event_todoJRBActionPerformed

    private void buscarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarJBActionPerformed
        // TODO add your handling code here:
        FD.resetTable(tablaJT);
        
        String serch = busquedaJTF.getText();

        try{
            if (!serch.equals("") || flag == 4) {
                FD.buscar(serch, flag);
                
                if (FD.getContactos().isEmpty()) JOptionPane.showMessageDialog(rootPane, "El contacto no se a encontrado.");
                else FD.setRow(tablaJT);
            
                busquedaJTF.setText(serch = "");
            }
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Valor ingresado incorrecto. Ingrese un numero.");
        }
    }//GEN-LAST:event_buscarJBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton apellidoJRB;
    private javax.swing.JButton buscarJB;
    private javax.swing.JLabel buscarPorJL;
    private javax.swing.JLabel busquedaJL;
    private javax.swing.JTextField busquedaJTF;
    private javax.swing.JRadioButton ciudadJRB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton numeroJRB;
    private javax.swing.JPanel panelBusquedaJP;
    private javax.swing.JTable tablaJT;
    private javax.swing.JRadioButton todoJRB;
    // End of variables declaration//GEN-END:variables
}
