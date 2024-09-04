package GUI.TP4;

import java.util.HashSet;

public class InicioJDP extends javax.swing.JFrame {
    
    private static HashSet<Alumno> alumnos = new HashSet();
    private static HashSet<Materia> materias = new HashSet();
    
    private AlumnoJF alumnoFrame;
    private MateriaJF materiaFrame;
    private RegistroJF registroFrame;
    
    private static int fila;
    
    public InicioJDP() {
        initComponents();
        this.fila = 0;
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        escritorioDP = new javax.swing.JDesktopPane();
        panelTablaJP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJT = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        alumnoJM = new javax.swing.JMenu();
        alumnoJMItem = new javax.swing.JMenuItem();
        materiaJM = new javax.swing.JMenu();
        materiaJMItem = new javax.swing.JMenuItem();
        rejistrarJM = new javax.swing.JMenu();
        registrarJMItem = new javax.swing.JMenuItem();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ULP Alumnos");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setName("ULP Alumnos"); // NOI18N
        setResizable(false);

        escritorioDP.setBackground(new java.awt.Color(0, 0, 0));
        escritorioDP.setForeground(new java.awt.Color(255, 255, 255));
        escritorioDP.setName(""); // NOI18N

        javax.swing.GroupLayout escritorioDPLayout = new javax.swing.GroupLayout(escritorioDP);
        escritorioDP.setLayout(escritorioDPLayout);
        escritorioDPLayout.setHorizontalGroup(
            escritorioDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        escritorioDPLayout.setVerticalGroup(
            escritorioDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        tablaJT.setModel(new javax.swing.table.DefaultTableModel(
            new String [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Recursante", "Asignatura", "ID"
            }
        ));
        tablaJT.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tablaJTComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(tablaJT);

        javax.swing.GroupLayout panelTablaJPLayout = new javax.swing.GroupLayout(panelTablaJP);
        panelTablaJP.setLayout(panelTablaJPLayout);
        panelTablaJPLayout.setHorizontalGroup(
            panelTablaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelTablaJPLayout.setVerticalGroup(
            panelTablaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setName(""); // NOI18N

        alumnoJM.setText("Alumno");

        alumnoJMItem.setText("Agregar");
        alumnoJMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnoJMItemActionPerformed(evt);
            }
        });
        alumnoJM.add(alumnoJMItem);

        jMenuBar1.add(alumnoJM);

        materiaJM.setText("Materia");

        materiaJMItem.setText("Agregar");
        materiaJMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materiaJMItemActionPerformed(evt);
            }
        });
        materiaJM.add(materiaJMItem);

        jMenuBar1.add(materiaJM);

        rejistrarJM.setText("Registrar");

        registrarJMItem.setText("Agregar");
        registrarJMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarJMItemActionPerformed(evt);
            }
        });
        rejistrarJM.add(registrarJMItem);

        jMenuBar1.add(rejistrarJM);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTablaJP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(escritorioDP)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorioDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTablaJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alumnoJMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnoJMItemActionPerformed
        escritorioDP.removeAll();
        escritorioDP.repaint();
        
        alumnoFrame = new AlumnoJF(alumnos);
        alumnoFrame.setVisible(true);
        
        escritorioDP.add(alumnoFrame);
        escritorioDP.moveToFront(alumnoFrame);
    }//GEN-LAST:event_alumnoJMItemActionPerformed

    private void materiaJMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materiaJMItemActionPerformed
        escritorioDP.removeAll();
        escritorioDP.repaint();
        
        materiaFrame = new MateriaJF(materias);
        materiaFrame.setVisible(true);
        
        escritorioDP.add(materiaFrame);
        escritorioDP.moveToFront(materiaFrame);
    }//GEN-LAST:event_materiaJMItemActionPerformed

    private void registrarJMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarJMItemActionPerformed
        escritorioDP.removeAll();
        escritorioDP.repaint();
        
        registroFrame = new RegistroJF(alumnos, materias);
        registroFrame.setVisible(true);

        escritorioDP.add(registroFrame);
        escritorioDP.moveToFront(registroFrame);
    }//GEN-LAST:event_registrarJMItemActionPerformed
    
    /**
     *     "ID", "Nombre", "Apellido", "Recursante", "Asignatura", "ID"
     *  0   0       1           2            3             4        5
     *  1
     *  2
     */
    public static void llenarTabla(String IDA, String IDM, boolean recursante) {
        for (Alumno alumno : alumnos) {
            for (Materia materia : materias) {
                if (IDA.equals(alumno.getID()) && IDM.equals(materia.getID())) {
                    for (int columna = 0; columna < 6; columna++) {
                        switch (columna) {
                            case 0 -> tablaJT.setValueAt(alumno.getID(), fila, columna);
                            case 1 -> tablaJT.setValueAt(alumno.getNombre(), fila, columna);
                            case 2 -> tablaJT.setValueAt(alumno.getApellido(), fila, columna);
                            case 3 -> tablaJT.setValueAt(recursante, fila, columna);
                            case 4 -> tablaJT.setValueAt(materia.getAsignatura(), fila, columna);
                            case 5 -> tablaJT.setValueAt(materia.getID(), fila, columna);
                        }
                    }
                }
            }
        }
        
        fila++;
    }
    
    private void tablaJTComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tablaJTComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaJTComponentAdded

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioJDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioJDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioJDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioJDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioJDP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu alumnoJM;
    private javax.swing.JMenuItem alumnoJMItem;
    private javax.swing.JDesktopPane escritorioDP;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JMenu materiaJM;
    private javax.swing.JMenuItem materiaJMItem;
    private javax.swing.JPanel panelTablaJP;
    private javax.swing.JMenuItem registrarJMItem;
    private javax.swing.JMenu rejistrarJM;
    private static javax.swing.JTable tablaJT;
    // End of variables declaration//GEN-END:variables
}
/*escritorio.removeAll();
        escritorio.repaint();
        AltaMaterias a2 = new AltaMaterias(mat);
        a2.setVisible(true);
        escritorio.add(a2);
        escritorio.moveToFront(a2);\*/
