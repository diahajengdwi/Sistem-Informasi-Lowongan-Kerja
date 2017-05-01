package Controller;

import Model.Aplikasi;
import Model.Perusahaan;
import View.Loginpage;
import View.PerusahaanSetpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class PerusahaanSetController implements ActionListener{
    
    private PerusahaanSetpage view;
    private Aplikasi model;
    private Perusahaan p;

    public PerusahaanSetController(Aplikasi model, Perusahaan p) {
        this.model = model;
        view = new PerusahaanSetpage();
        view.setVisible(true);
        view.setActionListener(this);
        view.setSession("Selamar Datang "+p.getNmPerusahaan());
        this.p = p;
        view.setField(p.getNmPerusahaan(), p.getEmail());
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object klik = e.getSource();
        if (klik.equals(view.getbtnclose())) {
            int selectedOption = JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan keluar?", "Informasi", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                view.dispose();
                Loginpage viewLogin = new Loginpage();
                LoginController login = new LoginController(viewLogin, model);
                viewLogin.setVisible(true);
            }
        }else if (klik.equals(view.getbtnback())) {
            view.dispose();
            PerusahaanController prController = new PerusahaanController(model, p);
        }else if (klik.equals(view.getbtnsimpan())) {
            try{
                model.ubahSetPerusahaan(p, view.getField().get(0), view.getField().get(1));
                JOptionPane.showMessageDialog(null, "Data berhasil di inputkan");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Data tidak berhasil di inputkan");
            }
        }
    }
    
}
