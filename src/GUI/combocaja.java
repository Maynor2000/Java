package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class combocaja {

	public static void main(String[] args) {
		framecaja fc = new framecaja();

	}

}
class framecaja extends JFrame{
	public framecaja() {
		add(new panelcaja());
		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class panelcaja extends JPanel{
	public panelcaja() {
		lb = new JLabel("maynor");
		add(lb);
		cb = new JComboBox();
		cb.addItem("null");
		cb.addItem("rojo");
		cb.addItem("blanco");
		cb.addItem("verde");
		add(cb);
		cb.addActionListener(new funcion());
	}
	JComboBox cb ;
	JLabel lb;
class funcion implements ActionListener{


	public void actionPerformed(ActionEvent e) {
		if(cb.getSelectedItem()=="rojo") {
			lb.setForeground(Color.RED);
		}
		if(cb.getSelectedItem()=="blanco") {
			lb.setForeground(Color.WHITE);
		}
		if(cb.getSelectedItem()=="verde") {
			lb.setForeground(Color.GREEN);
		}
		
	}
	
}
}