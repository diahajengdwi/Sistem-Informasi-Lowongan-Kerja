package Model;

import Connection.Database;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Diah Ajeng
 */
public class Aplikasi {
    // Deklarasi variable
    private List<Pelamar> daftarPelamar = new ArrayList<>();
    private List<Perusahaan> daftarPerusahaan = new ArrayList();
    private List<Gelar> gelar = new ArrayList<>();
    private List<String> skill = new ArrayList<>();
    private List<String> bahasa = new ArrayList<>();
    private List<Pengalaman> pengalamanKerja = new ArrayList<>();
    private Database db;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private static int idBahasa;
    private static int idSkill;
    
    public Aplikasi() {
        db = new Database();
        db.connect();
        daftarPerusahaan = new ArrayList();
        daftarPelamar = new ArrayList();
        gelar = new ArrayList();
        skill = new ArrayList();
        bahasa = new ArrayList();
        pengalamanKerja = new ArrayList();
    }
    
    public void buatakunContoh(){
        Perusahaan p = new Perusahaan(daftarPerusahaan.size(), "PT Bank Indonesia", "08", "Perbankan", "Keuangan", 5, "Diah", "diahajeng", "apa");
        addPerusahaan(p);
        Perusahaan p1 = new Perusahaan(daftarPerusahaan.size(), "PT Madurasa", "08", "Perbankan", "Keuangan", 5, "Diah", "ajeng", "apa");
        addPerusahaan(p1);
        
        Date date2 = null;
        try{
            date2 = dateFormat.parse("08-12-2017");
            createLowongan(daftarPerusahaan.get(0), date2);
            date2 = dateFormat.parse("02-02-2017");
            createLowongan(daftarPerusahaan.get(0), date2);
            date2 = dateFormat.parse("02-09-2017");
            createLowongan(daftarPerusahaan.get(1), date2);
            date2 = dateFormat.parse("08-09-2017");
            createLowongan(daftarPerusahaan.get(1), date2);
        }catch(ParseException e){
            e.printStackTrace();
        }
        
        // buat pelamar
        Pelamar pel = new Pelamar(daftarPelamar.size(), "Ajeng", "diahajeng","haha");
        addPelamar(pel);
    }
    
    // Berkas
  
    public List<Gelar> getGelar() {
        if(gelar.isEmpty()){
            return null;
        }else{
            return gelar;
        }
    }

    public List<String> getSkill() {
        if(skill.isEmpty()){
            return null;
        }else{
            return skill;
        }
    }
    
    public List<String> getBahasa() {
        if(bahasa.isEmpty()){
            return null;
        }else{
            return bahasa;
        }
    }
    
    public List<Pengalaman> getPengalamanKerja() {
        if(pengalamanKerja.isEmpty()){
            return null;
        }else{
            return pengalamanKerja;
        }
    }
    
    public void addGelar(Gelar g, Pelamar p){
        gelar.add(g);
        db.saveGelar(g, p);
    }
    
    public void addPengalaman(Pengalaman p){
        pengalamanKerja.add(p);
        db.savePengalaman(p);
    }
    
    public void addSkill(String s){
        skill.add(s);
        idSkill++;
        db.saveSkill(s, idSkill);
    }
    
    public void addBahasa(String b){
        bahasa.add(b);
        idBahasa++;
        db.saveBahasa(b, idBahasa);
    }   
    
    // Perusahaan
    public void addPerusahaan(Perusahaan p){
        daftarPerusahaan.add(p);
        db.savePerusahaan(p);
    }
    
    public List<Perusahaan> getDaftarPerusahaan(){
        if(daftarPerusahaan.isEmpty()){
            return null;
        }else{
            return daftarPerusahaan;
        }
    }
    
    public void createLowongan(Perusahaan p, Date tgl){
        p.createLowongan(p.getId(), tgl);
        db.saveLowongan(p, tgl);
    }
    
    public List<Lowongan> getDaftarLowongan(Perusahaan p){
        List<Lowongan> lowongan = new ArrayList<Lowongan>();
        if(p.getDaftarLowongan() == null){
            return null;
        }else{
            for(Lowongan l : p.getDaftarLowongan()){
                lowongan.add(l);
            }
            db.loadLowongan(p.getId());
            return lowongan;
        }
    }
    
    public void hapusLowongan(Perusahaan p, int pil){
        p.removeLowongan(pil);
        db.deleteLowongan(p, pil);
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
        System.out.println("2. Lihat Lowongan dan Detailnya");
        System.out.println("3. Buat Lowongan");
        System.out.println("4. Hapus Lowongan");
        System.out.println("5. Lihat Berkas Lamaran Masuk");
        System.out.println("6. Lihat Berkas Lamaran Di Terima");
        System.out.println("0. keluar");
        System.out.print("Masukkan Pilihan : ");
    }
    
    public void ubahProfilPerusahaan(Perusahaan p,String nama, String email,String tmpt,Date tgl,String notelp){
        p.setNama(nama);
        p.setEmail(email);
        p.setTempatLahir(tmpt);
        p.setTglLahir(tgl);
        p.setNoTelp(notelp);
        db.updateProfilPerusahaan(p);
    }
    
    public void ubahSetPerusahaan(Perusahaan p, String nama, String email){
        p.setNmPerusahaan(nama);
        p.setEmail(email);
        db.setPerusahaan(p);
    }
    
    public Perusahaan LoginPerusahaan(String email, String pass){
        int i = 0;
        Perusahaan p = null;
        boolean find = false;
        if(getDaftarPerusahaan()==null){
            while ((find == false) && i < getDaftarPerusahaan().size()) {
                if (getDaftarPerusahaan().get(i).getEmail().equals(email) && getDaftarPerusahaan().get(i).getPassword().equals(pass)) {
                    find = true;
                    p = getDaftarPerusahaan().get(i);
                }else {
                    i++;
                }
            }
        }else{
            if(find==true || (i<getDaftarPerusahaan().size()) || (getDaftarPerusahaan()==null)){
                p = db.loadPerusahaan(email, pass);
                if(p!=null){
                    daftarPerusahaan.add(p);
                }
                return p;
            }
        }
        return p;
    }
    
    // Pelamar
    
    public void ubahProfilPelamar(Pelamar p,String nama, String email, String jk, String tmpt,Date tgl,String notelp){
        p.setNama(nama);
        p.setEmail(email);
        p.setJk(jk);
        p.setTempatLahir(tmpt);
        p.setTglLahir(tgl);
        p.setNoTelp(notelp);
        db.updateProfilPelamar(p);
    }
    
    public void ubahSetPelamar(Pelamar p, String nama, String email){
        p.setNama(nama);
        p.setEmail(email);
        db.setPelamar(p);
    }
    
    public List<Pelamar> getDaftaPelamar(){
        if(daftarPelamar.isEmpty()){
            return null;
        }else{
            return daftarPelamar;
        }
    }
        
    public void addPelamar(Pelamar p){
        daftarPelamar.add(p);
        db.savePelamar(p);
    }

    public Pelamar getDaftarPelamar(int id) {
        return daftarPelamar.get(id);
    }
    
    public void deletePelamar(int id){
        daftarPelamar.remove(id);
    }   
    
    public BerkasLamaran lihatBerkas(Pelamar p){
        return p.getB();
    }
    
    public void createBerkas(Pelamar p, List<Gelar> gelar, List<String> skill,List<String> bhs,List<Pengalaman> pengalaman){
        p.createBerkas(p.getIdPelamar(), gelar, skill, bhs, pengalaman);
        db.saveBerkas(p.getIdPelamar(), gelar, skill, bhs, pengalaman);
    }
    
    public void addBerkasMasuk(Pelamar p){
        db.saveBerkasMasuk(p);
    }
    
    public void addBerkasdiTerima(Pelamar p){
        db.saveBerkasdiTerima(p);
    }
    
    public Pelamar LoginPelamar(String email, String pass){
        int i = 0;
        Pelamar p = null;
        boolean find = false;
        if(getDaftaPelamar()!=null){
            while ((find == false) && i < getDaftaPelamar().size()) {
                if (getDaftarPelamar(i).getEmail().equals(email) && getDaftarPelamar(i).getPassword().equals(pass)) {
                    find = true;
                    p = getDaftarPelamar(i);
                }else {
                    i++;
                }
            }
        }else{
            if((find==false) || (i<getDaftaPelamar().size()) || (getDaftaPelamar()==null)){
                p = db.loadPelamar(email, pass);
                if(p!=null){
                    daftarPelamar.add(p);
                }
                return p;
            }
        }
        return p;
    }
     
    public void PelamarMenu(){
        System.out.println("Pilihan ");
        System.out.println("1. Login");
        System.out.println("2. Daftar Akun Pelamar");
        System.out.println("0. Kembali");
        System.out.print("Masukkan Pilihan : ");
    }
    
    public void PelamarMainMenu(){
        System.out.println("Pilihan ");
        System.out.println("1. Daftar Lamaran");
        System.out.println("2. Profil");
        System.out.println("3. Setting");
        System.out.println("4. Lihat Berkas");
        System.out.println("0. keluar");
        System.out.print("Masukkan Pilihan : ");
    }
    
    public void pelamarProfil(){
        System.out.println("Pengaturan / Profil");
        System.out.println("1. Gelar");
        System.out.println("2. Bahasa");
        System.out.println("3. Keahlian");
        System.out.println("4. Pengalaman Kerja");
        System.out.println("5. View Profil");
        System.out.println("6. Buat Berkas");
        System.out.println("0. Kembali");
        System.out.print("Masukkan Pilihan : ");
    }
    
    public void pelamarBerkas(){
        System.out.println("Pengaturan / Profil");
        System.out.println("1. Gelar");
        System.out.println("2. Bahasa");
        System.out.println("3. Keahlian");
        System.out.println("4. Pengalaman Kerja");
        System.out.println("5. Buat Lamaran");
        System.out.println("0. Kembali");
        System.out.print("Masukkan Pilihan : ");
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
