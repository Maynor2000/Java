package excepciones;

import javax.swing.JOptionPane;

public class MultiplesExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dividir();
	}
	static void dividir() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("introducen un numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("introducen un numero"));
		System.out.println("el resultado es "+num1/num2);
	}

}
