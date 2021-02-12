
package j_lable;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JLabel;

public class ForegroundBackgroundColor  extends JFrame{
    
    private Container c;
    private Font f;
    private JLabel userlabel1, userlabel2;
    ForegroundBackgroundColor(){
        initComponents();
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        f = new Font("Arial", Font.BOLD, 14);
        userlabel1 = new JLabel();
        userlabel1.setText("Enter Name");
        userlabel1.setBounds(50,20,200,50);
        userlabel1.setForeground(Color.green);
        userlabel1.setOpaque(true);
        userlabel1.setBackground(Color.yellow);
          userlabel1.setFont(f);
        c.add(userlabel1);
        userlabel2 = new JLabel();
        userlabel2.setText("Enter your Passward");
        userlabel2.setBounds(50,80,120,120);
        userlabel2.setForeground(Color.yellow);
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


