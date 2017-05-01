package Controller;

import Model.Aplikasi;
import Model.BerkasLamaran;
import Model.Pelamar;
import View.Loginpage;
import View.PelamarProfilBahasapage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class PelamarBhsController implements ActionListener {
    
    private PelamarProfilBahasapage view;
    private Aplikasi model;
    private Pelamar p;
    private PelamarController pe;

    public PelamarBhsController(Aplikasi model, Pelamar p) {
        this.model = model;
        this.p = p;
        view = new PelamarProfilBahasapage();
        view.setVisible(true);
        view.setActionListener(this);
        view.setSession("Selamat Datang "+p.getNama());
        view.setbhs("");
        String bhs ="";
        try{
            if(model.getBahasa()==null){
                bhs = "-";
            }else{
                for (int j = 0; j < model.getBahasa().size(); j++) {
                    bhs=bhs+model.getBahasa().get(j)+"\n";
                }
            }            
            view.setLblbhs(bhs);
        }catch(Exception exc){
            JOptionPane.showMessageDialog(null, "Bahasa tidak dapat ditampilkan");
        }
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object klik = e.getSource();
        if(klik.equals(view.getbtnback())){
            view.dispose();
            PelamarController prController = new PelamarController(model, p);
        }else if(klik.equals(view.getbtnbhs())){
            
        }else if(klik.equals(view.getbtnclose())){
            int selectedOption = JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan keluar?", "Informasi", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                view.dispose();
                Loginpage viewLogin = new Loginpage();
                LoginController login = new LoginController(viewLogin, model);
                viewLogin.setVisible(true);
            }
        }else if(klik.equals(view.getbtngelar())){
            view.dispose();
            PelamarGelarController grController = new PelamarGelarController(model, p);
        }else if(klik.equals(view.getbtnkeahlian())){
            view.dispose();
            PelamarSkillController prController = new PelamarSkillController(model, p);
        }else if(klik.equals(view.getbtnpengalaman())){
            view.dispose();
            PelamarPengalamanController prController = new PelamarPengalamanController(model, p);
        }else if(klik.equals(view.getbtnsimpan())){
            try{
                model.addBahasa(view.getbhs());
                JOptionPane.showMessageDialog(null, "Bahasa berhasil di tambah");
                view.setbhs("");
                String bhs ="";
                try{
                    if(model.getBahasa()==null){
                        bhs = "-";
                    }else{
                        for (int j = 0; j < model.getBahasa().size(); j++) {
                            bhs=bhs+model.getBahasa().get(j)+"\n";
                        }
                    }            
                    view.setLblbhs(bhs);
                }catch(Exception exc){
                    JOptionPane.showMessageDialog(null, "Bahasa tidak dapat ditampilkan");
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            }
        }
    }
    
}
