package POO;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

import javax.swing.*;

public class temporizadorInterno {

	public static void main(String[] args) {
		relog mirelog = new relog(Integer.parseInt(JOptionPane.showInputDialog(null,"introduce delay"))
				,JOptionPane.showInputDialog("elije sonido si o no"));
		mirelog.EnMarcha();
		

}
	
}
class relog{
	public relog(int intervalo,String sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	public void EnMarcha() {
		ActionListener funcion = new DameLahora();
		Timer tempo = new Timer(intervalo,funcion);
		tempo.start();
		JOptionPane.showMessageDialog(null,"relog");
		System.exit(0);
		
	}
	

	private int intervalo;
	private String sonido;
	private boolean sonido2;
	
	class DameLahora implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			if(sonido.equals("si")) {
				sonido2=true;
				System.out.println("bien");
			}else {
				sonido2=false;
				System.out.println("error");
			}
			if(sonido2) {
				Toolkit.getDefaultToolkit().beep();
			}
			Date hora = new Date();
			System.out.println("est es la hora: "+hora);
		}
	}

	}


