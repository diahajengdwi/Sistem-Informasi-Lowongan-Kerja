package Controller;

import Model.Aplikasi;
import Model.Perusahaan;
import View.Loginpage;
import View.PerusahaanProfilpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class PerusahaanProfilController implements ActionListener{

    private PerusahaanProfilpage view;
    private Aplikasi model;
    private Perusahaan p;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public PerusahaanProfilController(Aplikasi model, Perusahaan p) {
        this.model = model;
        this.p = p;
        view = new PerusahaanProfilpage();
        view.setVisible(true);
        view.setActionListener(this);
        view.setSession("Selamar Datang "+p.getNmPerusahaan());
        try{
            view.setField(p.getNama(), p.getEmail(),(p.getTempatLahir()==null) ? "N/A" : p.getTempatLahir(), (p.getTglLahir()==null) ? null : p.getTglLahir(), (p.getNoTelp()==null) ? "N/A" : p.getNoTelp(), (p.getJk()==null) ? "N/A" : p.getJk());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data tidak lengkap");
        }
    }
       
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object klik = e.getSource();
        if(klik.equals(view.getbtnback())){
            view.dispose();
            PerusahaanController prController = new PerusahaanController(model, p);
        }else if(klik.equals(view.getbtnclose())){
            int selectedOption = JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan keluar?", "Informasi", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                view.dispose();
                Loginpage viewLogin = new Loginpage();
                LoginController login = new LoginController(viewLogin, model);
                viewLogin.setVisible(true);
            }
        }else if(klik.equals(view.getbtnsimpan())){
            Date tgl = null;
            try {
                tgl = dateFormat.parse(view.getField().get(4));
                JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan.");
            } catch (ParseException ex) {
                Logger.getLogger(PerusahaanProfilController.class.getName()).log(Level.SEVERE, null, ex);
            }
            model.ubahProfilPerusahaan(p, view.getField().get(1), view.getField().get(0),view.getField().get(3), tgl, view.getField().get(2));
        }
    }
    
}
