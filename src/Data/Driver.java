/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Controller.HomeController;
import Model.Model;
import View.Homepage;

/**
 *
 * @author Diah Ajeng
 */
public class Driver {
    public static void main(String[] args) {
        Homepage view = new Homepage();
        Model model = new Model();
        HomeController controller = new HomeController(view, model);
        view.setVisible(true);
        AplikasiKonsol aplikasi = new AplikasiKonsol();
        aplikasi.mainMenu();
    }
}
