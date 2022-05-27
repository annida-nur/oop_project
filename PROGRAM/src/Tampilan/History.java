/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import static Tampilan.DetailBuyEvent1.usernameBuy1;
import static Tampilan.DetailBuyEvent2.usernameBuy2;
import static Tampilan.DetailBuyEvent3.usernameBuy3;
import static Tampilan.DetailBuyEvent4.usernameBuy4;
import static Tampilan.DetailBuyEvent5.usernameBuy5;
import static Tampilan.DetailBuyEvent6.usernameBuy6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Asus
 */
public class History extends javax.swing.JFrame {

    public void tampilkan_data(){
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("No");
        model.addColumn("Tanggal");
        model.addColumn("No Pembelian");
        model.addColumn("ID Event");
        model.addColumn("Nama Event");
        model.addColumn("Jenis Tiket");
        model.addColumn("Harga");
        model.addColumn("Jumlah");
        model.addColumn("Metode Bayar");
        model.addColumn("Administrasi");
        model.addColumn("Total");
        
        try{
            int no = 1;
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/gettick", "root", "");
            Statement st = con.createStatement();
            String cari ="SELECT * FROM allbuy WHERE Username='"+usernameHistory.getText() +"'";
            ResultSet rs = st.executeQuery(cari);
            
            while(rs.next()){
                model.addRow(new Object[]{
                    no++,
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13),
                    rs.getString(14)
                });
                historyTable.setModel(model);
            } 
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
    
    /**
     * Creates new form Home
     */
    public History() {
        initComponents();
        tampilkan_data();
    }
    
    private static Connection c;
    private static Statement s;
    private static ResultSet rs;
    
    private static DefaultTableModel model = new DefaultTableModel();
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        backButton = new javax.swing.JLabel();
        bgHistory = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GETTICK");
        setMinimumSize(new java.awt.Dimension(1000, 720));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "No Pembelian", "ID Event", "Nama Event", "Jenis", "Harga", "Jumlah", "Metode Bayar", "Administrasi", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historyTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        historyTable.setGridColor(new java.awt.Color(10, 76, 134));
        jScrollPane2.setViewportView(historyTable);
        historyTable.getAccessibleContext().setAccessibleName("");

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 920, 320));

        usernameHistory.setEditable(false);
        usernameHistory.setBackground(new java.awt.Color(245, 243, 239));
        usernameHistory.setFont(new java.awt.Font("Tw Cen MT", 0, 28)); // NOI18N
        usernameHistory.setForeground(new java.awt.Color(10, 76, 134));
        usernameHistory.setBorder(null);
        jPanel1.add(usernameHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 220, 30));

        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 60));

        bgHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/bgHistory.png"))); // NOI18N
        jPanel1.add(bgHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        Home hm = new Home();
        hm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonMouseClicked

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
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel bgHistory;
    private javax.swing.JTable historyTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static final javax.swing.JTextField usernameHistory = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}