package flappyBirds;

import java.awt.Graphics;
import javax.swing.JPanel;

public class render extends JPanel {

	private static final long serialVersionVID = 1L;
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		flappybirds.flappyBird.repaint(g);
	}
	
	
}
