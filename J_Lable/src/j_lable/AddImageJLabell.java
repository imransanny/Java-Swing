
package j_lable;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class AddImageJLabell extends JFrame{
    
    //public class AddImageJLabel1 extends JFrame{
        private Container c;
        private JLabel imglabel;
        private ImageIcon img;
   
AddImageJLabell(){
    initComponents();
}
public void initComponents(){
   c =this.getContentPane();
  c.setLayout(null);
  c.setBackground(Color.pink);
img  = new ImageIcon(getClass().getResource("Untitled-1.png"));
imglabel = new JLabel(img);
imglabel.setBounds(5, 3, img.getIconWidth(), img.getIconHeight());
c.add(imglabel);

  
  
}
public static void main(String[] args){
     AddImageJLabell frame = new AddImageJLabell();
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setBounds(200, 50 , 400, 300);
     frame.setTitle("FrameDemo");
     frame.setResizable(false);    

}   

}
