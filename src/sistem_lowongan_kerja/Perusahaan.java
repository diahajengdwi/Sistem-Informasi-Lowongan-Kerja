/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_lowongan_kerja;

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
    private String nama;
    private String jk;
    private String tempatLahir;
    private Date tglLahir;
    private String noTelp;
    private String email;
    Lowongan l = new Lowongan();

    // Constructor
    public Perusahaan(int id, String nama, String jk, String tempatLahir, Date tglLahir, String noTelp, String email){
        super(id, nama, jk, tempatLahir, tglLahir, noTelp, email);
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
    
    //Method
    public void createLowongan(Date deadline) {
        daftarLowongan.add(l);
    }
    
    public void removeLowongan(int id){
        daftarLowongan.remove(id);
    }
}
