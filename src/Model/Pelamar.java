package Model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Diah Ajeng
 */
public class Pelamar extends Orang {
    // Deklarasi Variable
    private BerkasLamaran b;
    private int idPelamar;
    
    // Constructor
    public Pelamar(int id, String nama, String jk, String tempatLahir, Date tglLahir, String noTelp, String email, String password){
        super(id, nama, jk, tempatLahir, tglLahir, noTelp, email, password);
        this.idPelamar = id;
        b = new BerkasLamaran();
    }
    
    public Pelamar(int id, String nama, String email, String password){
        super(id, nama, email, password);
        this.idPelamar = id;
        b = new BerkasLamaran();
    }

    // Getter and Setter
    public void setIdPelamar(int idPelamar) {    
        this.idPelamar = idPelamar;
    }
    
    public int getIdPelamar(){    
        return idPelamar;
    }

    public BerkasLamaran getB() {
        return b;
    }

    public void setB(BerkasLamaran b) {
        this.b = b;
    }    
    
    // Method
    public void createBerkas(int idpelamar,List<Gelar> gelar, List<String> skill, List<String> bahasa, List<Pengalaman> pengalamanKerja) {
        getB().setIdBerkas(idpelamar);
        for (int i = 0; i < gelar.size(); i++) {
            getB().addGelar(gelar.get(i));
        }
        for (int i = 0; i < pengalamanKerja.size(); i++) {
            getB().addPengalaman(pengalamanKerja.get(i));
        }
        for (int i = 0; i < skill.size(); i++) {
            getB().addSkill(skill.get(i));
        }
        for (int i = 0; i < bahasa.size(); i++) {
            getB().addBahasa(bahasa.get(i));
        } 
    }
}
