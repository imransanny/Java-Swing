
package j_lable;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JLabel;
public class FrontCreate extends JFrame {
    private Container c;
    private Font f;
    private JLabel userlabel1, userlabel2;
    FrontCreate(){
        initComponents();
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        f = new Font("Arial", Font.BOLD, 14);
        userlabel1 = new JLabel();
        userlabel1.setText("Enter Name");
        userlabel1.setBounds(40,20,100,100);
          userlabel1.setFont(f);
        c.add(userlabel1);
        userlabel2 = new JLabel();
        userlabel2.setText("Enter your Passward");
        userlabel2.setBounds(50,80,120,120);
        userlabel2.setFont(f);
        c.add(userlabel2);
        
    }
    public static void main(String[] args) {
        FrontCreate frame = new FrontCreate();
        frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(400, 300, 400, 300);
    frame.setTitle("New Front Style");
    }
 
}
