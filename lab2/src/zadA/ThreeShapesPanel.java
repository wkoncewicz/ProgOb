package zadA;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Random;

public class ThreeShapesPanel extends JPanel {
	private Color[] shapeColors;
    public ThreeShapesPanel() {
        shapeColors = new Color[3];
        Random rand = new Random();
        shapeColors[0] = getRandomColor(rand);
        shapeColors[1] = getRandomColor(rand);
        shapeColors[2] = getRandomColor(rand);
    }

    // Helper method to generate random colors
    private Color getRandomColor(Random rand) {
        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN};
        return colors[rand.nextInt(colors.length)];
    }
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(shapeColors[0]);
        g.fillRect(50, 50, 100, 50);
        g.setColor(shapeColors[1]);
        g.fillOval(50, 210, 100, 100);
        g.setColor(shapeColors[2]);
        g.fillRect(50, 350, 75, 75);
    }
	public static void main(String[] args) {
        JFrame frame = new JFrame("Three Shapes");
        frame.setLayout(new GridLayout(1, 2));
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 1));
        JButton button1 = new JButton("Przycisk 1");
        JLabel label = new JLabel("To jest etykieta");
        JTextField field = new JTextField("A to pole tekstowe");
        panel1.add(label);
        panel1.add(button1);
        panel1.add(field);
        
        ThreeShapesPanel threeShapesPanel = new ThreeShapesPanel();
        panel1.setPreferredSize(new Dimension(300, 400));
        threeShapesPanel.setPreferredSize(new Dimension(300, 400));

        frame.add(panel1, BorderLayout.WEST);
        frame.add(threeShapesPanel, BorderLayout.CENTER);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
}
