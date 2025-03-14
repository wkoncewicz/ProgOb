package zadA;
import javax.swing.JFrame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

public class CloseableFrame extends JFrame {
    public CloseableFrame() throws HeadlessException {
    	this.setSize(640,480);
    	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public CloseableFrame(GraphicsConfiguration gc) {
        super(gc);
    }
    public CloseableFrame(String title) throws HeadlessException {
        super(title);
    }
    public CloseableFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }
    public static void main(String[] args) {
    	CloseableFrame closeableFrame = new CloseableFrame();
    	closeableFrame.setVisible(true);
    }
}

