package GUI;

import java.awt.Container;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class FormConvertor extends javax.swing.JFrame {

    private double gradosFahr, gradosCel;
    private final JDialog dialogo;
    private final JLabel fahrenJL;
    private final Container contenedor;
    
    public FormConvertor() {
        initComponents();
        this.gradosFahr = 0;
        this.gradosCel = 0;
        this.dialogo = new JDialog();
        this.fahrenJL = new JLabel();
        this.contenedor = dialogo.getContentPane();
        
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloJL = new javax.swing.JLabel();
        solicituJL = new javax.swing.JLabel();
        temperaturaJT = new javax.swing.JTextField();
        convertirJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        tituloJL.setBackground(new java.awt.Color(51, 51, 51));
        tituloJL.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        tituloJL.setForeground(new java.awt.Color(255, 255, 255));
        tituloJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloJL.setText(":: Convertor de Temperatura ::");

        solicituJL.setForeground(new java.awt.Color(255, 255, 255));
        solicituJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        solicituJL.setText("Ingrese temperatura en grados Celsius");

        temperaturaJT.setBackground(new java.awt.Color(255, 255, 255));
        temperaturaJT.setForeground(new java.awt.Color(0, 0, 0));
        temperaturaJT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        convertirJB.setBackground(new java.awt.Color(0, 0, 0));
        convertirJB.setForeground(new java.awt.Color(255, 255, 255));
        convertirJB.setText("Convertir");
        convertirJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloJL, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(temperaturaJT, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(convertirJB)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(solicituJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloJL, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(solicituJL)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperaturaJT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertirJB))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ventanaDialogo() {
        dialogo.setSize(250, 30);
        dialogo.setTitle("Grados Fahrenheit");
        dialogo.setResizable(false);
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
        
        fahrenJL.setSize(155, 20);
        fahrenJL.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        fahrenJL.setText(Integer.toString((int)gradosFahr) + "°");
        fahrenJL.setVisible(true);
        contenedor.add(fahrenJL);
    }
    
    private void convertirJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirJBActionPerformed
        // TODO add your handling code here:
        gradosCel = Integer.parseInt(temperaturaJT.getText());
        gradosFahr = gradosCel*9/5+32;
        
        ventanaDialogo();
    }//GEN-LAST:event_convertirJBActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormConvertor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertirJB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel solicituJL;
    private javax.swing.JTextField temperaturaJT;
    private javax.swing.JLabel tituloJL;
    // End of variables declaration//GEN-END:variables
}
