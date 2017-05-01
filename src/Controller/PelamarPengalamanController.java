package Controller;

import Model.Aplikasi;
import Model.Pelamar;
import Model.Pengalaman;
import View.Loginpage;
import View.PelamarProfilPengalamanpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
class PelamarPengalamanController implements ActionListener{
    
    private PelamarProfilPengalamanpage view;
    private Aplikasi model;
    private Pelamar p;
    
    public PelamarPengalamanController(Aplikasi model, Pelamar p) {
        this.model = model;
        this.p = p;
        view = new PelamarProfilPengalamanpage();
        view.setVisible(true);
        view.setActionListener(this);
        view.setSession("Selamat Datang "+p.getNama());
        view.reset();
        String pengl ="";
        try{
            if(model.getPengalamanKerja()==null){
                pengl = "-";
            }else{
                for (int j = 0; j < model.getPengalamanKerja().size(); j++) {
                    pengl=pengl+model.getPengalamanKerja().get(j).getJob()+" | "+model.getPengalamanKerja().get(j).getThnMasuk()+" | "+model.getPengalamanKerja().get(j).getThnKeluar()+" | "+model.getPengalamanKerja().get(j).getDivisi()+" | "+model.getPengalamanKerja().get(j).getKota()+" | "+model.getPengalamanKerja().get(j).getProv()+"\n";
                }
            }            
            view.setlblpengalaman(pengl);
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
        }else if(klik.equals(view.getbtngelar())){
            view.dispose();
            PelamarGelarController grController = new PelamarGelarController(model, p);
        }else if(klik.equals(view.getbtnkeahlian())){
            view.dispose();
            PelamarSkillController prController = new PelamarSkillController(model, p);
        }else if(klik.equals(view.getbtnsimpan())){
            try{
                model.addPengalaman(new Pengalaman(view.getField().get(0), Integer.parseInt(view.getField().get(1)), Integer.parseInt(view.getField().get(2)), view.getField().get(3), view.getField().get(4), view.getField().get(5)));
                JOptionPane.showMessageDialog(null, "Pengalaman berhasil di tambah");
                view.reset();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            }
        }
    }
    
    
}
