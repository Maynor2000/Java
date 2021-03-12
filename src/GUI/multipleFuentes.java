package GUI;
import javax.swing.*;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;

public class multipleFuentes {

	public static void main(String[] args) {
		ventanaMultiple vm = new ventanaMultiple();

	}

}
class ventanaMultiple extends JFrame{
	public ventanaMultiple() {
		setVisible(true);
		setSize(300,300);
		laminaMultiple lm = new laminaMultiple();
		add(lm);
		
	}
}
class laminaMultiple extends JPanel{
	
	public laminaMultiple() {
		
		action accionAmarillo = new action("amarillo",new ImageIcon("src/GUI/fe52.png"),Color.YELLOW);
		action accionRojo = new action("rojo",new ImageIcon("src/GUI/fe52.png"),Color.red);
		action accionAzul = new action("azul",new ImageIcon("src/GUI/fe52.png"),Color.BLUE);
		
		add(new JButton(accionAmarillo));
		add(new JButton(accionRojo));
		add(new JButton(accionAzul));
		
		InputMap mapa_entrada = getInputMap(WHEN_IN_FOCUSED_WINDOW);
		mapa_entrada.put(KeyStroke.getKeyStroke("ctrl A"),"fondo_amarillo");
		mapa_entrada.put(KeyStroke.getKeyStroke("ctrl B"),"fondo_azul");
		mapa_entrada.put(KeyStroke.getKeyStroke("ctrl R"),"fondo_rojo");
		ActionMap mapaAccion =getActionMap();
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);
		
	}

private	class action extends AbstractAction{

		public action(String nombre, Icon imagen,Color color_boton) {
			putValue(Action.NAME,nombre);
			putValue(Action.SMALL_ICON,imagen);
			putValue(Action.SHORT_DESCRIPTION,"poner la lamina de color "+nombre);
			putValue("color_de_fondo", color_boton);
			
		}
		public void actionPerformed(ActionEvent e) {
			Color micolor =(Color) getValue("color_de_fondo");
			setBackground(micolor);
			
		}
		
	}
	
}

