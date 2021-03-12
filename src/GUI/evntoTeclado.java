package GUI;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class evntoTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ventanaTeclado vt = new  ventanaTeclado();
	}

}
class ventanaTeclado extends JFrame{
	public ventanaTeclado() {
		setVisible(true);
		setTitle("eventos de teclado");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		laminaTeclado lt = new laminaTeclado();
		add(lt);
		addKeyListener(lt);
	}
}
class laminaTeclado extends JPanel implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		
		
		if(e.getKeyChar()=='e') {
			
			setBackground(Color.BLACK);
		}
		if(e.getKeyChar()=='a') {
			setBackground(Color.RED);
		}
		if(e.getKeyChar()=='b') {
			setBackground(Color.YELLOW);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
