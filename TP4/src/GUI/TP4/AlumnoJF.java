package GUI.TP4;

import java.awt.Color;
import java.util.HashSet;
import javax.swing.JComboBox;

public class AlumnoJF extends javax.swing.JInternalFrame {

    private HashSet<Alumno> alumnoHash = new HashSet<>();
    private String nombre;
    private String apellido;
    private String sexo;
    private String ID;

    public AlumnoJF(HashSet<Alumno> alumnoHash) {
        initComponents();
        this.alumnoHash = alumnoHash;
        this.nombre = "";
        this.apellido= "";
        this.sexo = "";
        this.ID = "";
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        contenedorJP = new javax.swing.JPanel();
        alumnoJL = new javax.swing.JLabel();
        nombreJL = new javax.swing.JLabel();
        idJL = new javax.swing.JLabel();
        sexoJL = new javax.swing.JLabel();
        siguienteJB = new javax.swing.JButton();
        apellidoJL1 = new javax.swing.JLabel();
        hombreJRB = new javax.swing.JRadioButton();
        mujerJRB = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        apellidoJTP = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        nombreJTP = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        idJTP = new javax.swing.JTextPane();

        jCheckBox1.setText("jCheckBox1");

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle("Alumno");

        contenedorJP.setBackground(new java.awt.Color(0, 51, 102));
        contenedorJP.setToolTipText("");

        alumnoJL.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        alumnoJL.setForeground(new java.awt.Color(255, 255, 255));
        alumnoJL.setText("Cargado de Alumno");

        nombreJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        nombreJL.setForeground(new java.awt.Color(255, 255, 255));
        nombreJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombreJL.setText("Nombre:");

        idJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        idJL.setForeground(new java.awt.Color(255, 255, 255));
        idJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idJL.setText("ID:");

        sexoJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        sexoJL.setForeground(new java.awt.Color(255, 255, 255));
        sexoJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sexoJL.setText("Sexo:");

        siguienteJB.setBackground(new java.awt.Color(255, 204, 0));
        siguienteJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        siguienteJB.setForeground(new java.awt.Color(255, 255, 255));
        siguienteJB.setText("Siguiente");
        siguienteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteJBActionPerformed(evt);
            }
        });

        apellidoJL1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        apellidoJL1.setForeground(new java.awt.Color(255, 255, 255));
        apellidoJL1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        apellidoJL1.setText("Apellido:");

        hombreJRB.setBackground(new java.awt.Color(0, 51, 102));
        hombreJRB.setForeground(new java.awt.Color(255, 255, 255));
        hombreJRB.setText("H");
        hombreJRB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                hombreJRBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                hombreJRBFocusLost(evt);
            }
        });
        hombreJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hombreJRBActionPerformed(evt);
            }
        });

        mujerJRB.setBackground(new java.awt.Color(0, 51, 102));
        mujerJRB.setForeground(new java.awt.Color(255, 255, 255));
        mujerJRB.setText("M");
        mujerJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mujerJRBActionPerformed(evt);
            }
        });

        jScrollPane1.setToolTipText("apellidoJTF");

        apellidoJTP.setBackground(new java.awt.Color(255, 255, 255));
        apellidoJTP.setForeground(new java.awt.Color(0, 0, 0));
        apellidoJTP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apellidoJTPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidoJTPFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(apellidoJTP);

        jScrollPane2.setToolTipText("apellidoJTF");

        nombreJTP.setBackground(new java.awt.Color(255, 255, 255));
        nombreJTP.setForeground(new java.awt.Color(0, 0, 0));
        nombreJTP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreJTPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreJTPFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(nombreJTP);

        jScrollPane3.setToolTipText("apellidoJTF");

        idJTP.setBackground(new java.awt.Color(255, 255, 255));
        idJTP.setForeground(new java.awt.Color(0, 0, 0));
        idJTP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idJTPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idJTPFocusLost(evt);
            }
        });
        jScrollPane3.setViewportView(idJTP);

        javax.swing.GroupLayout contenedorJPLayout = new javax.swing.GroupLayout(contenedorJP);
        contenedorJP.setLayout(contenedorJPLayout);
        contenedorJPLayout.setHorizontalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alumnoJL)
                    .addComponent(sexoJL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(apellidoJL1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombreJL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idJL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorJPLayout.createSequentialGroup()
                                .addComponent(hombreJRB)
                                .addGap(18, 18, 18)
                                .addComponent(mujerJRB)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(contenedorJPLayout.createSequentialGroup()
                                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jScrollPane2))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorJPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(siguienteJB)
                        .addGap(14, 14, 14))))
        );
        contenedorJPLayout.setVerticalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alumnoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siguienteJB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreJL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellidoJL1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addComponent(idJL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sexoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hombreJRB)
                            .addComponent(mujerJRB)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorJP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteJBActionPerformed
        nombre = nombreJTP.getText();
        apellido = apellidoJTP.getText();
        ID = idJTP.getText();
        
        Alumno alumno = new Alumno(nombre, apellido, sexo, ID);
        alumnoHash.add(alumno);
        
        nombreJTP.setText("");
        apellidoJTP.setText("");
        idJTP.setText("");
        
        mujerJRB.setSelected(false);
        mujerJRB.setEnabled(true);
        hombreJRB.setSelected(false);
        hombreJRB.setEnabled(true);
    }//GEN-LAST:event_siguienteJBActionPerformed

    private void hombreJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hombreJRBActionPerformed
        mujerJRB.setSelected(false);
        sexo = "Hombre";
    }//GEN-LAST:event_hombreJRBActionPerformed

    private void mujerJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mujerJRBActionPerformed
        hombreJRB.setSelected(false);
        sexo = "Mujer";
    }//GEN-LAST:event_mujerJRBActionPerformed

    private void hombreJRBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hombreJRBFocusGained
    }//GEN-LAST:event_hombreJRBFocusGained

    private void hombreJRBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hombreJRBFocusLost

    }//GEN-LAST:event_hombreJRBFocusLost

    private void nombreJTPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJTPFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreJTPFocusGained

    private void nombreJTPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJTPFocusLost
        // TODO add your handling code here:
        if (nombreJTP.getText().equals("")) {
            nombreJTP.setBackground(Color.red);
            nombreJTP.setForeground(Color.white);
        }else {
            nombreJTP.setBackground(Color.white);
            nombreJTP.setForeground(Color.black);
        }
    }//GEN-LAST:event_nombreJTPFocusLost

    private void apellidoJTPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoJTPFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoJTPFocusGained

    private void apellidoJTPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoJTPFocusLost
        // TODO add your handling code here:
        if (apellidoJTP.getText().equals("")) {
            apellidoJTP.setBackground(Color.red);
            apellidoJTP.setForeground(Color.white);
        }else {
            apellidoJTP.setBackground(Color.white);
            apellidoJTP.setForeground(Color.black);
        }
    }//GEN-LAST:event_apellidoJTPFocusLost

    private void idJTPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idJTPFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_idJTPFocusGained

    private void idJTPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idJTPFocusLost
        // TODO add your handling code here:
        if (idJTP.getText().equals("")) {
            idJTP.setBackground(Color.red);
            idJTP.setForeground(Color.white);
        }else {
            idJTP.setBackground(Color.white);
            idJTP.setForeground(Color.black);
        }
    }//GEN-LAST:event_idJTPFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alumnoJL;
    private javax.swing.JLabel apellidoJL1;
    private javax.swing.JTextPane apellidoJTP;
    private javax.swing.JPanel contenedorJP;
    private javax.swing.JRadioButton hombreJRB;
    private javax.swing.JLabel idJL;
    private javax.swing.JTextPane idJTP;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton mujerJRB;
    private javax.swing.JLabel nombreJL;
    private javax.swing.JTextPane nombreJTP;
    private javax.swing.JLabel sexoJL;
    private javax.swing.JButton siguienteJB;
    // End of variables declaration//GEN-END:variables
}
