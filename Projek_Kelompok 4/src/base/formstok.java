/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import database.Koneksi;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author DIKYPUT PC
 */
public class formstok extends javax.swing.JFrame {
  DefaultTableModel model;
  public Connection conn = Koneksi.getKoneksi();
    public formstok() {
        initComponents();
       String [] judul = {"ID Barang", "Nama Barang", "Jenis Barang", "Jumlah"};
       model =new DefaultTableModel(judul, 0);
               tbstok.setModel(model);
             tampilkan();
    }
public void bersih() {
barangid.setText("");
nbarang.setText("");
jbarang.setText("");
jmlbarang.setText("");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kembalia = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbstok = new javax.swing.JTable();
        jmlbarang = new javax.swing.JTextField();
        jbarang = new javax.swing.JTextField();
        nbarang = new javax.swing.JTextField();
        barangid = new javax.swing.JTextField();
        cetak = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Kembalia.setBackground(new java.awt.Color(255, 51, 51));
        Kembalia.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        Kembalia.setForeground(new java.awt.Color(255, 255, 255));
        Kembalia.setText("Kembali");
        Kembalia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Kembalia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliaActionPerformed(evt);
            }
        });
        getContentPane().add(Kembalia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 90, 30));

        tbstok.setModel(new javax.swing.table.DefaultTableModel(
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
        tbstok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbstokMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbstok);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 330, 280));
        getContentPane().add(jmlbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 150, -1));
        getContentPane().add(jbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 150, 20));

        nbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbarangActionPerformed(evt);
            }
        });
        getContentPane().add(nbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 150, -1));
        getContentPane().add(barangid, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 150, 20));

        cetak.setBackground(new java.awt.Color(0, 153, 255));
        cetak.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cetak.setForeground(new java.awt.Color(255, 255, 255));
        cetak.setText("CETAK");
        cetak.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });
        getContentPane().add(cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 90, 30));

        hapus.setBackground(new java.awt.Color(0, 153, 255));
        hapus.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        hapus.setForeground(new java.awt.Color(255, 255, 255));
        hapus.setText("HAPUS");
        hapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 90, 30));

        simpan.setBackground(new java.awt.Color(0, 153, 255));
        simpan.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        simpan.setForeground(new java.awt.Color(255, 255, 255));
        simpan.setText("SIMPAN");
        simpan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 90, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("JUMLAH BARANG");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("JENIS BARANG");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("NAMA BARANG");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("ID BARANG");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/form.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KembaliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliaActionPerformed
        new menuawal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KembaliaActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        String sql ="INSERT into stokbarang values (?,?,?,?)";
        try{
            PreparedStatement stat = (PreparedStatement) conn.prepareStatement(sql);
            stat.setString(1, barangid.getText());
            stat.setString(2, nbarang.getText());
            stat.setString(3, jbarang.getText());
            stat.setString(4, jmlbarang.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Simpan Barang Sukses");
            bersih();
            tampilkan();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Simpan Barang Gagal");
            bersih();
        }     // TODO add your handling code here:
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
     
       try{
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
        cn.createStatement().executeUpdate("delete from stokbarang where idbarang='"+barangid.getText()+"'");
            JOptionPane.showMessageDialog(null, "Hapus Barang Sukses");
            tampilkan();
         }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Hapus Barang Gagal");
        }
          
        
    }//GEN-LAST:event_hapusActionPerformed

    private void tbstokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbstokMouseClicked
int i = tbstok.getSelectedRow();
if (i>-1){
        barangid.setText(model.getValueAt(i, 0).toString());
        nbarang.setText(model.getValueAt(i, 1).toString());
        jbarang.setText(model.getValueAt(i, 2).toString());
        jmlbarang.setText(model.getValueAt(i, 3).toString());
}
    }//GEN-LAST:event_tbstokMouseClicked

    private void nbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbarangActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
      try {
            File reportB = new File("src/report/reportB.jasper");
            JasperPrint jp = JasperFillManager.fillReport(reportB.getPath(), null, Koneksi.getKoneksi());
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_cetakActionPerformed

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
            java.util.logging.Logger.getLogger(formstok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formstok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formstok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formstok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formstok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembalia;
    private javax.swing.JTextField barangid;
    private javax.swing.JButton cetak;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jbarang;
    private javax.swing.JTextField jmlbarang;
    private javax.swing.JTextField nbarang;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tbstok;
    // End of variables declaration//GEN-END:variables
private void tampilkan() {
    int row = tbstok.getRowCount();
    for (int a= 0; a<row;a++){
        model.removeRow(0);
    }
    try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
         ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM stokbarang");
         while (rs.next()){
             String data []= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
             model.addRow(data);
         }
    } catch (SQLException ex) {
        Logger.getLogger(formstok.class.getName()).log(Level.SEVERE, null, ex);
    }

} 
}






