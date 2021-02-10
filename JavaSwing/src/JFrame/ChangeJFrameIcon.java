
package JFrame;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
public class ChangeJFrameIcon extends JFrame {
    private ImageIcon icon;
    
    ChangeJFrameIcon(){
        initComponents();
    }
    
    public void initComponents(){
        icon = new ImageIcon();
        
      icon = new ImageIcon (getClass().getResource("Untitled-1.png"));
        
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        ChangeJFrameIcon frame = new ChangeJFrameIcon();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Frame Demo");
        frame.setResizable(false);
    }
}
