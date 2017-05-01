package Controller;

import Model.Aplikasi;
import Model.BerkasLamaran;
import Model.Gelar;
import Model.Pelamar;
import Model.Pengalaman;
import View.Loginpage;
import View.PelamarDaftarLamaranpage;
import View.PelamarProfilpage;
import View.PelamarSetpage;
import View.Pelamarpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Diah Ajeng
 */
public class PelamarController {
    private Pelamarpage view;
    private Aplikasi model;
    
    public PelamarController(Aplikasi model, Pelamar pelamar){
        view = new Pelamarpage();
        view.setVisible(true);
        this.model = model;
        view.setSession("Selamar Datang "+pelamar.getNama());
        this.view.addListendaftar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                PelamarDaftarLamaranController LamaranCon = new PelamarDaftarLamaranController(model, pelamar);
            }
        });
        this.view.addListenkeluar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedOption = JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan keluar?", "Informasi", JOptionPane.YES_NO_OPTION);
                if (selectedOption == JOptionPane.YES_OPTION) {
                    view.dispose();
                    Loginpage viewLogin = new Loginpage();
                    LoginController login = new LoginController(viewLogin, model);
                    viewLogin.setVisible(true);
                }
            }
        });
        this.view.addListenset(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                PelamarSetController pelamarController = new PelamarSetController(model, pelamar);
            }
        });
        this.view.addListenprofil(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                PelamarProfilController pelamarCon = new PelamarProfilController(model, pelamar);
            }
        });
        this.view.addListenberkas(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BerkasLamaran berkas = model.lihatBerkas(pelamar);
                if(model.getGelar()==null|| model.getBahasa()==null||model.getSkill()==null||model.getPengalamanKerja()==null){
                    JOptionPane.showMessageDialog(null,"Isi gelar, bahasa, keahlian dan pengalaman secara lengkap!");
                }else if(berkas.getIdBerkas()==pelamar.getIdPelamar()){
                    pelamar.getB().getBahasa().clear();
                    pelamar.getB().getGelar().clear();
                    pelamar.getB().getPengalamanKerja().clear();
                    pelamar.getB().getSkill().clear();
                    try{
                        model.createBerkas(pelamar,model.getGelar(),model.getSkill(),model.getBahasa(),model.getPengalamanKerja());
                        JOptionPane.showMessageDialog(null,"Berhasil");
                    }catch(Exception excep){
                        JOptionPane.showMessageDialog(null,"Berkas tidak dapat di buat.");
                    }
                }else{
                    try{
                        model.createBerkas(pelamar, model.getGelar(), model.getSkill(), model.getBahasa(), model.getPengalamanKerja());
                        JOptionPane.showMessageDialog(null,"Berhasil");
                    }catch(Exception kc){
                        JOptionPane.showMessageDialog(null,"Gagal membuat berkas.");
                    }
                }
            }
        });
    }
}
