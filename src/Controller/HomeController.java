package Controller;

import Controller.CariController;
import Model.Aplikasi;
import View.Caripage;
import View.Daftarpage;
import View.Homepage;
import View.Loginpage;
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
    private Aplikasi model;
    private Homepage view;
    
    public HomeController(Homepage view, Aplikasi model){
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
