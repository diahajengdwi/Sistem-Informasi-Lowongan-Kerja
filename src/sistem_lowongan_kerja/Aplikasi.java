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
    
    // Menu
    public void PerusahaanMenu(){
        System.out.println("Pilihan");
        System.out.println("1. Login");
        System.out.println("2. Daftar Akun Perusahaan");                        
        System.out.println("0. Kembali");
        System.out.print("Masukkan Pilihan : ");
    }
    
    public void perusahaanMainMenu(){
        System.out.println("Pilihan");
        System.out.println("1. Daftar Pelamar");
        System.out.println("2. Lihat Lowongan");
        System.out.println("0. Logout");
        System.out.print("Masukkan Pilihan : ");
    }
    
    public void daftarAccPerusahaan(int i){
        switch (i) {
            case 1:
                System.out.println("Silahkan Mendaftar.");
                System.out.println("=====");
                System.out.print("Nama Perusahaan   : ");
                break;
            case 2:
                System.out.print("No Telp           : ");
                break;
            case 3:
                System.out.print("Jenis             : ");
                break;
            case 4:
                System.out.print("Kategori          : ");
                break;
            case 5:
                System.out.print("Karyawan          : ");
                break;
            case 6:
                System.out.print("Nama              : ");
                break;
            case 7:
                System.out.print("Email             : ");
                break;
            case 8:
                System.out.print("Kata Sandi        : ");
                break;
            default:
                System.out.print("Ulangi Kata Sandi : ");
                break;
        } 
    }
    
    public void login(int i){
        if(i == 1){
            System.out.println("Silahkan masukkan kredensial login Anda di bawah ini.");
            System.out.println("=====");
            System.out.print("Email      : ");
        }
        else{
            System.out.print("Kata Sandi : ");
        }
    }
     
    public void pencariKerjaMenu(){
        System.out.println("Pilihan ");
        System.out.println("1. Login");
        System.out.println("2. Daftar Akun Pelamar");
        System.out.println("0. Kembali");
        System.out.print("Masukkan Pilihan : ");
    }
    
    public void daftarAccPelamar(int i){
        switch (i) {
            case 1:
                System.out.println("Silahkan Mendaftar.");
                System.out.println("=====");
                System.out.print("Nama              : ");
                break;
            case 2:
                System.out.print("Email             : ");
                break;
            case 3:
                System.out.print("Kata Sandi        : ");
                break;
            default:
                System.out.print("Ulangi Kata Sandi : ");
                break;
        } 
    }
    
    public void pelamarMenu(){
        System.out.println("Pilihan ");
        System.out.println("1. Daftar Lamaran");
        System.out.println("2. Profil");
        System.out.println("3. Setting");
        System.out.println("0. Logout");
        System.out.print("Masukkan Pilihan : ");
    }
    
    public void pelamarProfil(){
        System.out.println("Pengaturan / Profil");
        System.out.println("1. Gelar");
        System.out.println("2. Bahasa");
        System.out.println("3. Keahlian");
        System.out.println("4. Pengalaman Kerja");
        System.out.println("0. Kembali");
        System.out.println("Masukkan Pilihan : ");
    }
    
    public void pelamarSetting(int i){
        switch(i){
            case 1 : 
                System.out.println("Pengaturan / Settings");
                System.out.println("Nama          : ");
                break;
            case 2 : 
                System.out.println("Email         : ");
                break;
            case 3 : 
                System.out.println("Jenis Kelamin : ");
                break;
            case 4 : 
                System.out.println("Tempat Lahir  : ");
                break;
            case 5 : 
                System.out.println("Tanggal Lahir : ");
                break;
            default : 
                System.out.println("No Telp       : ");
                break;
        }
        
        
        
        
        
        
    }
    
    public void daftarMenu(){
        System.out.println("Silahkan Pilih Jenis Pendaftaran.");
        System.out.println("1. Pencari Kerja");
        System.out.println("2. Perusahaan");
        System.out.println("0. Kembali");
        System.out.print("Masukkan pilihan : ");
    }
    
    public void mainMenu(){
        System.out.println("Main Menu");
        System.out.println("1. Cari Lowongan");
        System.out.println("2. Perusahaan");
        System.out.println("3. Pencari Kerja");
        System.out.println("4. Daftar Akun");
        System.out.println("0. Keluar");
        System.out.print("Masukkan Pilihan : ");
    }
}
