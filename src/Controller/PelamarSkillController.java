package Controller;

import Model.Aplikasi;
import Model.Pelamar;
import View.Loginpage;
import View.PelamarProfilSkillpage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Diah Ajeng
 */
public class PelamarSkillController implements ActionListener{

    private PelamarProfilSkillpage view;
    private Aplikasi model;
    private Pelamar p;
    
    PelamarSkillController(Aplikasi model, Pelamar pelamar) {
        this.model = model;
        this.p = pelamar;
        view = new PelamarProfilSkillpage();
        view.setVisible(true);
        view.setActionListener(this);
        view.setSession("Selamat Datang "+p.getNama());
        view.setSkill("");
        String skill ="";
        try{
            if(model.getSkill()==null){
                skill = "-";
            }else{
                for (int j = 0; j < model.getSkill().size(); j++) {
                    skill=skill+model.getSkill().get(j)+"\n";
                }
            }            
            view.setlblSkil(skill);
        }catch(Exception exc){
            JOptionPane.showMessageDialog(null, "Keahlian tidak dapat ditampilkan");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object klik = e.getSource();
        if(klik.equals(view.getbtnback())){
            view.dispose();
            PelamarController prController = new PelamarController(model, p);
        }else if(klik.equals(view.getbtnbhs())){
            view.dispose();
            PelamarBhsController bhsController = new PelamarBhsController(model, p);
        }else if(klik.equals(view.getbtnclose())){
            int selectedOption = JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan keluar?", "Informasi", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                view.dispose();
                Loginpage viewLogin = new Loginpage();
                LoginController login = new LoginController(viewLogin, model);
                viewLogin.setVisible(true);
            }
        }else if(klik.equals(view.getbtngelar())){
            view.dispose();
            PelamarGelarController grController = new PelamarGelarController(model, p);
        }else if(klik.equals(view.getbtnpengalaman())){
            view.dispose();
            PelamarPengalamanController prController = new PelamarPengalamanController(model, p);
        }else if(klik.equals(view.getbtnsimpan())){
            try{
                model.addSkill(view.getskill());
                JOptionPane.showMessageDialog(null, "Skill berhasil di tambah");
                view.setSkill("");
                String skill ="";
                try{
                    if(model.getSkill()==null){
                        skill = "-";
                    }else{
                        for (int j = 0; j < model.getSkill().size(); j++) {
                            skill=skill+model.getSkill().get(j)+"\n";
                        }
                    }            
                    view.setlblSkil(skill);
                }catch(Exception exc){
                    JOptionPane.showMessageDialog(null, "Keahlian tidak dapat ditampilkan");
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            }
        }
    }
    
}
