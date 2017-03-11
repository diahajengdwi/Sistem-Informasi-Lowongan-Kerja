/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_lowongan_kerja;

import java.util.List;

/**
 *
 * @author Diah Ajeng
 */
public class Aplikasi {
    // Deklarasi variable
    private List<Perusahaan> daftarPerusahaan;
    private List<Pelamar> daftarPelamar;
    
    public void addPerusahaan(Perusahaan p){
        daftarPerusahaan.add(p);
    }
    
    public void addPelamar(Pelamar p){
        daftarPelamar.add(p);
    }

    public Pelamar getDaftarPelamar(int id) {
        return daftarPelamar.get(id);
    }
    
    public void deletePelamar(int id){
        daftarPelamar.remove(id);
    }
    
    public void mainMenu(){
        
    }
}
