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
                
            }        
        });
    }
}
