package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Diah Ajeng
 */
public class PelamarProfilSkillpage extends javax.swing.JFrame {

    public PelamarProfilSkillpage() {
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
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnbahasa = new javax.swing.JButton();
        btngelar = new javax.swing.JButton();
        btnkeahlian = new javax.swing.JButton();
        btnpengalaman = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txtskill = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSkill = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(30, 47, 90));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nama Keahlian");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jPanel12.setBackground(new java.awt.Color(106, 116, 145));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Profil");

        btnbahasa.setForeground(new java.awt.Color(255, 255, 255));
        btnbahasa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diah Ajeng\\Documents\\GitHub\\Sistem_Lowongan_Kerja\\icon\\flat\\bahasa.png")); // NOI18N
        btnbahasa.setText("Bahasa");
        btnbahasa.setBorderPainted(false);
        btnbahasa.setContentAreaFilled(false);
        btnbahasa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnbahasa.setFocusable(false);
        btnbahasa.setMaximumSize(new java.awt.Dimension(142, 142));
        btnbahasa.setMinimumSize(new java.awt.Dimension(167, 41));
        btnbahasa.setName(""); // NOI18N
        btnbahasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbahasaActionPerformed(evt);
            }
        });

        btngelar.setForeground(new java.awt.Color(255, 255, 255));
        btngelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diah Ajeng\\Documents\\GitHub\\Sistem_Lowongan_Kerja\\icon\\flat\\gelar.png")); // NOI18N
        btngelar.setText("Gelar");
        btngelar.setBorderPainted(false);
        btngelar.setContentAreaFilled(false);
        btngelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btngelar.setFocusable(false);
        btngelar.setMaximumSize(new java.awt.Dimension(142, 142));
        btngelar.setMinimumSize(new java.awt.Dimension(167, 41));
        btngelar.setName(""); // NOI18N
        btngelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngelarActionPerformed(evt);
            }
        });

        btnkeahlian.setForeground(new java.awt.Color(255, 255, 255));
        btnkeahlian.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diah Ajeng\\Documents\\GitHub\\Sistem_Lowongan_Kerja\\icon\\flat\\skill.png")); // NOI18N
        btnkeahlian.setText("Keahlian");
        btnkeahlian.setBorderPainted(false);
        btnkeahlian.setContentAreaFilled(false);
        btnkeahlian.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnkeahlian.setFocusable(false);
        btnkeahlian.setMaximumSize(new java.awt.Dimension(142, 142));
        btnkeahlian.setMinimumSize(new java.awt.Dimension(167, 41));
        btnkeahlian.setName(""); // NOI18N
        btnkeahlian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeahlianActionPerformed(evt);
            }
        });

        btnpengalaman.setForeground(new java.awt.Color(255, 255, 255));
        btnpengalaman.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diah Ajeng\\Documents\\GitHub\\Sistem_Lowongan_Kerja\\icon\\flat\\pengalaman.png")); // NOI18N
        btnpengalaman.setText("Pengalaman Kerja");
        btnpengalaman.setBorderPainted(false);
        btnpengalaman.setContentAreaFilled(false);
        btnpengalaman.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnpengalaman.setFocusable(false);
        btnpengalaman.setMaximumSize(new java.awt.Dimension(142, 142));
        btnpengalaman.setMinimumSize(new java.awt.Dimension(167, 41));
        btnpengalaman.setName(""); // NOI18N
        btnpengalaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpengalamanActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(106, 116, 145));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(106, 116, 145));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnkeahlian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbahasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpengalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel17)
                        .addComponent(btngelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(1, 1, 1)
                .addComponent(btngelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnkeahlian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnbahasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnpengalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtskill.setBackground(new java.awt.Color(30, 47, 90));
        txtskill.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtskill.setForeground(new java.awt.Color(255, 255, 255));
        txtskill.setText("Java");
        txtskill.setBorder(null);
        txtskill.setCaretColor(new java.awt.Color(255, 255, 255));
        txtskill.setOpaque(false);

        btnsimpan.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnsimpan.setText("Simpan");

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Profil / Keahlian");

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

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menampilkan Keahlian");

        lblSkill.setForeground(new java.awt.Color(255, 255, 255));
        lblSkill.setText("-");
        lblSkill.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtskill, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addComponent(jSeparator1)
                                .addComponent(btnsimpan))
                            .addComponent(jLabel1)
                            .addComponent(lblSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 150, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(20, 20, 20)
                        .addComponent(txtskill, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsimpan)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
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

    private void btnbahasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbahasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbahasaActionPerformed

    private void btngelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btngelarActionPerformed

    private void btnkeahlianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeahlianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkeahlianActionPerformed

    private void btnpengalamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpengalamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpengalamanActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

    public void setSession(String session){
        sessionlabel.setText(session);
    }
    
    public void setActionListener(ActionListener e) {
        btnclose.addActionListener(e);
        btnsimpan.addActionListener(e);
        btngelar.addActionListener(e);
        btnpengalaman.addActionListener(e);
        btnkeahlian.addActionListener(e);
        btnback.addActionListener(e);
        btnbahasa.addActionListener(e);
    }
    
    public JButton getbtnclose(){
        return btnclose;
    }
    
    public JButton getbtnbhs(){
        return btnbahasa;
    }
    
    public JButton getbtnsimpan(){
        return btnsimpan;
    }

    public JButton getbtnback(){
        return btnback;
    }
    
    public JButton getbtngelar(){
        return btngelar;
    }
    
    public JButton getbtnpengalaman(){
        return btnpengalaman;
    }

    public JButton getbtnkeahlian(){
        return btnkeahlian;
    }
    
    public String getskill(){
        return txtskill.getText();
    }
    
    public void setSkill(String skill){
        txtskill.setText(skill);
    }
    
    public void setlblSkil(String skill){
        lblSkill.setText(skill);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnbahasa;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btngelar;
    private javax.swing.JButton btnkeahlian;
    private javax.swing.JButton btnpengalaman;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSkill;
    private javax.swing.JLabel sessionlabel;
    private javax.swing.JTextField txtskill;
    // End of variables declaration//GEN-END:variables
}   
