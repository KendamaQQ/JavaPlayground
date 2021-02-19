import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstGUI {
	
	public static void main(String [] args) {
		
		try {
			setFrame();
		} catch(Exception e) {
			e.getStackTrace();
		}
		
	}
	
	public static void setFrame() {
		ImageIcon image = new ImageIcon("D:/Users/artemtom/Documents/JavaPlayground/JavaExercise08/src/my/first/gui/manbrett.png");
		
		JFrame frame = new JFrame("My first GUI");
		
		Dimension frameDimension = new Dimension(600, 600);
		
		BorderLayout bl = new BorderLayout();
		
		//FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
		
		//System.out.println(bl.getHgap());
		//System.out.println(bl.getVgap());
		//System.out.println(frame.getContentPane().getLayout());
		
		frame.setSize(frameDimension);
		frame.setLayout(bl);
		frame.setIconImage(image.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		/* Add Components to the JFrame Object */
		addComponents(frame);

		frame.setVisible(true);
	}
	
	public static void addComponents(JFrame frame) {
		
			JPanel topPanel = new JPanel(new GridBagLayout());
			
			GridBagConstraints gbc = new GridBagConstraints();
			//gbc.gridx = 0;
			//gbc.gridy = 0;
			gbc.ipadx = 50;
			gbc.ipady = 5;
			gbc.weightx = 0.8;
			//gbc.weighty = 0.0;
			gbc.fill = GridBagConstraints.VERTICAL;
			gbc.anchor = GridBagConstraints.PAGE_START;
			
			topPanel.setPreferredSize(new Dimension(600, 50));
			topPanel.setBackground(Color.blue);
			
			JButton myButton = new JButton("Hallo");
			
			topPanel.add(myButton, gbc);
			
			frame.add(topPanel, BorderLayout.NORTH);
			
	}
	
	
}
