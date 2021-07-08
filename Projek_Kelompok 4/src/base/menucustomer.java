/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import com.mysql.jdbc.PreparedStatement;
import database.Koneksi;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author DIKYPUT PC
 */
public class menucustomer extends javax.swing.JFrame {
 private final Connection conn = Koneksi.getKoneksi();
    /**
     * Creates new form menucustomer
     */
    public menucustomer() {
        initComponents();
        tampil_combo();
        tanggal();
    }
    
     public void bersih() {
namac.setText("");
alamatc.setText("");
teleponc.setText("");
idpaket.setSelectedItem("-Pilih-");
paket.setText("");
kecepatan.setText("");
}
    
    public void tanggal(){
        Date ys= new Date();
        SimpleDateFormat t=new SimpleDateFormat("dd-MM-yy");
        tanggalan.setText(t.format(ys));
    }
    
    public void tampil_combo()
    {
        try {
        Connection c = Koneksi.getKoneksi();
        Statement s = c.createStatement();
        String sql = "select id_paket from paket order by id_paket asc";      // disini saya menampilkan NIM, anda dapat menampilkan
        ResultSet r = s.executeQuery(sql);                                // yang anda ingin kan
        
        while(r.next()){
            Object[] ob = new Object[3];
            ob[0] = r.getString(1);
            
            idpaket.addItem((String) ob[0]);                                      // fungsi ini bertugas menampung isi dari database
        }
        r.close(); s.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
     public void tampil()
    {
        try {
        Connection c = Koneksi.getKoneksi();
        Statement s = c.createStatement();
        String sql = "select nama_paket, kecepatan from paket where id_paket='"+idpaket.getSelectedItem()+"'";  
        ResultSet r = s.executeQuery(sql);
        
        while(r.next()){
            Object[] ob = new Object[3];
            ob[0]=  r.getString(1);
            ob[1]= r.getString(2);
            
            paket.setText((String) ob[0]);
            kecepatan.setText((String) ob[1]);
        }
        r.close(); s.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }              
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kembalia = new javax.swing.JButton();
        tanggalan = new javax.swing.JTextField();
        namac = new javax.swing.JTextField();
        alamatc = new javax.swing.JTextField();
        teleponc = new javax.swing.JTextField();
        paket = new javax.swing.JTextField();
        kecepatan = new javax.swing.JTextField();
        idpaket = new javax.swing.JComboBox<>();
        order = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        getContentPane().add(Kembalia, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 80, 30));

        tanggalan.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        tanggalan.setForeground(new java.awt.Color(0, 153, 204));
        tanggalan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(tanggalan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 80, -1));
        getContentPane().add(namac, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 200, 20));
        getContentPane().add(alamatc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 200, -1));
        getContentPane().add(teleponc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 200, 20));
        getContentPane().add(paket, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 200, 20));
        getContentPane().add(kecepatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 200, 20));

        idpaket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-" }));
        idpaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpaketActionPerformed(evt);
            }
        });
        getContentPane().add(idpaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 90, -1));

        order.setBackground(new java.awt.Color(0, 153, 255));
        order.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        order.setForeground(new java.awt.Color(255, 255, 255));
        order.setText("ORDER");
        order.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        getContentPane().add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 130, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Telepon");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Pilih Paket");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("Nama Paket");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("Kecepatan");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Nama");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 80, 120));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/unnamed (2).jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 290, 300));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/unnamed (2).jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 330, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/menu customer.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 625, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idpaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpaketActionPerformed
    tampil();
    }//GEN-LAST:event_idpaketActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
String sql ="INSERT into tpesanan values (?,?,?,?,?,?,?)";
        try{
        PreparedStatement stat = (PreparedStatement) conn.prepareStatement(sql);
        stat.setString(1, tanggalan.getText());    
        stat.setString(2, namac.getText());    
        stat.setString(3, alamatc.getText());    
        stat.setString(4, teleponc.getText());    
        stat.setString(5, (String) idpaket.getSelectedItem());    
        stat.setString(6, paket.getText());    
        stat.setString(7, kecepatan.getText());
        
        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "Order Sukses");
        bersih();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Order Gagal");
            bersih();
        }     // TODO add your handling code here:
    }//GEN-LAST:event_orderActionPerformed

    private void KembaliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliaActionPerformed
         new menuawal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KembaliaActionPerformed

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
            java.util.logging.Logger.getLogger(menucustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menucustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menucustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menucustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menucustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembalia;
    private javax.swing.JTextField alamatc;
    private javax.swing.JComboBox<String> idpaket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kecepatan;
    private javax.swing.JTextField namac;
    private javax.swing.JButton order;
    private javax.swing.JTextField paket;
    private javax.swing.JTextField tanggalan;
    private javax.swing.JTextField teleponc;
    // End of variables declaration//GEN-END:variables
}
