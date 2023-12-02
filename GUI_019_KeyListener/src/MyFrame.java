import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener{

	JLabel label;
	ImageIcon icon;
	
	MyFrame(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon = new ImageIcon("rocket.png");
		
		label = new JLabel();
		label.setBounds(0,0,130,130);
		label.setIcon(icon);
		//label.setBackground(Color.red);
		//label.setOpaque(true);
		
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// keyTyped = Invoked when a key is typed. Uses Keychar, char Output
		switch(e.getKeyChar()){
			case 'a': label.setLocation(label.getX()-10, label.getY());
				break;
			case 'w': label.setLocation(label.getX(), label.getY()-10);
				break;
			case 'd': label.setLocation(label.getX()+10, label.getY());
				break;
			case 's': label.setLocation(label.getX(), label.getY()+10);
				break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// keyPressed = Invoked when a physical key is pressed down. Uses Keycode, int ouput
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// keyReleased = called whenever a button is released
		//System.out.println("You released key char: " + e.getKeyChar());
		//System.out.println("You released key char: " + e.getKeyCode());
	}
	
}
