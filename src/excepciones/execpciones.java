package excepciones;

import javax.swing.*;

public class execpciones {
	public static void main (String[]args) {
		int[]my_matriz = new int[5];
		my_matriz[0]=5;
		my_matriz[1]=38;
		my_matriz[2]=15;
		my_matriz[3]=92;
		my_matriz[4]=71;
		for(int i=0;i<5;i++) {
			System.out.println("posici�n "+i+" numero "+my_matriz[i]);
		}
		String nombre=JOptionPane.showInputDialog("introduce tu nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("edada"));
		System.out.println("hola "+ nombre +" tienes "+edad +" a�os "+" el programa termino su ejecuci�n");
	}
}
