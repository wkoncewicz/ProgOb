package zadA;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ThreeButtonFrame extends JFrame{
	public ThreeButtonFrame(){
		super("Three Button Frame");
		setLayout(new FlowLayout());
		
		JButton button1 = new JButton("Zmień nazwe okna");
		JButton button2 = new JButton("Zmień kolor guzika");
		JButton button3 = new JButton("Zamknij");
		
		ActionListener nameChange = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setTitle("Elooo");
			}	
		};
		
		ActionListener colorChange = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				button2.setBackground(Color.RED);
			}	
		};
		
		ActionListener exitListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}	
		};
		
		button1.addActionListener(nameChange);
		button2.addActionListener(colorChange);
		button3.addActionListener(exitListener);

		add(button1);
		add(button2);
		add(button3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(400, 200);

	    setVisible(true);
	}
	public static void main(String[] args) {
		new ThreeButtonFrame();
	}
}
