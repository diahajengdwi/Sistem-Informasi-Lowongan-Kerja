package Model;

import Model.Lowongan;
import Model.Pelamar;
import Model.Perusahaan;
import java.util.List;

/**
 *
 * @author Diah Ajeng
 */
public class Model {
    // Deklarasi variable
    private List<Perusahaan> daftarPerusahaan;
    private List<Pelamar> daftarPelamar;
    
    // Perusahaan
    public void addPerusahaan(String nmPerusahaan, String notelp, String jenis, String kat, int jmlKaryawan, String nm, String email, String pass){
        Perusahaan pe = new Perusahaan(getDaftarPerusahaan().size(), nmPerusahaan, notelp,jenis, kat,jmlKaryawan,nm, email, pass);
        daftarPerusahaan.add(pe);
    }
    
    public List<Perusahaan> getDaftarPerusahaan(){
        return daftarPerusahaan;
    }
    
    public List<Lowongan> getDaftarLowongan(int i){
        return daftarPerusahaan.get(i).getDaftarLowongan();
    }
    
    // Pelamar
    public void addPelamar(String nama, String email, String password){
        Pelamar p = new Pelamar(getDaftarPelamar().size(),nama, email, password);
        daftarPelamar.add(p);
    }

    public Pelamar getDaftarPelamar(int id) {
        return daftarPelamar.get(id);
    }
    
    public void deletePelamar(int id){
        daftarPelamar.remove(id);
    }

    public List<Pelamar> getDaftarPelamar() {
        return daftarPelamar;
    }

    public void setDaftarPelamar(List<Pelamar> daftarPelamar) {
        this.daftarPelamar = daftarPelamar;
    }
    
    
}
