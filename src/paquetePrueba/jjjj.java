package paquetePrueba;

import javax.swing.JOptionPane;

public class jjjj {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("escribe el numero"));
		int c=0;
		for(int i=a;i>0;i--) {
			 c = a*(i-1);
			// System.out.println(i);
			 System.out.println(c);
			
		}
		
	}

}
