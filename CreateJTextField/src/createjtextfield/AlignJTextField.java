
package createjtextfield;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JTextField;
public class AlignJTextField extends JFrame {
    private Container c;
    private Font f;
    private JTextField t1 ,t2; 
  
    AlignJTextField(){
        initComponents();
    }
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        f = new Font("Arial", Font.ITALIC + Font.BOLD, 18);
        t1 = new JTextField();
        t1.setFont(f);
        t1 .setBounds(50 ,50 ,200 , 50);
        // the text write to start center
        t1.setHorizontalAlignment(JTextField.CENTER);
        c.add(t1);
        
    
    }
    
    
    
    
    public static void main(String[] args) {
        AlignJTextField frame  = new AlignJTextField();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 100, 400, 400);
         frame.setTitle("Align Text Field");
    }
}
