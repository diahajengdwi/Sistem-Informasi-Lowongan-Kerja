package Model;

import View.AplikasiKonsol;
import Controller.HomeController;
import Model.Model;
import View.Homepage;
import View.LokerApp;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class Driver {
    public static void main(String[] args) throws ParseException {
        LokerApp view = new LokerApp();
        view.setVisible(true);
        try{
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                view.lblload.setText(Integer.toString(i)+"%");
                view.load.setValue(i);
            }
            view.dispose();
            Homepage viewHome = new Homepage();
            Aplikasi model = new Aplikasi();
            HomeController controller = new HomeController(viewHome, model);
            viewHome.setVisible(true);
            AplikasiKonsol aplikasi = new AplikasiKonsol(model);
            aplikasi.MainMenu();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan!");
        }
    }
}
