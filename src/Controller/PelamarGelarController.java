package Controller;

import Model.Aplikasi;
import Model.Gelar;
import Model.Pelamar;
import View.Loginpage;
import View.PelamarProfilGelarpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class PelamarGelarController implements ActionListener{

    private PelamarProfilGelarpage view;
    private Aplikasi model;
    private Pelamar p;
    
    public PelamarGelarController(Aplikasi model, Pelamar p){
        this.model = model;
        this.p = p;
        view = new PelamarProfilGelarpage();
        view.setVisible(true);
        view.setActionListener(this);
        view.setSession("Selamat Datang "+p.getNama());
        view.reset();
        String gelar ="";
        try{
            if(model.getGelar()==null){
                gelar = "-";
            }else{
                for (int j = 0; j < model.getGelar().size(); j++) {
                    gelar=gelar+model.getGelar().get(j).getNamaGelar()+" | "+model.getGelar().get(j).getThnMasuk()+" | "+model.getGelar().get(j).getThnKeluar()+" | "+model.getGelar().get(j).getInstitusi()+" | "+model.getGelar().get(j).getIpk()+"\n";
                }
            }            
            view.setlblGelar(gelar);
        }catch(Exception exc){
            JOptionPane.showMessageDialog(null, "Gelar tidak dapat ditampilkan");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object klik = e.getSource();
        if(klik.equals(view.getbtnback())){
            view.dispose();
            PelamarController prController = new PelamarController(model, p);
        }else if(klik.equals(view.getbtnbhs())){
            view.dispose();
            PelamarBhsController bhsController = new PelamarBhsController(model, p);
        }else if(klik.equals(view.getbtnclose())){
            int selectedOption = JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan keluar?", "Informasi", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                view.dispose();
                Loginpage viewLogin = new Loginpage();
                LoginController login = new LoginController(viewLogin, model);
                viewLogin.setVisible(true);
            }
        }else if(klik.equals(view.getbtnkeahlian())){
            view.dispose();
            PelamarSkillController prController = new PelamarSkillController(model, p);
        }else if(klik.equals(view.getbtnpengalaman())){
            view.dispose();
            PelamarPengalamanController prController = new PelamarPengalamanController(model, p);
        }else if(klik.equals(view.getbtnsimpan())){
            try{
                model.addGelar(new Gelar(view.getField().get(0), Integer.parseInt(view.getField().get(1)), Integer.parseInt(view.getField().get(2)), view.getField().get(3), Double.parseDouble(view.getField().get(4))),p);
                JOptionPane.showMessageDialog(null, "Gelar berhasil di tambah");
                view.reset();
                String gelar ="";
                try{
                    if(model.getGelar()==null){
                        gelar = "-";
                    }else{
                        for (int j = 0; j < model.getGelar().size(); j++) {
                            gelar=gelar+model.getGelar().get(j).getNamaGelar()+" | "+model.getGelar().get(j).getThnMasuk()+" | "+model.getGelar().get(j).getThnKeluar()+" | "+model.getGelar().get(j).getInstitusi()+" | "+model.getGelar().get(j).getIpk()+"\n";
                        }
                    }            
                    view.setlblGelar(gelar);
                }catch(Exception exc){
                    JOptionPane.showMessageDialog(null, "Gelar tidak dapat ditampilkan");
                }   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            }
        }
    }
    
}
