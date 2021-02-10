
package JFrame;
import javax.swing.JFrame;
public class CreateJFrame extends JFrame{
//public class CreateJFrame{
    public static void main(String[] args) {
//        JFrame frame =  new JFrame();
        CreateJFrame frame = new CreateJFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(400,300); 
     //use null it indicates the frame is defult which is stay on the center 
     // frame.setLocationRelativeTo(null);
      
      frame.setLocation(20, 40);
      
//first two peramiter is set a location(1st left,2nd top) and second two is set a size(3rd width, 4th hight)
      frame.setBounds(100, 50 , 400 , 300);
      frame.setTitle("Frame Demo");
     
      //Do not able to  resizable
      frame.setResizable(false);
      
    }

    
}
