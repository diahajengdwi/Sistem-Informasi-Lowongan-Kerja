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
public class Pelamar extends Orang {
    // Deklarasi Variable
    private BerkasLamaran berkas;
    private String nama;
    private String jk;
    private String tempatLahir;
    private Date tglLahir;
    private String noTelp;
    private String email;
    BerkasLamaran b = new BerkasLamaran();
    // Constructor
    public Pelamar(int id, String nama, String jk, String tempatLahir, Date tglLahir, String noTelp, String email){
        super(id, nama, jk, tempatLahir, tglLahir, noTelp, email);
    }
    
    // Getter and Setter
 
    // Method
    public void createBerkas(int idBerkas, double ipk, List<String> gelar, List<String> skill, List<String> bahasa, List<String> pengalamanKerja, List<String> pengalamanOrganisasi){
        b.setIdBerkas(idBerkas);
        b.setIpk(ipk);
        for (int i = 0; i < gelar.size(); i++) {
            b.setGelar(gelar.get(i));
        }
        for (int i = 0; i < skill.size(); i++) {
            b.setSkill(skill.get(i));
        }
        for (int i = 0; i < bahasa.size(); i++) {
            b.setBahasa(bahasa.get(i));
        }        
        for (int i = 0; i < pengalamanKerja.size(); i++) {
            b.setPengalamanKerja(pengalamanKerja.get(i));
        }
        for (int i = 0; i < pengalamanOrganisasi.size(); i++) {
            b.setPengalamanOrganisasi(pengalamanOrganisasi.get(i));
        }
    }
}
