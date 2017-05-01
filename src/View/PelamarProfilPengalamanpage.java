package View;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author Diah Ajeng
 */
public class PelamarProfilPengalamanpage extends javax.swing.JFrame {

    public PelamarProfilPengalamanpage() {
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
        jPanel13 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtmasuk = new javax.swing.JTextField();
        txtpekerjaan = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtdivisi = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        txtkota = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtkeluar = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        txtprov = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btnback = new javax.swing.JButton();
        lblpeng = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(30, 47, 90));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Job Title");

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
                .addGap(133, 133, 133)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Tahun Masuk");

        txtmasuk.setBackground(new java.awt.Color(30, 47, 90));
        txtmasuk.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtmasuk.setForeground(new java.awt.Color(255, 255, 255));
        txtmasuk.setText("2015");
        txtmasuk.setBorder(null);
        txtmasuk.setCaretColor(new java.awt.Color(255, 255, 255));
        txtmasuk.setOpaque(false);
        txtmasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmasukActionPerformed(evt);
            }
        });

        txtpekerjaan.setBackground(new java.awt.Color(30, 47, 90));
        txtpekerjaan.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtpekerjaan.setForeground(new java.awt.Color(255, 255, 255));
        txtpekerjaan.setText("Apa");
        txtpekerjaan.setBorder(null);
        txtpekerjaan.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpekerjaan.setOpaque(false);

        btnsimpan.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnsimpan.setText("Simpan");

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Profil / Pengalaman Kerja");

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Divisi");

        txtdivisi.setBackground(new java.awt.Color(30, 47, 90));
        txtdivisi.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtdivisi.setForeground(new java.awt.Color(255, 255, 255));
        txtdivisi.setText("Universitas Telkom");
        txtdivisi.setBorder(null);
        txtdivisi.setCaretColor(new java.awt.Color(255, 255, 255));
        txtdivisi.setOpaque(false);
        txtdivisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdivisiActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Kota");

        txtkota.setBackground(new java.awt.Color(30, 47, 90));
        txtkota.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtkota.setForeground(new java.awt.Color(255, 255, 255));
        txtkota.setText("Cilacap");
        txtkota.setBorder(null);
        txtkota.setCaretColor(new java.awt.Color(255, 255, 255));
        txtkota.setOpaque(false);
        txtkota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkotaActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Daftar Pengalaman");

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Tahun Keluar");

        txtkeluar.setBackground(new java.awt.Color(30, 47, 90));
        txtkeluar.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtkeluar.setForeground(new java.awt.Color(255, 255, 255));
        txtkeluar.setText("2019");
        txtkeluar.setBorder(null);
        txtkeluar.setCaretColor(new java.awt.Color(255, 255, 255));
        txtkeluar.setOpaque(false);
        txtkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkeluarActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Provinsi");

        txtprov.setBackground(new java.awt.Color(30, 47, 90));
        txtprov.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtprov.setForeground(new java.awt.Color(255, 255, 255));
        txtprov.setText("Jawa Tengah");
        txtprov.setBorder(null);
        txtprov.setCaretColor(new java.awt.Color(255, 255, 255));
        txtprov.setOpaque(false);
        txtprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprovActionPerformed(evt);
            }
        });

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

        lblpeng.setForeground(new java.awt.Color(255, 255, 255));
        lblpeng.setText("-");
        lblpeng.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(txtdivisi, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtmasuk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txtpekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtkeluar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsimpan)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21)
                                .addComponent(txtkota, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(36, 36, 36)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel24)
                                .addComponent(txtprov, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(lblpeng, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txtpekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(20, 20, 20)
                                        .addComponent(txtmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(20, 20, 20)
                                        .addComponent(txtkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addGap(20, 20, 20)
                                .addComponent(txtdivisi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(20, 20, 20)
                                        .addComponent(txtkota, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(20, 20, 20)
                                        .addComponent(txtprov, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsimpan))
                            .addComponent(lblpeng, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7))
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

    private void txtmasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmasukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmasukActionPerformed

    private void txtdivisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdivisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdivisiActionPerformed

    private void txtkotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkotaActionPerformed

    private void txtkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkeluarActionPerformed

    private void txtprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprovActionPerformed

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
    
    public List<String> getField(){
       List<String> list = new ArrayList<>();
       list.add(txtpekerjaan.getText());
       list.add(txtmasuk.getText());
       list.add(txtkeluar.getText());
       list.add(txtdivisi.getText());
       list.add(txtkota.getText());
       list.add(txtprov.getText());
       return list;
    }
    
    public void reset(){
        txtpekerjaan.setText("");
        txtmasuk.setText("");
        txtkeluar.setText("");
        txtdivisi.setText("");
        txtkota.setText("");
        txtprov.setText("");
    }
    
    public void setlblpengalaman(String p){
        lblpeng.setText(p);
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblpeng;
    private javax.swing.JLabel sessionlabel;
    private javax.swing.JTextField txtdivisi;
    private javax.swing.JTextField txtkeluar;
    private javax.swing.JTextField txtkota;
    private javax.swing.JTextField txtmasuk;
    private javax.swing.JTextField txtpekerjaan;
    private javax.swing.JTextField txtprov;
    // End of variables declaration//GEN-END:variables
}
