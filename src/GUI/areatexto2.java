package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class areatexto2 {

	public static void main(String[] args) {
		area2 mia = new area2();
	}

}
class area2 extends JFrame{
	public area2() {
		add(new framearea());
		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class framearea extends JPanel{
	public framearea() {
		setLayout(new BorderLayout());
	    miarea = new JTextArea(8,20);
		JScrollPane miscroll = new JScrollPane(miarea);
		add(miscroll,BorderLayout.NORTH);
		JPanel mipanel2 = new JPanel();
		btn1 = new JButton("enviar");
		btn2 = new JButton("agregar/borrar");
		mipanel2.add(btn1);
		mipanel2.add(btn2);
		add(mipanel2);
		btn1.addActionListener(new funcion());
		btn2.addActionListener(new funcion());
	}
	JTextArea miarea;
	JButton btn2;
	JButton btn1;
class funcion implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn2) {
			boton2();
		}if (e.getSource()==btn1){
			boton1();
		}
		
		
	}
public void boton1() {
miarea.append("hola ");
}
public void boton2() {
	boolean salto=!miarea.getLineWrap();
	System.out.println(salto);
	miarea.setLineWrap(salto);
	if(salto) {
		btn2.setText("quitar salto");
	}else {
		btn2.setText("poner salto");
	}
}
	
}
}