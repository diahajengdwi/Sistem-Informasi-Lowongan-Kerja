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
public class BerkasLamaran {
    // Deklarasi Variable
    private int idBerkas;
    private double ipk;
    private List<String> gelar;
    private List<String> skill;
    private List<String> bahasa;
    private List<String> pengalamanKerja;
    private List<String> pengalamanOrganisasi;
        
    // Getter and Setter
    public int getIdBerkas() {
        return idBerkas;
    }

    public void setIdBerkas(int idBerkas) {
        this.idBerkas = idBerkas;
    }
    
    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public List<String> getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar.add(gelar);
    }

    public List<String> getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill.add(skill);
    }

    public List<String> getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa.add(bahasa);
    }

    public List<String> getPengalamanKerja() {
        return pengalamanKerja;
    }

    public void setPengalamanKerja(String pengalamanKerja) {
        this.pengalamanKerja.add(pengalamanKerja);
    }

    public List<String> getPengalamanOrganisasi() {
        return pengalamanOrganisasi;
    }

    public void setPengalamanOrganisasi(String pengalamanOrganisasi) {
        this.pengalamanOrganisasi.add(pengalamanOrganisasi);
    }
    
    // Method
    public void addPengalamanKerja(String p) {
        pengalamanKerja.add(p);
    }
    
    public void addPengalamanOrganisasi(String or){
        pengalamanOrganisasi.add(or);
    }
    
    public void addGelar(String g){
        gelar.add(g);
    }
    
    public void addSkill(String s){
        skill.add(s);
    }
    
    public void addBahasa(String b){
        bahasa.add(b);
    }
}
