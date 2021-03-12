package GUI;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
public class cuadroTextoValidado {

	public static void main(String[] args) {
		ventanaValidada vv= new ventanaValidada();

	}

}
class ventanaValidada extends JFrame{
	public ventanaValidada() {
		//setLayout(new GridLayout());
		frameValido fv=new frameValido();
		add(fv,BorderLayout.NORTH);
		add(fv.panel2,BorderLayout.SOUTH);
		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
class frameValido extends JPanel{
	public frameValido(){
		setLayout(new GridLayout(2,2));
		JLabel nusuario = new JLabel("Usuario");
		add(nusuario);
		usuario = new JTextField(15);
		add(usuario);
	
		JLabel nusuario2 = new JLabel("Usuario");
		add(nusuario2);
		contrasena = new JPasswordField();
		add(contrasena);
		panel2 = new JPanel();
		JButton crear= new JButton("Enviar");
		panel2.add(crear);
		contrasena.getDocument().addDocumentListener(new validacion());
	}
	JPanel panel2;
	JTextField usuario;
	JPasswordField contrasena;
	
private class validacion implements DocumentListener{

	public void changedUpdate(DocumentEvent e) {
		
		
	}

	
	public void insertUpdate(DocumentEvent e) {
	char []	contrasen;
	contrasen=contrasena.getPassword();
		if(contrasen.length<8 ||contrasen.length>12) {
			contrasena.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		}
		else {
			contrasena.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		}
	}

	
	public void removeUpdate(DocumentEvent e) {
		char []	contrasen;
		contrasen=contrasena.getPassword();
			if(contrasen.length<8 ||contrasen.length>12) {
				contrasena.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
			}
			else {
				contrasena.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
			}
		
	}
	
}
}