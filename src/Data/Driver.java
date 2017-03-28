/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

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
            Model model = new Model();
            HomeController controller = new HomeController(viewHome, model);
            viewHome.setVisible(true);
            AplikasiKonsol aplikasi = new AplikasiKonsol();
            aplikasi.mainMenu();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan!");
        }
    }
}
