package GUI;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class Barra_Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Barra mimarco=new Marco_Barra();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Barra extends JFrame{
	
	public Marco_Barra(){
		
		setTitle("Marco con Barra");
		
		setBounds(500,300,600,450);
		
		lamina=new JPanel();
		
		add(lamina);
		
		// configuración de acciones
		
		Action accionAzul=new AccionColor("Azul", new ImageIcon("src/graficos/bola_azul.gif"), Color.BLUE);
		
		Action accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/graficos/bola_amarilla.gif"), Color.YELLOW);
		
		Action accionRojo=new AccionColor("Rojo", new ImageIcon("src/graficos/bola_roja.gif"), Color.RED);
		Action salir=new AbstractAction("salir") {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
			
		};
		
		JMenu menu = new JMenu("color");
		menu.add(accionAzul);
		menu.add(accionAmarillo);
		menu.add(accionRojo);
		JMenuBar barra = new JMenuBar();
		barra.add(menu);
		//add(barra);
		setJMenuBar(barra);
		JToolBar herramientas = new JToolBar();
		herramientas.add(accionAzul).setBackground(Color.BLUE);
		herramientas.add(accionAmarillo).setBackground(Color.yellow);
		herramientas.add(accionRojo).setBackground(Color.red);
		herramientas.addSeparator();
		herramientas.add(salir);
		add(herramientas,BorderLayout.NORTH);
		
		
	}
		
	
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color c){
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
			
			putValue("Color", c);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			Color c=(Color) getValue("Color");
			
			lamina.setBackground(c);
			
		}		
		
	}
	private JPanel lamina;
}



