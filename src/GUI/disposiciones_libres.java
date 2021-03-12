package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.*;

public class disposiciones_libres{

	public static void main(String[] args) {
		framelibre fl = new framelibre();

	}

}
class framelibre extends JFrame{
	public framelibre() {
		add(new panellibre());
		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
	}
}
class panellibre extends JPanel{
	public panellibre() {
		setLayout(new columnas(100,20));
		JLabel nombre = new JLabel("nombre");
		JButton b1 = new JButton("rojo");
		b1.setBackground(Color.red);
		//b1.setBounds(250-40, 250, 80, 20);
		add(nombre);
		add(b1);
	}
}


class columnas implements LayoutManager{
	public columnas(int ancho, int alto) {
		x1=ancho;
		y1=alto;
	}

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container micontenedor) {
		int d = micontenedor.getWidth();
		x = d/2;
		int contador=0;
		int n = micontenedor.getComponentCount();
		System.out.println(n);
		for (int i=0;i<n;i++) {
			contador++;
			Component c = micontenedor.getComponent(i);
			c.setBounds(x-100, y, x1,y1);
			x+=100;
			if (contador%2==0) {
				x=20;
				y+=40;
			}
		}
		
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}
	private int x;
	private int y=20;
	private int x1;
	private int y1;
	
}