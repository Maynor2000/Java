package GUI;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
public class marco_centrado {

	public static void main(String[] args) {
		//marco mimarco = new marco();

	}

}
class marco extends JFrame{
	
	public marco() {
		Toolkit mi_pantalla = Toolkit.getDefaultToolkit();
		Dimension tamano = mi_pantalla.getScreenSize();
		int altura = tamano.height;
		int ancho = tamano.width;
		setVisible(true);
		setSize(ancho/3,altura/3);
		setLocation(ancho/3,altura/3);
		setTitle("ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icono = mi_pantalla.getImage("src/GUI/facebook.png");
		setIconImage(icono);
	}
}
