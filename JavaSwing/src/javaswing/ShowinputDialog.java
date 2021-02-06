
package javaswing;
import javax.swing.JOptionPane;
public class ShowinputDialog {
    public static void main(String[] args) {
        /*String name = JOptionPane.showInputDialog("Enter name");
        JOptionPane.showMessageDialog(null, name +" "+ "Welcome");
       */ 
        
  // String fname = JOptionPane.showInputDialog("Enter your name", "imran");
   String fname = JOptionPane.showInputDialog(null,"Enter 1st name", "this is title",JOptionPane.QUESTION_MESSAGE);
   String lname = JOptionPane.showInputDialog("Enter your last name :");
   String name = fname + lname;
   JOptionPane.showMessageDialog(null,"your full name is :"+ name);
   // JOptionPane.ShowMessageDialog(null, "what's your name");
    }
}
