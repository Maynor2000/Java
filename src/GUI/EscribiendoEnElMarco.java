package GUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.geom.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

import javax.swing.*;
public class EscribiendoEnElMarco {

	public static void main(String[] args) {
		
		marco2 mi_marco1 = new marco2();

	}

}
class marco2 extends JFrame {
	
	public marco2() {
		setVisible(true);
		setSize(500,500);
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension pantalla = miPantalla.getScreenSize();
		int alto= pantalla.height;
		int ancho= pantalla.width;
		setLocation(ancho/2-250,alto/2-250);
		setTitle("escribiendo");
		lamina milamina = new lamina();
		add(milamina);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color micolor = new Color(134,233,121);
		milamina.setBackground(SystemColor.window);
	}
}
class lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawString("maynor",10, 10);//metodo para escribir
		
		//g.drawLine(0, 10, 500,10 );//dibuja una linea
		//g.drawRect(20, 20, 460, 100);//dibuja un cuadrado
		//g.draw3DRect(20, 40, 100, 100, true);//rectangulo 3d
		//g.fill3DRect(50, 50, 100, 100, false);
		Graphics2D g2= (Graphics2D) g;
		/*Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.BLUE);
		g2.fill(rectangulo);
		g2.setPaint(Color.BLACK);
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		g2.setPaint(new Color(215,104,112,80).brighter());
		
		elipse.setFrame(rectangulo);
		
		g2.fill(elipse);
		//g2.draw(new Line2D.Double(100,100,300,250));
		double centroX = rectangulo.getCenterX();
		double centroY = rectangulo.getCenterY();
		double radio = 150;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroX, centroY,centroX+radio, centroY+radio);
		//g2.draw(circulo);*/
		Font mifuente = new Font("arial",Font.BOLD,35);
		g2.setFont(mifuente);
		g2.drawString("maynor",10, 20);//metodo para escribir
		
		
		
		
		
	}
	
}