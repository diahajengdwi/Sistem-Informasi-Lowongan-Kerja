/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.DaftarPelamarpage;
import View.DaftarPerusahaanpage;
import View.Daftarpage;
import View.Homepage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class DaftarController {
    private Daftarpage view;
    private Model model;
    
    public DaftarController(Daftarpage view, Model model){
        this.view = view;
        this.model = model;
        this.view.addListenkeluar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                Homepage viewHome = new Homepage();
                HomeController home = new HomeController(viewHome, model);
                viewHome.setVisible(true);
            }        
        });
        this.view.addListenpelamar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                DaftarPelamarpage viewPelamar = new DaftarPelamarpage();
                DaftarPelamarController pelamar = new DaftarPelamarController(viewPelamar, model);
                viewPelamar.setVisible(true);
            }        
        });
        this.view.addListenperusahaan(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                DaftarPerusahaanpage viewPerusahaan = new DaftarPerusahaanpage();
                DaftarPerusahaanController pelamar = new DaftarPerusahaanController(viewPerusahaan, model);
                viewPerusahaan.setVisible(true);
            }        
        });
    }
}
