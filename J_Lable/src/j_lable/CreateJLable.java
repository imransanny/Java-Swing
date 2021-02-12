
package j_lable;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Container;
public class CreateJLable extends JFrame {
    
    private Container c;
    private JLabel userlable1, userlabel2;
    
    CreateJLable(){
        initComponents();
    }
    public void initComponents(){
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
    
    userlable1 = new JLabel();
    
    userlable1.setText("Enter Name");
    
    userlable1.setBounds(50,30,150,150);
      c.add(userlable1);
    userlabel2 = new JLabel("Enter your passward");
  //  userlabel2.setText("enter your name");
    userlabel2.setBounds(40,80,150,150);
    c.add(userlabel2);
    }
    public static void main(String[] args) {
        CreateJLable frame = new CreateJLable();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.setSize(400,300);
    //frame.setLocationRelativeTo(null);
   // frame.setLocation(200, 50);
    frame.setBounds(400,300,400,300);
    frame.setTitle("frmae demo");
    //frame.setResizable(false);
    
    
    }

} 

