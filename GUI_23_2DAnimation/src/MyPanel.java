import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH = 595;
	final int PANEL_HEIGHT = 595;
	Image enemy;
	Image backgroundSpace;
	Timer timer;
	int xVelocity = 3;
	int yVelocity = 2;
	int x = 0;
	int y = 0;
	
	MyPanel(){
		
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.black);
		enemy = new ImageIcon("enemy.png").getImage(); //this will make an image out of our imageicon
		backgroundSpace = new ImageIcon("space.png").getImage();
		timer = new Timer(5, this);
		timer.start();
		
	}
	
	public void paint(Graphics g) {
		
		super.paint(g); //paint background
		
		Graphics g2D = (Graphics2D) g;
		
		g2D.drawImage(backgroundSpace, 0, 0, null);
		g2D.drawImage(enemy, x, y, null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x >= PANEL_WIDTH-enemy.getWidth(null) || x<0) {
			xVelocity = xVelocity * -1;
		}
		x = x + xVelocity;
		
		if(y >= PANEL_HEIGHT-enemy.getHeight(null) || y<0) {
			yVelocity = yVelocity * -1;
		}
		y = y + yVelocity;
		repaint();
		
	}

}
