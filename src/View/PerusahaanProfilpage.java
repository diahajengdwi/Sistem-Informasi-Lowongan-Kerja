package View;

import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author Diah Ajeng
 */
public class PerusahaanProfilpage extends javax.swing.JFrame {

    public PerusahaanProfilpage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        sessionlabel = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtemail = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txttempat = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txttgl = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        txttelp = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(30, 47, 90));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nama");

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diah Ajeng\\Documents\\GitHub\\Sistem_Lowongan_Kerja\\icon\\flat\\contact.png")); // NOI18N

        sessionlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sessionlabel.setForeground(new java.awt.Color(255, 255, 255));
        sessionlabel.setText("Session!");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(488, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sessionlabel)
                .addGap(158, 158, 158))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sessionlabel)
                .addContainerGap())
        );

        btnclose.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diah Ajeng\\Documents\\GitHub\\Sistem_Lowongan_Kerja\\icon\\flat\\logout.png")); // NOI18N
        btnclose.setBorderPainted(false);
        btnclose.setContentAreaFilled(false);
        btnclose.setDefaultCapable(false);
        btnclose.setFocusPainted(false);
        btnclose.setFocusable(false);
        btnclose.setMaximumSize(new java.awt.Dimension(142, 142));
        btnclose.setMinimumSize(new java.awt.Dimension(167, 41));
        btnclose.setName(""); // NOI18N
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Email");

        txtemail.setBackground(new java.awt.Color(30, 47, 90));
        txtemail.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        txtemail.setText("diahajengdwi@gmail.com");
        txtemail.setBorder(null);
        txtemail.setCaretColor(new java.awt.Color(255, 255, 255));
        txtemail.setOpaque(false);
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        txtnama.setBackground(new java.awt.Color(30, 47, 90));
        txtnama.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtnama.setForeground(new java.awt.Color(255, 255, 255));
        txtnama.setText("Diah Ajeng Dwi Yuniasih");
        txtnama.setBorder(null);
        txtnama.setCaretColor(new java.awt.Color(255, 255, 255));
        txtnama.setOpaque(false);

        btnsimpan.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnsimpan.setText("Simpan");

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Profil");

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Tempat Lahir");

        txttempat.setBackground(new java.awt.Color(30, 47, 90));
        txttempat.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txttempat.setForeground(new java.awt.Color(255, 255, 255));
        txttempat.setText("Cilacap");
        txttempat.setBorder(null);
        txttempat.setCaretColor(new java.awt.Color(255, 255, 255));
        txttempat.setOpaque(false);
        txttempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttempatActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Tanggal Lahir");

        txttgl.setBackground(new java.awt.Color(30, 47, 90));
        txttgl.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txttgl.setForeground(new java.awt.Color(255, 255, 255));
        txttgl.setText("07-06-1996");
        txttgl.setBorder(null);
        txttgl.setCaretColor(new java.awt.Color(255, 255, 255));
        txttgl.setOpaque(false);
        txttgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttglActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("No Telp");

        txttelp.setBackground(new java.awt.Color(30, 47, 90));
        txttelp.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txttelp.setForeground(new java.awt.Color(255, 255, 255));
        txttelp.setText("08");
        txttelp.setBorder(null);
        txttelp.setCaretColor(new java.awt.Color(255, 255, 255));
        txttelp.setOpaque(false);

        btnback.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diah Ajeng\\Documents\\GitHub\\Sistem_Lowongan_Kerja\\icon\\flat\\back.png")); // NOI18N
        btnback.setBorderPainted(false);
        btnback.setContentAreaFilled(false);
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnback.setFocusable(false);
        btnback.setMaximumSize(new java.awt.Dimension(142, 142));
        btnback.setMinimumSize(new java.awt.Dimension(167, 41));
        btnback.setName(""); // NOI18N
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txttgl, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel14)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnsimpan)))
                            .addComponent(txttempat, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel14))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(20, 20, 20)
                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel19)
                        .addGap(20, 20, 20)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(20, 20, 20)
                        .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnsimpan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(20, 20, 20)
                .addComponent(txttempat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addGap(20, 20, 20)
                .addComponent(txttgl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncloseActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txttempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttempatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttempatActionPerformed

    private void txttglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttglActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

    public void setSession(String session){
        sessionlabel.setText(session);
    }
    
    public void setActionListener(ActionListener e) {
        btnclose.addActionListener(e);
        btnsimpan.addActionListener(e);
        btnback.addActionListener(e);
    }
    
    public JButton getbtnclose(){
        return btnclose;
    }
    
    public JButton getbtnsimpan(){
        return btnsimpan;
    }

    public JButton getbtnback(){
        return btnback;
    }
    
    public void setField(String nama, String email, String tmpt, Date tgl, String noTelp, String jk){
        Date todaysDate = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        txtemail.setText(email);
        txtnama.setText(nama);
        txttelp.setText(noTelp);
        txttempat.setText(tmpt);
        txttgl.setText(df.format(tgl));
    }
    
    public List<String> getField(){
       List<String> list = new ArrayList<>();
       list.add(txtemail.getText());
       list.add(txtnama.getText());
       list.add(txttelp.getText());
       list.add(txttempat.getText());
       list.add(txttgl.getText());
       return list;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel sessionlabel;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttelp;
    private javax.swing.JTextField txttempat;
    private javax.swing.JTextField txttgl;
    // End of variables declaration//GEN-END:variables
}
