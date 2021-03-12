package GUI;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class eventosVentana {

	public static void main(String[] args) {
		frame1 v1 =new frame1();
		v1.setTitle("ventana1");
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v1.setLocation(0, 50);
		frame1 v2 =new frame1();
		v2.setTitle("ventana2");
		v2.setLocation(500, 50);
		v2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class frame1 extends JFrame{
	
	public frame1() {
		
		setVisible(true);
		setSize(500,300);
		//setLocation(0,0);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miventana vent = new miventana();
		addWindowListener(vent);
	}
}
class miventana implements WindowListener{

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("ventana restaurada");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("ventana minimisada");// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}