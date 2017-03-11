/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_lowongan_kerja;

import java.util.Date;
/**
 *
 * @author Diah Ajeng
 */
public class Perusahaan extends Orang{
    // Deklarasi variable
    private Lowongan[] daftarlowongan;
    public Lowongan[] getDaftarlowongan(){    
        return daftarlowongan;
        
    }

    // Getter and Setter
    public void setDaftarlowongan(Lowongan[] daftarlowongan) {    
        this.daftarlowongan = daftarlowongan;
    }

    //Method
    public void createLowongan(Date deadline) {
    }
}
