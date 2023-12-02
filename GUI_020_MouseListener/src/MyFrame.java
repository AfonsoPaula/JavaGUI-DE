import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{

	JLabel label;
	ImageIcon smile;
	ImageIcon desconfiado;
	ImageIcon magoado;
	ImageIcon zonzo;
	
	MyFrame(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		label = new JLabel();
		label.addMouseListener(this);
		
		smile = new ImageIcon("smile.png");
		desconfiado = new ImageIcon("desconfiado.png");
		magoado = new ImageIcon("magoado.png");
		zonzo = new ImageIcon("zonzo.png");
		
		label.setIcon(smile);
		
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
//		System.out.println("You clicked the mouse!");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
//		System.out.println("You pressed the mouse!");
		label.setBackground(Color.yellow);
		label.setIcon(magoado);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
//		System.out.println("You released the mouse!");
		label.setBackground(Color.green);
		label.setIcon(zonzo);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
//		System.out.println("You entered the component!");
		label.setBackground(Color.blue);
		label.setIcon(desconfiado);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits a component
//		System.out.println("You exited the mouse!");
		label.setBackground(Color.red);
		label.setIcon(smile);
	}
}
