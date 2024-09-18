package Act6_punt2;

import Act6_punt2_Funciones.Funcion;
import Act6_punt2_Funciones.Producto;
import javax.swing.table.DefaultTableModel;

public class ListadoPrecio extends javax.swing.JInternalFrame {

    private DefaultTableModel mTabla;
    
    public ListadoPrecio() {
        initComponents();
        
        setColum();
        
        Funcion.cargarFuncion();
    }

    private void setColum() {
        mTabla = new DefaultTableModel() {
            public boolean celdaEditable(int fila, int col) {
                
                return false;
            }
        };

        mTabla.addColumn("N°");
        mTabla.addColumn("Codigo");
        mTabla.addColumn("Nombre");
        mTabla.addColumn("Tipo");
        mTabla.addColumn("Stock");
        mTabla.addColumn("Precio");

        tablaJT.setModel(mTabla);
    }
    
    private void resetTable() {
        int x = mTabla.getRowCount()-1;
        
        for (int c = x; c >= 0; c--) {
            mTabla.removeRow(c);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        minJTF = new javax.swing.JTextField();
        maxJTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        minJTF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        minJTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                minJTFKeyReleased(evt);
            }
        });

        maxJTF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        maxJTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                maxJTFKeyReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Act6_punt2/img/lupa.png"))); // NOI18N

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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Listado por Precio");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Entre  $");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Y");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(minJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(maxJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(77, 77, 77)
                        .addComponent(jLabel4)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(minJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(maxJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maxJTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maxJTFKeyReleased
        resetTable();
        
        Integer cont = 0;
        
        try {
            for (Producto producto : Funcion.getProductos()) {

                long condicion = producto.getPrecio();

                if (condicion >= Long.parseLong(minJTF.getText()) && condicion <= Long.parseLong(maxJTF.getText())) {
                    cont++;
                    mTabla.addRow(new Object[]{
                        cont,
                        producto.getCodigo(),
                        producto.getNombre(),
                        producto.getTipo(),
                        producto.getStock(),
                        producto.getPrecio(),
                    });
                }
            }

            tablaJT.setModel(mTabla);
        }catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_maxJTFKeyReleased

    private void minJTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minJTFKeyReleased
        // TODO add your handling code here:
        resetTable();
        
        Integer cont = 0;
  
        try {
            for (Producto producto : Funcion.getProductos()) {

                long condicion = producto.getPrecio();

                if (condicion >= Long.parseLong(minJTF.getText()) && condicion <= Long.parseLong(maxJTF.getText())) {
                    cont++;
                    mTabla.addRow(new Object[]{
                        cont,
                        producto.getCodigo(),
                        producto.getNombre(),
                        producto.getTipo(),
                        producto.getStock(),
                        producto.getPrecio(),
                    });
                }
            }

            tablaJT.setModel(mTabla);
        }catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_minJTFKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maxJTF;
    private javax.swing.JTextField minJTF;
    private javax.swing.JTable tablaJT;
    // End of variables declaration//GEN-END:variables
}
