/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Pelamar;
import View.DaftarPelamarpage;
import View.Daftarpage;
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
    private Aplikasi model;
    
    public DaftarPelamarController(DaftarPelamarpage view, Aplikasi model){
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
                if(view.getPass().equals(view.getPwd())){
                    try{
                        // create
                        if(model.getDaftaPelamar()==null){
                            model.addPelamar(new Pelamar(0,view.getNama(), view.getEmail(), view.getPwd()));
                        }else{
                            model.addPelamar(new Pelamar(model.getDaftaPelamar().size(),view.getNama(), view.getEmail(), view.getPwd()));
                        }
                        JOptionPane.showMessageDialog(null, "Berhasil!");
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Terdapat kesalahan!");
                    }
                    view.reset();
                }else if(view.getNama().equals("") || view.getEmail().equals("") || view.getPass().equals("") || view.getPwd().equals("")){
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong!");
                    view.reset();
                }else{
                    JOptionPane.showMessageDialog(null, "Kata Sandi Tidak Sama!");
                    view.setPass();
                } 
            }
        });
    }
}
