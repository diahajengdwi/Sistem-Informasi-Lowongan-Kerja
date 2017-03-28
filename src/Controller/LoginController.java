/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.Daftarpage;
import View.Homepage;
import View.Loginpage;
import View.Pelamarpage;
import View.Perusahaanpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class LoginController {
    private Loginpage view;
    private Model model;
    
    public LoginController(Loginpage view, Model model){
        this.view = view;
        this.model = model;
        this.view.addListendaftar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                Daftarpage viewDaftar = new Daftarpage();
                DaftarController daftar = new DaftarController(viewDaftar, model);
                viewDaftar.setVisible(true);
            }        
        });
        this.view.addListenkeluar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                Homepage viewHome = new Homepage();
                HomeController home = new HomeController(viewHome, model);
                viewHome.setVisible(true);
            }        
        });
        this.view.addListenmasuk(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean find = false;
                int i = 0;
                
                if(view.getEmail().isEmpty() || view.getPassword().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Field tidak boleh ada yang kosong");
                }else if(view.getPilihan().equals("Perusahaan")){
                    if(model.getDaftarPerusahaan().size() == 0){
                        JOptionPane.showMessageDialog(null, "Anda belum terdaftar");
                    }else{
                        while(find != true){
                            if(model.getDaftarPerusahaan().get(i).getEmail().equals(view.getEmail()) && model.getDaftarPerusahaan().get(i).getPassword().equals(view.getPassword())){
                                find = true;
                            }else{
                                i++;
                            }
                        }

                        if(find == true){
                            JOptionPane.showMessageDialog(null, "Berhasil");
                            view.dispose();
                            Perusahaanpage viewPerusahaan = new Perusahaanpage();
                            PerusahaanController prController = new PerusahaanController(viewPerusahaan, model); // tambah ,i
                            viewPerusahaan.setVisible(find);
                        }else{
                            JOptionPane.showMessageDialog(null, "Periksa kembali email dan password anda");
                            view.reset();
                        }
                    }
                }else if(view.getPilihan().equals("Pelamar")){
                    if(model.getDaftarPelamar().size() == 0){
                        JOptionPane.showMessageDialog(null, "Anda belum terdaftar");
                    }else{
                        while(find != true){
                            if(model.getDaftarPelamar().get(i).getEmail().equals(view.getEmail()) && model.getDaftarPelamar().get(i).getPassword().equals(view.getPassword())){
                                find = true;
                            }else{
                                i++;
                            }
                        }

                        if(find == true){
                            JOptionPane.showMessageDialog(null, "Berhasil");
                            view.dispose();
                            Pelamarpage viewPelamar = new Pelamarpage();
                            PelamarController pController = new PelamarController(viewPelamar, model); // tambah ,i
                            viewPelamar.setVisible(find);
                        }else{
                            JOptionPane.showMessageDialog(null, "Periksa kembali email dan password anda");
                            view.reset();
                        }
                    }
                }
            }        
        });
    }
}
