package GUI;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class pruebaImagen {

	public static void main(String[] args) {
		marco3 marco3 = new marco3();

	}

}
class marco3 extends JFrame{
	
	public marco3() {
		setVisible(true);
		setSize(300,250);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		laminaImagen miLamina = new laminaImagen();
		add(miLamina);
	}
	
}
class laminaImagen extends JPanel{
	public laminaImagen() {
		try {
		imagen=ImageIO.read(new File("src/GUI/punto-png2.png"));
		}catch(IOException e){
			System.out.println("no se encontro la ruta de la imagen ");
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		File miImagen = new File("src/GUI/punto-png-2.png");
		
		
		try {
			imagen = ImageIO.read(miImagen);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int ancho= imagen.getWidth(this);
		int alto =imagen.getHeight(this);
		g.drawImage(imagen, 0, 0, null);
		
		g.copyArea(0, 0, ancho, alto, 2, 5);
		
		
	}
	private Image imagen;
}
