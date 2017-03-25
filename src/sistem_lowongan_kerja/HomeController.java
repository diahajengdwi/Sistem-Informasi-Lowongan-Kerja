/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_lowongan_kerja;

import sistem_lowongan_kerja.Controller.CariController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.sun.javafx.css.CalculatedValue;
import javax.swing.Icon;

/**
 *
 * @author Diah Ajeng
 */
public class HomeController {
    private Model model;
    private Homepage view;
    
    public HomeController(Homepage view, Model model){
        this.view = view;
        this.model = model;
        this.view.addListencari(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                Caripage viewCari = new Caripage();
                CariController cari = new CariController(viewCari, model);
                viewCari.setVisible(true);
            }        
        });
        this.view.addListenPelamar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                Loginpage viewLogin = new Loginpage();
                LoginController pelamar = new LoginController(viewLogin, model);
                viewLogin.setVisible(true);
            }
        });
        this.view.addListenPerusahaan(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                Loginpage viewLogin = new Loginpage();
                LoginController perusahaan = new LoginController(viewLogin, model);
                viewLogin.setVisible(true);
            }
        });
        this.view.addListenDaftar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                Daftarpage viewDaftar= new Daftarpage();
                DaftarController daftar = new DaftarController(viewDaftar, model);
                viewDaftar.setVisible(true);
            }
        });
        this.view.addListenClose(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedOption = JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan keluar?", "Informasi", JOptionPane.YES_NO_OPTION);
                if (selectedOption == JOptionPane.YES_OPTION) {
                        System.exit(0);
                        view.dispose();
                }
            }
        });
    }
}
