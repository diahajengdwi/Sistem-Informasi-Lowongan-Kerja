package View;

import java.awt.event.ActionListener;

/**
 *
 * @author Diah Ajeng
 */
public class DaftarPelamarpage extends javax.swing.JFrame {

    public DaftarPelamarpage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnkeluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtpwd = new javax.swing.JPasswordField();
        btndaftar = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(30, 47, 90));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        btnkeluar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diah Ajeng\\Documents\\GitHub\\Sistem_Lowongan_Kerja\\icon\\flat\\back.png")); // NOI18N
        btnkeluar.setBorderPainted(false);
        btnkeluar.setContentAreaFilled(false);
        btnkeluar.setDefaultCapable(false);
        btnkeluar.setFocusPainted(false);
        btnkeluar.setFocusable(false);
        btnkeluar.setMaximumSize(new java.awt.Dimension(142, 142));
        btnkeluar.setMinimumSize(new java.awt.Dimension(167, 41));
        btnkeluar.setName(""); // NOI18N
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnkeluar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama");

        txtnama.setBackground(new java.awt.Color(30, 47, 90));
        txtnama.setForeground(new java.awt.Color(255, 255, 255));
        txtnama.setBorder(null);
        txtnama.setCaretColor(new java.awt.Color(255, 255, 255));
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alamat Email");

        txtemail.setBackground(new java.awt.Color(30, 47, 90));
        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        txtemail.setBorder(null);
        txtemail.setCaretColor(new java.awt.Color(255, 255, 255));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kata Sandi");

        txtpass.setBackground(new java.awt.Color(30, 47, 90));
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setBorder(null);
        txtpass.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ulang Kata Sandi");

        txtpwd.setBackground(new java.awt.Color(30, 47, 90));
        txtpwd.setForeground(new java.awt.Color(255, 255, 255));
        txtpwd.setBorder(null);
        txtpwd.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpwd.setPreferredSize(new java.awt.Dimension(6, 27));

        btndaftar.setText("Daftar");
        btndaftar.setPreferredSize(new java.awt.Dimension(85, 33));
        btndaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndaftarActionPerformed(evt);
            }
        });

        btnbatal.setText("Batal");
        btnbatal.setPreferredSize(new java.awt.Dimension(85, 33));
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diah Ajeng\\Documents\\GitHub\\Sistem_Lowongan_Kerja\\icon\\icon.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Daftar Cari Job.id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(txtemail)
                            .addComponent(jSeparator2)
                            .addComponent(txtpass)
                            .addComponent(jSeparator3))
                        .addGap(145, 145, 145))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btndaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4))
                        .addGap(133, 133, 133))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndaftar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btndaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndaftarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndaftarActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkeluarActionPerformed
    public void addListenbatal(ActionListener listenbtnbatal){
        btnbatal.addActionListener(listenbtnbatal);
    }
    
    public void addListendaftar(ActionListener listenbtndaftar){
        btndaftar.addActionListener(listenbtndaftar);
    }
    
    public void addListenkeluar(ActionListener listenbtnkeluar){
        btnkeluar.addActionListener(listenbtnkeluar);
    }
    
    public void reset(){
        txtnama.setText("");
        txtemail.setText("");
        txtpass.setText("");
        txtpwd.setText("");
    }
    
    public void setPass() {
        txtpass.setText("");
        txtpwd.setText("");
    }
       
    public String getNama() {
        return txtnama.getText();
    }
    
    public String getEmail() {
        return txtemail.getText();
    }
    
    public String getPass() {
        return txtpass.getText();
    }
    
    public String getPwd() {
        return txtpwd.getText();
    }
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btndaftar;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnama;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JPasswordField txtpwd;
    // End of variables declaration//GEN-END:variables
}
