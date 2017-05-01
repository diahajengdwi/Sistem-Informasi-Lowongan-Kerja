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
public class PelamarSetpage extends javax.swing.JFrame {

    public PelamarSetpage() {
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
                .addContainerGap(463, Short.MAX_VALUE)
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
        jLabel14.setText("Pengaturan");

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
                        .addGap(38, 38, 38)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemail)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtnama, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnsimpan)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
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
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addGap(20, 20, 20)
                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel19)
                .addGap(20, 20, 20)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsimpan)
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

    public void setSession(String session){
        sessionlabel.setText(session);
    }
    
    public void setActionListener(ActionListener e) {
        btnclose.addActionListener(e);
        btnback.addActionListener(e);
        btnsimpan.addActionListener(e);
    }
    
    public void setField(String nama, String email){
        txtemail.setText(email);
        txtnama.setText(nama);
    }
    
    public List<String> getField(){
       List<String> list = new ArrayList<>();
       list.add(txtemail.getText());
       list.add(txtnama.getText());
       return list;
    }
    
    public JButton getbtnback() {
        return btnback;
    }

    public JButton getbtnclose() {
        return btnclose;
    }

    public JButton getbtnsimpan() {
        return btnsimpan;
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel sessionlabel;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
