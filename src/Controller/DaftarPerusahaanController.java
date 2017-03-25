/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.DaftarPerusahaanpage;
import View.Daftarpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class DaftarPerusahaanController {
    private DaftarPerusahaanpage view;
    private Model model;
    
    public DaftarPerusahaanController(DaftarPerusahaanpage view, Model model){
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
                        //keluar
                }
            }
        });
        this.view.addListendaftar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
}
