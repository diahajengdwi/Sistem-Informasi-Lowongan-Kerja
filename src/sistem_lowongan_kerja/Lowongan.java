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
public class Lowongan {
    // Deklarasi variable
    private BerkasLamaran[] berkasMasuk;
    private BerkasLamaran[] berkasDiterima;
    
    // Getter and Setter
    public BerkasLamaran[] getBerkasMasuk() {
        return berkasMasuk;
    }

    public void setBerkasMasuk(BerkasLamaran[] berkasMasuk) {
        this.berkasMasuk = berkasMasuk;
    }

    public BerkasLamaran[] getBerkasDiterima() {
        return berkasDiterima;
    }

    public void setBerkasDiterima(BerkasLamaran[] berkasDiterima) {
        this.berkasDiterima = berkasDiterima;
    }
    
    // Method
    public void addBerkas(BerkasLamaran b){
        
    }
    
    public void terimaBerkas(BerkasLamaran b){
        
    }
}
