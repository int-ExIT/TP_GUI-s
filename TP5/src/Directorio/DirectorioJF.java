package Directorio;

import javax.swing.JOptionPane;

public class DirectorioJF extends javax.swing.JFrame {
    
    public DirectorioJF() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelJP = new javax.swing.JPanel();
        tituloJL = new javax.swing.JLabel();
        nombreJL = new javax.swing.JLabel();
        telefonoJL = new javax.swing.JLabel();
        apellidoJL = new javax.swing.JLabel();
        DNIJL = new javax.swing.JLabel();
        ciudadJL = new javax.swing.JLabel();
        direccionJL = new javax.swing.JLabel();
        agendarJB = new javax.swing.JButton();
        apellidoJTF = new javax.swing.JTextField();
        nombreJTF = new javax.swing.JTextField();
        telefonoJTF = new javax.swing.JTextField();
        ciudadJTF = new javax.swing.JTextField();
        DNIJTF = new javax.swing.JTextField();
        direccionJTF = new javax.swing.JTextField();
        buscarJB = new javax.swing.JButton();
        eliminarJB = new javax.swing.JButton();
        eliminarJTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Directorio de Contactos");

        panelJP.setBackground(new java.awt.Color(51, 51, 51));
        panelJP.setForeground(new java.awt.Color(255, 255, 255));

        tituloJL.setBackground(new java.awt.Color(51, 51, 51));
        tituloJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        tituloJL.setForeground(new java.awt.Color(0, 204, 204));
        tituloJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloJL.setText(":: DIRECTORIO ::");

        nombreJL.setBackground(new java.awt.Color(51, 51, 51));
        nombreJL.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        nombreJL.setForeground(new java.awt.Color(255, 255, 255));
        nombreJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombreJL.setText("Nombre:");

        telefonoJL.setBackground(new java.awt.Color(51, 51, 51));
        telefonoJL.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        telefonoJL.setForeground(new java.awt.Color(255, 255, 255));
        telefonoJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telefonoJL.setText("Telefono:");

        apellidoJL.setBackground(new java.awt.Color(51, 51, 51));
        apellidoJL.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        apellidoJL.setForeground(new java.awt.Color(255, 255, 255));
        apellidoJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        apellidoJL.setText("Apellido:");

        DNIJL.setBackground(new java.awt.Color(51, 51, 51));
        DNIJL.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        DNIJL.setForeground(new java.awt.Color(255, 255, 255));
        DNIJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DNIJL.setText("DNI:");

        ciudadJL.setBackground(new java.awt.Color(51, 51, 51));
        ciudadJL.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        ciudadJL.setForeground(new java.awt.Color(255, 255, 255));
        ciudadJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ciudadJL.setText("Ciudad:");

        direccionJL.setBackground(new java.awt.Color(51, 51, 51));
        direccionJL.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        direccionJL.setForeground(new java.awt.Color(255, 255, 255));
        direccionJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        direccionJL.setText("Direccion:");

        agendarJB.setBackground(new java.awt.Color(0, 102, 102));
        agendarJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        agendarJB.setForeground(new java.awt.Color(255, 255, 255));
        agendarJB.setText("Agendar");
        agendarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendarJBActionPerformed(evt);
            }
        });

        apellidoJTF.setActionCommand("");
        apellidoJTF.setOpaque(true);

        nombreJTF.setActionCommand("");
        nombreJTF.setOpaque(true);

        telefonoJTF.setActionCommand("");
        telefonoJTF.setOpaque(true);

        ciudadJTF.setActionCommand("");
        ciudadJTF.setOpaque(true);

        DNIJTF.setActionCommand("");
        DNIJTF.setOpaque(true);

        direccionJTF.setActionCommand("");
        direccionJTF.setOpaque(true);

        buscarJB.setBackground(new java.awt.Color(255, 102, 0));
        buscarJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        buscarJB.setForeground(new java.awt.Color(255, 255, 255));
        buscarJB.setText("Buscar");
        buscarJB.setMaximumSize(new java.awt.Dimension(90, 28));
        buscarJB.setMinimumSize(new java.awt.Dimension(90, 28));
        buscarJB.setPreferredSize(new java.awt.Dimension(90, 28));
        buscarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarJBActionPerformed(evt);
            }
        });

        eliminarJB.setBackground(new java.awt.Color(153, 0, 0));
        eliminarJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        eliminarJB.setForeground(new java.awt.Color(255, 255, 255));
        eliminarJB.setText("Eliminar Contacto");
        eliminarJB.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        eliminarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarJBActionPerformed(evt);
            }
        });

        eliminarJTF.setActionCommand("");
        eliminarJTF.setOpaque(true);

        javax.swing.GroupLayout panelJPLayout = new javax.swing.GroupLayout(panelJP);
        panelJP.setLayout(panelJPLayout);
        panelJPLayout.setHorizontalGroup(
            panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJPLayout.createSequentialGroup()
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelJPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelJPLayout.createSequentialGroup()
                                .addComponent(eliminarJB)
                                .addGap(12, 12, 12)
                                .addComponent(eliminarJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelJPLayout.createSequentialGroup()
                                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(telefonoJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(apellidoJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nombreJL, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(apellidoJTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(nombreJTF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefonoJTF)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelJPLayout.createSequentialGroup()
                                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(DNIJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ciudadJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(direccionJL, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(buscarJB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelJPLayout.createSequentialGroup()
                                        .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ciudadJTF, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(direccionJTF)
                                            .addComponent(DNIJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJPLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(agendarJB)))))))
                .addContainerGap())
        );
        panelJPLayout.setVerticalGroup(
            panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloJL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreJL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionJL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ciudadJL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudadJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DNIJL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNIJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agendarJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void generarContacto() {
            String nombre = nombreJTF.getText();
            String apellido = apellidoJTF.getText();
            String ciudad = ciudadJTF.getText();
            String direccion = direccionJTF.getText();
        try {
            Integer DNI = Integer.valueOf(DNIJTF.getText());
            Long numero = Long.valueOf(telefonoJTF.getText());
            FD.addContacto(nombre, apellido, ciudad, direccion, DNI, numero);
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Complete los campos solicitados.");
        }
    }
    
    private void eliminarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarJBActionPerformed
        // TODO add your handling code here:
        String serch = eliminarJTF.getText();
        
        try {
            if (!serch.equals("")) {
                FD.buscar(serch, 1);
                
                if (FD.getContactos().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "El contacto no se a encontrado.");
                }else {
                    int confirm = JOptionPane.showConfirmDialog(rootPane, "Seguro que desea eliminar el contacto:\n" + FD.getContactos().toString());
                    
                    if (confirm == 0) {
                        FD.remContacto(Long.valueOf(serch));

                        JOptionPane.showMessageDialog(rootPane, "Eliminacion Exitosa.");
                    }else {
                        JOptionPane.showMessageDialog(rootPane, "Operacion Cancelada.");
                    }
                }
            }else {
                JOptionPane.showMessageDialog(rootPane, "Por fabor ingrese un numero.");
            }
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Valor ingresado incorrecto.");
        }
        
        Check.cleanField(panelJP);
    }//GEN-LAST:event_eliminarJBActionPerformed

    private void buscarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarJBActionPerformed
        // TODO add your handling code here:
        BuscarIJF buscar = new BuscarIJF();
        buscar.setVisible(true);
    }//GEN-LAST:event_buscarJBActionPerformed

    private void agendarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendarJBActionPerformed
        // TODO add your handling code here:
        boolean flag = Check.checkField(panelJP);

        if (flag) generarContacto();
        else JOptionPane.showMessageDialog(rootPane, "Complete los campos solicitados.");

        Check.cleanField(panelJP);
    }//GEN-LAST:event_agendarJBActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DirectorioJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DirectorioJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DirectorioJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DirectorioJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DirectorioJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DNIJL;
    private javax.swing.JTextField DNIJTF;
    private javax.swing.JButton agendarJB;
    private javax.swing.JLabel apellidoJL;
    private javax.swing.JTextField apellidoJTF;
    private javax.swing.JButton buscarJB;
    private javax.swing.JLabel ciudadJL;
    private javax.swing.JTextField ciudadJTF;
    private javax.swing.JLabel direccionJL;
    private javax.swing.JTextField direccionJTF;
    private javax.swing.JButton eliminarJB;
    private javax.swing.JTextField eliminarJTF;
    private javax.swing.JLabel nombreJL;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JPanel panelJP;
    private javax.swing.JLabel telefonoJL;
    private javax.swing.JTextField telefonoJTF;
    private javax.swing.JLabel tituloJL;
    // End of variables declaration//GEN-END:variables
}
