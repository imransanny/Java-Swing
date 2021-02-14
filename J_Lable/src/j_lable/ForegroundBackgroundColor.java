package j_lable;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ForegroundBackgroundColor extends JFrame {

    private Container c;
    private ImageIcon ion;
    private Font f;
    private JLabel userlabel1, passlabel1;

    ForegroundBackgroundColor() {
        initcomponent();

    }

    public void initcomponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        f = new Font("Arial", Font.BOLD, 16);
        userlabel1 = new JLabel();
        userlabel1.setText("Enter name");
        userlabel1.setBounds(50, 20, 200, 50);
        userlabel1.setForeground(Color.red);
        userlabel1.setBackground(Color.green);
        userlabel1.setOpaque(true);
        userlabel1.setFont(f);
        userlabel1.setToolTipText("enter name please");
        
        //String s = userlabel.getToolTipText();
        System.out.println(" userlaebl1.getText()");
        c.add(userlabel1);
        passlabel1 = new  JLabel("Enter passward");
        //passlabel1.setText("Enter passward ");
        passlabel1.setBounds(50, 80, 150, 50);
        passlabel1.setBackground(Color.red);
        passlabel1.setForeground(Color.GRAY);
        passlabel1.setOpaque(true);
        passlabel1.setToolTipText("please enter passward");
        passlabel1.setFont(f);
        c.add(passlabel1);
        

    }

    public static void main(String[] args) {
        ForegroundBackgroundColor frame = new ForegroundBackgroundColor();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Frame Demo");
        frame.setResizable(false);

    }
}
