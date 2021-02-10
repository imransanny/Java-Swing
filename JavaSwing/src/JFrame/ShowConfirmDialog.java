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
import javax.swing.JOptionPane;
public class ShowConfirmDialog {
    public static void main(String[] args) {
        
       int choice = JOptionPane.showConfirmDialog(null, "What do you want", "title" , JOptionPane.YES_NO_CANCEL_OPTION);
      
       if (choice == JOptionPane.YES_OPTION){
           System.exit (0);
    }
       else {
           System.out.println("Click no option");
       }
       
       
    }
}
