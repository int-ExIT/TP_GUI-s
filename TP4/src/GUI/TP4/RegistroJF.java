package GUI.TP4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class RegistroJF extends javax.swing.JInternalFrame {

    private HashSet<Alumno> alumnos = new HashSet();
    private HashSet<Materia> materias = new HashSet();
    
    private final ArrayList<Alumno> alumnosOrdenados;
    private final ArrayList<Materia> materiasOrdenadas;
    
    private String IDA = new String();
    private String IDM = new String();
    
    private boolean recursante;

    public RegistroJF(HashSet<Alumno> alumnos, HashSet<Materia> materias) {
        initComponents();
        this.alumnos = alumnos;
        this.materias = materias;
        this.alumnosOrdenados = new ArrayList(alumnos);
        this.materiasOrdenadas = new ArrayList(materias);
        this.IDA = IDA;
        this.IDM = IDM;
        this.recursante = recursante;
        
        Comparator<Alumno> ALF = (Alumno t, Alumno t1) -> t.getNombre().compareTo(t1.getNombre());
        Collections.sort(alumnosOrdenados, ALF);
        
        cargarBoxMaterias();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        contenedorJP = new javax.swing.JPanel();
        rejistroJL = new javax.swing.JLabel();
        alumnoJL = new javax.swing.JLabel();
        siguienteJB = new javax.swing.JButton();
        materiaJL = new javax.swing.JLabel();
        materiaJCB = new javax.swing.JComboBox<>();
        alumnoJCB = new javax.swing.JComboBox<>();
        buscarPorJL = new javax.swing.JLabel();
        apellidoJRB = new javax.swing.JRadioButton();
        idJRB = new javax.swing.JRadioButton();
        recursanteJL = new javax.swing.JLabel();
        recursanteJChB = new javax.swing.JCheckBox();

        jCheckBox1.setText("jCheckBox1");

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle("Alumno");

        contenedorJP.setBackground(new java.awt.Color(0, 51, 102));
        contenedorJP.setToolTipText("");

        rejistroJL.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        rejistroJL.setForeground(new java.awt.Color(255, 255, 255));
        rejistroJL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rejistroJL.setText("Registro");

        alumnoJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        alumnoJL.setForeground(new java.awt.Color(255, 255, 255));
        alumnoJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        alumnoJL.setText("Alumno:");

        siguienteJB.setBackground(new java.awt.Color(255, 204, 0));
        siguienteJB.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        siguienteJB.setForeground(new java.awt.Color(255, 255, 255));
        siguienteJB.setText("Siguiente");
        siguienteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteJBActionPerformed(evt);
            }
        });

        materiaJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        materiaJL.setForeground(new java.awt.Color(255, 255, 255));
        materiaJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        materiaJL.setText("Materia:");

        materiaJCB.setBackground(new java.awt.Color(255, 255, 255));
        materiaJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {""}));
        materiaJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materiaJCBActionPerformed(evt);
            }
        });

        alumnoJCB.setBackground(new java.awt.Color(255, 255, 255));
        alumnoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {""}));
        alumnoJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnoJCBActionPerformed(evt);
            }
        });

        buscarPorJL.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        buscarPorJL.setForeground(new java.awt.Color(255, 255, 255));
        buscarPorJL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buscarPorJL.setText("Buscar alumno por:");

        apellidoJRB.setBackground(new java.awt.Color(0, 51, 102));
        apellidoJRB.setForeground(new java.awt.Color(255, 255, 255));
        apellidoJRB.setText("Apellido");
        apellidoJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoJRBActionPerformed(evt);
            }
        });

        idJRB.setBackground(new java.awt.Color(0, 51, 102));
        idJRB.setForeground(new java.awt.Color(255, 255, 255));
        idJRB.setText("ID");
        idJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idJRBActionPerformed(evt);
            }
        });

        recursanteJL.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        recursanteJL.setForeground(new java.awt.Color(255, 255, 255));
        recursanteJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        recursanteJL.setText("Recursante:");

        recursanteJChB.setBackground(new java.awt.Color(0, 51, 102));
        recursanteJChB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recursanteJChBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorJPLayout = new javax.swing.GroupLayout(contenedorJP);
        contenedorJP.setLayout(contenedorJPLayout);
        contenedorJPLayout.setHorizontalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorJPLayout.createSequentialGroup()
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(materiaJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(materiaJL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alumnoJL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alumnoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorJPLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(buscarPorJL, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apellidoJRB)
                                .addGap(18, 18, 18)
                                .addComponent(idJRB))
                            .addComponent(rejistroJL, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(siguienteJB)
                    .addGroup(contenedorJPLayout.createSequentialGroup()
                        .addComponent(recursanteJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recursanteJChB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        contenedorJPLayout.setVerticalGroup(
            contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorJPLayout.createSequentialGroup()
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejistroJL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siguienteJB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarPorJL)
                    .addComponent(apellidoJRB)
                    .addComponent(idJRB))
                .addGap(15, 15, 15)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alumnoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alumnoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(materiaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(materiaJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(recursanteJL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recursanteJChB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorJP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarBoxAlumnosApellido() {
        for (Alumno alumno : alumnosOrdenados) {
            alumnoJCB.addItem(alumno.getNombre() + " " + alumno.getApellido());
        }
    }
    
    private void cargarBoxAlumnosID() {
        for (Alumno alumno : alumnosOrdenados) {
            alumnoJCB.addItem(alumno.getNombre() + " " + alumno.getID());
        }
    }
    
    private void cargarBoxMaterias() {
        materiaJCB.removeAllItems();
        
        Comparator<Materia> ALF = (Materia t, Materia t1) -> t.getAsignatura().compareTo(t1.getAsignatura());
        Collections.sort(materiasOrdenadas, ALF);
        
        for (Materia materia : materiasOrdenadas) {
            materiaJCB.addItem(materia.getAsignatura());
        }
    }
    
    private void siguienteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteJBActionPerformed
        String nombreM = materiaJCB.getItemAt(materiaJCB.getSelectedIndex());

        for (Materia materia : materias) {
            if (nombreM.equals(materia.getAsignatura())) {
                IDM = materia.getID();
            }
        }
        
        String nombreA = alumnoJCB.getItemAt(alumnoJCB.getSelectedIndex());

        for (Alumno alumno : alumnos) {
            if (nombreA.equals(alumno.getNombre() + " " + alumno.getApellido()) || nombreA.equals(alumno.getNombre() + " " + alumno.getID())) {
                IDA = alumno.getID();
            }
        }
        
        System.out.println(IDM);
        System.out.println(IDA);
        
        InicioJDP.llenarTabla(IDA, IDM, recursante);
        
        recursante = false;
        recursanteJChB.setSelected(false);
    }//GEN-LAST:event_siguienteJBActionPerformed

    private void materiaJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materiaJCBActionPerformed
//         TODO add your handling code here:
    }//GEN-LAST:event_materiaJCBActionPerformed

    private void alumnoJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnoJCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alumnoJCBActionPerformed

    private void apellidoJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoJRBActionPerformed
        // TODO add your handling code here:
        idJRB.setSelected(false);
        alumnoJCB.removeAllItems();
        
        cargarBoxAlumnosApellido();
    }//GEN-LAST:event_apellidoJRBActionPerformed

    private void idJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idJRBActionPerformed
        // TODO add your handling code here:
        apellidoJRB.setSelected(false);
        alumnoJCB.removeAllItems();
        
        cargarBoxAlumnosID();
    }//GEN-LAST:event_idJRBActionPerformed

    private void recursanteJChBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recursanteJChBActionPerformed
        recursante = recursanteJChB.isSelected();
    }//GEN-LAST:event_recursanteJChBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alumnoJCB;
    private javax.swing.JLabel alumnoJL;
    private javax.swing.JRadioButton apellidoJRB;
    private javax.swing.JLabel buscarPorJL;
    private javax.swing.JPanel contenedorJP;
    private javax.swing.JRadioButton idJRB;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> materiaJCB;
    private javax.swing.JLabel materiaJL;
    private javax.swing.JCheckBox recursanteJChB;
    private javax.swing.JLabel recursanteJL;
    private javax.swing.JLabel rejistroJL;
    private javax.swing.JButton siguienteJB;
    // End of variables declaration//GEN-END:variables
}
