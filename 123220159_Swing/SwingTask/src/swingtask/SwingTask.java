/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingtask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */

class FrameBox extends JFrame{
    JLabel tulisan = new JLabel("Welcome, [Mr./Mrs.][username]");
    JLabel tulisan2= new JLabel("Tentukan panjang, lebar dan tinggi untuk menghitung Balok");
    
    JTextField inputPanjang = new JTextField();
    JLabel labelInputPanjang = new JLabel("Panjang");
    
    JTextField inputLebar = new JTextField();
    JLabel labelInputLebar = new JLabel("Lebar");
    
    JTextField inputTinggi = new JTextField();
    JLabel labelInputTinggi = new JLabel("Tinggi");
    
    JButton tombolhitung = new JButton("Hitung");
    JButton tombolreset = new JButton("Reset");
    
    JLabel tulisan3 = new JLabel("Hasil");
    
    JLabel luas = new JLabel("Luas Persegi");
    JLabel hasilluas = new JLabel("[Hasil berupa angka]");
    
    JLabel keliling = new JLabel("Keliling Persegi");
    JLabel hasilkeliling = new JLabel("[Hasil berupa angka]");
    
    JLabel volume = new JLabel("Volume Balok");
    JLabel hasilvolume = new JLabel("[Hasil berupa angka]");
    
    JLabel luaspermukaan = new JLabel("Luas Permukaan Balok");
    JLabel hasillpermukaan = new JLabel("[Hasil berupa angka]");
    
    FrameBox(){
        setVisible(true);
        setSize(620,720);
        setTitle("Halaman Utama");
        tulisan.setFont (tulisan.getFont ().deriveFont (20f));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        add(tulisan);
        tulisan.setBounds(50, 75, 500, 24);
        
        add(tulisan2);
        tulisan2.setBounds(50, 100, 500, 24);
        
        add (inputPanjang);
        inputPanjang.setBounds(170, 144, 380, 32);
        
        add (labelInputPanjang);
        labelInputPanjang.setBounds(50, 144, 100, 32);
        
        add (inputLebar);
        inputLebar.setBounds(170, 184, 380, 32);
        
        add (labelInputLebar);
        labelInputLebar.setBounds(50, 184, 100, 32);
        
        add (inputTinggi);
        inputTinggi.setBounds(170, 224, 380, 32);
        
        add (labelInputTinggi);
        labelInputTinggi.setBounds(50, 224, 100, 32);
              
        add (tombolhitung);
        tombolhitung.setBounds(50, 274, 500, 32);
        
        add (tombolreset);
        tombolreset.setBounds(50, 314, 500, 32);
        
        add(tulisan3);
        tulisan3.setBounds(285, 364, 150, 24);
        
        add(luas);
        luas.setBounds(50, 404, 150, 24);
        add(hasilluas);
        hasilluas.setBounds(240, 404, 150, 24);
        
        add(keliling);
        keliling.setBounds(50, 444, 150, 24);
        add(hasilkeliling);
        hasilkeliling.setBounds(240, 444, 150, 24);
        
        add(volume);
        volume.setBounds(50, 484, 150, 24);
        add(hasilvolume);
        hasilvolume.setBounds(240, 484, 150, 24);
        
        add(luaspermukaan);
        luaspermukaan.setBounds(50, 524, 150, 24);
        add(hasillpermukaan);
        hasillpermukaan.setBounds(240, 524, 150, 24);
    }
}

public class SwingTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FrameBox frameBox = new FrameBox();
    }
    
}
