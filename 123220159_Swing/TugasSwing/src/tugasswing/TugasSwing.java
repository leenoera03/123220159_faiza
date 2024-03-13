/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasswing;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */

class KotakFrame extends JFrame{
    JLabel tulisan = new JLabel("Selamat Datang!");
    
    JLabel tulisan2= new JLabel("Silahkan masuk untuk melanjutkan.");
    
    JTextField inputNama = new JTextField();
    JLabel labelInputNama = new JLabel("Username");
    
    JTextField inputPw = new JTextField();
    JLabel labelInputPw = new JLabel("Password");
    
    JRadioButton pilihlaki = new JRadioButton("Laki- laki");
    JRadioButton pilihperempuan = new JRadioButton("Perempuan");
    JLabel labelJK = new JLabel("Jenis Kelamin");
    
    JButton tombollogin = new JButton("Login");
    
    KotakFrame(){
        setVisible(true);
        setSize(620,720);
        setTitle("Login Page");
        tulisan.setFont (tulisan.getFont ().deriveFont (20f));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        add(tulisan);
        tulisan.setBounds(50, 75, 500, 24);
        
        add(tulisan2);
        tulisan2.setBounds(50, 100, 500, 24);
        
        add (inputNama);
        inputNama.setBounds(50, 174, 500, 32);
        
        add (labelInputNama);
        labelInputNama.setBounds(50, 144, 100, 32);
        
        add (inputPw);
        inputPw.setBounds(50, 234, 500, 32);
        
        add (labelInputPw);
        labelInputPw.setBounds(50, 204, 100, 32);
        
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(pilihlaki);
        pilihJenisKelamin.add(pilihperempuan);
        
        add (labelJK);
        labelJK.setBounds(50, 274, 100, 32);
        
        add (pilihlaki);
        pilihlaki.setBounds(50, 300, 100, 32);
        
        add (pilihperempuan);
        pilihperempuan.setBounds(160, 300, 100, 32);
        
        add (tombollogin);
        tombollogin.setBounds(50, 340, 500, 32);
        
    }
}

public class TugasSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        KotakFrame kotakFrame = new KotakFrame();
        
    }
    
}
