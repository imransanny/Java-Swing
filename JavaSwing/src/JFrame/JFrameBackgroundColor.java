
package JFrame;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Container;
public class JFrameBackgroundColor extends JFrame {
    private ImageIcon icon;
    private Container c;
   JFrameBackgroundColor(){
       initComponents();
   }
   public void initComponents(){
       c = this.getContentPane();
       c.setBackground(Color.yellow);
       
       icon = new ImageIcon();
       icon = new ImageIcon(getClass().getResource("Untitled-1.png"));
       
       this.setIconImage(icon.getImage());
   }
    public static void main(String[] args) {
        JFrameBackgroundColor frame =  new JFrameBackgroundColor();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(200, 50, 400, 300);
    frame.setTitle("Frame Demo");
    frame.setResizable(false);
    }
   
}
