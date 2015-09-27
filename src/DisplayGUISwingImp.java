import java.awt.BorderLayout;
import javax.swing.*;

public class DisplayGUISwingImp implements DisplayUI{
    
    private JFrame frame;
    private JLabel label;

    public DisplayGUISwingImp() {
        frame = new JFrame();
    	label = new JLabel();
    	frame.getContentPane().add(label,BorderLayout.CENTER);
    	frame.setSize(50,50);
    	frame.show();
    }

    public void displayTime(String time){

       label.setText(time);
       label.repaint();
        
    }
}
