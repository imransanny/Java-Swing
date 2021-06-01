
package createjtextfield;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JTextField;
import java.awt.Font;
public class CreateJTextField extends JFrame{
private Container c;
   private JTextField tf1, tf2;
    private Font f;
    CreateJTextField(){
        initComponents();
    }
   public void  initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
         c.setBackground(Color.yellow);
         f = new Font("Arial", Font.ITALIC + Font.BOLD, 18);
         
   tf1  = new  JTextField();
   tf1.setBounds(50 , 30 ,200, 50);
   tf1.setFont(f);
   c.add(tf1);
 tf2 = new JTextField();
 tf2.setBounds(50, 110, 200, 50);
   c.add(tf2);
   
   }
    
    
    public static void main(String[] args) {
       CreateJTextField frame = new CreateJTextField();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500 ,400);
        frame.setTitle("JText Field");
    
    }
    
}
