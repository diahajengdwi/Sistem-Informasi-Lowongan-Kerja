/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_lowongan_kerja;

/**
 *
 * @author Diah Ajeng
 */
public class Pelamar extends Orang {
    // Deklarasi Variable
    private BerkasLamaran berkas;
    private double ipk;
    private String gelar;
    private String pengalamanKerja;

    // Getter and Setter
    public BerkasLamaran getBerkas() {
        return berkas;
    }

    public void setBerkas(BerkasLamaran berkas) {
        this.berkas = berkas;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getPengalamanKerja() {
        return pengalamanKerja;
    }

    public void setPengalamanKerja(String pengalamanKerja) {
        this.pengalamanKerja = pengalamanKerja;
    }
    
    // Method
    public void createBerkas(){
        
    }
}
