package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JTextArea1 {

	public static void main(String[] args) {
		ventanaArea va = new ventanaArea();
		va.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class ventanaArea extends JFrame{
	public ventanaArea() {
		
		setSize(500,300);
		
		panelArea pa= new panelArea();
		add(pa);
		
		setVisible(true);
	}
}
class panelArea extends JPanel{
	
	public panelArea() {
		area = new JTextArea(8,20);
		JScrollPane mi = new JScrollPane(area);
		add(mi);
		JButton miboton = new JButton("Enviar");
		add(miboton);
		miboton.addActionListener(new funcionA());
	}
	JButton miboton;
	JTextArea area;
class funcionA implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println(area.getText());
		area.setText("");
		
	}
	
}
}