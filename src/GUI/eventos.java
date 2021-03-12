package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class eventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ventana4 miventana4 = new ventana4();
	}

}
class ventana4 extends JFrame{
	
	public ventana4() {
		setVisible(true);
		setSize(500,300);
		setTitle("eventos");
		setLocation(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		laminaBotones lamina = new laminaBotones();
		add(lamina);
		
	}
	public void dispose() {
		dispose();
	}
}
class laminaBotones extends JPanel implements ActionListener{
	
	JButton botonazul = new JButton("azul");
	JButton botonrojo = new JButton("rojo");
	JButton botonverde = new JButton("verde");
	
	public laminaBotones(){
		
		add(botonazul);
		add(botonrojo);
		add(botonverde);
		
		botonazul.addActionListener(this);
		botonrojo.addActionListener(this);
		botonverde.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==botonazul) {
			cambia_color(Color.BLUE);
		}
		if(e.getSource()==botonrojo) {
			cambia_color(Color.RED);
		}
		if(e.getSource()==botonverde) {
			
			marco2 mi_marco1 = new marco2();
			 
			
			
		}
			
	}
	public void cambia_color(Color e) {
		setBackground(e);
	}
	
	
}