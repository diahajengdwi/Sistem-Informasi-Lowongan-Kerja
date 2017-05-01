package Controller;

import Model.Aplikasi;
import Model.Perusahaan;
import View.Loginpage;
import View.Perusahaanpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class PerusahaanController implements ActionListener {
    
    private Perusahaanpage view;
    private Aplikasi model;
    private Perusahaan perusahaan;
    
    public PerusahaanController(Aplikasi model, Perusahaan perusahaan){
        this.model = model;
        view = new Perusahaanpage();
        view.setVisible(true);
        view.setActionListener(this);
        view.setSession("Selamar Datang "+perusahaan.getNmPerusahaan());
        this.perusahaan = perusahaan;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object klik = e.getSource();
        if (klik.equals(view.getbtnberkas())) {
            view.dispose();
            PerusahaanBerkaspageController pBController = new PerusahaanBerkaspageController(model, perusahaan);
        } else if (klik.equals(view.getbtnclose())) {
            int selectedOption = JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan keluar?", "Informasi", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                view.dispose();
                Loginpage viewLogin = new Loginpage();
                LoginController login = new LoginController(viewLogin, model);
                viewLogin.setVisible(true);
            }
        }else if (klik.equals(view.getbtndaftarP())) {
            view.dispose();
            PerusahaanPelamarController pPController = new PerusahaanPelamarController(model, perusahaan);
        }else if (klik.equals(view.getbtnlowongan())) {
            view.dispose();
            PerusahaanLowController pLController = new PerusahaanLowController(model, perusahaan);
        }else if (klik.equals(view.getbtnset())) {
            view.dispose();
            PerusahaanSetController prController = new PerusahaanSetController(model, perusahaan);
        }else if (klik.equals(view.getprofil())) {
            view.dispose();
            PerusahaanProfilController profController = new PerusahaanProfilController(model, perusahaan);
        }
    }
}
