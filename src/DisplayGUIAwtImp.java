import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.text.DecimalFormat;
import java.util.Calendar;
import javax.swing.*;

public class DisplayGUIAwtImp implements DisplayUI{
        private DecimalFormat tflz, tf;
    	private Frame frame;
	private Label label;
    
    public DisplayGUIAwtImp() {
    frame = new Frame();
    label = new Label();
    frame.add(label,BorderLayout.CENTER);
    frame.setSize(50,50);
    frame.show();
    }
    public void displayTime(String time){
        label.setText(time);
        label.repaint();
    }
    
    
  }

