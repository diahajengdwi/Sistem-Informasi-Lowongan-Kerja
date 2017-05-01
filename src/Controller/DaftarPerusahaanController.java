package Controller;

import Model.Aplikasi;
import Model.Perusahaan;
import View.DaftarPerusahaanpage;
import View.Daftarpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class DaftarPerusahaanController {
    private DaftarPerusahaanpage view;
    private Aplikasi model;
    
    public DaftarPerusahaanController(DaftarPerusahaanpage view, Aplikasi model){
        this.view = view;
        this.model = model;
        this.view.addListenkeluar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                Daftarpage viewDaftar = new Daftarpage();
                DaftarController daftar = new DaftarController(viewDaftar, model);
                viewDaftar.setVisible(true);
            }        
        });
        this.view.addListenbatal(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedOption = JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan membatalkan pendaftaran?", "Informasi", JOptionPane.YES_NO_OPTION);
                if (selectedOption == JOptionPane.YES_OPTION) {
                    view.reset();
                }
            }
        });
        this.view.addListendaftar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(view.getPass().equals(view.getPwd())){
                    try{
                        if(model.getDaftarPerusahaan()==null){
                            model.addPerusahaan(new Perusahaan(0, view.getNamaPerusahaan(), view.getNoTelp(), view.getJenis(), view.getKategori(), view.getKaryawan(), view.getNama(), view.getEmail(), view.getPwd()));
                        }else{
                            model.addPerusahaan(new Perusahaan(model.getDaftarPerusahaan().size(), view.getNamaPerusahaan(), view.getNoTelp(), view.getJenis(), view.getKategori(), view.getKaryawan(), view.getNama(), view.getEmail(), view.getPwd()));
                        }
                        JOptionPane.showMessageDialog(null, "Berhasil!");
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Terdapat kesalahan!");
                    }
                    view.reset();
                }else if(view.getEmail().equals("") || view.getNama().equals("") || view.getPass().equals("") || view.getPwd().equals("")){
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong!");
                    view.reset();
                }else{
                    JOptionPane.showMessageDialog(null, "Kata Sandi Tidak Sama!");
                    view.setPass();
                } 
            }
        });
    }
}
