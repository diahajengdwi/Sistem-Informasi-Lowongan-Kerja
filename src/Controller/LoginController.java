package Controller;

import Model.Aplikasi;
import Model.Pelamar;
import Model.Perusahaan;
import View.Daftarpage;
import View.Homepage;
import View.Loginpage;
import View.Pelamarpage;
import View.Perusahaanpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class LoginController {
    private Loginpage view;
    private Aplikasi model;
    
    public LoginController(Loginpage view, Aplikasi model){
        this.view = view;
        this.model = model;
        this.view.addListendaftar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                Daftarpage viewDaftar = new Daftarpage();
                DaftarController daftar = new DaftarController(viewDaftar, model);
                viewDaftar.setVisible(true);
            }        
        });
        this.view.addListenkeluar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                Homepage viewHome = new Homepage();
                HomeController home = new HomeController(viewHome, model);
                viewHome.setVisible(true);
            }        
        });
        this.view.addListenmasuk(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean find = false;
                int i = 0;
                try{
                   if(view.getEmail().isEmpty() || view.getPassword().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Field tidak boleh ada yang kosong");
                    }else if(view.getPilihan().equals("Perusahaan")){
                        if(model.getDaftarPerusahaan().size() == 0){
                            JOptionPane.showMessageDialog(null, "Anda belum terdaftar");
                        }else{
                            Perusahaan perusahaan = model.LoginPerusahaan(view.getEmail(), view.getPassword());
                            if(perusahaan !=null){
                                JOptionPane.showMessageDialog(null, "Berhasil");
                                view.dispose();
                                PerusahaanController prController = new PerusahaanController(model, perusahaan);
                            }else{
                                JOptionPane.showMessageDialog(null, "Periksa kembali email dan password anda");
                                view.reset();
                            }
                        }
                    }else if(view.getPilihan().equals("Pelamar")){
                        if(model.getDaftaPelamar().size() == 0){
                            JOptionPane.showMessageDialog(null, "Anda belum terdaftar");
                        }else{
                            Pelamar pelamar = model.LoginPelamar(view.getEmail(), view.getPassword());
                            if(pelamar !=null){
                                JOptionPane.showMessageDialog(null, "Berhasil");
                                view.dispose();
                                PelamarController prController = new PelamarController(model, pelamar);
                            }else{
                                JOptionPane.showMessageDialog(null, "Periksa kembali email dan password anda");
                                view.reset();
                            }
                        }
                    } 
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
                }
            }        
        });
    }
}
