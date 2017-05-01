package Controller;

import Model.Aplikasi;
import Model.Perusahaan;
import View.Loginpage;
import View.PerusahaanBerkaspage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class PerusahaanBerkaspageController extends MouseAdapter implements ActionListener{
    
    private PerusahaanBerkaspage view;
    private Aplikasi model;
    private Perusahaan p;

    public PerusahaanBerkaspageController(Aplikasi model, Perusahaan p) {
        this.model = model;
        this.p = p;
        view = new PerusahaanBerkaspage();
        view.setVisible(true);
        view.setActionListener(this);
        view.addAdapter(this);
        view.setSession("Selamat Datang "+p.getNmPerusahaan());
        try{
            String[] ket;
            ket = new String[p.getDaftarLowongan().size()];
            for (int i = 0; i < p.getDaftarLowongan().size(); i++) {
                ket[i]="Lowongan "+(i+1);
            }
            view.setListLowongan(ket);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
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
        }
    }
    
    public void mousePressed(MouseEvent e) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Object source = e.getSource();
        String bM = "";
        String bMasuk = "";
        String bPelamar = "";
        String bGelar = "";
        String bBhs = "";
        String bSkill = "";
        String bPe = "";
        int pjg = view.getSelectedLowonganList().length();
        int idLowongan = Integer.parseInt(view.getSelectedLowonganList().substring(9,pjg))-1;
        String tgl = dateFormat.format(p.getDaftarLowongan().get(idLowongan).getDeadline()).toString();
        if(p.getdaftarLowongan(idLowongan).getBerkasMasuk()== null){
            bM = "Tidak ada berkas yang masuk pada lowongan ini \n";
        }else{
            int jmlBerkas = p.getdaftarLowongan(idLowongan).getBerkasMasuk().size();
            for (int k = 0; k <= jmlBerkas-1; k++) {
                bMasuk = "Berkas Masuk ke-" + (k+1);
                for (int i = 0; i < model.getDaftaPelamar().size(); i++) {
                    if(model.getDaftarPelamar(i).getIdPelamar() == p.getdaftarLowongan(idLowongan).getBerkasMasuk(k).getIdBerkas()){
                        bPelamar = "\n\t Nama            : "+model.getDaftarPelamar(i).getNama() + "\n\t No Telp         : "+model.getDaftarPelamar(i).getNoTelp() + "\n\t Jenis Kelamin   : "+model.getDaftarPelamar(i).getJk() + "\n\t TTL             : "+model.getDaftarPelamar(i).getTempatLahir()+", "+model.getDaftarPelamar(i).getTglLahir() + "\n\t Gelar           : " + "\n\t\tNama Gelar | Tahun Masuk | Tahun Lulus | Institusi | IPK" + "\n";
                        for (int l = 0; l < model.getDaftarPelamar(i).getB().getGelar().size(); l++) {
                            bGelar = "\n\t\t"+model.getDaftarPelamar(i).getB().getGelar().get(i).getNamaGelar()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getThnMasuk()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getThnKeluar()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getInstitusi()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getIpk();
                        }
                        for (int l = 0; l < model.getDaftarPelamar(i).getB().getBahasa().size(); l++) {
                            bBhs = "\n\t\t"+model.getDaftarPelamar(i).getB().getBahasa().get(i);
                        }
                        for (int l = 0; l < model.getDaftarPelamar(i).getB().getSkill().size(); l++) {
                            bSkill = "\n\t\t"+model.getDaftarPelamar(i).getB().getSkill().get(i);
                        }
                        for (int l = 0; l < model.getDaftarPelamar(i).getB().getPengalamanKerja().size(); l++) {
                            bPe="\n\t\t"+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getJob()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getThnMasuk()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getThnKeluar()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getDivisi()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getKota()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getProv();
                        }
                    }
                }
            }
            bM = "Ada " + jmlBerkas + " berkas yang masuk \n" + bMasuk + bPelamar + bGelar + "\n\tBahasa           : " + bBhs + "\n\tKeahlian         : " + bSkill + "\n\tPengalaman Kerja : " + "\n\t\tNama Pekerjaan | Tahun Masuk | Tahun Keluar | Divisi | Kota | Provinsi"+bPe;
        }
        
        String konten = tgl + "\n" + bM;
        view.setViewLowongan(konten);
        
        if(p.getdaftarLowongan(idLowongan).getBerkasDiterima()== null){
            bM = "Tidak ada berkas yang di terima pada lowongan ini \n";
        }else{
            int jmlBerkas = p.getdaftarLowongan(idLowongan).getBerkasDiterima().size();
            for (int k = 0; k <= jmlBerkas-1; k++) {
                bMasuk = "Berkas Di terima ke-" + (k+1);
                for (int i = 0; i < model.getDaftaPelamar().size(); i++) {
                    if(model.getDaftarPelamar(i).getIdPelamar() == p.getdaftarLowongan(idLowongan).getBerkasDiterima(k).getIdBerkas()){
                        bPelamar = "\n\t Nama            : "+model.getDaftarPelamar(i).getNama() + "\n\t No Telp         : "+model.getDaftarPelamar(i).getNoTelp() + "\n\t Jenis Kelamin   : "+model.getDaftarPelamar(i).getJk() + "\n\t TTL             : "+model.getDaftarPelamar(i).getTempatLahir()+", "+model.getDaftarPelamar(i).getTglLahir() + "\n\t Gelar           : " + "\n\t\tNama Gelar | Tahun Masuk | Tahun Lulus | Institusi | IPK" + "\n";
                        for (int l = 0; l < model.getDaftarPelamar(i).getB().getGelar().size(); l++) {
                            bGelar = "\n\t\t"+model.getDaftarPelamar(i).getB().getGelar().get(i).getNamaGelar()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getThnMasuk()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getThnKeluar()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getInstitusi()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getIpk();
                        }
                        for (int l = 0; l < model.getDaftarPelamar(i).getB().getBahasa().size(); l++) {
                            bBhs = "\n\t\t"+model.getDaftarPelamar(i).getB().getBahasa().get(i);
                        }
                        for (int l = 0; l < model.getDaftarPelamar(i).getB().getSkill().size(); l++) {
                            bSkill = "\n\t\t"+model.getDaftarPelamar(i).getB().getSkill().get(i);
                        }
                        for (int l = 0; l < model.getDaftarPelamar(i).getB().getPengalamanKerja().size(); l++) {
                            bPe="\n\t\t"+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getJob()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getThnMasuk()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getThnKeluar()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getDivisi()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getKota()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getProv();
                        }
                    }
                }
            }
            bM = "Ada " + jmlBerkas + " berkas yang masuk \n" + bMasuk + bPelamar + bGelar + "\n\tBahasa           : " + bBhs + "\n\tKeahlian         : " + bSkill + "\n\tPengalaman Kerja : " + "\n\t\tNama Pekerjaan | Tahun Masuk | Tahun Keluar | Divisi | Kota | Provinsi"+bPe;
        }
        
        konten = tgl + "\n" + bM;
        view.setViewLowonganditerima(konten);
    }
    
}
