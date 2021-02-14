
package j_lable;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class AddImageJLabell extends JLabel{
    
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
imglabel.setBounds(50, 30, img.getIconWidth(), img.getIconHeight());
c.add(imglabel);

  
  
}
public static void main(String[] args){
     AddImageJLabell frame = new AddImageJLabell();
     frame.setVisible(true);
     frame.setDefaultCloaseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setBounds(200, 50 , 400, 300);
     frame.setTitle("FrameDemo");
     frame.setResizable(flase);
     
     
     

}   

    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDefaultCloaseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
