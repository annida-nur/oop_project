/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class DetailBuyEvent5 extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    String idTiket = "GT005";
    String namaEvent = "Freedom of Nggambleh";
    String username = usernameBuy5.getText();
    
    public DetailBuyEvent5() {
        initComponents();
    }
    
    private void hapuslayar(){
        noPembelian.setText("");
        nama.setText("");
        email.setText("");
        notelp.setText("");
        jenis.setSelectedIndex(0);
        jumlah.setValue(0);
        metodebayar.setSelectedIndex(0);
        totalharga.setText("");
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
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        noPembelian = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        notelp = new javax.swing.JTextField();
        totalharga = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jenis = new javax.swing.JComboBox<>();
        jumlah = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        metodebayar = new javax.swing.JComboBox<>();
        buyButton = new javax.swing.JLabel();
        bgFull = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GETTICK");
        setMinimumSize(new java.awt.Dimension(1000, 720));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, 110, 50));

        jPanel2.setBackground(new java.awt.Color(245, 243, 239));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/5D.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 25)); // NOI18N
        jLabel2.setText("Freedom of Nggambleh");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setText("Pelaksanaan");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal : 21 Agustus 2021");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel6.setText("Waktu   : 19.30 WIB");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel7.setText("Lokasi");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel8.setText("Depan FE UII Concat Yogyakarta");

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(245, 243, 239));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("by Hindia, Pamungkas, Ray Orange\nCountry, Kunto Aji, Ardhito Pramono\n");
        jTextArea2.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(204, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(206, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(142, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(206, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(206, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(206, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(188, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(205, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 154, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(70, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(98, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(95, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(116, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(51, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(140, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(163, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addContainerGap()))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 460, 190));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(245, 243, 239));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Memiliki konsep \"Jebakan\" yang tidak hanya menampilkan musik tetapi \njuga wajah Ray Orange Country sampai Hindia, padahal acara stand up \ncomedy. Wajah-wajah musisi yang ada dalam poster, hanya ditampilkan\ndalam bentuk playlist yang berisi lagu-lagu mereka saja\n");
        jTextArea1.setBorder(null);
        jPanel1.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 450, 90));

        jPanel4.setBackground(new java.awt.Color(245, 243, 239));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel11.setText("Platinum : Rp 200.000");

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel12.setText("Gold     : Rp 500.000");

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel13.setText("Silver    : Rp 400.000");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 200, 110));

        tanggal5.setEditable(false);
        tanggal5.setBackground(new java.awt.Color(245, 243, 239));
        tanggal5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tanggal5.setForeground(new java.awt.Color(245, 243, 239));
        tanggal5.setBorder(null);
        jPanel1.add(tanggal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 110, -1));

        noPembelian.setBackground(new java.awt.Color(10, 76, 134));
        noPembelian.setForeground(new java.awt.Color(10, 76, 134));
        noPembelian.setBorder(null);
        jPanel1.add(noPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 40, 20));

        usernameBuy5.setEditable(false);
        usernameBuy5.setBackground(new java.awt.Color(10, 76, 134));
        usernameBuy5.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        usernameBuy5.setForeground(new java.awt.Color(10, 76, 134));
        usernameBuy5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameBuy5.setBorder(null);
        jPanel1.add(usernameBuy5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 40, -1));

        nama.setText(" ");
        nama.setBorder(null);
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 300, 20));

        email.setText(" ");
        email.setBorder(null);
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 300, 29));

        notelp.setText(" ");
        notelp.setBorder(null);
        jPanel1.add(notelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 300, 20));

        totalharga.setEditable(false);
        totalharga.setBorder(null);
        totalharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalhargaActionPerformed(evt);
            }
        });
        jPanel1.add(totalharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 300, 28));

        jPanel3.setBackground(new java.awt.Color(10, 76, 134));

        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Platinum (Rp 200.000)", "Silver     (Rp 400.000)", "Gold      (Rp 500.000)" }));
        jenis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });

        jumlah.setName(""); // NOI18N
        jumlah.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jumlahStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 340, 40));

        jPanel5.setBackground(new java.awt.Color(10, 76, 134));

        metodebayar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minimarket (Alfamart / Indomaret)  +Rp 2.500", "Transfer Bank                                  +Rp 1.000", "E-Wallet (OVO / Dana / LinkAja)      +Rp 1.000" }));
        metodebayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodebayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(metodebayar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(metodebayar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, -1, 40));

        buyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyButtonMouseClicked(evt);
            }
        });
        jPanel1.add(buyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, 120, 60));

        bgFull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/bgDetailBaru.png"))); // NOI18N
        bgFull.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgFullMouseClicked(evt);
            }
        });
        jPanel1.add(bgFull, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 680));

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

    private void bgFullMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgFullMouseClicked

    }//GEN-LAST:event_bgFullMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void buyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyButtonMouseClicked
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/gettick", "root", "");
            Statement st = con.createStatement();
            String simpan = "SELECT MAX(RIGHT(NoPembelian,5)) AS no_auto FROM pembeliant5";
            ResultSet rs = st.executeQuery(simpan);
            
            if(rs.next()){
                String no_auto, nol_plus;
                int p;
                no_auto=Integer.toString(rs.getInt(1)+1);
                p = no_auto.length();
                nol_plus="";
                for (int i = 1; i <=5-p; i++) {
                    nol_plus = nol_plus+"0";
                }
                noPembelian.setText("GTFN"+nol_plus+no_auto);
            }
        } catch(SQLException e){
           noPembelian.setText("GTFN00001");
        }
        
        try{
            int piljenis = 0; int pilmetod=0;
            int harga = 0;int admin = 0;
            String jns = "";String metode ="";
            
            piljenis = jenis.getSelectedIndex();
            if(piljenis==0){jns="Platinum";harga=200000;}
            if(piljenis==1){jns="Silver";harga=400000;}
            if(piljenis==2){jns="Gold";harga=500000;}
            
            pilmetod = metodebayar.getSelectedIndex();
            if(pilmetod==0){metode="Minimarket";admin=2500;}
            if(pilmetod==1){metode="Transfer Bank";admin=1000;}
            if(pilmetod==2){metode="E-Wallet";admin=1000;}
            
            int jmlh = (int) jumlah.getValue();
            int ttl = (harga*jmlh)+admin;
            
            if(nama.getText().equals("")||email.getText().equals("")||
                notelp.getText().equals("") || jumlah.getValue().equals(0)) {
                JOptionPane.showMessageDialog(this, "Lengkapi Data!", "Pesan", JOptionPane.ERROR_MESSAGE);
                hapuslayar();
            } else{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/gettick", "root", "");
                st = con.createStatement();
                String simpan = "insert into pembeliant5 values ('" +tanggal5.getText()+ "','"+ noPembelian.getText()+"','" + idTiket + "','" + namaEvent + "','" + username + "','" 
                        + nama.getText() + "','" + email.getText() + "','" + notelp.getText() + "','" + jns + "','" + harga + "','" + jumlah.getValue() +
                        "','" + metode + "','" + admin + "','" + ttl + "')";
                String simpan2 = "insert into allBuy values ('" +tanggal5.getText()+ "','"+ noPembelian.getText()+"','" + idTiket + "','" + namaEvent + "','" + username + "','" 
                        + nama.getText() + "','" + email.getText() + "','" + notelp.getText() + "','" + jns + "','" + harga + "','" + jumlah.getValue() +
                        "','" + metode + "','" + admin + "','" + ttl + "')";
                st = con.createStatement();
                st.executeUpdate(simpan);
                st.executeUpdate(simpan2);
                JOptionPane.showMessageDialog(null, "Data Berhasil disimpan."+"Silahkan Lakukan Konfirmasi Pembelian.");
                hapuslayar();
                Buy5 buy = new Buy5();
                buy.setVisible(true);
                this.setVisible(false);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan ! Silahkan isi ulang!");
            hapuslayar();
        }
    }//GEN-LAST:event_buyButtonMouseClicked

    private void totalhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalhargaActionPerformed

    }//GEN-LAST:event_totalhargaActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        ubah();
    }//GEN-LAST:event_jenisActionPerformed

    private void metodebayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodebayarActionPerformed
        ubah();
    }//GEN-LAST:event_metodebayarActionPerformed

    private void jumlahStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jumlahStateChanged
        ubah();
    }//GEN-LAST:event_jumlahStateChanged

    private void ubah(){
        int piljenis = 0; int pilmetod=0;
        int harga = 0;int admin = 0;
        String jns = "";String metode ="";

        piljenis = jenis.getSelectedIndex();
        if(piljenis==0){jns="Platinum";harga=200000;}
        if(piljenis==1){jns="Silver";harga=400000;}
        if(piljenis==2){jns="Gold";harga=500000;}
        
        pilmetod = metodebayar.getSelectedIndex();
        if(pilmetod==0){metode="Minimarket";admin=2500;}
        if(pilmetod==1){metode="Transfer Bank";admin=1000;}
        if(pilmetod==2){metode="E-Wallet";admin=1000;}

        int jmlh = (int) jumlah.getValue();
        int ttl = (harga*jmlh)+admin;
        totalharga.setText("Rp "+ttl);
    }
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
            java.util.logging.Logger.getLogger(DetailBuyEvent5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailBuyEvent5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailBuyEvent5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailBuyEvent5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new DetailBuyEvent5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel bgFull;
    private javax.swing.JLabel buyButton;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JSpinner jumlah;
    private javax.swing.JComboBox<String> metodebayar;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField noPembelian;
    private javax.swing.JTextField notelp;
    public static final javax.swing.JTextField tanggal5 = new javax.swing.JTextField();
    private javax.swing.JFormattedTextField totalharga;
    public static final javax.swing.JTextField usernameBuy5 = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
