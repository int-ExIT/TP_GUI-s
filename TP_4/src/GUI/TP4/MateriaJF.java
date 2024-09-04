package GUI.TP4;

import java.awt.Color;
import java.util.HashSet;

public class MateriaJF extends javax.swing.JInternalFrame {

    private HashSet<Materia> materiaHash = new HashSet<>();
    private String asignatura;
    private String ID;

    public MateriaJF(HashSet<Materia> materiaHash) {
        initComponents();
        this.materiaHash = materiaHash;
        this.asignatura = "";
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        contenedorJP = new javax.swing.JPanel();
        alumnoJL = new javax.swing.JLabel();
        asignaturaJL = new javax.swing.JLabel();
        idJL = new javax.swing.JLabel();
        siguienteJB = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        asignaturaJTP = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        idJTP = new javax.swing.JTextPane();

        jCheckBox1.setText("jCheckBox1");

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle("Materia");

        contenedorJP.setBackground(new java.awt.Color(0, 51, 102));
        contenedorJP.setToolTipText("");

        alumnoJL.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        alumnoJL.setForeground(new java.awt.Color(255, 255, 255));
        alumnoJL.setText("Cargado de Asignatura");

        asignaturaJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        asignaturaJL.setForeground(new java.awt.Color(255, 255, 255));
        asignaturaJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        asignaturaJL.setText("Asignatura:");

        idJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        idJL.setForeground(new java.awt.Color(255, 255, 255));
        idJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idJL.setText("ID:");

        siguienteJB.setBackground(new java.awt.Color(255, 204, 0));
        siguienteJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        siguienteJB.setForeground(new java.awt.Color(255, 255, 255));
        siguienteJB.setText("Siguiente");
        siguienteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteJBActionPerformed(evt);
            }
        });

        jScrollPane2.setToolTipText("apellidoJTF");

        asignaturaJTP.setBackground(new java.awt.Color(255, 255, 255));
        asignaturaJTP.setForeground(new java.awt.Color(0, 0, 0));
        asignaturaJTP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                asignaturaJTPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                asignaturaJTPFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(asignaturaJTP);

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
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addComponent(alumnoJL)
                        .addGap(37, 37, 37)
                        .addComponent(siguienteJB)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorJPLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(asignaturaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idJL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );
        contenedorJPLayout.setVerticalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alumnoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siguienteJB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asignaturaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idJL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteJBActionPerformed
        
        asignatura = asignaturaJTP.getText();
        ID = idJTP.getText();
        
        Materia materia = new Materia(asignatura, ID);
        materiaHash.add(materia);
        
        asignaturaJTP.setText("");
        idJTP.setText("");
    }//GEN-LAST:event_siguienteJBActionPerformed

    private void asignaturaJTPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_asignaturaJTPFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_asignaturaJTPFocusGained

    private void asignaturaJTPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_asignaturaJTPFocusLost
        // TODO add your handling code here:
        if (asignaturaJTP.getText().equals("")) {
            asignaturaJTP.setBackground(Color.red);
            asignaturaJTP.setForeground(Color.white);
        }else {
            asignaturaJTP.setBackground(Color.white);
            asignaturaJTP.setForeground(Color.black);
        }
    }//GEN-LAST:event_asignaturaJTPFocusLost

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
    private javax.swing.JLabel asignaturaJL;
    private javax.swing.JTextPane asignaturaJTP;
    private javax.swing.JPanel contenedorJP;
    private javax.swing.JLabel idJL;
    private javax.swing.JTextPane idJTP;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton siguienteJB;
    // End of variables declaration//GEN-END:variables
}
