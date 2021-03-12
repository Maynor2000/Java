package GUI;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
public class layouts {

	public static void main(String[] args) {
		ventanaLayouts vlayout = new ventanaLayouts();

	}

}
class ventanaLayouts extends JFrame{
	
	public ventanaLayouts() {
		setVisible(true);
		setLocation(0,0);
		setSize(600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		laminaLayouts ll = new laminaLayouts();
		add(ll,BorderLayout.NORTH);
		add(new laminaLayout2(),BorderLayout.CENTER);
		
	}
}
class laminaLayouts extends JPanel{
	
	public laminaLayouts() {
		setLayout(new BorderLayout(10,10));
		
		//add(new JButton("amarillo"),BorderLayout.NORTH);
		//add(new JButton("amarillo"),BorderLayout.NORTH);
		//add(new JButton("rojo"),BorderLayout.SOUTH);
		add(new JButton("azul"),BorderLayout.WEST);
		add(new JButton("verde"),BorderLayout.EAST);
		add(new JButton("gris"),BorderLayout.CENTER);
	}
}
class laminaLayout2 extends JPanel{
	
	public laminaLayout2() {
		setLayout(new GridLayout(1,1));
		add(new JButton("amarillo"));
		add(new JButton("amarillo"));
		
	}
}