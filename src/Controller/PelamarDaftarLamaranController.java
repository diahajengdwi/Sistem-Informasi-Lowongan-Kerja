package Controller;

import Model.Aplikasi;
import Model.Pelamar;
import Model.Perusahaan;
import View.Loginpage;
import View.PelamarDaftarLamaranpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class PelamarDaftarLamaranController extends MouseAdapter implements ActionListener{
    
    private PelamarDaftarLamaranpage view;
    private Aplikasi model;
    private Pelamar p;
    private Perusahaan pe;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private List<Perusahaan> per = new ArrayList<>();
    
    public PelamarDaftarLamaranController(Aplikasi model, Pelamar p){
        this.model = model;
        this.p = p;
        view = new PelamarDaftarLamaranpage();
        view.setVisible(true);
        view.setActionListener(this);
        view.addAdapter(this);
        view.setSession("Selamat Datang "+p.getNama());
        try{
            List<Perusahaan> per = model.getDaftarPerusahaan();
            String[] ket = null;
            ket = new String[model.getDaftarPerusahaan().size()];
            int jml = per.size();
            boolean sts = false;
            for (int i = 0; i < jml; i++) {
                int jmlL = per.get(i).getDaftarLowongan().size();
                for (int j = 0; j < jmlL; j++) {
                    if(per.get(i).getdaftarLowongan(j).getBerkasMasuk() != null){
                       int jmlB = per.get(i).getdaftarLowongan(j).getBerkasMasuk().size();
                        for (int k = 0; k < jmlB; k++) {
                            if(per.get(i).getdaftarLowongan(j).getBerkasMasuk(k).getIdBerkas()==(p.getB().getIdBerkas())){
                                ket[k] = per.get(i).getNmPerusahaan();
                                sts = true;
                            }
                        } 
                    }
                }
            }
            if(sts == false){
                ket[0] = "Tidak ada perusahaan yang anda lamar";
            }
            view.setListLamaran(ket);
            
            String[] trima = null;
            trima = new String[model.getDaftarPerusahaan().size()];
            for (int i = 0; i < jml; i++) {
                int jmlL = per.get(i).getDaftarLowongan().size();
                for (int j = 0; j < jmlL; j++) {
                    if(per.get(i).getdaftarLowongan(j).getBerkasDiterima()!= null){
                       int jmlB = per.get(i).getdaftarLowongan(j).getBerkasDiterima().size();
                        for (int k = 0; k < jmlB; k++) {
                            if(per.get(i).getdaftarLowongan(j).getBerkasDiterima(k).getIdBerkas()==(p.getB().getIdBerkas())){
                                trima[k]=per.get(i).getNmPerusahaan();
                                sts = true;
                            }
                        } 
                    }
                }
            }
            if(sts == false){
                trima[0]="Belum ada berkas lamaran yang di terima";
            }
            view.setListTerima(trima);
            
            String[] peru;
            peru = new String[model.getDaftarPerusahaan().size()];
            for (int i = 0; i < model.getDaftarPerusahaan().size(); i++) {
                peru[i]="Perusahaan "+ model.getDaftarPerusahaan().get(i).getNmPerusahaan();
            }
            view.setListPerusahaan(peru);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data Kosong");
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
        }else if(klik.equals(view.getbtnlamar())){
            try{
                int selectedOption = JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan melamar perusahaan pada ini?", "Informasi", JOptionPane.YES_NO_OPTION);
                if (selectedOption == JOptionPane.YES_OPTION) {
                    pe.getdaftarLowongan(view.getlamar()).addBerkas(p.getB());
                    model.addBerkasMasuk(model.getDaftarPelamar(view.getlamar()));
                    JOptionPane.showMessageDialog(null, "Berkas berhasil di terima");
                    try{
                        List<Perusahaan> per = model.getDaftarPerusahaan();
                        String[] ket = null;
                        ket = new String[model.getDaftarPerusahaan().size()];
                        int jml = per.size();
                        boolean sts = false;
                        for (int i = 0; i < jml; i++) {
                            int jmlL = per.get(i).getDaftarLowongan().size();
                            for (int j = 0; j < jmlL; j++) {
                                if(per.get(i).getdaftarLowongan(j).getBerkasMasuk() != null){
                                   int jmlB = per.get(i).getdaftarLowongan(j).getBerkasMasuk().size();
                                    for (int k = 0; k < jmlB; k++) {
                                        if(per.get(i).getdaftarLowongan(j).getBerkasMasuk(k).getIdBerkas()==(p.getB().getIdBerkas())){
                                            ket[k] = per.get(i).getNmPerusahaan();
                                            sts = true;
                                        }
                                    } 
                                }
                            }
                        }
                        if(sts == false){
                            ket[0] = "Tidak ada perusahaan yang anda lamar";
                        }
                        view.setListLamaran(ket);
                    }catch(Exception exc){
                        JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
                    }
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            }
        }
    }
    
    public void mousePressed(MouseEvent e) {
        Object source = e.getSource();
        String low = "";
        int jml = view.getSelectedPerusahaan();
        pe = model.getDaftarPerusahaan().get(jml);
        if(pe.getDaftarLowongan() == null){
            view.setlamar("Tidak ada lowongan pada perusahaan ini",0);
        }else{
            try{
                int SL = pe.getDaftarLowongan().size();
                for (int j = 0; j < SL; j++) {
                    low = low + "Deadline : " + dateFormat.format(pe.getdaftarLowongan(j).getDeadline()) + "\n";
                }
                view.setlamar(low,SL);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            }
            
        }    
    }
    
}
