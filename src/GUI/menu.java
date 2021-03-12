package GUI;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class menu {

	public static void main(String[] args) {
		framemenu fm = new framemenu();

	}

}
class framemenu extends JFrame{
	public framemenu() {
		add(new panelmenu());
		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class panelmenu extends JPanel{
	public panelmenu() {

		JMenuBar jmb = new JMenuBar();
		jmb.setBackground(Color.GREEN);
		jmb.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		JMenu jm = new JMenu("edicion");
		JMenu jm2 = new JMenu("archivo");
		JMenu jm3 = new JMenu("herramienta");
		JMenu jm4 = new JMenu("opcion1");
		JCheckBoxMenuItem item1 = new JCheckBoxMenuItem("item1");
		JMenuItem item2 = new JMenuItem("hola");
		JMenuItem item3 = new JMenuItem("hola");
		item4 = new JRadioButtonMenuItem("item4");
		item4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
		JRadioButtonMenuItem item5 = new JRadioButtonMenuItem("item5");
		ButtonGroup migrupo = new ButtonGroup();
		migrupo.add(item4);
		migrupo.add(item5);
		jm.add(jm4);
		jm.addSeparator();
		jm4.add(item4);
		jm4.add(item5);
		jm.add(item1);
		jm.add(item2);
		jm.add(item3);
		jmb.add(jm);
		jmb.add(jm2);
		jmb.add(jm3);
		add(jmb);
		JPopupMenu emergente = new JPopupMenu();
		JMenu jme1 = new JMenu("archivo");
		iteme2 = new JMenuItem("hola");
		emergente.add(jme1);
		jme1.add(iteme2);
		setComponentPopupMenu(emergente);
		item1.addActionListener(new funcion());
		item4.addActionListener(new funcion());
		
	}
	JMenuItem iteme2;
	JRadioButtonMenuItem item4;
class funcion implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==item4) {
			System.out.println("hola");
		}
		
	}
	
}
}