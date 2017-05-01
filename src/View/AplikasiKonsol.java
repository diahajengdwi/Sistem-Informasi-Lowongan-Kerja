package View;

import Model.Aplikasi;
import Model.BerkasLamaran;
import Model.Gelar;
import Model.Pelamar;
import Model.Pengalaman;
import Model.Perusahaan;
import java.io.IOException;
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

    Aplikasi model;
    
    Scanner inpInteger = new Scanner(System.in);
    Scanner inpString = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    Date tgl=null;
    
    public AplikasiKonsol(Aplikasi model) {
        this.model = model;
    }
    
    public void MainMenu() throws ParseException{
        // Menu
        System.out.println("Cari Job.id");
        System.out.println("Pekerjaan Terbaik Menanti Anda!");
        System.out.println("-------------------------------");
        boolean keluar = false;
        do{
            model.mainMenu();
            try{
                int pil = Integer.parseInt(inpString.nextLine());
                switch(pil){
                    case 0 : // Keluar
                        System.out.println("Program Keluar");
                        keluar = true;
                        break;
                    case 1 : // Daftar Lowongan Kerja
                        if(model.getDaftarPerusahaan()==null){
                            System.out.println("Tidak Ada Daftar Lowongan");
                        }else{
                            LihatDaftarLowongan();
                        }
                        System.out.println("Tekan Enter...");
                        String in = inpString.nextLine();
                        break;
                    case 2 : // Perusahaan
                        MenuPerusahaan();
                        in = inpString.nextLine();
                        break;
                    case 3 : // Pelamar
                        MenuPelamar();
                        in = inpString.nextLine();
                        break;
                    case 4 : // Daftar Akun
                        boolean exit = false;
                        do {
                            exit = DaftarAkun(exit);
                        } while (exit == false);
                        in = inpString.nextLine();
                        break;
                    default :
                        System.out.println("Pilihan Tidak Ada! Tekan Enter...");
                        in = inpString.nextLine();
                        break;
                }
            }catch(Exception e){
                System.out.print("Terjadi kesalahan. Tekan Enter...");
                String in = inpString.nextLine();
            }
        }while(keluar == false);
    }
    
    void LihatDaftarLowongan(){
        // show all
        System.out.println("Daftar Lowongan Kerja\n=====================");
        int SP = model.getDaftarPerusahaan().size();
        for(int i=0;i<=SP-1;i++){
            String namaPerusahaan = model.getDaftarPerusahaan().get(i).getNmPerusahaan(); 
            if(model.getDaftarPerusahaan().get(i).getDaftarLowongan() == null){
                System.out.println("Perusahaan " + namaPerusahaan + " tidak memiliki lowongan pekerjaan");
            }else{
                System.out.println("Nama Perusahaan : " + namaPerusahaan);
                int SL = model.getDaftarPerusahaan().get(i).getDaftarLowongan().size();
                for (int j = 0; j <= SL-1; j++) {
                    System.out.println("Lowongan " + (j+1));
                    System.out.println("\t Deadline : " + dateFormat.format(model.getDaftarPerusahaan().get(i).getdaftarLowongan(j).getDeadline()) + "\n");
                } 
            }
        } 
    }
    
    void MenuPerusahaan(){
        boolean keluar = false;
        do {
            model.PerusahaanMenu();
            try{
                int n = Integer.parseInt(inpString.nextLine());
                switch(n){
                    case 0 : // Kembali
                        keluar = true;
                        break;
                    case 1 : // Login Perusahaan
                        System.out.println("Silahkan masukkan kredensial login Anda di bawah ini.");
                        System.out.println("=====================================================");
                        System.out.print("Email      : ");
                        String email = inpString.nextLine();
                        System.out.print("Kata Sandi : ");
                        String pass = inpString.nextLine();
                        // search
                        Perusahaan perusahaan = model.LoginPerusahaan(email, pass);
                        if(perusahaan != null){
                            PerusahaanMainMenu(perusahaan);
                        }else{
                            System.out.println("Masukkan field dengan benar");
                        }
                        System.out.print("Tekan Enter...");
                        String in = inpString.nextLine();
                        break;
                    case 2 : // Daftar Akun Perusahaan
                        DaftarPerusahaan();
                        break;
                    default :
                        System.out.println("Pilihan Tidak Ada! Tekan Enter...");
                        in = inpString.nextLine();
                        break;
                }
            }catch(Exception e8){
                System.out.println("Terjadi kesalahan input. Tekan Enter...");
                String in = inpString.nextLine();
            }  
        }while (keluar == false); 
    }
    
    void DaftarPerusahaan(){
        System.out.println("Silahkan Mendaftar.");
        System.out.println("==================");
        System.out.print("Nama Perusahaan   : ");
        String nmPerusahaan = inpString.nextLine();
        System.out.print("No Telp           : ");
        String noTelp = inpString.nextLine();
        System.out.print("Jenis             : ");
        String jenis = inpString.nextLine();
        System.out.print("Kategori          : ");
        String kat = inpString.nextLine();
        System.out.print("Jumlah Karyawan   : ");
        int karyawan = inpInteger.nextInt();
        System.out.print("Nama              : ");
        String nama = inpString.nextLine();
        System.out.print("Email             : ");
        String email = inpString.nextLine();
        System.out.print("Kata Sandi        : ");
        String password = inpString.nextLine();
        // create
        if(model.getDaftarPerusahaan()==null){
            model.addPerusahaan(new Perusahaan(0, nmPerusahaan, noTelp, jenis, kat, karyawan, nama, email, password));
        }else{
            model.addPerusahaan(new Perusahaan(model.getDaftarPerusahaan().size(), nmPerusahaan, noTelp, jenis, kat, karyawan, nama, email, password));
        }
        System.out.println("Berhasil. Silahkan Login! Tekan Enter...");
        String inpt = inpString.nextLine();
    }

    void PerusahaanMainMenu(Perusahaan perusahaan){
        System.out.println("Selamat Datang Perusahaan " + perusahaan.getNmPerusahaan());
        System.out.println("=================================");
        boolean keluar = false;
        do {
            model.perusahaanMainMenu();
            try{
                int pil = Integer.parseInt(inpString.nextLine());
                switch(pil){
                    case 0 : // Keluar
                        System.out.println("Apakah anda yakin akan keluar?");
                        System.out.print("Pilihan (Ya/Tidak) : ");
                        String inpt = inpString.nextLine();
                        if(inpt.equals("Ya") || inpt.equals("ya")){
                            keluar = true;
                        }else{
                            System.out.print("Tekan Enter...");
                            inpt = inpString.nextLine();
                        }
                        break;
                    case 1 : // Daftar Pelamar
                        System.out.println("Daftar Pelamar (Keseluruhan) : ");
                        if(perusahaan.getDaftarLowongan() == null){
                            System.out.println("Tidak ada pelamar");
                        }else{
                            int jmlLow = perusahaan.getDaftarLowongan().size();
                            int st =0;
                            for (int j = 0; j <= jmlLow-1; j++) {
                                if(perusahaan.getdaftarLowongan(j).getBerkasMasuk() == null){
                                    st++;
                                }else{
                                    int jmlBerkas = perusahaan.getdaftarLowongan(j).getBerkasMasuk().size();
                                    System.out.println("Ada " + jmlBerkas + " berkas yang masuk");
                                    for (int k = 0; k <= jmlBerkas-1; k++) {
                                        System.out.println("Berkas Masuk ke-" + (k+1));
                                        for (int i = 0; i < model.getDaftaPelamar().size(); i++) {
                                            if(model.getDaftarPelamar(i).getIdPelamar() == perusahaan.getdaftarLowongan(j).getBerkasMasuk(k).getIdBerkas()){
                                                System.out.println("\t Nama            : "+model.getDaftarPelamar(i).getNama());
                                                System.out.println("\t No Telp         : "+model.getDaftarPelamar(i).getNoTelp());
                                                System.out.println("\t Jenis Kelamin   : "+model.getDaftarPelamar(i).getJk() );
                                                System.out.println("\t TTL             : "+model.getDaftarPelamar(i).getTempatLahir()+", "+model.getDaftarPelamar(i).getTglLahir());
                                            }
                                        }
                                    }
                                }
                            }
                            if(st == jmlLow){
                                System.out.println("Tidak ada pelamar");
                            }
                        }
                        System.out.print("Tekan Enter...");
                        inpt = inpString.nextLine();
                        break;
                    case 2 : // Lihat Lowongan
                        System.out.println("Lihat Lowongan : ");
                        if(perusahaan.getDaftarLowongan() == null){
                            System.out.println("Tidak ada lowongan. Silahkan buat lowongan!");
                        }else {
                            int jmlLow = perusahaan.getDaftarLowongan().size();
                            for (int j = 0; j <= jmlLow-1; j++) {
                                System.out.println("Lowongan ke-" + (j+1));
                                System.out.println("\t Deadline : " + dateFormat.format(perusahaan.getdaftarLowongan(j).getDeadline()) + "\n");
                                // berkas masuk
                                if(perusahaan.getdaftarLowongan(j).getBerkasMasuk() == null){
                                    System.out.println("Tidak ada berkas masuk pada lowongan ini \n");
                                }else{
                                    int jmlBerkas = perusahaan.getdaftarLowongan(j).getBerkasMasuk().size();
                                    System.out.println("Ada " + jmlBerkas + " berkas yang masuk");
                                    for (int k = 0; k <= jmlBerkas-1; k++) {
                                        System.out.println("Berkas Masuk ke-" + (k+1));
                                        for (int i = 0; i < model.getDaftaPelamar().size(); i++) {
                                            if(model.getDaftarPelamar(i).getIdPelamar() == perusahaan.getdaftarLowongan(j).getBerkasMasuk(k).getIdBerkas()){
                                                System.out.println("\t Nama            : "+model.getDaftarPelamar(i).getNama());
                                                System.out.println("\t No Telp         : "+model.getDaftarPelamar(i).getNoTelp());
                                                System.out.println("\t Jenis Kelamin   : "+model.getDaftarPelamar(i).getJk() );
                                                System.out.println("\t TTL             : "+model.getDaftarPelamar(i).getTempatLahir()+", "+model.getDaftarPelamar(i).getTglLahir());
                                                System.out.println("\t Gelar           : ");
                                                System.out.println("\t\tNama Gelar | Tahun Masuk | Tahun Lulus | Institusi | IPK");
                                                for (int l = 0; l < model.getDaftarPelamar(i).getB().getGelar().size(); l++) {
                                                    System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getGelar().get(i).getNamaGelar()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getThnMasuk()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getThnKeluar()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getInstitusi()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getIpk());
                                                }
                                                System.out.println("\tBahasa           : ");
                                                for (int l = 0; l < model.getDaftarPelamar(i).getB().getBahasa().size(); l++) {
                                                    System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getBahasa().get(i));
                                                }
                                                System.out.println("\tKeahlian         : ");
                                                for (int l = 0; l < model.getDaftarPelamar(i).getB().getSkill().size(); l++) {
                                                    System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getSkill().get(i));
                                                }
                                                System.out.println("\tPengalaman Kerja : ");
                                                System.out.println("\t\tNama Pekerjaan | Tahun Masuk | Tahun Keluar | Divisi | Kota | Provinsi");
                                                for (int l = 0; l < model.getDaftarPelamar(i).getB().getPengalamanKerja().size(); l++) {
                                                    System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getJob()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getThnMasuk()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getThnKeluar()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getDivisi()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getKota()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getProv());
                                                }
                                            }
                                        }
                                    }
                                    System.out.println("Apakah anda kana menerima berkas lamaran?");
                                    System.out.print("Masukkan pilihan (Ya/Tidak) : ");
                                    inpt = inpString.nextLine();
                                    if(inpt.equals("Ya") || inpt.equals("ya")){
                                        System.out.print("Masukkan pilihan berkas (1 - "+jmlBerkas+") : ");
                                        int plh = Integer.parseInt(inpString.nextLine());
                                        try{
                                            if((plh > jmlBerkas) || (plh < 0)){
                                                System.out.println("Perintah tdk tersedia");
                                            }else{
                                                perusahaan.getdaftarLowongan(j).terimaBerkas(model.getDaftarPelamar(plh-1).getB());
                                                model.addBerkasdiTerima(model.getDaftarPelamar(plh-1));
                                                System.out.println("Berhasil"); 
                                            }
                                        }catch(Exception ex){
                                            System.out.println("file tdk terinput");
                                        }
                                    }
                                    System.out.println("Apakah Anda akan melihat berkas yang diterima? ");
                                    System.out.print("Masukkan Pilihan (Ya/Tidak) : ");
                                    inpt = inpString.nextLine();
                                    if(inpt.equals("Ya") || inpt.equals("ya")){
                                        // berkas di terima
                                        if(perusahaan.getdaftarLowongan(j).getBerkasDiterima()== null){
                                            System.out.println("Tidak ada berkas yang di terima pada lowongan ini \n");
                                        }else{
                                            int jmlterima = perusahaan.getdaftarLowongan(j).getBerkasDiterima().size();
                                            System.out.println("Ada " + jmlterima + " berkas yang di terima");
                                            for (int k = 0; k <= jmlterima-1; k++) {
                                                System.out.println("Berkas di Terima ke-" + (k+1));
                                                for (int i = 0; i < model.getDaftaPelamar().size(); i++) {
                                                    if(model.getDaftarPelamar(i).getIdPelamar() == perusahaan.getdaftarLowongan(j).getBerkasDiterima(k).getIdBerkas()){
                                                        System.out.println("\t Nama          : "+model.getDaftarPelamar(i).getNama());
                                                        System.out.println("\t No Telp       : "+model.getDaftarPelamar(i).getNoTelp());
                                                        System.out.println("\t Jenis Kelamin : "+model.getDaftarPelamar(i).getJk() );
                                                        System.out.println("\t TTL           : "+model.getDaftarPelamar(i).getTempatLahir()+", "+model.getDaftarPelamar(i).getTglLahir());
                                                        System.out.println("\t Gelar : ");
                                                        System.out.println("\t\tNama Gelar | Tahun Masuk | Tahun Lulus | Institusi | IPK");
                                                        for (int l = 0; l < model.getDaftarPelamar(i).getB().getGelar().size(); l++) {
                                                            System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getGelar().get(i).getNamaGelar()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getThnMasuk()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getThnKeluar()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getInstitusi()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getIpk());
                                                        }
                                                        System.out.println("\tBahasa : ");
                                                        for (int l = 0; l < model.getDaftarPelamar(i).getB().getBahasa().size(); l++) {
                                                            System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getBahasa().get(i));
                                                        }
                                                        System.out.println("\tKeahlian : ");
                                                        for (int l = 0; l < model.getDaftarPelamar(i).getB().getSkill().size(); l++) {
                                                            System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getSkill().get(i));
                                                        }
                                                        System.out.println("\tPengalaman Kerja : ");
                                                        System.out.println("\t\tNama Pekerjaan | Tahun Masuk | Tahun Keluar | Divisi | Kota | Provinsi");
                                                        for (int l = 0; l < model.getDaftarPelamar(i).getB().getPengalamanKerja().size(); l++) {
                                                            System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getJob()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getThnMasuk()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getThnKeluar()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getDivisi()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getKota()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getProv());
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        System.out.print("Tekan Enter...");
                        inpt = inpString.nextLine();
                        break;
                    case 3 : //Buat Lowongan
                        System.out.print("Masukkan Tanggal : ");
                        String tggl = inpString.nextLine();
                        try {
                            tgl = dateFormat.parse(tggl);
                            System.out.println(perusahaan.getNmPerusahaan());
                            // create
                            model.createLowongan(perusahaan, tgl);
                            System.out.println("Lowongan telah dibuat!");
                        } catch (ParseException par) {
                            par.printStackTrace();
                        }
                        System.out.print("Tekan Enter...");
                        inpt = inpString.nextLine();
                        break;
                    case 4 : //Hapus Lowongan
                        System.out.println("Daftar Lowongan Kerja\n=====================");
                        int SL = perusahaan.getDaftarLowongan().size();
                        for (int j = 0; j <= SL-1; j++) {
                            System.out.println("Lowongan " + (j+1));
                            System.out.println("\t Deadline : " + dateFormat.format(perusahaan.getdaftarLowongan(j).getDeadline()) + "\n");
                        } 
                        System.out.println("Apakah Anda Akan menghapus data lowongan kerja?");
                        System.out.print("Masukkan pilihan (Ya/Tidak) :");
                        inpt = inpString.nextLine();
                        if(inpt.equals("Ya") || inpt.equals("ya")){
                            System.out.print("Masukkan pilihan berkas (1 - "+SL+") : ");
                            int plh = Integer.parseInt(inpString.nextLine());
                            try{
                                if((plh > (SL-1))||(plh < 0)){
                                    System.out.println("Perintah tdk tersedia");
                                }else{
                                    model.hapusLowongan(perusahaan, plh-1);
                                    System.out.println("Berhasil");
                                }
                            }catch(Exception ex){
                                System.out.println("data tdk terinput");
                                ex.printStackTrace();
                            }
                        }
                        System.out.print("Tekan Enter...");
                        inpt = inpString.nextLine();
                        break;
                    case 5 : //Lihat Berkas Lamaran Masuk
                        System.out.println("Berkas Lamaran Masuk : ");
                        if(perusahaan.getDaftarLowongan() == null){
                            System.out.println("Tidak ada lamaran masuk");
                        }else{
                            int jmlLow = perusahaan.getDaftarLowongan().size();
                            int st = 0;
                            for (int j = 0; j <= jmlLow-1; j++) {
                                if(perusahaan.getdaftarLowongan(j).getBerkasMasuk() == null){
                                    st++;
                                }else{
                                    int jmlBerkas = perusahaan.getdaftarLowongan(j).getBerkasMasuk().size();
                                    System.out.println("Ada " + jmlBerkas + " berkas yang masuk");
                                    for (int k = 0; k <= jmlBerkas-1; k++) {
                                        System.out.println("Berkas Masuk ke-" + (k+1));
                                        for (int i = 0; i < model.getDaftaPelamar().size(); i++) {
                                            if(model.getDaftarPelamar(i).getIdPelamar() == perusahaan.getdaftarLowongan(j).getBerkasMasuk(k).getIdBerkas()){
                                                System.out.println("\t Nama            : "+model.getDaftarPelamar(i).getNama());
                                                System.out.println("\t No Telp         : "+model.getDaftarPelamar(i).getNoTelp());
                                                System.out.println("\t Jenis Kelamin   : "+model.getDaftarPelamar(i).getJk() );
                                                System.out.println("\t TTL             : "+model.getDaftarPelamar(i).getTempatLahir()+", "+model.getDaftarPelamar(i).getTglLahir());
                                                System.out.println("\t Gelar           : ");
                                                System.out.println("\t\tNama Gelar | Tahun Masuk | Tahun Lulus | Institusi | IPK");
                                                for (int l = 0; l < model.getDaftarPelamar(i).getB().getGelar().size(); l++) {
                                                    System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getGelar().get(i).getNamaGelar()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getThnMasuk()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getThnKeluar()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getInstitusi()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getIpk());
                                                }
                                                System.out.println("\tBahasa           : ");
                                                for (int l = 0; l < model.getDaftarPelamar(i).getB().getBahasa().size(); l++) {
                                                    System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getBahasa().get(i));
                                                }
                                                System.out.println("\tKeahlian         : ");
                                                for (int l = 0; l < model.getDaftarPelamar(i).getB().getSkill().size(); l++) {
                                                    System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getSkill().get(i));
                                                }
                                                System.out.println("\tPengalaman Kerja : ");
                                                System.out.println("\t\tNama Pekerjaan | Tahun Masuk | Tahun Keluar | Divisi | Kota | Provinsi");
                                                for (int l = 0; l < model.getDaftarPelamar(i).getB().getPengalamanKerja().size(); l++) {
                                                    System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getJob()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getThnMasuk()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getThnKeluar()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getDivisi()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getKota()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getProv());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if(st == jmlLow){
                                System.out.println("Tidak ada lamaran masuk.");
                            }
                        }
                        System.out.print("Tekan Enter...");
                        inpt = inpString.nextLine();
                        break;
                    case 6 : //Lihat Berkas Lamaran Di Terima
                        if(perusahaan.getDaftarLowongan() == null){
                            System.out.println("Tidak ada lamaran masuk yang di terima");
                        }else{
                            int jmlLow = perusahaan.getDaftarLowongan().size();
                            int st = 0;
                            for (int j = 0; j <= jmlLow-1; j++) {
                                if(perusahaan.getdaftarLowongan(j).getBerkasDiterima() == null){
                                    st++;
                                }else{
                                    int jmlterima = perusahaan.getdaftarLowongan(j).getBerkasDiterima().size();
                                    System.out.println("Ada " + jmlterima + " berkas yang di terima");
                                    for (int k = 0; k <= jmlterima-1; k++) {
                                        System.out.println("Berkas di Terima ke-" + (k+1));
                                        for (int i = 0; i < model.getDaftaPelamar().size(); i++) {
                                            if(model.getDaftarPelamar(i).getIdPelamar() == perusahaan.getdaftarLowongan(j).getBerkasDiterima(k).getIdBerkas()){
                                                System.out.println("\t Nama          : "+model.getDaftarPelamar(i).getNama());
                                                System.out.println("\t No Telp       : "+model.getDaftarPelamar(i).getNoTelp());
                                                System.out.println("\t Jenis Kelamin : "+model.getDaftarPelamar(i).getJk() );
                                                System.out.println("\t TTL           : "+model.getDaftarPelamar(i).getTempatLahir()+", "+model.getDaftarPelamar(i).getTglLahir());
                                                System.out.println("\t Gelar : ");
                                                System.out.println("\t\tNama Gelar | Tahun Masuk | Tahun Lulus | Institusi | IPK");
                                                for (int l = 0; l < model.getDaftarPelamar(i).getB().getGelar().size(); l++) {
                                                    System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getGelar().get(i).getNamaGelar()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getThnMasuk()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getThnKeluar()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getInstitusi()+" | "+model.getDaftarPelamar(i).getB().getGelar().get(i).getIpk());
                                                }
                                                System.out.println("\tBahasa : ");
                                                for (int l = 0; l < model.getDaftarPelamar(i).getB().getBahasa().size(); l++) {
                                                    System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getBahasa().get(i));
                                                }
                                                System.out.println("\tKeahlian : ");
                                                for (int l = 0; l < model.getDaftarPelamar(i).getB().getSkill().size(); l++) {
                                                    System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getSkill().get(i));
                                                }
                                                System.out.println("\tPengalaman Kerja : ");
                                                System.out.println("\t\tNama Pekerjaan | Tahun Masuk | Tahun Keluar | Divisi | Kota | Provinsi");
                                                for (int l = 0; l < model.getDaftarPelamar(i).getB().getPengalamanKerja().size(); l++) {
                                                    System.out.println("\t\t"+(l+1)+". "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getJob()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getThnMasuk()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getThnKeluar()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getDivisi()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getKota()+" | "+model.getDaftarPelamar(i).getB().getPengalamanKerja().get(i).getProv());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if(st == jmlLow){
                                System.out.println("Tidak ada lamaran masuk yang di terima.");
                            }
                        }
                        System.out.print("Tekan Enter...");
                        inpt = inpString.nextLine();
                        break;
                    default : 
                        System.out.println("Perintah tidak tersedia. Tekan Enter...");
                        inpt = inpString.nextLine();
                        break;
                }
            }catch(Exception e7){
                System.out.println("Kesalahan input. Tekan Enter...");
                String inpt = inpString.nextLine();
            }
        } while (keluar == false);
    }
    
    void MenuPelamar(){
        boolean keluar = false;
        do {
            model.PelamarMenu();
            try{
                int pilihan = Integer.parseInt(inpString.nextLine());
                switch(pilihan){
                    case 0 : // Kembali
                        keluar = true;
                        break;
                    case 1 : // Login
                        System.out.println("Silahkan masukkan kredensial login Anda di bawah ini.");
                        System.out.println("=====================================================");
                        System.out.print("Email      : ");
                        String email = inpString.nextLine();
                        System.out.print("Kata Sandi : ");
                        String pass = inpString.nextLine();
                        // search
                        Pelamar pelamar = model.LoginPelamar(email, pass);
                        if(pelamar!=null){
                            PelamarMainMenu(pelamar);
                        }else{
                            System.out.println("Masukkan field dengan benar");
                        }
                        break;
                    case 2 : // Daftar Akun Pelamar
                        DaftarPelamar();
                        break;
                    default :
                        System.out.println("Perintah tidak tersedia. Tekan Enter...");
                        String inpt = inpString.nextLine();
                        break;
                }
            }catch(Exception e6){
                System.out.println("Kesalahan input. Tekan Enter...");
                String inpt = inpString.nextLine();
            }
            
        } while (keluar = false);
    }
    
    void DaftarPelamar(){
        System.out.println("Silahkan Mendaftar.");
        System.out.println("===================");
        System.out.print("Nama              : ");
        String nama = inpString.nextLine();
        System.out.print("Email             : ");
        String email = inpString.nextLine();
        System.out.print("Kata Sandi        : ");
        String pass = inpString.nextLine();
        // create
        if(model.getDaftaPelamar()==null){
            model.addPelamar(new Pelamar(0,nama, email, pass));
        }else{
            model.addPelamar(new Pelamar(model.getDaftaPelamar().size(),nama, email, pass));
        }
        System.out.println("Berhasil. Silahkan Login! Tekan Enter...");
        String inpt = inpString.nextLine();
    }
    
    void PelamarMainMenu(Pelamar pelamar){
        int count = 0;
        System.out.println("Selamat Datang " + pelamar.getNama());
        System.out.println("=================================");
        boolean keluar = false;
        do {
            model.PelamarMainMenu();
            try{
                int pil = Integer.parseInt(inpString.nextLine());
                switch(pil){
                    case 0 : // Keluar
                        System.out.println("Apakah anda yakin akan keluar?");
                        System.out.print("Pilihan (Ya/Tidak) : ");
                        String inpt = inpString.nextLine();
                        if(inpt.equals("Ya") || inpt.equals("ya")){
                            keluar = true;
                        }else{
                            inpt = inpString.nextLine();
                        }
                        break;
                    case 1 : // Daftar Lamaran dan Lowongan
                        LihatDaftarLowongan();
                        List<Perusahaan> p = model.getDaftarPerusahaan();
                        System.out.println("Daftar yang di Lamaran : ");
                        int jml = p.size();
                        boolean sts = false;
                        for (int i = 0; i < jml; i++) {
                            int jmlL = p.get(i).getDaftarLowongan().size();
                            for (int j = 0; j < jmlL; j++) {
                                if(p.get(i).getdaftarLowongan(j).getBerkasMasuk() != null){
                                   int jmlB = p.get(i).getdaftarLowongan(j).getBerkasMasuk().size();
                                    for (int k = 0; k < jmlB; k++) {
                                        if(p.get(i).getdaftarLowongan(j).getBerkasMasuk(k).getIdBerkas()==(pelamar.getB().getIdBerkas())){
                                            System.out.println("Nama Perusahaan yang anda lamar : "+p.get(i).getNmPerusahaan());
                                            sts = true;
                                        }
                                    } 
                                }
                            }
                        }
                        if(sts == false){
                            System.out.println("Tidak ada perusahaan yang anda lamar");
                        }
                        sts = false;
                        inpt = inpString.nextLine();
                        System.out.println("Daftar Lamaran di Terima : ");
                        for (int i = 0; i < jml; i++) {
                            int jmlL = p.get(i).getDaftarLowongan().size();
                            for (int j = 0; j < jmlL; j++) {
                                if(p.get(i).getdaftarLowongan(j).getBerkasDiterima()!= null){
                                   int jmlB = p.get(i).getdaftarLowongan(j).getBerkasDiterima().size();
                                    for (int k = 0; k < jmlB; k++) {
                                        if(p.get(i).getdaftarLowongan(j).getBerkasDiterima(k).getIdBerkas()==(pelamar.getB().getIdBerkas())){
                                            System.out.println("Anda di terima di Perusahaan : "+p.get(i).getNmPerusahaan());
                                            sts = true;
                                        }
                                    } 
                                }
                            }
                        }
                        if(sts == false){
                            System.out.println("Belum ada berkas lamaran yang di terima");
                        }
                        inpt = inpString.nextLine();
                        System.out.println("Apakah anda akan melamar pekerjaan?");
                        System.out.print("Masukkan pilihan (Ya/Tidak) : ");
                        inpt = inpString.nextLine();
                        if(inpt.equals("Ya") || inpt.equals("ya")){
                            System.out.print("Masukkan Nama Perusahaan yang Akan Anda Lamar : ");
                            inpt = inpString.nextLine();
                            // search
                            int jmlP = model.getDaftarPerusahaan().size();
                            boolean status = false;
                            for (int j = 0; j <= jmlP-1; j++) {
                                if(p.get(j).getNmPerusahaan().equals(inpt)){
                                    int jmlL = p.get(j).getDaftarLowongan().size();
                                    for (int k = 0; k <= jmlL-1; k++) {
                                        if(p.get(j).getdaftarLowongan(k).getIdLowongan()== p.get(j).getId()){
                                            System.out.println("Lowongan ke-" + (k+1));
                                            System.out.println("\t Deadline : " + dateFormat.format(p.get(j).getdaftarLowongan(k).getDeadline()) + "\n");
                                            status = true;
                                        }
                                    }
                                    if(status == true){
                                        System.out.print("Masukkan pilihan (1 - " + jmlP + ") : ");
                                        int pilihan = Integer.parseInt(inpString.nextLine());
                                        if((pilihan > jmlP)||(pilihan < 0)){
                                            System.out.println("Perintah tdk tersedia");
                                        }else{
                                            p.get(j).getdaftarLowongan(pilihan-1).addBerkas(pelamar.getB());
                                            model.addBerkasMasuk(pelamar);
                                            System.out.println("Anda berhasil melamar"); 
                                        }
                                    }else{
                                        System.out.println("Data tidak ditemukan"); 
                                    }
                                }
                            }
                        }
                        break;
                    case 2 : // Profil Pelamar memunculkan detail (editable)
                        boolean kluar = false;
                        do{
                            model.pelamarProfil();
                            pil = Integer.parseInt(inpString.nextLine());
                            switch(pil){
                                case 0 :
                                    kluar = true;
                                    break;
                                case 1 : // Gelar
                                    System.out.print("Banyak Gelar : ");
                                    try{
                                        int n = Integer.parseInt(inpString.nextLine());
                                        for (int j = 0; j < n; j++) {
                                            System.out.println("Gelar ke-"+(j+1));
                                            System.out.println("Masukkan data secara benar!");
                                            System.out.print("Gelar          : ");
                                            String nama = inpString.nextLine();
                                            System.out.print("Tahun Masuk    : ");
                                            int msk = Integer.parseInt(inpString.nextLine());
                                            System.out.print("Tahun Lulus    : ");
                                            int klr = Integer.parseInt(inpString.nextLine());
                                            System.out.print("Nama Institusi : ");
                                            String institusi = inpString.nextLine();
                                            System.out.print("IPK            : ");
                                            String ipk = inpString.nextLine();
                                            try{
                                                double ip = Double.parseDouble(ipk);
                                                model.addGelar(new Gelar(nama, msk, klr, institusi, ip), pelamar);
                                                System.out.println("Berhasil! Tekan Enter...");
                                            }catch(Exception exc){
                                                System.out.print("Tidak dapat diinputkan. Tekan Enter...");
                                            }
                                            String inp = inpString.nextLine();
                                        }
                                    }catch(Exception e2){
                                        System.out.println("Perintah tdk tersedia. Tekan Enter...");
                                        String inp = inpString.nextLine();
                                    }
                                    break;
                                case 2 : // Bahasa
                                    System.out.print("Banyak Bahasa : ");
                                    try{
                                        int n = Integer.parseInt(inpString.nextLine());
                                        for (int j = 0; j < n; j++) {
                                            System.out.print("Bahasa ke-"+(j+1)+" = ");
                                            String nmBhs = inpString.nextLine();
                                            model.addBahasa(nmBhs);
                                            System.out.print("Berhasil. Tekan Enter...");
                                        }
                                    }catch(Exception excpt){
                                        System.out.println("perintah tdk tersedia. Tekan Enter...");
                                        String inp = inpString.nextLine();
                                    }
                                    String inp = inpString.nextLine();
                                    break;
                                case 3 : // Skill
                                    System.out.print("Banyak Keahlian : ");
                                    try{
                                        int n = Integer.parseInt(inpString.nextLine());
                                        for (int j = 0; j < n; j++) {
                                            System.out.print("Keahlian ke-"+(j+1)+" = ");
                                            String nmKeahlian = inpString.nextLine();
                                            model.addSkill(nmKeahlian);
                                            System.out.print("Berhasil. Tekan Enter...");
                                        }
                                    }catch(Exception e1){
                                        System.out.print("Perintah tdk tersedia. Tekan Enter...");
                                        inp = inpString.nextLine();
                                    }
                                    inp = inpString.nextLine();
                                    break;
                                case 4 : // Pengalman
                                    System.out.print("Banyak Pengalaman Kerja : ");
                                    try{
                                        int n = Integer.parseInt(inpString.nextLine());
                                        for (int j = 0; j < n; j++) {
                                            System.out.println("Pengalaman ke-"+(j+1));
                                            System.out.print("Nama Pekerjaan : ");
                                            String nama = inpString.nextLine();
                                            System.out.print("Tahun Masuk    : ");
                                            int msk = inpInteger.nextInt();
                                            System.out.print("Tahun Keluar   : ");
                                            int klr = inpInteger.nextInt();
                                            System.out.print("Divisi         : ");
                                            String divisi = inpString.nextLine();
                                            System.out.print("Kota           : ");
                                            String kota = inpString.nextLine();
                                            System.out.print("Provinsi       : ");
                                            String prov = inpString.nextLine();
                                            try{
                                                model.addPengalaman(new Pengalaman(nama, msk, klr, divisi, kota, prov));
                                                System.out.println("Berhasil");
                                            }catch(Exception excp){
                                                System.out.println("Data tidak dapat diinputkan");
                                            }
                                            inp = inpString.nextLine();
                                        } 
                                    }catch(Exception e3){
                                        System.out.println("Perintah tdk tersedia. Tekan Enter...");
                                        inp = inpString.nextLine();
                                    }
                                    break;
                                case 5 :
                                    System.out.println("Pengaturan / Profil");
                                    System.out.println("Nama          : "+((pelamar.getNama() == null) ? "N/A" : pelamar.getNama()));
                                    System.out.println("Email         : "+((pelamar.getEmail() == null) ? "N/A" : pelamar.getEmail()));
                                    System.out.println("Jenis Kelamin : "+((pelamar.getJk()== null) ? "N/A" : pelamar.getJk()));
                                    System.out.println("Tempat Lahir  : "+((pelamar.getTempatLahir()== null) ? "N/A" : pelamar.getTempatLahir()));
                                    System.out.println("Tanggal Lahir : "+((pelamar.getTglLahir()== null) ? "N/A" : dateFormat.format(pelamar.getTglLahir())));
                                    System.out.println("No Telp       : "+((pelamar.getNoTelp()== null) ? "N/A" : pelamar.getNoTelp()));
                                    System.out.println("Apakah anda akan mengubah ?");
                                    System.out.println("Pilihan (Ya/Tidak) : ");
                                    inpt = inpString.nextLine();
                                    if(inpt.equals("Ya") || inpt.equals("ya")){
                                        System.out.println("Isi data secara lengkap!");
                                        System.out.println("Pengaturan / Profil");
                                        System.out.print("Nama          : ");
                                        String nama = inpString.nextLine();
                                        System.out.print("Email         : ");
                                        String email = inpString.nextLine();
                                        System.out.print("Jenis Kelamin : ");
                                        String jk = inpString.nextLine();
                                        System.out.print("Tempat Lahir  : ");
                                        String tmpt = inpString.nextLine();
                                        System.out.print("Tanggal Lahir : ");
                                        String tggl = inpString.nextLine();
                                        try {
                                            tgl = dateFormat.parse(tggl);
                                        } catch (ParseException pars) {
                                            pars.printStackTrace();
                                        }
                                        System.out.print("No Telp       : ");
                                        String notelp = inpString.nextLine();
                                        model.ubahProfilPelamar(pelamar, nama, email, jk, tmpt, tgl, notelp);
                                        System.out.println("Data berhasil di ubah! Tekan Enter...");
                                    }
                                    inp = inpString.nextLine();
                                    break;
                                case 6 : //Buat berkas
                                    BerkasLamaran berkas = model.lihatBerkas(pelamar);
                                    if(model.getGelar()==null|| model.getBahasa()==null||model.getSkill()==null||model.getPengalamanKerja()==null){
                                        System.out.println("Isi gelar, bahasa, keahlian dan pengalaman secara lengkap!");
                                    }else if(berkas.getIdBerkas()==pelamar.getIdPelamar()){
                                        pelamar.getB().getBahasa().clear();
                                        pelamar.getB().getGelar().clear();
                                        pelamar.getB().getPengalamanKerja().clear();
                                        pelamar.getB().getSkill().clear();
                                        try{
                                            model.createBerkas(pelamar,model.getGelar(),model.getSkill(),model.getBahasa(),model.getPengalamanKerja());
                                            System.out.print("Berhasil. Tekan Enter...");
                                        }catch(Exception excep){
                                            System.out.print("Berkas tidak dapat di buat. Tekan Enter...");
                                            excep.printStackTrace();
                                        }
                                    }else{
                                        try{
                                            model.createBerkas(pelamar, model.getGelar(), model.getSkill(), model.getBahasa(), model.getPengalamanKerja());
                                            System.out.print("Berhasil. Tekan Enter...");
                                        }catch(Exception kc){
                                            System.out.print("Berkas tidak dapat di buat. Tekan Enter...");
                                        }
                                    }
                                    inp = inpString.nextLine();
                                    break;
                            }
                        }while(kluar == false);
                        break;
                    case 3 : // Setting Akun Pelamar memunculkan nama dan email (editable)
                        System.out.println("Pengaturan / Setting");
                        System.out.println("Nama          : "+((pelamar.getNama() == null) ? "N/A" : pelamar.getNama()));
                        System.out.println("Email         : "+((pelamar.getEmail() == null) ? "N/A" : pelamar.getEmail()));
                        System.out.println("Apakah anda akan mengubah ?");
                        System.out.println("Pilihan (Ya/Tidak) : ");
                        inpt = inpString.nextLine();
                        if(inpt.equals("Ya") || inpt.equals("ya")){
                            System.out.println("Isi data secara lengkap!");
                            System.out.println("Pengaturan / Setting");
                            System.out.print("Nama         : ");
                            String nama = inpString.nextLine();
                            System.out.print("Alamat Email : ");
                            String email = inpString.nextLine();
                            model.ubahSetPelamar(pelamar, nama, email);
                            System.out.print("Data berhasil diubah. Tekan Enter...");
                        }
                        inpt = inpString.nextLine();
                        break;
                    case 4 : // Lihat Berkas
                        System.out.println("Berkas kamu");
                        BerkasLamaran berkas = model.lihatBerkas(pelamar);
                        if(berkas.getGelar() == null|| berkas.getSkill() == null || berkas.getBahasa() == null || berkas.getPengalamanKerja()== null){
                            System.out.println("Anda belum selesai mengisi berkas");
                        }else{
                            for (int j = 0; j < berkas.getGelar().size(); j++) {
                                System.out.println("Gelar " + (j+1));
                                System.out.println("========");
                                System.out.println("\t Nama Gelar  : "+berkas.getGelar().get(j).getNamaGelar());
                                System.out.println("\t Tahun Masuk : "+berkas.getGelar().get(j).getThnMasuk());
                                System.out.println("\t Tahun Lulus : "+berkas.getGelar().get(j).getThnKeluar());
                                System.out.println("\t Institusi   : "+berkas.getGelar().get(j).getInstitusi());
                                System.out.println("\t IPK         : "+berkas.getGelar().get(j).getIpk());
                            }
                            System.out.println("Keahlian");
                            System.out.println("========");
                            for (int j = 0; j < berkas.getSkill().size(); j++) {
                                System.out.println("\t "+berkas.getSkill().get(j));
                            }
                            System.out.println("Bahasa");
                            System.out.println("======");
                            for (int j = 0; j < berkas.getBahasa().size(); j++) {
                                System.out.println("\t "+berkas.getBahasa().get(j));
                            }
                            for (int j = 0; j < berkas.getPengalamanKerja().size(); j++) {
                                System.out.println("Pengalaman Kerja "+(j+1));
                                System.out.println("================");
                                System.out.println("\t Pekerjaan    : "+berkas.getPengalamanKerja().get(j).getJob());
                                System.out.println("\t Tahun Masuk  : "+berkas.getPengalamanKerja().get(j).getThnMasuk());
                                System.out.println("\t Tahun Keluar : "+berkas.getPengalamanKerja().get(j).getThnKeluar());
                                System.out.println("\t Divisi       : "+berkas.getPengalamanKerja().get(j).getDivisi());
                                System.out.println("\t Kota         : "+berkas.getPengalamanKerja().get(j).getKota());
                                System.out.println("\t Provinsi     : "+berkas.getPengalamanKerja().get(j).getProv());
                            }
                        }
                        System.out.print("Tekan Enter...");
                        inpt = inpString.nextLine();
                        break;
                    default :
                        System.out.print("Perintah tidak tersedia. Tekan Enter...");
                        inpt = inpString.nextLine();
                        break;
                } 
            }catch(Exception e4){
                System.out.print("Kesalahan input. Tekan Enter...");
                String inpt = inpString.nextLine();
            }
        } while (keluar==false);
    }
    
    boolean DaftarAkun(boolean exit){
        System.out.println("Silahkan Pilih Jenis Pendaftaran.");
        System.out.println("1. Perusahaan");
        System.out.println("2. Pencari Kerja / Pelamar");
        System.out.println("0. Kembali");
        System.out.print("Masukkan pilihan : ");
        try{
            int pil = Integer.parseInt(inpString.nextLine());
            switch(pil){
                case 0 :
                    exit = true;
                    break;
                case 1 :
                    DaftarPerusahaan();
                    break;
                case 2 :
                    DaftarPelamar();
                    break;
                default :
                    System.out.println("Perintah tidak tersedia. Tekan Enter...");
                    String inpt = inpString.nextLine();
                    break;
            }
        }catch(Exception e5){
            System.out.println("Kesalah input. Tekan Enter...");
            String inpt = inpString.nextLine();
        }
        return exit;
    }
}
