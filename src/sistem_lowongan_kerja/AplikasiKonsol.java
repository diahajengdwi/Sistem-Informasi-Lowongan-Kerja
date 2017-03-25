/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_lowongan_kerja;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Diah Ajeng
 */
public class AplikasiKonsol {

    public void mainMenu(){
        List<Pelamar> pelamarList = new ArrayList<>();
        List<Perusahaan> perusahaanList = new ArrayList();
        
        Scanner input = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);
        
        // Menu List
        Aplikasi app = new Aplikasi();
        int pil = -1;
        int n;
        String nama,email, password, pass;
        while (pil != 0){
            // Main Menu
            app.mainMenu();
            n = -1;
            pil = input.nextInt();
            switch (pil) {
                case 1: // Daftar Lowongan Kerja
                    System.out.println("Daftar Lowongan Kerja : ");
                    if(perusahaanList.size() == 0 ){
                        System.out.println("Tidak ada daftar Lowongan");
                    }else{
                        for(int i=0;i<perusahaanList.size()-1;i++){
                            System.out.println("Nama Perusahaan : " + perusahaanList.get(i).getNmPerusahaan());
                            for (int j = 0; j < perusahaanList.get(i).getDaftarLowongan().size()-1; j++) {
                                System.out.println("Lowongan " + j+1 + " = " + perusahaanList.get(i).getdaftarLowongan(j));
                            } 
                        } 
                    }
                    break;
                case 2: // Menu Perusahaan
                    while (n != 0) {
                        app.PerusahaanMenu();
                        n = input.nextInt();
                        switch(n){
                            case 1 :    // Login Perusahaan
                                app.login(1);
                                email = inp.nextLine();
                                app.login(2);
                                password = inp.nextLine();
                                if(perusahaanList.size() == 0 ){
                                    System.out.println("Anda belum terdaftar"); 
                                    break;
                                }
                                int i = 0;
                                boolean find = false;
                                while (find != true) {
                                    if (perusahaanList.get(i).getEmail().equals(email) && perusahaanList.get(i).getEmail().equals(password)) {
                                        find = true;
                                    } else {
                                        i++;
                                    }
                                }
                                if(find){
                                    System.out.println("Selamat Datang " + perusahaanList.get(i).getNmPerusahaan());
                                    System.out.println("=================================");
                                    int pilihan = -1;
                                    while(pilihan != 0){
                                        app.perusahaanMainMenu();
                                        pilihan = input.nextInt();
                                        switch(pilihan){
                                            case 1 : 
                                                if(perusahaanList.get(i).getDaftarLowongan().isEmpty()){
                                                    System.out.println("Tidak ada lowongan");
                                                    break;
                                                }
                                                for (int j = 0; j < perusahaanList.get(i).getDaftarLowongan().size()-1; j++) {
                                                    if(perusahaanList.get(i).getdaftarLowongan(j).getBerkasMasuk().isEmpty()){
                                                        System.out.println("Tidak ada berkas masuk pada lowongan ini");
                                                    }else{
                                                        for (int k = 0; k < perusahaanList.get(i).getdaftarLowongan(j).getBerkasMasuk().size()-1; k++) {
                                                            System.out.println("id berkas : " + perusahaanList.get(i).getdaftarLowongan(j).getBerkasMasuk(k).getIdBerkas());
                                                        }
                                                    }
                                                }
                                                break;
                                            case 2 : 
                                                if(perusahaanList.get(i).getDaftarLowongan().equals(null)){
                                                    System.out.println("Tidak ada lowongan");
                                                }else{
                                                    for (int j = 0; j < perusahaanList.get(i).getDaftarLowongan().size()-1; j++) {
                                                    System.out.println("id lowongan : " + perusahaanList.get(i).getdaftarLowongan(i).getIdLowongan());
                                                    }
                                                }
                                                break;
                                            case 3 : //Buat Lowongan
                                                System.out.print("Masukkan Tanggal : ");
                                                String date = inp.next();

                                                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                                                Date date2=null;
                                                try {
                                                    date2 = dateFormat.parse(date);
                                                    perusahaanList.get(i).createLowongan(date2);
                                                    System.out.println("Lowongan telah dibuat!");
                                                } catch (ParseException e) {
                                                    e.printStackTrace();
                                                }
                                                break;
                                            case 4 : //Hapus Lowongan
                                                break;
                                            case 5 : //Lihat Berkas Lamaran Masuk
                                                break;
                                            case 6 : //Lihat Berkas Lamaran Di Terima
                                                break;
                                            default : 
                                                System.out.println("Anda salah memasukkan angka !");
                                                break;
                                        }
                                    }
                                }else{
                                    System.out.println("Email dan Password Salah!");
                                }
                                break;
                            case 2 :    // Daftar Akun Perusahaan
                                app.daftarAccPerusahaan(1);
                                String nmPerusahaan = inp.nextLine();
                                app.daftarAccPerusahaan(2);
                                String noTelp = inp.nextLine();
                                app.daftarAccPerusahaan(3);
                                String jenis = inp.nextLine();
                                app.daftarAccPerusahaan(4);
                                String kat = inp.nextLine();
                                app.daftarAccPerusahaan(5);
                                int karyawan = input.nextInt();
                                app.daftarAccPerusahaan(6);
                                nama = inp.nextLine();
                                app.daftarAccPerusahaan(7);
                                email = inp.nextLine();
                                app.daftarAccPerusahaan(8);
                                password = inp.nextLine();
                                app.daftarAccPerusahaan(9);
                                pass = inp.nextLine();
                                Perusahaan per = new Perusahaan(perusahaanList.size(), nmPerusahaan, noTelp, jenis, kat, karyawan, nama, email, pass);
                                perusahaanList.add(per);
                                System.out.println("Berhasil. Silahkan Login!");
                                break;
                            default : 
                                System.out.println("Anda salah memasukkan angka !");
                                break;
                        }
                    }
                    break;
                case 3: // Menu Pencari Kerja / Pelamar
                    while (n != 0) {
                        app.pencariKerjaMenu();
                        n = input.nextInt();
                        switch(n){
                            case 1 :    // Login Pelamar
                                app.login(1);
                                email = inp.nextLine();
                                app.login(2);
                                password = inp.nextLine();
                                if(pelamarList.size() == 0 ){
                                    System.out.println("Anda belum terdaftar"); 
                                    break;
                                }
                                int i = 0;
                                boolean find = false;
                                while (find != true) {
                                    if (pelamarList.get(i).getEmail().equals(email) && pelamarList.get(i).getEmail().equals(password)) {
                                        find = true;
                                    } else {
                                        i++;
                                    }
                                }
                                if(find){
                                    int pilihan = -1;
                                    while(pilihan != 0){
                                        app.pelamarMenu();
                                        pilihan = input.nextInt();
                                        switch(pilihan){
                                            case 1 :    // Daftar Lamaran dari Pelamar
                                                if(perusahaanList.isEmpty()){
                                                    System.out.println("Tidak Ada Perusahaan yang Memberi Lowongan!");
                                                }else{
                                                    int jmlP = perusahaanList.size();
                                                    for (int j = 0; j < jmlP-1; j++) {
                                                        System.out.print("Perusahaan : "+perusahaanList.get(i).getNmPerusahaan());
                                                        if(perusahaanList.get(i).getDaftarLowongan().isEmpty()){
                                                            System.out.println("Perusahaan Ini Tidak Ada Lowongan!");
                                                        }else{
                                                            System.out.println("Lowongan : ");
                                                            int jmlL = perusahaanList.get(i).getDaftarLowongan().size();
                                                            for (int k = 0; k < jmlL-1; k++) {
                                                                //munculin lowongan
                                                            }
                                                        }
                                                    }
                                                }
                                                System.out.println("Daftar Lamaran : ");

                                            case 2 :    // Edit Profil Pelamar
                                                int set = -1;
                                                while(set != 0){
                                                    app.pelamarProfil();
                                                    set = input.nextInt();
                                                    switch(set){
                                                        case 1 :    // Tambah Gelar
                                                            System.out.print("Banyak Gelar : ");
                                                            int nGelar = input.nextInt();
                                                            List<String> gelar = new ArrayList();
                                                            for (int j = 0; j < nGelar-1; j++) {
                                                                String nmGelar = inp.nextLine();
                                                                gelar.add(nmGelar);
                                                            }
                                                        case 2 :    // Tambah Bahasa
                                                            System.out.print("Banyak Bahasa : ");
                                                            int nBhs = input.nextInt();
                                                            List<String> bahasa = new ArrayList();
                                                            for (int j = 0; j < nBhs-1; j++) {
                                                                String nmBhs = inp.nextLine();
                                                                bahasa.add(nmBhs);
                                                            }
                                                        case 3 :    // Tambah Skill
                                                            System.out.print("Banyak Keahlian : ");
                                                            int nKeahlian = input.nextInt();
                                                            List<String> skill = new ArrayList();
                                                            for (int j = 0; j < nKeahlian-1; j++) {
                                                                String nmKeahlian = inp.nextLine();
                                                                skill.add(nmKeahlian);
                                                            }
                                                        case 4 :    // Tambah Pengalaman Kerja
                                                            System.out.print("Banyak Pengalaman Kerja : ");
                                                            int nPk = input.nextInt();
                                                            List<String> pk = new ArrayList();
                                                            for (int j = 0; j < nPk-1; j++) {
                                                                String nmPk = inp.nextLine();
                                                                pk.add(nmPk);
                                                            }
                                                        default :   
                                                            System.out.println("Angka yang Anda Masukkan Salah!");
                                                            break;
                                                    }
                                                }
                                            case 3 :    // Setting Akun Pelamar
                                                app.pelamarSetting(1);
                                                nama = inp.nextLine();
                                                app.pelamarSetting(2);
                                                email = inp.nextLine();
                                                app.pelamarSetting(3);
                                                String jk = inp.nextLine();
                                                app.pelamarSetting(4);
                                                String ttl = inp.nextLine();
                                                app.pelamarSetting(5);
                                                //Date tgllahir = inp.;
                                                app.pelamarSetting(6);
                                                String noTelp = inp.nextLine();
                                            case 4 : //Membuat Berkas

                                                break;
                                            default : 
                                                System.out.println("Angka yang Anda Masukkan Salah!");
                                                break;
                                        }
                                    }
                                }else{
                                    System.out.println("Email dan Password Salah!");
                                }
                                break;
                            case 2 :    // Daftar Akun Pelamar
                                app.daftarAccPelamar(1);
                                nama = inp.nextLine();
                                app.daftarAccPelamar(2);
                                email = inp.nextLine();
                                app.daftarAccPelamar(3);
                                password = inp.nextLine();
                                app.daftarAccPelamar(4);
                                pass = inp.nextLine();
                                Pelamar p = new Pelamar(pelamarList.size(),nama, email, password);
                                pelamarList.add(p);
                                System.out.println("Berhasil. Silahkan Login!");
                                break;
                            default : 
                                        System.out.println("Anda salah memasukkan angka !");
                                        break;
                        }
                    }
                    break;
                case 4: // Daftar Akun
                        app.daftarMenu();
                        n = input.nextInt();
                        switch(n){
                            case 1 :    // Daftar Akun Perusahaan
                                        app.daftarAccPelamar(1);
                                        String nmPerusahaan = inp.nextLine();
                                        app.daftarAccPelamar(2);
                                        String noTelp = inp.nextLine();
                                        app.daftarAccPelamar(3);
                                        String jenis = inp.nextLine();
                                        app.daftarAccPelamar(4);
                                        String kat = inp.nextLine();
                                        app.daftarAccPelamar(5);
                                        int karyawan = input.nextInt();
                                        app.daftarAccPelamar(6);
                                        nama = inp.nextLine();
                                        app.daftarAccPelamar(7);
                                        email = inp.nextLine();
                                        app.daftarAccPelamar(8);
                                        password = inp.nextLine();
                                        app.daftarAccPelamar(8);
                                        pass = inp.nextLine();
                                        Perusahaan per = new Perusahaan(perusahaanList.size()+1, nmPerusahaan, noTelp, jenis, kat, karyawan, nama, email, pass);
                                        perusahaanList.add(per);
                                        break;
                            case 2 :    // Daftar Akun Pelamar
                                        app.daftarAccPelamar(1);
                                        nama = inp.nextLine();
                                        app.daftarAccPelamar(2);
                                        email = inp.nextLine();
                                        app.daftarAccPelamar(3);
                                        password = inp.nextLine();
                                        app.daftarAccPelamar(4);
                                        pass = inp.nextLine();
                                        Pelamar p = new Pelamar(pelamarList.size()+1,nama, email, password);
                                        pelamarList.add(p);
                                        System.out.println("Berhasil. Silahkan Login!");
                                        break;
                            default : 
                                        System.out.println("Anda salah memasukkan angka !");
                                        break;
                        }
                default: 
                            System.out.println("Anda salah memasukkan angka !");
                            break;
            }
        }      

        // Pelamar
        int id = pelamarList.size() + 1;
        nama = input.nextLine();
        String jk = input.nextLine();
        String tempatLahir = input.nextLine();
        Date tglLahir = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String noTelp = input.nextLine();
        email = input.nextLine();
        password = input.nextLine();

        Pelamar p = new Pelamar(id, nama, jk, tempatLahir, tglLahir, noTelp, email, password);

        // create berkas lamaran
        int idBerkas = p.b.getIdBerkas() + 1;
        int ipk = input.nextInt();
        System.out.println("Banyak Gelar : ");
        int nGelar = input.nextInt();
        List<String> gelar = new ArrayList();
        for (int i = 0; i < nGelar; i++) {
            String nmGelar = input.nextLine();
            gelar.add(nmGelar);
        }

        System.out.println("Banyak Skill : ");
        int nSkill = input.nextInt();
        List<String> skill = new ArrayList();
        for (int i = 0; i < nSkill; i++) {
            String nmSkill = input.nextLine();
            skill.add(nmSkill);
        }

        System.out.println("Banyak Bahasa : ");
        int nBhs = input.nextInt();
        List<String> bahasa = new ArrayList();
        for (int i = 0; i < nBhs; i++) {
            String nmBhs = input.nextLine();
            bahasa.add(nmBhs);
        }

        System.out.println("Banyak Pengalaman Kerja : ");
        int nPk = input.nextInt();
        List<String> pk = new ArrayList();
        for (int i = 0; i < nPk; i++) {
            String nmPk = input.nextLine();
            pk.add(nmPk);
        }

        System.out.println("Banyak Bahasa : ");
        int nPo = input.nextInt();
        List<String> po = new ArrayList();
        for (int i = 0; i < nPo; i++) {
            String nmPo = input.nextLine();
            po.add(nmPo);
        }

        p.createBerkas(idBerkas, ipk, gelar, skill, bahasa, pk, po);

        // adding pelamar to pelamarLIst
        pelamarList.add(p);
    }
}
