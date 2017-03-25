/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Date;
import java.util.List;
/**
 *
 * @author Diah Ajeng
 */
public class Perusahaan extends Orang{
    // Deklarasi variable
    private List<Lowongan> daftarLowongan;
    private int id;
    private String nmPerusahaan;
    private String jenis;
    private String kat;
    private int karyawan;
    Lowongan l = new Lowongan();

    // Constructor
    public Perusahaan(int id, String nama, String jk, String tempatLahir, Date tglLahir, String noTelp, String email, String password, String nmPerusahaan){
        super(id, nama, jk, tempatLahir, tglLahir, noTelp, email, password);
        this.nmPerusahaan = nmPerusahaan;
    }
    
    public Perusahaan(int id, String nmPerusahaan, String noTelp, String jenis, String kat, int karyawan, String nama, String email, String password){
        super(id, nama, noTelp, email, password);
        this.nmPerusahaan = nmPerusahaan;
        this.jenis = jenis;
        this.kat = kat;
        this.karyawan = karyawan;
    }
    
    // Getter and Setter
    public Lowongan getdaftarLowongan(int index){
        return daftarLowongan.get(index);
    }
    
    public Lowongan getdaftarLowonganbyid(int id){
        if(daftarLowongan.equals(id)){
            return daftarLowongan.get(id);
        }
        return null;
    }

    public List<Lowongan> getDaftarLowongan() {
        if(daftarLowongan.isEmpty()){
            return null;
        }else{
            return daftarLowongan;
        }
    }

    public void setDaftarLowongan(List<Lowongan> daftarLowongan) {
        this.daftarLowongan = daftarLowongan;
    }
    
    public String getNmPerusahaan() {
        return nmPerusahaan;
    }

    public void setNmPerusahaan(String nmPerusahaan) {
        this.nmPerusahaan = nmPerusahaan;
    }
      
    //Method
    public void createLowongan(Date deadline) {
        daftarLowongan.add(l);
        int n = daftarLowongan.size();
        daftarLowongan.get(n-1).setIdLowongan(daftarLowongan.get(n-1).getIdLowongan()+1);
        daftarLowongan.get(n-1).setDeadline(deadline);
        
    }
    
    public void removeLowongan(int id){
        daftarLowongan.remove(id);
    }

    @Override
    public String toString() {
        return "Perusahaan{" + "daftarLowongan=" + daftarLowongan + ", id=" + id + ", nmPerusahaan=" + nmPerusahaan + ", jenis=" + jenis + ", kat=" + kat + ", karyawan=" + karyawan + ", l=" + l + '}';
    }
    
    
}
