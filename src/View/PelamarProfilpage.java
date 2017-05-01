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
public class PelamarProfilpage extends javax.swing.JFrame {

    public PelamarProfilpage() {
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
        jLabel23 = new javax.swing.JLabel();
        txtjk = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
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

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Jenis Kelamin");

        txtjk.setBackground(new java.awt.Color(30, 47, 90));
        txtjk.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtjk.setForeground(new java.awt.Color(255, 255, 255));
        txtjk.setBorder(null);
        txtjk.setCaretColor(new java.awt.Color(255, 255, 255));
        txtjk.setOpaque(false);

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
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txttgl, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txttempat, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsimpan)
                            .addComponent(jLabel23)
                            .addComponent(txtjk, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(20, 20, 20)
                                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(20, 20, 20)
                                        .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9)
                                .addComponent(jLabel19)
                                .addGap(20, 20, 20)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(20, 20, 20)
                                .addComponent(txtjk, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txttempat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btnsimpan)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addGap(20, 20, 20)
                        .addComponent(txttgl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txttglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttglActionPerformed

    private void txttempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttempatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttempatActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void btnpengalamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpengalamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpengalamanActionPerformed

    private void btnkeahlianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeahlianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkeahlianActionPerformed

    private void btngelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btngelarActionPerformed

    private void btnbahasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbahasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbahasaActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed
    
    public void setSession(String session){
        sessionlabel.setText(session);
    }
    
    public void setActionListener(ActionListener e) {
        btnbahasa.addActionListener(e);
        btnclose.addActionListener(e);
        btngelar.addActionListener(e);
        btnkeahlian.addActionListener(e);
        btnpengalaman.addActionListener(e);
        btnsimpan.addActionListener(e);
        btnback.addActionListener(e);
    }
    
    public void setField(String nama, String email, String tmpt, Date tgl, String noTelp, String jk){
        Date todaysDate = new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        txtemail.setText(email);
        txtnama.setText(nama);
        txttelp.setText(noTelp);
        txttempat.setText(tmpt);
        txttgl.setText(df.format(tgl));
        txtjk.setText(jk);
    }
    
    public List<String> getField(){
       List<String> list = new ArrayList<>();
       list.add(txtemail.getText());
       list.add(txtnama.getText());
       list.add(txttelp.getText());
       list.add(txttempat.getText());
       list.add(txttgl.getText());
       list.add(txtjk.getText());
       return list;
    }
    
    public JButton getbtnback() {
        return btnback;
    }
    
    public JButton getbtnbahasa() {
        return btnbahasa;
    }

    public JButton getbtnclose() {
        return btnclose;
    }

    public JButton getbtngelar() {
        return btngelar;
    }
    
    public JButton getbtnkeahlian() {
        return btnkeahlian;
    }

    public JButton getbtnpengalaman() {
        return btnpengalaman;
    }

    public JButton getbtnsimpan() {
        return btnsimpan;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnbahasa;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btngelar;
    private javax.swing.JButton btnkeahlian;
    private javax.swing.JButton btnpengalaman;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel sessionlabel;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtjk;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttelp;
    private javax.swing.JTextField txttempat;
    private javax.swing.JTextField txttgl;
    // End of variables declaration//GEN-END:variables
}
