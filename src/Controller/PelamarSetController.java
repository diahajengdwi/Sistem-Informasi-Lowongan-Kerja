package Controller;

import Model.Aplikasi;
import Model.Pelamar;
import View.Loginpage;
import View.PelamarSetpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class PelamarSetController implements ActionListener{
    private PelamarSetpage view;
    private Aplikasi model;
    private Pelamar p;

    public PelamarSetController(Aplikasi model, Pelamar pelamar) {
        this.model = model;
        this.p = pelamar;
        this.view = new PelamarSetpage();
        view.setVisible(true);
        view.setActionListener(this);
        view.setSession("Selamat Datang "+p.getNama());
        try{
            view.setField(p.getNama(), pelamar.getEmail());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data tidak lengkap");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object klik = e.getSource();
        if(klik.equals(view.getbtnback())){
            view.dispose();
            PelamarController prController = new PelamarController(model, p);
        }else if(klik.equals(view.getbtnclose())){
            int selectedOption = JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan keluar?", "Informasi", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                view.dispose();
                Loginpage viewLogin = new Loginpage();
                LoginController login = new LoginController(viewLogin, model);
                viewLogin.setVisible(true);
            }
        }else if(klik.equals(view.getbtnsimpan())){
            try{
                model.ubahSetPelamar(p, view.getField().get(1), view.getField().get(0));
                JOptionPane.showMessageDialog(null, "Berhasil");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Terdapat kesalahan pada saat input data");
            }
        }
    }
    
}
