/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author DIKYPUT PC
 */
public class menuawal extends javax.swing.JFrame {

    public menuawal() {
        initComponents();
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ordercustomer = new javax.swing.JButton();
        tentanglayanan = new javax.swing.JButton();
        tentanglayanan1 = new javax.swing.JButton();
        kontaklayanan = new javax.swing.JButton();
        Kembalia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ordercustomer.setBackground(new java.awt.Color(0, 153, 255));
        ordercustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/CUSTOMER.jpg"))); // NOI18N
        ordercustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordercustomerActionPerformed(evt);
            }
        });
        getContentPane().add(ordercustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 110, 80));

        tentanglayanan.setBackground(new java.awt.Color(0, 153, 255));
        tentanglayanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/PELANGGAN.jpg"))); // NOI18N
        tentanglayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tentanglayananActionPerformed(evt);
            }
        });
        getContentPane().add(tentanglayanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 110, 80));

        tentanglayanan1.setBackground(new java.awt.Color(0, 153, 255));
        tentanglayanan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/PELANGGAN.jpg"))); // NOI18N
        tentanglayanan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tentanglayanan1ActionPerformed(evt);
            }
        });
        getContentPane().add(tentanglayanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 110, 80));

        kontaklayanan.setBackground(new java.awt.Color(0, 153, 255));
        kontaklayanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/stok barangjpg.jpg"))); // NOI18N
        kontaklayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kontaklayananActionPerformed(evt);
            }
        });
        getContentPane().add(kontaklayanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 110, 80));

        Kembalia.setBackground(new java.awt.Color(255, 51, 51));
        Kembalia.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        Kembalia.setForeground(new java.awt.Color(255, 255, 255));
        Kembalia.setText("LOG-OUT");
        Kembalia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Kembalia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliaActionPerformed(evt);
            }
        });
        getContentPane().add(Kembalia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/menuawal1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ordercustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordercustomerActionPerformed
     new menucustomer().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_ordercustomerActionPerformed

    private void kontaklayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontaklayananActionPerformed
    new formstok().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_kontaklayananActionPerformed

    private void tentanglayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tentanglayananActionPerformed
      new pelanggan().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_tentanglayananActionPerformed

    private void KembaliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliaActionPerformed
        new loginadmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KembaliaActionPerformed

    private void tentanglayanan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tentanglayanan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tentanglayanan1ActionPerformed

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
            java.util.logging.Logger.getLogger(menuawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuawal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembalia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kontaklayanan;
    private javax.swing.JButton ordercustomer;
    private javax.swing.JButton tentanglayanan;
    private javax.swing.JButton tentanglayanan1;
    // End of variables declaration//GEN-END:variables
}
