package paquetePrueba;

import javax.swing.JOptionPane;

public class pasos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pasos = Integer.parseInt(JOptionPane.showInputDialog("escribe la cantidad de pasos"));
		int cm= pasos*45;
		double m = cm/100;
		double km = m/1000;
		JOptionPane.showMessageDialog(null,cm+" cemtimeros "+m+" metros "+km+" kilometros");
		
	}

}
