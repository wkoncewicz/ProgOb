package zadA;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

public class ThreeShapesPanel extends JPanel {
	private int colorNum;
	public void paintComponent(Graphics g) {
		for (int i = 0; i<3; i++) {
			super.paintComponent(g);
	        colorNum = 1 + (int) Math.random() * 3; 
	        if (colorNum == 1) {
	        	g.setColor(Color.red);
	        } else if (colorNum == 2) {
	        	g.setColor(Color.blue);
	        } else {
	        	g.setColor(Color.green);
	        }
	        if (i == 0) {
	        	g.fillRect(50, 50, 150, 100);
	        } else if (i == 1) {
	        	g.fillOval(250, 250, 150, 150);
	        } else {
	        	g.fillRect(100, 100, 100, 100);
	        }
		}
	}
	public static void main(String[] args) {
        CloseableFrame frame = new CloseableFrame();
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        JButton button1 = new JButton("Przycisk 1");
        JLabel label = new JLabel("To jest etykieta");
        JTextField field = new JTextField("A to pole tekstowe");
        ThreeShapesPanel panel2 = new ThreeShapesPanel();
        panel2.setPreferredSize(new Dimension(400, 400));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(button1, BorderLayout.SOUTH);
        frame.add(label, BorderLayout.WEST);
        frame.add(field, BorderLayout.EAST);
        frame.add(panel2, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
	}
}
