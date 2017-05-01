package Connection;

import Model.BerkasLamaran;
import Model.Gelar;
import Model.Lowongan;
import Model.Pelamar;
import Model.Pengalaman;
import Model.Perusahaan;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class Database {
    
    private Connection con;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    Date date2 = null;

    public void connect() {
        String url = "jdbc:mysql://localhost:3306/Loker";
        String username = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(url, username, password);
            con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            con.setAutoCommit(false);
            //System.out.println("connected");

        } catch (SQLException ex) {
            System.out.println("gagal konek");
        }
    }
    
    // Pelamar    
    
    public void saveBerkas(int idPelamar, List<Gelar> gelar, List<String> skill, List<String> bhs, List<Pengalaman> pengalaman) {
        try{
            for (int i = 0; i < gelar.size(); i++) {
                Statement stmt = con.createStatement();
                String query = "insert into berkaslamaran values("
                        + 0 + ", " 
                        + idPelamar + ", " // idBerkas = idPelamar
                        + idPelamar + ", " // idPelamar
                        + gelar.get(i).getIdGelar() + ", " // idGelar
                        + 0 + ", " // idPengalaman
                        + 0 + ", " // idSkill
                        + 0 // idBahasa
                        + ");";
                stmt.execute(query);
                con.commit();
                stmt.close();
            }
            for (int i = 0; i < pengalaman.size(); i++) {
                Statement stmt = con.createStatement();
                String query = "insert into berkaslamaran values("
                        + 0 + ", " 
                        + idPelamar + ", " // idBerkas = idPelamar
                        + idPelamar + ", " // idPelamar
                        + 0 + ", " // idGelar
                        + pengalaman.get(i).getIdPengalaman() + ", " // idPengalaman
                        + 0 + ", " // idSkill
                        + 0  // idBahasa
                        + ");";
                stmt.execute(query);
                con.commit();
                stmt.close();
            }
            for (int i = 0; i < skill.size(); i++) {
                Statement stmt = con.createStatement();
                String query = "insert into berkaslamaran values("
                        + 0 + ", " 
                        + idPelamar + ", " // idBerkas = idPelamar
                        + idPelamar + ", " // idPelamar
                        + 0 + ", " // idGelar
                        + 0 + ", " // idPengalaman
                        + (i+1)  + ", " // idSkill
                        + 0 // idBahasa
                        + ");";
                stmt.execute(query);
                con.commit();
                stmt.close();
            }
            for (int i = 0; i < bhs.size(); i++) {
                Statement stmt = con.createStatement();
                String query = "insert into berkaslamaran values("
                        + 0 + ", " 
                        + idPelamar + ", " // idBerkas = idPelamar
                        + idPelamar + ", " // idPelamar
                        + 0 + ", " // idGelar
                        + 0 + ", " // idPengalaman
                        + 0 + ", " // idSkill
                        + (i+1)// idBahasa
                        + ");";
                stmt.execute(query);
                con.commit();
                stmt.close();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ada error di save berkas lamaran!");
            e.printStackTrace();
        }
    }
    
    public BerkasLamaran loadBerkasLamaran(Pelamar p){
        BerkasLamaran berkas;
        List<Gelar> gelar = new ArrayList<>();
        List<Pengalaman> pengalaman = new ArrayList<>();
        List<String> skill = new ArrayList<>();
        List<String> bhs = new ArrayList<>();
        int idBerkas = 0;
        try{
            Statement stmt = con.createStatement();
            String query = "select idBerkas,idGelar, idPengalaman, idSkill, idBahasa from berkaslamaran where idPelamar = "+p.getIdPelamar()+";";
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                idBerkas = rs.getInt(1);
                gelar.add(loadGelar(rs.getInt(2)));
                pengalaman.add(loadPengalaman(rs.getInt(3)));
                skill.add(loadSkill(rs.getInt(4)));
                bhs.add(loadBahasa(rs.getInt(5)));
            }
            berkas = new BerkasLamaran();
            berkas.setGelar(gelar);
            berkas.setBahasa(bhs);
            berkas.setPengalamanKerja(pengalaman);
            berkas.setSkill(skill);
            return berkas;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data Tidak Dapat di Load!");
            return null;
        }
    }
    
    public void saveBerkasMasuk(Pelamar p) {
        try{
            Statement stmt = con.createStatement();
            String query = "insert into berkaslamaranmasuk values("
                    + 0 + ", " 
                    + p.getB().getIdBerkas() + ", " // idBerkas = idPelamar
                    + p.getIdPelamar() // idPelamar
                    + ");";
            stmt.execute(query);
            con.commit();
            stmt.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ada error di save berkas lamaran masuk!");
            e.printStackTrace();
        }
    }
    
    public BerkasLamaran loadBerkasLamaranMasuk(Pelamar p){
        BerkasLamaran berkas;
        int idBerkas = 0;
        int idLowongan = 0;
        try{
            Statement stmt = con.createStatement();
            String query = "select idBerkas,idLowongan from berkaslamaranmasuk where idBerkas = "+p.getB().getIdBerkas()+";";
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                idBerkas = rs.getInt(1);
                idLowongan = rs.getInt(2);
            }
            berkas = loadBerkasLamaran(p);
            return berkas;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data Tidak Dapat di Load!");
            return null;
        }
    }
    
    public void saveBerkasdiTerima(Pelamar p) {
        try{
            Statement stmt = con.createStatement();
            String query = "insert into berkaslamaranditerima values("
                    + 0 + ", " 
                    + p.getB().getIdBerkas() + ", " // idBerkas = idPelamar
                    + p.getIdPelamar() // idPelamar
                    + ");";
            stmt.execute(query);
            con.commit();
            stmt.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ada error di save berkas lamaran diterima!");
            e.printStackTrace();
        }
    }
    
    public BerkasLamaran loadBerkasLamaranDiTerima(Pelamar p){
        BerkasLamaran berkas;
        int idBerkas = 0;
        int idLowongan = 0;
        try{
            Statement stmt = con.createStatement();
            String query = "select idBerkas,idLowongan from berkaslamaranditerima where idBerkas = "+p.getB().getIdBerkas()+";";
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                idBerkas = rs.getInt(1);
                idLowongan = rs.getInt(2);
            }
            berkas = loadBerkasLamaran(p);
            return berkas;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data Tidak Dapat di Load!");
            return null;
        }
    }
    
    public void saveGelar(Gelar g, Pelamar p){
        try {
            Statement stmt = con.createStatement();
            String query = "insert into gelar values("
                    + g.getIdGelar() + ",'" 
                    + g.getNamaGelar()+ "'," 
                    + g.getThnMasuk()+ "," 
                    + g.getThnKeluar()+ ",'" 
                    + g.getInstitusi()+ "'," 
                    + g.getIpk() 
                    + ");";
            stmt.execute(query);
            con.commit();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("ada error save gelar");
            ex.printStackTrace();
        }
    }
    
    public Gelar loadGelar(int idGelar){
        Gelar g;
        String namaGelar = "";
        int thnMasuk = 0;
        int thnKeluar = 0;
        String institusi = "";
        double ipk = 0;
        try{
            Statement stmt = con.createStatement();
            String query = "select * from gelar where idGelar = "+idGelar+";";
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                namaGelar = rs.getString(2);
                thnMasuk = rs.getInt(3);
                thnKeluar = rs.getInt(4);
                institusi = rs.getString(5);
                ipk = rs.getDouble(6);
            }
            g = new Gelar(namaGelar,thnMasuk,thnKeluar,institusi,ipk);
            return g;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data tidak dapat ke load!");
            return null;
        }
    }
    
    public void savePengalaman(Pengalaman p){
        try {
            Statement stmt = con.createStatement();
            String query = "insert into pengalaman values("
                    + p.getIdPengalaman() + ",'" 
                    + p.getJob()+ "'," 
                    + p.getThnMasuk()+ "," 
                    + p.getThnKeluar()+ ",'" 
                    + p.getDivisi()+ "','" 
                    + p.getKota()+ "','" 
                    + p.getProv()
                    + "');";
            stmt.execute(query);
            con.commit();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("ada error save pengalaman");
            ex.printStackTrace();
        }
    }
    
    public Pengalaman loadPengalaman(int idPengalaman){
        Pengalaman p;
        String job = "";
        int thnMasuk = 0;
        int thnKeluar = 0;
        String divisi =  "";
        String kota = "";
        String prov = "";
        try{
            Statement stmt = con.createStatement();
            String query = "select * from pengalaman where idpengalaman = "+idPengalaman+";";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                job = rs.getString(2);
                thnMasuk = rs.getInt(3);
                thnKeluar = rs.getInt(4);
                divisi = rs.getString(5);
                kota = rs.getString(6);
                prov = rs.getString(7);
            }
            p = new Pengalaman(job, thnMasuk, thnKeluar, divisi, kota, prov);
            return p;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data tidak dapat ke load!");
            return null;
        }       
    }
    
    public void saveSkill(String skill, int idSkill){
        try {
            Statement stmt = con.createStatement();
            String query = "insert into skill values("
                    + idSkill + ",'" 
                    + skill
                    + "');";
            stmt.execute(query);
            con.commit();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("ada error save skill");
            ex.printStackTrace();
        }
    }
    
    public String loadSkill(int idSkill){
        String skill = "";
        try{
            Statement stmt = con.createStatement();
            String query = "select * from skill where idSkill = "+idSkill+";";
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                skill = rs.getString(2);
            }
            skill = skill;
            return skill;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data tidak dapat ke load!");
            return null;
        }
    }
    
    public void saveBahasa(String bhs, int idBhs){
        try {
            Statement stmt = con.createStatement();
            String query = "insert into bahasa values("
                    + idBhs + ",'" 
                    + bhs
                    + "');";
            stmt.execute(query);
            con.commit();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("ada error save bahasa");
            ex.printStackTrace();
        }
    }
    
    public String loadBahasa(int idBhs){
        String bahasa = "";
        try{
            Statement stmt = con.createStatement();
            String query = "select * from bahasa where idbahasa = "+idBhs+";";
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                bahasa = rs.getString(2);
            }
            bahasa = bahasa;
            return bahasa;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data tidak dapat ke load!");
            return null;
        }
    }
    
    public Pelamar loadPelamar(String emil, String pass){
        int idPelamar = 0;
        String nama = "";
        String jk = "";
        String tempatLahir = "";
        String tglLahir = null;
        String noTelp = "";
        String email = "";
        String password = "";
        try{
            Statement stmt = con.createStatement();
            String query = "select * from pelamar where email = '"+emil+"' and password = '"+pass+"';";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                idPelamar = rs.getInt(1);
                nama = rs.getString(2);
                jk = rs.getString(3);
                tempatLahir = rs.getString(4);
                tglLahir = rs.getString(5);
                noTelp = rs.getString(6);
                email = rs.getString(7);
                password = rs.getString(8);
            }
            Pelamar p = new Pelamar(idPelamar, nama, email, password);
            p.setJk(jk);
            p.setTempatLahir(tempatLahir);
            p.setNoTelp(noTelp);
            return p;
        }catch(Exception e){
            System.out.println("Data tidak dapat ke load!");
            return null;
        }
    }
    
    public void savePelamar(Pelamar p){
        try {
            Statement stmt = con.createStatement();
            String query = "insert into pelamar values(" 
                    + p.getIdPelamar()+ ",'" 
                    + p.getNama()+ "','" 
                    + p.getJk()+ "','" 
                    + p.getTempatLahir()+ "'," 
                    + p.getTglLahir()+ ",'" 
                    + p.getNoTelp()+ "','" 
                    + p.getEmail()+ "','" 
                    + p.getPassword() 
                    + "');";
            stmt.execute(query);
            con.commit();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("ada error save pelamar");
            ex.printStackTrace();
        }
    }
    
    public void setPelamar(Pelamar p){
        try {
            Statement stmt = con.createStatement();
            String query = "update pelamar "
                    + "set nama='" + p.getNama()+ "', "
                    + "email='" + p.getEmail() + "' "
                    + "where idPelamar=" + p.getIdPelamar()+ ";";
            stmt.executeUpdate(query);
            con.commit();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ada error pada setting pelamar");
            ex.printStackTrace();
        }
    }
    
    public void updateProfilPelamar(Pelamar p){
        try {
            Statement stmt = con.createStatement();
            String query = "update pelamar "
                    + "set nama='" + p.getNama()+ "', "
                    + "jk='" + p.getJk()+ "', "
                    + "tempatLahir='" + p.getTempatLahir()+ "', "
                    + "tglLahir='" + p.getTglLahir()+ "', "
                    + "noTelp='" + p.getNoTelp()+ "', "
                    + "email='" + p.getEmail() + "' "
                    + "where idPelamar=" + p.getIdPelamar()+ ";";
            stmt.executeUpdate(query);
            con.commit();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ada error pada edit profil pelamar");
            ex.printStackTrace();
        }
    }
    
    // Perusahaan
    
    public List<Perusahaan> loadPerusahaan(){
        List<Perusahaan> p = new ArrayList<>();
        int idPerusahaan = 0;
        String nmPerusahaan = "";
        String jenis = "";
        String kat = "";
        int karyawan = 0;
        String nama = "";
        String jk = "";
        String tempatLahir = "";
        String tglLahir = null;
        String noTelp = "";
        String email = "";
        String password = "";
        try{
            Statement stmt = con.createStatement();
            String query = "select * from perusahaan;";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                idPerusahaan = rs.getInt(1);
                nmPerusahaan = rs.getString(2);
                jenis = rs.getString(3);
                kat = rs.getString(4);
                karyawan = rs.getInt(5);
                nama = rs.getString(6);
                jk = rs.getString(7);
                tempatLahir = rs.getString(8);
                tglLahir = rs.getString(9);
                noTelp = rs.getString(10);
                email = rs.getString(11);
                password = rs.getString(12);
                p.add(new Perusahaan(idPerusahaan, nmPerusahaan, noTelp, jenis, kat, karyawan, nama, email, password));
                p.get(p.size()-1).setTempatLahir(tempatLahir);
                p.get(p.size()-1).setTglLahir(dateFormat.parse(tglLahir));
                p.get(p.size()-1).setJk(jk);
            }
            return p;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ada error pada edit profil pelamar");
            e.printStackTrace();
            return null;
        }
    }
    
    public Perusahaan loadPerusahaan(String emil, String pass){
        int idPerusahaan = 0;
        String nmPerusahaan = "";
        String jenis = "";
        String kat = "";
        int karyawan = 0;
        String nama = "";
        String jk = "";
        String tempatLahir = "";
        String tglLahir = null;
        String noTelp = "";
        String email = "";
        String password = "";
        try{
            Statement stmt = con.createStatement();
            String query = "select * from perusahaan where email = '"+emil+"' and password = '"+pass+"';";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                idPerusahaan = rs.getInt(1);
                nmPerusahaan = rs.getString(2);
                jenis = rs.getString(3);
                kat = rs.getString(4);
                karyawan = rs.getInt(5);
                nama = rs.getString(6);
                jk = rs.getString(7);
                tempatLahir = rs.getString(8);
                tglLahir = rs.getString(9);
                noTelp = rs.getString(10);
                email = rs.getString(11);
                password = rs.getString(12);
            }
            Perusahaan p = new Perusahaan(idPerusahaan, nmPerusahaan, noTelp, jenis, kat, karyawan, nama, email, password);
            p.setTempatLahir(tempatLahir);
            p.setJk(jk);
            return p;
        }catch(Exception e){
            System.out.println("Data tidak dapat ke load!");
            return null;
        }
    }
    
    public void savePerusahaan(Perusahaan p){
        try {
            Statement stmt = con.createStatement();
            String query = "insert into perusahaan values("+ "" 
                    + p.getId() + ",'" 
                    + p.getNmPerusahaan() + "','" 
                    + p.getJenis() + "','" 
                    + p.getKat()+ "'," 
                    + p.getKaryawan()+ ",'" 
                    + p.getNama()+ "','" 
                    + p.getJk()+ "','" 
                    + p.getTempatLahir()+ "'," 
                    + p.getTglLahir()+ ",'" 
                    + p.getNoTelp()+ "','" 
                    + p.getEmail()+ "','" 
                    + p.getPassword() 
                    + "');";
            stmt.execute(query);
            con.commit();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("ada error save perusahaan");
            ex.printStackTrace();
        }
    }
    
    public void setPerusahaan(Perusahaan p){
        try {
            Statement stmt = con.createStatement();
            String query = "update perusahaan "
                    + "set nmPerusahaan='" + p.getNmPerusahaan() + "', "
                    + "email='" + p.getEmail() + "' "
                    + "where idPerusahaan=" + p.getId()+ ";";
            stmt.executeUpdate(query);
            con.commit();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ada error pada setting perusahaan");
            ex.printStackTrace();
        }
    }
    
    public void updateProfilPerusahaan(Perusahaan p){
        try {
            Statement stmt = con.createStatement();
            String query = "update perusahaan "
                    + "set nama='" + p.getNama()+ "', "
                    + "tempatLahir='" + p.getTempatLahir()+ "', "
                    + "tglLahir='" + p.getTglLahir()+ "', "
                    + "noTelp='" + p.getNoTelp()+ "', "
                    + "email='" + p.getEmail() + "' "
                    + "where idPerusahaan=" + p.getId()+ ";";
            stmt.executeUpdate(query);
            con.commit();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ada error pada edit profil perusahaan");
            ex.printStackTrace();
        }
    } 
    
    public void saveLowongan(Perusahaan p,Date deadline){
        try {
            Statement stmt = con.createStatement();
            String query = "insert into lowongan values("+
                    + (p.getDaftarLowongan().size()-1) + ",'" 
                    + deadline+ "'," 
                    + p.getId()
                    + ");";
            stmt.execute(query);
            con.commit();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("ada error save perusahaan");
            ex.printStackTrace();
        }
    }
    
    public void deleteLowongan(Perusahaan p, int pil) {
        try {
            Statement stmt = con.createStatement();
            String query = "delete from lowongan where idPerusahaan = " + p.getId() + " and idLowongan = "+pil+";";
            System.out.println(query);
            stmt.execute(query);
            System.out.println("Berhasil");
        } catch (Exception e) {
            System.out.println("ada error load");
            e.printStackTrace();
        }
    }
    
    public Date loadLowongan(int idPerusahaan){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date2 = null;
        try{
            Statement stmt = con.createStatement();
            String query = "select deadline from lowongan where idPerusahaan = "+idPerusahaan+";";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                date2 = rs.getDate(1);
            }
            return date2;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data tidak dapat ke load!");
            return null;
        }
    } 
}
