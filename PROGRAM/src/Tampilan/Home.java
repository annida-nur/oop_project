/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import static Tampilan.DetailBuyEvent1.tanggal1;
import static Tampilan.DetailBuyEvent1.usernameBuy1;
import static Tampilan.DetailBuyEvent2.tanggal2;
import static Tampilan.DetailBuyEvent2.usernameBuy2;
import static Tampilan.DetailBuyEvent3.tanggal3;
import static Tampilan.DetailBuyEvent3.usernameBuy3;
import static Tampilan.DetailBuyEvent4.tanggal4;
import static Tampilan.DetailBuyEvent4.usernameBuy4;
import static Tampilan.DetailBuyEvent5.tanggal5;
import static Tampilan.DetailBuyEvent5.usernameBuy5;
import static Tampilan.DetailBuyEvent6.tanggal6;
import static Tampilan.DetailBuyEvent6.usernameBuy6;
import static Tampilan.History.usernameHistory;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Asus
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        tanggal();
    }
    
    public void tanggal(){
        Date ys = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        tanggal.setText(s.format(ys));
        tanggal1.setText(""+tanggal.getText());
        tanggal2.setText(""+tanggal.getText());
        tanggal3.setText(""+tanggal.getText());
        tanggal4.setText(""+tanggal.getText());
        tanggal5.setText(""+tanggal.getText());
        tanggal6.setText(""+tanggal.getText());
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        history = new javax.swing.JLabel();
        LOGOUT = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pstr1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        detail1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pstr2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        detail2 = new javax.swing.JLabel();
        pstr3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        detail3 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        detail4 = new javax.swing.JLabel();
        pstr4 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        pstr5 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        detail5 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        pstr6 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        detail6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tanggal = new javax.swing.JTextField();
        bgHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GETTICK");
        setMinimumSize(new java.awt.Dimension(1000, 720));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 76, 134));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hello");

        usernameHome.setEditable(false);
        usernameHome.setBackground(new java.awt.Color(10, 76, 134));
        usernameHome.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        usernameHome.setForeground(new java.awt.Color(255, 255, 255));
        usernameHome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameHome.setBorder(null);

        history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/historyButton.png"))); // NOI18N
        history.setText("jLabel4");
        history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historyMouseClicked(evt);
            }
        });

        LOGOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/LOGOUT.png"))); // NOI18N
        LOGOUT.setText("jLabel4");
        LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usernameHome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(usernameHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 160, 410));

        jPanel3.setBackground(new java.awt.Color(245, 243, 239));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Padi Reborn");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 116, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("July 31, 2021");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, 20));

        pstr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/1.png"))); // NOI18N
        jPanel3.add(pstr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 160));

        jLabel8.setText("🔖");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 20));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 214, -1, -1));

        jLabel10.setText("📅");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, 20));

        detail1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        detail1.setForeground(new java.awt.Color(0, 0, 255));
        detail1.setText("Detail");
        detail1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detail1MouseClicked(evt);
            }
        });
        jPanel3.add(detail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 76, 134)));
        jPanel4.setForeground(new java.awt.Color(10, 76, 134));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 200, 250));

        jLabel15.setText("📅");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        pstr2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/2.png"))); // NOI18N
        jPanel3.add(pstr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel16.setText("🔖");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("The Wings Tour");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 150, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("November 22, 2021");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 76, 134)));
        jPanel5.setForeground(new java.awt.Color(10, 76, 134));

        detail2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        detail2.setForeground(new java.awt.Color(0, 0, 255));
        detail2.setText("Detail");
        detail2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detail2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(detail2)
                .addGap(26, 26, 26))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(detail2)
                .addContainerGap())
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 250));

        pstr3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/3.png"))); // NOI18N
        jPanel3.add(pstr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Korean Wave");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 116, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("September 10, 2021");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        jLabel21.setText("🔖");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        jLabel22.setText("📅");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 76, 134)));
        jPanel6.setForeground(new java.awt.Color(10, 76, 134));

        detail3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        detail3.setForeground(new java.awt.Color(0, 0, 255));
        detail3.setText("Detail");
        detail3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detail3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(detail3)
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(detail3)
                .addContainerGap())
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, 250));

        jLabel39.setText("🔖");
        jPanel3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("August 4, 2021");
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, -1, -1));

        detail4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        detail4.setForeground(new java.awt.Color(0, 0, 255));
        detail4.setText("Detail");
        detail4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detail4MouseClicked(evt);
            }
        });
        jPanel3.add(detail4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        pstr4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/4.png"))); // NOI18N
        jPanel3.add(pstr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Sound of The City");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 140, -1));

        jLabel38.setText("📅");
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 76, 134)));
        jPanel8.setForeground(new java.awt.Color(10, 76, 134));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 250));

        pstr5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/5.png"))); // NOI18N
        jPanel3.add(pstr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jLabel33.setText("📅");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel31.setText("Freedom of Nggambleh");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 150, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("August 21, 2022");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, -1, -1));

        jLabel34.setText("🔖");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 76, 134)));
        jPanel7.setForeground(new java.awt.Color(10, 76, 134));

        detail5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        detail5.setForeground(new java.awt.Color(0, 0, 255));
        detail5.setText("Detail");
        detail5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detail5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(detail5)
                .addGap(26, 26, 26))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(detail5)
                .addContainerGap())
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 200, -1));

        jLabel46.setText("🔖");
        jPanel3.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, -1, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setText("31 July 2021");
        jPanel3.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, -1, -1));

        jLabel45.setText("📅");
        jPanel3.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 570, -1, -1));

        pstr6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/6.png"))); // NOI18N
        jPanel3.add(pstr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("Tiga Dimensi");
        jPanel3.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 116, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 76, 134)));
        jPanel9.setForeground(new java.awt.Color(10, 76, 134));

        detail6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        detail6.setForeground(new java.awt.Color(0, 0, 255));
        detail6.setText("Detail");
        detail6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detail6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(detail6)
                .addGap(26, 26, 26))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(detail6)
                .addContainerGap())
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/available tickets.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 356, 40));

        tanggal.setEditable(false);
        tanggal.setBackground(new java.awt.Color(245, 243, 239));
        tanggal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tanggal.setForeground(new java.awt.Color(245, 243, 239));
        tanggal.setBorder(null);
        jPanel3.add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 110, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -20, 790, 620));

        bgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/bgHome.png"))); // NOI18N
        jPanel1.add(bgHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

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

    private void detail1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detail1MouseClicked
        // TODO add your handling code here:
        usernameBuy1.setText(""+usernameHome.getText());
        DetailBuyEvent1 detail1 = new DetailBuyEvent1 ();
        detail1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_detail1MouseClicked

    private void detail2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detail2MouseClicked
        // TODO add your handling code here:
        usernameBuy2.setText(""+usernameHome.getText());
        DetailBuyEvent2 detail1 = new DetailBuyEvent2 ();
        detail1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_detail2MouseClicked

    private void detail3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detail3MouseClicked
        // TODO add your handling code here:
        usernameBuy3.setText(""+usernameHome.getText());
        DetailBuyEvent3 detail3 = new DetailBuyEvent3();
        detail3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_detail3MouseClicked

    private void detail4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detail4MouseClicked
        // TODO add your handling code here:
        usernameBuy4.setText(""+usernameHome.getText());
        DetailBuyEvent4 detail4 = new DetailBuyEvent4 ();
        detail4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_detail4MouseClicked

    private void detail5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detail5MouseClicked
        // TODO add your handling code here:
        usernameBuy5.setText(""+usernameHome.getText());
        DetailBuyEvent5 detail5 = new DetailBuyEvent5 ();
        detail5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_detail5MouseClicked

    private void detail6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detail6MouseClicked
        // TODO add your handling code here:
        usernameBuy6.setText(""+usernameHome.getText());
        DetailBuyEvent6 detail6 = new DetailBuyEvent6 ();
        detail6.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_detail6MouseClicked

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseClicked
        // TODO add your handling code here:
        OnboardingAndLogin login = new OnboardingAndLogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LOGOUTMouseClicked

    private void historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyMouseClicked
        usernameHistory.setText(""+usernameHome.getText());
        History hs = new History();
        hs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_historyMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGOUT;
    private javax.swing.JLabel bgHome;
    private javax.swing.JLabel detail1;
    private javax.swing.JLabel detail2;
    private javax.swing.JLabel detail3;
    private javax.swing.JLabel detail4;
    private javax.swing.JLabel detail5;
    private javax.swing.JLabel detail6;
    private javax.swing.JLabel history;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel pstr1;
    private javax.swing.JLabel pstr2;
    private javax.swing.JLabel pstr3;
    private javax.swing.JLabel pstr4;
    private javax.swing.JLabel pstr5;
    private javax.swing.JLabel pstr6;
    private javax.swing.JTextField tanggal;
    public static final javax.swing.JTextField usernameHome = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
