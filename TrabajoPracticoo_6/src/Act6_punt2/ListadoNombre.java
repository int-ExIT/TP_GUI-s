package Act6_punt2;

import Act6_punt2_Funciones.Funcion;
import Act6_punt2_Funciones.Producto;
import javax.swing.table.DefaultTableModel;

public class ListadoNombre extends javax.swing.JInternalFrame {

    private DefaultTableModel mTabla;
    
    public ListadoNombre() {
        initComponents();
        
        Funcion.cargarFuncion();
        setColum();
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

        panelPrinJP = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        busquedaJTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        panelPrinJP.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese un Nombre:");

        busquedaJTF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        busquedaJTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busquedaJTFKeyReleased(evt);
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listado por Nombre");

        javax.swing.GroupLayout panelPrinJPLayout = new javax.swing.GroupLayout(panelPrinJP);
        panelPrinJP.setLayout(panelPrinJPLayout);
        panelPrinJPLayout.setHorizontalGroup(
            panelPrinJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrinJPLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelPrinJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrinJPLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(panelPrinJPLayout.createSequentialGroup()
                        .addGroup(panelPrinJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrinJPLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(busquedaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelPrinJPLayout.setVerticalGroup(
            panelPrinJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrinJPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(panelPrinJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(busquedaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrinJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrinJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busquedaJTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaJTFKeyReleased
        resetTable();
        
        Integer cont = 0;
        
        for (Producto producto : Funcion.getProductos()) {
            
            boolean condicion = producto.getNombre().toLowerCase().startsWith(busquedaJTF.getText().toLowerCase());
            
            if (condicion) {
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
        
    }//GEN-LAST:event_busquedaJTFKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busquedaJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrinJP;
    private javax.swing.JTable tablaJT;
    // End of variables declaration//GEN-END:variables
}
