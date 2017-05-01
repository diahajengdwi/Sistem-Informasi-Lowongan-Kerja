package Controller;

import View.Caripage;
import Model.Aplikasi;
import View.Homepage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class CariController extends MouseAdapter{
    
    private Caripage view;
    private Aplikasi model;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    
    public CariController(Caripage view, Aplikasi model){
        this.view = view;
        this.model = model;
        view.addAdapter(this);
        try{
            String[] ket;
            ket = new String[model.getDaftarPerusahaan().size()];
            for (int i = 0; i < model.getDaftarPerusahaan().size(); i++) {
                ket[i]="Perusahaan "+ model.getDaftarPerusahaan().get(i).getNmPerusahaan();
            }
            view.setListPerusahaan(ket);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data Kosong");
        }
        this.view.addListenClose(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                Homepage viewHome = new Homepage();
                HomeController home = new HomeController(viewHome, model);
                viewHome.setVisible(true);
            }
        });
    }
    
    public void mousePressed(MouseEvent e) {
        Object source = e.getSource();
        String per = "";
        String lowket = "";
        String low = "";
        int jml = view.getSelectedPerusahaan();
        if(model.getDaftarPerusahaan().get(jml).getDaftarLowongan() == null){
            view.setViewLowongan("Tidak ada lowongan pada perusahaan ini");
        }else{
            try{
                int SL = model.getDaftarPerusahaan().get(jml).getDaftarLowongan().size();
                for (int j = 0; j < SL; j++) {
                    low = low + "Deadline : " + dateFormat.format(model.getDaftarPerusahaan().get(jml).getdaftarLowongan(j).getDeadline()) + "\n";
                }
                lowket = low;
                view.setViewLowongan(lowket);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            }
            
        }    
    }
}
