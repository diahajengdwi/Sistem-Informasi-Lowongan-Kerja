/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_lowongan_kerja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class DaftarPelamarController {
    private DaftarPelamarpage view;
    private Model model;
    
    public DaftarPelamarController(DaftarPelamarpage view, Model model){
        this.view = view;
        this.model = model;
        this.view.addListenkeluar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                Daftarpage viewDaftar = new Daftarpage();
                DaftarController daftar = new DaftarController(viewDaftar, model);
                viewDaftar.setVisible(true);
            }        
        });
        this.view.addListenbatal(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedOption = JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan membatalkan pendaftaran?", "Informasi", JOptionPane.YES_NO_OPTION);
                if (selectedOption == JOptionPane.YES_OPTION) {
                    view.reset();
                }
            }
        });
        this.view.addListendaftar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = null;
                String email = null;
                String pass = null;
                nama = view.getNama();
                email = view.getEmail();
                if(view.getPass().equals(view.getPwd())){
                    pass = view.getPwd();
                    //insert data
                    //model.setPe(a, b);
                    JOptionPane.showMessageDialog(null, "Berhasil!");
                    view.reset();
                }else if(nama.equals("") || email.equals("") || view.getPass().equals("") || view.getPwd().equals("")){
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong!");
                    view.reset();
                }else{
                    JOptionPane.showMessageDialog(null, "Kata Sandi Tidak Sama!");
                    view.setPass();
                    view.setPwd();
                } 
            }
        });
    }
}
