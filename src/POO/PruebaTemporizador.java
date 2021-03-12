package POO;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

import javax.swing.*;
public class PruebaTemporizador {

	public static void main(String[] args) {
		ActionListener oyente = new temporizador();
		Timer mi_temporizador = new Timer(1000,oyente);
		mi_temporizador.start();
		JOptionPane.showMessageDialog(null,"esta es la hora");
		System.exit(0);
		
	}

}
class temporizador implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		Date hora = new Date();
		System.out.println("hora : "+hora);
		Toolkit.getDefaultToolkit().beep();
	}
}
