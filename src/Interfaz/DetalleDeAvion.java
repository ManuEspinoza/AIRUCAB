package Interfaz;

import Controller.ConectorDb;
import Controller.Controladora;
import Dominio.Cliente;
import Dominio.Solicitud_Avion;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DetalleDeAvion extends javax.swing.JFrame {

    Controladora control;
    ConectorDb conector;
    JFrame ventana;
    Cliente cl;
    int idAvion;
    public DetalleDeAvion(JFrame ventana,int idAvion,Cliente cl) {
        initComponents();
        control = new Controladora();
        control.iniciaVentana(this);
        conector = new ConectorDb();
        conector.conectar();
        this.cl = cl;
        this.idAvion = idAvion;
        this.ventana = ventana;
        control.buildDescripcionCaracteristicas(control.getResultSet(conector,"select ca_nombre, ac_valor from avion,avion_caracteristica,caracteristica where av_id = '"+idAvion+"' and av_id = ac_avion_id and ca_id = ac_caracteristica_id"),conector, tableCaracteristicas, idAvion, desCripcionDetalle,nombreAirucab);
        
    }
    
    public DetalleDeAvion(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreAirucab = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desCripcionDetalle = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCaracteristicas = new javax.swing.JTable();
        solicitarBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        atrasBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 118, 210));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Avion AirUcab");

        nombreAirucab.setBackground(new java.awt.Color(255, 255, 255));
        nombreAirucab.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        nombreAirucab.setForeground(new java.awt.Color(255, 255, 255));
        nombreAirucab.setText("XXX");

        jLabel23.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("X");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("_");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreAirucab)
                .addContainerGap(578, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel6))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreAirucab))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 118, 210), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Airplane_Mode_On_100px.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 13, 287, 176));

        desCripcionDetalle.setEditable(false);
        desCripcionDetalle.setColumns(20);
        desCripcionDetalle.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        desCripcionDetalle.setRows(5);
        desCripcionDetalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 118, 210), 2));
        jScrollPane1.setViewportView(desCripcionDetalle);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 177, 736, 120));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Caracteristicas Generales : ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 303, -1, -1));

        tableCaracteristicas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tableCaracteristicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Medida"
            }
        ));
        jScrollPane2.setViewportView(tableCaracteristicas);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 540, 100));

        solicitarBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        solicitarBtn.setForeground(new java.awt.Color(25, 118, 210));
        solicitarBtn.setText("Solicitar Avión");
        solicitarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        solicitarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                solicitarBtnMouseClicked(evt);
            }
        });
        solicitarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(solicitarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Descripcion :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        atrasBtn.setText("Atras");
        atrasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBtnActionPerformed(evt);
            }
        });
        jPanel2.add(atrasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 760, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solicitarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_solicitarBtnActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setState(Home.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir?","SALIR",dialogButton);
        if (result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void solicitarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitarBtnMouseClicked
        Solicitud_Avion SA = new Solicitud_Avion(cl.getCL_id(),idAvion);
        SA.generarSolicitud(conector);        

    }//GEN-LAST:event_solicitarBtnMouseClicked

    private void atrasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBtnActionPerformed
        control.activaVentana(ventana, this);
    }//GEN-LAST:event_atrasBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetalleDeAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleDeAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleDeAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleDeAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleDeAvion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasBtn;
    private javax.swing.JTextArea desCripcionDetalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombreAirucab;
    private javax.swing.JButton solicitarBtn;
    private javax.swing.JTable tableCaracteristicas;
    // End of variables declaration//GEN-END:variables
}
