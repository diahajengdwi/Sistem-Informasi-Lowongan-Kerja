/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.Loginpage;
import View.PelamarProfilpage;
import View.PelamarSetpage;
import View.Pelamarpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author Diah Ajeng
 */
public class PelamarController {
    private Pelamarpage view;
    private Model model;
    
    public PelamarController(Pelamarpage view, Model model){
        this.view = view;
        this.model = model;
        this.view.addListendaftar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                PelamarProfilpage viewProfil = new PelamarProfilpage();
                PelamarProfilController pelamar = new PelamarProfilController(viewProfil, model);
                viewProfil.setVisible(true);
            }
        });
        this.view.addListenkeluar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedOption = JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan keluar?", "Informasi", JOptionPane.YES_NO_OPTION);
                if (selectedOption == JOptionPane.YES_OPTION) {
                        view.dispose();
                        Loginpage viewLogin = new Loginpage();
                        LoginController login = new LoginController(viewLogin, model);
                        viewLogin.setVisible(true);
                }
            }
        });
        this.view.addListenset(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                PelamarSetpage viewSet = new PelamarSetpage();
                PelamarSetController pelamar = new PelamarSetController(viewSet, model);
                viewSet.setVisible(true);
            }
        });
        this.view.addListenprofil(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                PelamarProfilpage viewProfil = new PelamarProfilpage();
                PelamarProfilController pelamar = new PelamarProfilController(viewProfil, model);
                viewProfil.setVisible(true);
            }
        });
    }
}
