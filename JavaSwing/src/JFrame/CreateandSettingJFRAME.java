/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

/**
 *
 * @author Imran Hasan
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//public class CreateandSettingJFRAME {
public class CreateandSettingJFRAME extends JFrame{  
public static void main(String[] args) {
      //  JFrame f = new JFrame();
    CreateandSettingJFRAME f = new CreateandSettingJFRAME();    
      
      f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           f.setSize(400, 300);
         //  f.setLocationRelativeTo(null);
           f.setLocation(200, 50);
           f.setTitle("Frame Demo");
           f.setResizable(false);
           
    }
}
