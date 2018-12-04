 
package guiwindowexample;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
 
public class GuiStructure extends WindowAdapter{
    
    
        GuiStructure(){
    
        initGui();
        
    }
    
    public void initGui(){
    
        JFrame window = new JFrame("GuiWindowExample");
        Container container = window.getContentPane();
        
        container.setLayout(new FlowLayout());
        
        JButton button1 = new JButton("Button");
    
         
        window.addWindowListener(this);
        window.setSize(200,200);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
  
    @Override
    public void windowClosing(WindowEvent e) {
    
        JOptionPane.showMessageDialog(null,"Window Closed");
            System.exit(0);
        
    }

    

    
}
