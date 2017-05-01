package Controller;

import Model.Aplikasi;
import Model.Pelamar;
import View.Homepage;
import View.Loginpage;
import View.PelamarProfilBahasapage;
import View.PelamarProfilpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diah Ajeng
 */
public class PelamarProfilController  implements ActionListener {
    
    private PelamarProfilpage view;
    private Aplikasi model;
    private Pelamar pelamar;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public PelamarProfilController(Aplikasi model, Pelamar pelamar) {
        view = new PelamarProfilpage();
        view.setVisible(true);
        view.setActionListener(this);
        this.model = model;
        this.pelamar = pelamar;
        view.setSession("Selamar Datang "+pelamar.getNama());
        try{
            view.setField(pelamar.getNama(), pelamar.getEmail(),(pelamar.getTempatLahir()==null) ? "N/A" : pelamar.getTempatLahir(), (pelamar.getTglLahir()==null) ? null : pelamar.getTglLahir(), (pelamar.getNoTelp()==null) ? "N/A" : pelamar.getNoTelp(), (pelamar.getJk()==null) ? "N/A" : pelamar.getJk());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data tidak lengkap");
        }
    }

    @Override
    public void actionPerformed(ActionEvent ec) {
        Object klik = ec.getSource();
        Date tgl = null;
        if (klik.equals(view.getbtnsimpan())) {
            try {
                tgl = dateFormat.parse(view.getField().get(4));
            } catch (ParseException ex) {
                Logger.getLogger(PelamarProfilController.class.getName()).log(Level.SEVERE, null, ex);
            }
            try{
                model.ubahProfilPelamar(pelamar, view.getField().get(1), view.getField().get(0), view.getField().get(5), 
                    view.getField().get(3), tgl, view.getField().get(2));
                JOptionPane.showMessageDialog(null, "Berhasil");
            }catch(Exception exc){
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            }
        } else if (klik.equals(view.getbtnclose())) {
            int selectedOption = JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan keluar?", "Informasi", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                view.dispose();
                Loginpage viewLogin = new Loginpage();
                LoginController login = new LoginController(viewLogin, model);
                viewLogin.setVisible(true);
            }
        }else if(klik.equals(view.getbtnbahasa())){
            view.dispose();
            PelamarBhsController bhsController = new PelamarBhsController(model, pelamar);
        }else if(klik.equals(view.getbtngelar())){
            view.dispose();
            PelamarGelarController grController = new PelamarGelarController(model, pelamar);
        }else if(klik.equals(view.getbtnkeahlian())){
            view.dispose();
            PelamarSkillController plmrController = new PelamarSkillController(model, pelamar);
        }else if(klik.equals(view.getbtnpengalaman())){
            view.dispose();
            PelamarPengalamanController pmrController = new PelamarPengalamanController(model, pelamar);
        }else if(klik.equals(view.getbtnback())){
            view.dispose();
            PelamarController plrController = new PelamarController(model, pelamar);
        }
    }
}
