package GUI;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class calculadora{
	
	public static void main(String[]args) {
		ventanaCalculadora vc = new ventanaCalculadora();
		
	}
}
class ventanaCalculadora extends JFrame{
	
	public ventanaCalculadora() {
		setVisible(true);
		//pack();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 laminaCalculadora1 miLamina= new laminaCalculadora1();
		 add(miLamina,BorderLayout.NORTH);
		 add(miLamina.panel2,BorderLayout.CENTER);
		pack();
		
	}
}
class laminaCalculadora1 extends JPanel{
	public laminaCalculadora1() {
		setLayout(new BorderLayout());
		principio=true;
		display = new JButton("0");
		display.setEnabled(false);
		add(display,BorderLayout.NORTH);
		
		 panel2 = new JPanel();
		panel2.setLayout(new GridLayout(4,4));
		ActionListener action= new funcion();
		ActionListener opera= new operaciones();
		
		AsignaBoton("7",action);
		AsignaBoton("8",action);
		AsignaBoton("9",action);
		AsignaBoton("X",opera);
		AsignaBoton("4",action);
		AsignaBoton("5",action);
		AsignaBoton("6",action);
		AsignaBoton("-",opera);
		AsignaBoton("3",action);
		AsignaBoton("2",action);
		AsignaBoton("1",action);
		AsignaBoton("+",opera);
		AsignaBoton("0",action);
		AsignaBoton("/",opera);
		AsignaBoton(".",opera);
		AsignaBoton("=",opera);
		add(panel2);
		UltimaOperacion="=";
		
	}
	public void AsignaBoton(String nombre,ActionListener oyente) {
		JButton boton=new JButton(nombre);
		panel2.add(boton);
		boton.addActionListener(oyente);
	}
	public JPanel panel2;
	JButton display;
	private boolean principio;
	int operation;
	double resultado;
	private String UltimaOperacion;
class operaciones implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		String operacion = e.getActionCommand();
		calcular(Double.parseDouble(display.getText()));
		UltimaOperacion=operacion;
		principio=true;
		
	}
	public void calcular(double x) {
		if(UltimaOperacion.equals("+")) {
			resultado+=x;
			System.out.println(resultado);
		}
		else if(UltimaOperacion.equals("-")) {
			resultado-=x;
		}
		else if(UltimaOperacion.equals("X")) {
			resultado*=x;
		}
		else if(UltimaOperacion.equals("/")) {
			resultado/=x;
		}
		
		else if(UltimaOperacion.equals("=")) {
			resultado=x;
		}
		display.setText(""+resultado);
	}
}
class funcion implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
	String entrada = e.getActionCommand();
	if(principio) {
		display.setText("");
		principio=false;
	}
		display.setText(display.getText()+entrada);
	if(e.getActionCommand()=="+") {
		display.setText("");
		
	}

		
	}
		
	}
}

